package page_fucntion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    private static final int DEFAULT_WAIT_TIME = 10; // Default wait time in seconds

    // Wait for an element to be visible
    public static void waitForElementVisible(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Overloaded method with default timeout
    public static void waitForElementVisible(WebDriver driver, WebElement element) {
        waitForElementVisible(driver, element, DEFAULT_WAIT_TIME);
    }

    // Wait for an element to be clickable
    public static void waitForElementClickable(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Overloaded method with default timeout
    public static void waitForElementClickable(WebDriver driver, WebElement element) {
        waitForElementClickable(driver, element, DEFAULT_WAIT_TIME);
    }

    // Wait for an element to be present in the DOM
    public static void waitForElementPresent(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated((org.openqa.selenium.By) element));
    }

    // Overloaded method with default timeout
    public static void waitForElementPresent(WebDriver driver, WebElement element) {
        waitForElementPresent(driver, element, DEFAULT_WAIT_TIME);
    }

}
