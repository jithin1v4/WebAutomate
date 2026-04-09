package utils;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public boolean isElementPresent(By locator){
        WebElement ele = driver.findElement(locator);
        return (ele.isDisplayed());
    }
}
