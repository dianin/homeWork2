package Pages;

import com.google.common.util.concurrent.FluentFuture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    private WebDriver driver;
    private final WebDriverWait shortWait;
    private final WebDriverWait longWait;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
        shortWait = new WebDriverWait(driver,15);
        longWait = new WebDriverWait(driver, 40);
    }


    public void click (By selector)
    {
        shortWait.until(ExpectedConditions.elementToBeClickable(selector));
        driver.findElement(selector).click();
    }

    public void visabilitySelector (By selector)
    {
        shortWait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

}
