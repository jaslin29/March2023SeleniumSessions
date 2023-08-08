package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name.
	 * valid browsers = chrome/firefox/edge/safari
	 * @param browserName
	 */
	
	public WebDriver launchBrowser(String browserName) { // I will give you the browser name and with the help of 
													// browser name you give me the browser
		
		System.out.println("browser name: - " +browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			 driver = new ChromeDriver();
			break;
		case "firefox":
			 driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("plz pass the right browser name..." + browserName);
			break;
		}
		
		return driver;
		
	}
	
	public void enterURL(String URL) {
		if(URL.contains("http")) {
			driver.get(URL);
		}
		else {
			System.out.println("URL should have http(s)");
		}		
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}
	

}
