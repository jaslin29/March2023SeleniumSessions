package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//drop down: <select> tag
		//Select Class
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		
		By country = By.id("Form_getForm_Country");
	//	WebElement country_ele = driver.findElement(country);
//		Select sel = new Select(country_ele);
//		
//		List<WebElement> countryList = sel.getOptions();
//		int count = countryList.size();
//		System.out.println("The size is : " +count);
//		
//		for(WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
		getDropDownTextList(country, "India");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void getDropDownTextList(By locator, String value) {
		Select sel = new Select(getElement(locator));
		
		List<WebElement> countryList = sel.getOptions();
		int count = countryList.size();
		System.out.println("The size is : " +count);
		
		for(WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
