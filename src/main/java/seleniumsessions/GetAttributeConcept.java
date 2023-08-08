package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;// so that we can use the driver without object creation

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// By locator
		
		By forgotpwd = By.linkText("Forgotten Password");
		By firstnName = By.id("input-firstname");
		By logoImage = By.className("img-responsive");
		
//		String forgotpwd_href =	driver.findElement(forgotpwd).getAttribute("href");
//		System.out.println(forgotpwd_href);
//
//		String fn_placeholder_val = driver.findElement(firstnName).getAttribute("placeholder");
//		System.out.println(fn_placeholder_val);
//		
//		WebElement logo_ele = driver.findElement(logoImage);
//		String srcVal = logo_ele.getAttribute("src");
//		String titleVal = logo_ele.getAttribute("title");
//		String altVal = logo_ele.getAttribute("alt");
//		
//		System.out.println(srcVal);
//		System.err.println(titleVal);
//		System.out.println(altVal);
		
		String srcVal = getElementAttribute(logoImage,"src");
		System.out.println(srcVal);
		
		getElementAttribute(logoImage,"title");
		getElementAttribute(logoImage,"alt");
		
		String forgotpwd_href = getElementAttribute(forgotpwd,"href");
		System.out.println(forgotpwd_href);
		String fn_placeholder_val = getElementAttribute(firstnName,"placeholder");
		System.out.println(fn_placeholder_val);
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String atrrName) {
		return getElement(locator).getAttribute(atrrName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
