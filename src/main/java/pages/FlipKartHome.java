package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Flipkart.LoginPopup;
import utils.CommonUtils;
import utils.ConfigReader;

import java.util.ArrayList;
import java.util.List;

public class FlipKartHome {

    protected CommonUtils common ;
    protected WebDriver driver;
    protected ConfigReader config;

    protected  By searchBar = By.xpath("(//*[@title='Search for Products, Brands and More'])[2]");
    protected  By mobilesCategoryButton= By.xpath("(//div[contains(text(),'Mobiles')])[1]");
    protected By mobileNameLists = By.xpath("//*[@id='slot-list-container']//div[@dir='auto' and string-length(normalize-space()) < 15]");


    public FlipKartHome(WebDriver driver){
        this.driver=driver;
        config = new ConfigReader();
        driver.get(config.getProperty("flipkarturl"));
        common = new CommonUtils(driver);
    }

    public void searchAnyProduct(String text){
        common.sendText(searchBar,text);
        common.pressEnter();
    }

    public void getLatestMobiles(){
        if(common.isElementPresent(mobilesCategoryButton)){
            common.clickElement(mobilesCategoryButton);
        }

        List<WebElement> list= new ArrayList<>();
        list = common.getElements(mobileNameLists);
        for(WebElement a : list){
            System.out.println(a.getText());
        }

    }

}