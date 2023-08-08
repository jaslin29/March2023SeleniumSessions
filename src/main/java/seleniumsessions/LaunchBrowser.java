package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// open the browser - chrome
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("act title:- " +title);
		
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		driver.quit();

	}

}
