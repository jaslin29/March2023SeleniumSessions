package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		// wait for the particular title and then only you give me the title
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains("Free CRM"))) {
//			System.out.println(driver.getTitle());
//		}

		waitForTitleContains("Free CRM11", 5);
	}
	

	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(urlFraction))) {
				return driver.getCurrentUrl();
			} else {
				System.out.println(urlFraction + " title value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(urlFraction + " title value is not present...");
			return null;
		}
	}
	
	public static String waitForURLToBe(String URLValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlToBe(URLValue))) {
				return driver.getCurrentUrl();
			} else {
				System.out.println(URLValue + " title value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(URLValue + " title value is not present...");
			return null;
		}
	}
		
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		else {
			System.out.println(titleFraction + "title value is not present");
			return null;
		}
		
	}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(titleFraction + " title value is not present...");
			return null;
		}
		
	}
	
	public static String waitForTitleIs(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			} else {
				System.out.println(titleValue + " title value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(titleValue + " title value is not present...");
			return null;
		}
	}
	
	
	
	
	
	
	

}
