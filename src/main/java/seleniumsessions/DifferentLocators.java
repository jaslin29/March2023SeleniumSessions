package seleniumsessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	//	driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
		
		// xpath
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("naveen");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("naveen");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
//		
//		driver.findElement(By.name("agree")).click();
		
//		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
//		By password_xpath = By.xpath("//*[@id=\"input-password\"]");
//		By privacyPolicy_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		doSendKeys(fn_xpath,"Naveen");
//		doSendKeys(ln_xpath,"Automation");
//		doSendKeys(password_xpath, "test@123");
//		doClick(privacyPolicy_xpath);
//		doClick(continue_xpath);
//		
		//5. CSS SELECTOR: not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("98989898989");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		
		//6. LinkText: only for links...with the text of the link. 
		//html tag = <a>
		//attributes, linktext
		//driver.findElement(By.linkText("Delivery Information")).click();
//		By deliveryInfoLink = By.linkText("Delivery Information");
//		doClick(deliveryInfoLink);

		//7. Partial Link Text: only for links...with the partial text of the link.
				//driver.findElement(By.partialLinkText("Forgotten")).click();
				//Forgotten username
				//Forgotten password
		
		//8. TAG NAME: html tag, not an attribute
		//driver.findElement(By.tagName("input")).sendKeys("naveen");
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);	
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	
	
	
	
	
}
