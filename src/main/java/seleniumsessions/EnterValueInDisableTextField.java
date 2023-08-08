package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueInDisableTextField {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By disBox = By.id("pass");
		
		boolean flag = driver.findElement(disBox).isEnabled();
		System.out.println(flag);
		
		boolean flag1 = driver.findElement(disBox).isDisplayed();
		System.out.println(flag1);
		
		String disable_val = driver.findElement(disBox).getAttribute("disabled");
		System.out.println(disable_val);

	}

	public static boolean checkElementIsDisabled(By locator) {
		String disabledValue = getElement(locator).getAttribute("disabled");
		if(disabledValue.equals("true")) {
			return true;
		}
		return false;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
