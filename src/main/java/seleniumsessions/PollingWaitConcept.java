package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email12");
		
		//Setting up explicit wait with polling interval as 2 seconds
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("testing");
		
	}

}
