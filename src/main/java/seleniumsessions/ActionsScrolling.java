package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform();		
		
		// The page will come to the end directly
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		//scrollToElement
		act.scrollToElement(driver.findElement(By.linkText("Help")))
		.click(driver.findElement(By.linkText("Help")))
		.build().perform();
		
		// refresh
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform	();	
	}

}
