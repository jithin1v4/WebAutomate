package pages.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.FlipKartHome;
import utils.CommonUtils;

public class LoginPopup {

    public By loginPopUpCloseIcon = By.xpath("//span[@role='button']");

    private WebDriver driver;
    private CommonUtils common;

    public LoginPopup(WebDriver driver){
        this.driver=driver;
        common =  new CommonUtils(driver);
    }

    public void clickCancelPopup(){
        if(common.isElementPresent(loginPopUpCloseIcon)) {
            common.clickElement(loginPopUpCloseIcon);
        }
    }
}
