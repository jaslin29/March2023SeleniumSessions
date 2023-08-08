package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");

		
		//xpath: address of the element in HTM DOM
		//1. absolute xpath: /html/body/div/div/div[2]/ul/li[4]/a
		//2. relative xpath/custom xpath: using attributes, using xpath functions
		
		//input[@name='username']
		//button[@type='submit']

		//input - 14
		//input[@id] - 6
		
		////htmltag[@attr1='value' and @attr2='value']
		//input[@id='input-firstname']
		//input[@name='username' and @placeholder='Username']
		//input[@name='username' and @placeholder='Username' and @class='oxd-input oxd-input--active']
		
		//htmltag[@attr1 and @attr2 and @attr3]
		
		//input[@name and @placeholder and @class] //2
		
		//By ele1 = By.xpath("//input[@class='form-control private-form__control login-email']");
	//	By ele2 = By.className("login-email");
		By ele3 = By.className("form-control private-form__control login-email");
		
		//driver.findElement(ele1).sendKeys("test@gmail.com");
		
		//driver.findElement(ele2).sendKeys("test@gmail.com");
		
		driver.findElement(ele3).sendKeys("test@gmail.com");
		
		//contains() in xpath:
				//htmltag[contains(@attr,'value')]
				//input[contains(@data-test-id,'email-input')]
				//input[contains(@data-test-id,'field')]
				//input[contains(@class,'login-email')]
				
				//long value: 
				//dynamic attributes/ids:
//				<input id = "test_123">
//				<input id = "test_456">
//				<input id = "test_900">

				//input[contains(@id,'test_')]
				
				//contains() with attr1 and attr2 without contains:
				//htmltag[contains(@attr1,'value') and @attr2='value']
				//input[contains(@data-test-id,'email-input') and @type='email']
				//input[@type='email' and contains(@data-test-id,'email-input')]
				//input[@type='email' and contains(@data-test-id,'email-input') and @id='username']
		
		
		//span[contains(text(),'Trusted by')]
		//span[contains(text(),'60,000+ businesses of all sizes')]
		
		//text() with @attr:
		//htmltag[text()='value' and @attr='value']
		//a[text()='Login' and @class='list-group-item']
		//a[text()='Address Book' and @class='list-group-item']
		
		//text() with contains and attr1 with contains() and attr2 without contains:
		//htmltag[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
			
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
