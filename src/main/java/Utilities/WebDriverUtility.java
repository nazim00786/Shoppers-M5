package Utilities;

public class WebDriverUtility {
	/**
	 * AUthor : Mustakim When we get ElementClickInterceptedException (when element
	 * is hidden by other element) then we will use java script click
	 * 
	 * @param driver
	 * @param ele
	 */
	public void javaScriptClick(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].click();", ele);
	}

	/**
	 * to avoid ElementClickInterceptedException
	 * 
	 * @param driver
	 * @param ele
	 * @param data
	 */
	public void javaScriptSendKeys(WebDriver driver, WebElement ele, String data) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value=arguments[1];", ele, data);
	}

	/**
	 * Author : mustakim this method will scroll the webpage till the given element
	 * 
	 * @param driver
	 * @param ele
	 */
	public void javaScriptScrollTillWebElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	/**
	 * Author : mustakim this method will scroll the webpage with given coordinates
	 * 
	 * @param driver
	 * @param xCordinate
	 * @param yCordinate
	 */
	public void javaScriptScrollByCoordinates(WebDriver driver, int xCordinate, int yCordinate) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(" + xCordinate + "," + yCordinate + ");");
	}

	/**
	 * Author : mustakim this method will highlight the WebElemet border with 2px
	 * red color
	 * 
	 * @param driver
	 * @param ele
	 */
	public void javaScriptHighLightWebElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red';", ele);
	}

	/**
	 * To performe mouse over operation on webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	public void mouseOverAction(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}

	/**
	 * To performe right operation on webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.contextClick(ele).perform();
	}

	/**
	 * To performe double click operation on webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.doubleClick(ele).perform();
	}

	/**
	 * To performe drag and drop operation between two elements
	 * 
	 * @param driver
	 * @param ele
	 */
	public void dragAndDrop(WebDriver driver, WebElement draggingELement, WebElement dropingElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(draggingELement, dropingElement).perform();
	}

	/**
	 * To performe click and hold operation on webElement
	 * 
	 * @param driver
	 * @param ele
	 */
	public void clickAndHold(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.clickAndHold(ele).perform();
	}

	/**
	 * To performe scrolling of webpage till the webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	public void scrollToWebELementByActionsClass(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.scrollToElement(ele).perform();
	}

	/**
	 * this method will wait until given element reaches to click able state
	 * 
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForElementToBeClickable(WebDriver driver, By locator, int timeDelay) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * this method will wait until given element is visible
	 * 
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForElementToBeVisible(WebDriver driver, WebElement ele, int timeDelay) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	/**
	 * this method will wait until alert is present
	 * 
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForAlert(WebDriver driver, int timeDelay) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * this method will wait until perticular page or perticular(given) url is
	 * appears
	 * 
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForUrl(WebDriver driver, int timeDelay, String Completeurl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.urlToBe(Completeurl));
	}

	/**
	 * this method will wait until perticular page is displayed/appears
	 * 
	 * @param driver
	 * @param locator
	 */
	public void explicitlyWaitForTitle(WebDriver driver, int timeDelay, String CompleteTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.titleIs(CompleteTitle));
	}
}

}
