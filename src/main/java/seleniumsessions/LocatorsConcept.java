package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//1. 
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");
		
		//2. 
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@gmail.com");
		
		//3 By Locator:
		
//		By email_id = By.id("input-email");
//		By pass_id = By.id("input-password");
//		
//		WebElement emailId1 = driver.findElement(email_id);
//		WebElement password2 = driver.findElement(pass_id);
//		
//		emailId1.sendKeys("naveen@gmail.com");
//		password2.sendKeys("naveen@123");
	
		//4. By locator with web element generic method:
//		By email_id = By.id("input-email");
//		By pass_id = By.id("input-password");
		

//		getElement(email_id).sendKeys("naveen@gmail.com");
//		getElement(pass_id).sendKeys("naveen@123");
		
		//5. By locator with web element and action generic method
//		By email_id = By.id("input-email");
//		By pass_id = By.id("input-password");
//		
//		doSendKeys(email_id, "naveen@gmail.com");
//		doSendKeys(pass_id, "test@123");
		
		//6.
		
		By email_id = By.id("input-email");
		By pass_id = By.id("input-password");  
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email_id, "naveen@gmail.com");
		eleUtil.doSendKeys(pass_id, "test@123");
		
		
	}
	
	

}
