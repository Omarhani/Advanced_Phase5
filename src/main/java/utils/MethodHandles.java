package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MethodHandles {

    static ExtentReports extent;

    static ExtentTest test;

    protected WebDriver driver;
    Select select;

    Actions actions;

    WebDriverWait wait;

    public MethodHandles(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement webElement(By locator) {
        return driver.findElement(locator);
    }

    private void explicitWait(int time, By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)
        ));
    }

    protected void click(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                addBorderToElement(driver, webElement(locator));
                webElement(locator).click();
                setSteps();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void selectByIndex(By locator, int time, int index) {
        select = new Select(webElement(locator));
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                select.selectByIndex(index);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void selectByValue(By locator, int time, String value) {
        select = new Select(webElement(locator));
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                select.selectByValue(value);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void selectByVisibleText(By locator, int time, String visibleText) {
        select = new Select(webElement(locator));
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                select.selectByVisibleText(visibleText);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void submit(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                webElement(locator).submit();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void clear(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                webElement(locator).clear();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected boolean isSelected(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                flag = webElement(locator).isSelected();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isEnabled(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                flag = webElement(locator).isEnabled();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isDisplayed(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                flag = webElement(locator).isDisplayed();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected String getText(By locator, int time) {
        String text = null;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                text = webElement(locator).getText();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return text;
    }

    protected void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    protected void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    protected void sendKeysAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    protected String getTextAlert() {
        return driver.switchTo().alert().getText();
    }

    protected void switchToFrame(String nameOrId) {
        driver.switchTo().frame(nameOrId);
    }

    protected void switchToFrame(By locator) {
        driver.switchTo().frame(webElement(locator));
    }

    protected void switchToParent() {
        driver.switchTo().parentFrame();
    }


    protected void sendKeys(By locator, int time, String text) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                webElement(locator).sendKeys(text);
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }

    protected void clickWithActions(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                actions.click(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }

    protected void doubleClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                actions.doubleClick(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }

    protected void contextClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                actions.contextClick(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }
    protected void moveToElement(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                actions.moveToElement(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }
    protected void clickAndHold(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, locator);
                actions.clickAndHold(webElement(locator)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(locator));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }
    protected void dragAndDrop(By src, By target, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(time, src);
                explicitWait(time, target);
                actions.dragAndDrop(webElement(src), webElement(target)).build().perform();
                setSteps();
                addBorderToElement(driver, webElement(src));
                addBorderToElement(driver, webElement(target));
                break;
            } catch (StaleElementReferenceException e) {

            }
        }

    }


    protected void contextClick() {
        actions = new Actions(driver);
        actions.contextClick().build().perform();
        setSteps();
    }
    protected void release() {
        actions = new Actions(driver);
        actions.release().build().perform();
        setSteps();
    }

    protected void clickWithActions() {
        actions = new Actions(driver);
        actions.click().build().perform();
        setSteps();
    }


    private static String getMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 2) {
            if (stackTraceElements.length >= 4)
                return stackTraceElements[4].getMethodName();
            return stackTraceElements[2].getMethodName();
        } else {
            return "Unknown";
        }
    }

    public void setSteps() {
        test.info(getMethodName());
    }

    public static void myAssertEquals(Object actual, Object expected) {
        test.info(MarkupHelper.createLabel("----------------- Actual Result -----------------", ExtentColor.BLUE));
        test.info(actual.toString());

        test.info(MarkupHelper.createLabel("----------------- Expected Result -----------------", ExtentColor.BLUE));
        test.info(expected.toString());

        assertEquals(actual, expected);
    }
    public static void myAssertTrue(boolean condition) {
        test.info(MarkupHelper.createLabel("----------------- Verification -----------------", ExtentColor.BLUE));
        test.info(condition ? "Condition PASSED" : "Condition FAILED");

        assertTrue(condition);
    }


    private static void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red';", element);
    }
    protected void smoothScrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});",  webElement(locator));
        setSteps();
    }

    protected void navigateBack() {
        driver.navigate().back();
        setSteps();
    }

}
