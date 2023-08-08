package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=chrome");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
