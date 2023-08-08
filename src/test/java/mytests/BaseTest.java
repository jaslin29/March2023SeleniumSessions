package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}


}
