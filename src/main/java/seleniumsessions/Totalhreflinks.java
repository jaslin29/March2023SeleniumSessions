package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalhreflinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");


		By images = By.tagName("a");
		List<WebElement> imagesList = driver.findElements(images);
		System.out.println("Total Images  =  "+imagesList.size());
		
		for (WebElement e : imagesList) {
			String srcVal = e.getAttribute("href");
//			String altVal = e.getAttribute("alt");
			System.out.println(srcVal);
		}



	}

}
