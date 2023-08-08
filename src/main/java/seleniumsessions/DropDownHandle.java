package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		WebElement drpdwn1 = driver.findElement(day);
		WebElement drpdwn2 = driver.findElement(month);
		WebElement drpdwn3 = driver.findElement(year);
		
		Select sel = new Select(drpdwn1);
		sel.selectByVisibleText("18");
		
		Select sel2 = new Select(drpdwn2);
		sel2.selectByVisibleText("Jul");
		
		Select sel3 = new Select(drpdwn3);
		sel3.selectByVisibleText("1989");

	}

}
