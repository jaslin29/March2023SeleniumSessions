package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksWithAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		
		// open any url
				// get the count of links on the page -- html tag = a
				// print all the href values
				// but ignore blank text
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		By links = By.tagName("a");
		List<WebElement> linksList = driver.findElements(links);
		
		int count = linksList.size();
		System.out.println(count);
		
		for(WebElement e: linksList) {
			if(!e.getText().isEmpty()) {
				String url = e.getAttribute("href");
				if(url!=null) {
					System.out.println(url);
				}
			}
			
		}
		

	}

}
