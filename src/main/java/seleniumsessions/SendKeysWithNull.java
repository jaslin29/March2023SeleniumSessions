package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// this means I am supplying the null in the text field
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
	//	driver.findElement(firstName).sendKeys(null);
	//	driver.findElement(firstName).sendKeys("");
	//	driver.findElement(firstName).sendKeys(" ");
		
	//	driver.findElement(firstName).sendKeys(123);
		//driver.findElement(firstName).se																									
		
		String str = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		
		//driver.findElement(firstName).sendKeys(str+sb+sf);
		driver.findElement(firstName).sendKeys(str+" "+sb+" "+sf);
		driver.findElement(firstName).sendKeys(sb);
		//driver.findElement(firstName).sendKeys(str, sb, sf);

	}

}
