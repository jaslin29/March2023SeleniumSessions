package seleniumsessions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doSendKeys(By locator, String value) {
		
		if(value ==null) {
			System.out.println("value can not be null while using sendKeys method");
			//throw new FrameworkException("VALUECANNOTBENULL");
		}
		getElement(locator).sendKeys(value);
	}
	
	public boolean checkElementIsDisabled(By locator) {
		String disabledValue = getElement(locator).getAttribute("disabled");
		if(disabledValue.equals("true")) {
			return true;
		}
		return false;
	}
	
	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is ====>" + eleText);
		return eleText;
		
	}
	
	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();// getElement will help me to create the webelement 
	}
	

	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public String getElementAttribute(By locator, String atrrName) {
		return getElement(locator).getAttribute(atrrName);
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("getting element exception...plz check your locator again");
			e.printStackTrace();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
		
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void clickOnElement(By locator, String value) {
		
		List<WebElement> LinksList = getElements(locator);
		System.out.println("Toatl Links are : - " + LinksList.size());
		for(WebElement e: LinksList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}

		}
		
	}
	
	//*****************************Drop down utils******************************************
	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);

	}
	
	
	public  void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select sel = new Select(getElement(locator)); 
		sel.selectByVisibleText(visibleText);
	}
	
	
	public void doSelectDropDownByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	
	}
	
	public void doSelectDropDownValueUsingLocator(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		for(WebElement e : optionsList ) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	//*********************************Actions Utils***********************************
	
	public void twoLevelMenuHandling(By level1MenuLocator, By level2MenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1MenuLocator)).build().perform();
		Thread.sleep(1500);
	//	getElement(level2MenuLocator).click();
		doClick(level2MenuLocator);
		
	}
	
	public void selectRightClickOption(By contextMenuLocator, String optionValue) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator = By.xpath("//*[text()='"+optionValue+"']");
		doClick(optionLocator);
	}
	
	public WebElement getLinkEleByText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}
	
	
	public void muliLevelMenuHandling(By level1Locator, String level2, String level3, String level4) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1Locator)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level3)).perform();
		Thread.sleep(1500);
		getLinkEleByText(level4).click();

	}
	
	public void muliLevelMenuHandling(By level1Locator, String level2, String level3) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1Locator)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		getLinkEleByText(level3).click();
	}
	
	
	
	//*****************Wait Util*****************
	
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementPresence(By locator, int timeOut, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(pollingTime));
	   return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForElementVisible(By locator, int timeOut, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(pollingTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
public String waitForTitleContains(String titleFraction, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		else {
			System.out.println(titleFraction + "title value is not present");
			return null;
		}
		
	}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(titleFraction + " title value is not present...");
			return null;
		}
		
	}
	
	public String waitForTitleIs(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			} else {
				System.out.println(titleValue + " title value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(titleValue + " title value is not present...");
			return null;
		}
	}
	
	public Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public Alert waitForJSAlert(int timeOut, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(pollingTime));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean waitForNumberOfBrowserWindows(int timeOut, int numberOfWindowsToBe) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindowsToBe));
		//System.out.println(flag);
		
	}
	
	public void waitForFrameByLocator(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public void waitForFrameByFrameNameOrID(String frameNameOrID, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameNameOrID));
	}
	
	public void waitForFrameByFrameElement(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		//System.out.println(list.size());
		
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible.
	 *  Visibility means that the elements are not only displayed 
	 *  but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator
	 * @param timeOut
	 */
	public void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

	}


	
}
