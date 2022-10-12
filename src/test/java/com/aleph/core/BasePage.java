package com.aleph.core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected WebDriver driver;
    private static WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void navigateTo(String url) {
        this.driver.get(url);
    }

    public void write(By locator, String textToWrite) {
        FindElement(locator).clear();
        FindElement(locator).sendKeys(textToWrite);
    }

    public void writeSlow(By locator, String textToWrite) throws InterruptedException {
        WebElement el = FindElement(locator);
        el.clear();
        el.sendKeys(" ");
        for(int i = 0; i < textToWrite.length(); i++) {
            Thread.sleep(300);
            el.sendKeys(textToWrite.substring(i, i+1));
        }
    }

    public static WebElement FindElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public Boolean FindInvisibilityElement(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public List<WebElement> FindElements(By locator) {
        try {
            return driver.findElements(locator);
        } catch (Exception e) {
            return null;
        }
    }

    public WebElement waitExitElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement FindElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public void pressEnter(By locator) {
        FindElement(locator).sendKeys(Keys.ENTER);
    }

    public void actionEnter(){
        Actions action=new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
    }

    public void backSpace(By locator) {
        FindElement(locator).sendKeys(Keys.BACK_SPACE);
    }

    public void pressTab(By locator) {
        FindElement(locator).sendKeys(Keys.TAB);
    }

    public void pressEsc(By locator) {
        FindElement(locator).sendKeys(Keys.ESCAPE);
    }

    public void pressArrowDown(By locator) {
        FindElement(locator).sendKeys(Keys.ARROW_DOWN);
    }


    public String textFromElement(By locator) {
        return FindElement(locator).getText();
    }

    public String attributeFromElement(By locator, String attribute) {
        return FindElement(locator).getAttribute(attribute);
    }

    public String attributeValueFromElement(By locator) {
        return FindElement(locator).getAttribute("value");
    }

    public String attributeValueFromInvisibilityElement(By locator) {
        return waitExitElement(locator).getAttribute("value");
    }

    public void clickElement(By locator) {
        FindElement(locator).click();
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public void realClickElement(String locator) {
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
        a.click(driver.findElement(By.xpath(locator))).build().perform();
    }

    public void mouseOverElement(String locator) {
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
    }

    public void setPrice(By locator, String value) {
        Actions actionDriver = new Actions(driver);
        actionDriver.doubleClick(FindElement(locator)).perform();
        actionDriver.sendKeys(Keys.CLEAR, value).perform();
    }

    public void clickAceptarModal() {
        Actions actionDriver = new Actions(driver);
        actionDriver.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).build().perform();
    }

    public void sendKeysToInput(String value) {
        Actions actionDriver = new Actions(driver);
        actionDriver.sendKeys(Keys.CLEAR, value).build().perform();
        actionDriver.sendKeys(Keys.ENTER).build().perform();
    }

    public void writeInvisibleInput(By locator, By locator2, String value) {
        WebElement btnDelete = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        btnDelete.click();
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
        //input.sendKeys(value);
        Actions actionDriver = new Actions(driver);
        actionDriver.sendKeys(value).build().perform();
        //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        //set the text
        //jsExecutor.executeScript("arguments[0].value='" + value + "'", input);
    }

    public void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElementVisible(By locator) {
        FindElementClickable(locator).click();
    }

    public void sendKeysElementVisible(By locator, String keys) {
        waitExitElement(locator).sendKeys(keys);
    }

    public void selectFromDropdownByValue(By locator, String valueToSelect) {
        Select dropdown = new Select(FindElement(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(By locator, int valueToSelect) {
        Select dropdown = new Select(FindElement(locator));
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(By locator, String valueToSelect) {
        Select dropdown = new Select(FindElement(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }

    public boolean elementIsDisplayed(By locator) {
        return FindElement(locator).isDisplayed();
    }

    public static boolean elementExist(By locator) {
        try {
            FindElement(locator).isDisplayed();
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }

    public void waitDontExitElement(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void ZoomPantalla(By locator) {
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }
    }
}