package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		//WebElement parentMenu = driver.findElement(By.className("menulink"));
		
		// Actions class object - In actions class we need to supply the driver
		
//		Actions act = new Actions(driver);
//		act.moveToElement(parentMenu).build().perform();
		
		// if we want to move the cursor to the courses(submenu)
//		WebElement childMenu = driver.findElement(By.linkText("COURSES"));
//		act.moveToElement(childMenu).build().perform();
		
		// if we just want to click on courses
		//driver.findElement(By.linkText("COURSES")).click();
		
		By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");
		
		twoLevelMenuHandling(parentMenu,childMenu);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void twoLevelMenuHandling(By level1MenuLocator, By level2MenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1MenuLocator)).build().perform();
		Thread.sleep(1500);
		getElement(level2MenuLocator).click();
		
	}
	
	
	
	
	
	
	
	
	

}
