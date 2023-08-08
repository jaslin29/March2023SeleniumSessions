package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//drop down: <select> tag
		//Select Class
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		
		By country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(country);
//		
//		Select select = new Select(country_ele);
		//select.selectByIndex(5);
		//select.selectByVisibleText("India");
		//select.selectByValue("Austria");
		
		
		//doSelectDropDownByVisibleText(country, "Brazil");
		//doSelectDropDownByIndex(country, 5);
		doSelectDropDownByValue(country,"Austria");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	} 	
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);

	}
	
	
	public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select sel = new Select(getElement(locator)); 
		sel.selectByVisibleText(visibleText);
	}
	
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	
	}
	
	
	
	
	
	
	
	

}
