package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
//		List<WebElement> LangLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println("Toatl Links are : - " + LangLinks.size());
		
		By LangLinks = By.xpath("//div[@id='SIvCob']/a");
		
		//print all the text of the 9 languages
		
//		for(WebElement e: LangLinks) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("मराठी")) {
//				e.click();
//				break;
//			}
//
//		}
		
		clickOnElement(LangLinks, "मराठी");

	}
	


	public static void clickOnElement(By locator, String value) {
		
		List<WebElement> LangLinks = getElements(locator);
		System.out.println("Toatl Links are : - " + LangLinks.size());
		for(WebElement e: LangLinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}

		}

		
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
