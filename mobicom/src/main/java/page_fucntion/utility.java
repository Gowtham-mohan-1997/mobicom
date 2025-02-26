package page_fucntion;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_fucntion.common_fucntion;

public class utility extends common_fucntion{
	public static void clickWithWait(WebElement ele) throws InterruptedException {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));

                wait.until(ExpectedConditions.elementToBeClickable(ele));


                for (int i = 0; i < 20; i++) {

                    try {
                        ele.click();
                        break;

                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        Thread.sleep(1000);
                    }

                }
	}

}
