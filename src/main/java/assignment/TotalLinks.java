package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links = By.xpath("//div[@class='list-group']/a");
		List<WebElement> linksList = driver.findElements(links);
		System.out.println(linksList.size());
		
		ElementUtil ele = new ElementUtil(driver);
		ele.clickOnElement(links, "Wish List");
		
		//print the text of all the links
		
//		for(WebElement e: linksList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Wish List")) {
//				e.click();
//				break;
//			}
//		}

	}
	
	
	// clickOnElement
}
