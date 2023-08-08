package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageTest {

	public static void main(String[] args) {
		
		
		// call the browser
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// now the By locators
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By aboutUsLink = By.linkText("About Uys");
		
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(firstName, "Jaslin");
		ele.doSendKeys(lastName, "Kaur");
		ele.doSendKeys(emailId, "jaslin@gmail.com");
		ele.doSendKeys(phone, "123456");
		ele.doSendKeys(password, "jaslin@123");
		ele.doSendKeys(confirmPassword, "jaslin@123");
		
		String accPageTitle = br.getPageTitle();
		System.out.println("acc page title is: " + accPageTitle);
		
		if(ele.checkElementIsDisplayed(aboutUsLink)) {
			String header = ele.doElementGetText(aboutUsLink);
			System.out.println(header);
		}
		
		

	}


}
