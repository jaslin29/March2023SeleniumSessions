package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	
	public static void main(String[] args) {
		
		//we need to launch the browser first. Call browser util class
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		 br.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		 System.out.println(br.getPageTitle());
		 
		 //enter the username and password
		 
		 By email_id = By.id("input-email");
		 By pass_id = By.id("input-password");
		 
		 ElementUtil eleUtl = new ElementUtil(driver);
		 eleUtl.doSendKeys(email_id, "naveen@gmail.com");
		eleUtl.doSendKeys(pass_id, "test@123");
		
		br.quitBrowser();
		
		
		
		
	}

}
