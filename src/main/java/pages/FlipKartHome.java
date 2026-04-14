package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Flipkart.LoginPopup;
import utils.CommonUtils;
import utils.ConfigReader;

public class FlipKartHome {

    protected CommonUtils common ;
    protected WebDriver driver;
    protected ConfigReader config;

    protected  By searchBar = By.xpath("(//*[@title='Search for Products, Brands and More'])[2]");

    public FlipKartHome(WebDriver driver){
        this.driver=driver;
        config = new ConfigReader();
        driver.get("https://www.flipkart.com");
        common = new CommonUtils(driver);
    }

    public void searchAnyProduct(String text){
        common.sendText(searchBar,text);
        common.pressEnter();
    }

}
