package utils;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class CommonUtils {

    public WebDriver driver;
    public CommonUtils(WebDriver driver){
        this.driver=driver;
    }

    public void sendText(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

//    public boolean isElementPresent(By locator){
//        WebElement ele = driver.findElement(locator);
//        return (ele.isDisplayed());
//    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void clearText(By locator){
        driver.findElement(locator).clear();
    }

    public boolean isElementSelected(By locator){
        return driver.findElement(locator).isSelected();
    }

    public boolean  isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }

    public String getAttribute(By locator, String attributeName){
        return driver.findElement(locator).getAttribute(attributeName);
    }



    public WebElement waitForElementVisible(By locator, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickWhenReady(By locator, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void sendTextWhenReady(By locator, String text, int timeout){
        WebElement element = waitForElementVisible(locator, timeout);
        element.clear();
        element.sendKeys(text);
    }

    public void scrollToElement(By locator){
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    

}
