package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonUtils;
import utils.ConfigReader;

public class GoogleWeb {
    protected CommonUtils common ;
    protected WebDriver driver;
    protected ConfigReader config;


    By searchBar = By.xpath("//*[@title='Search']");//this class will contain all locators no matter what type
    By searchButton = By.xpath("//input[@value='Google Search']");
    By sampleLink =  By.xpath("//a[starts-with(@href,'https://www.')]");



    public GoogleWeb(WebDriver driver){
        this.driver=  driver;
        config=new ConfigReader();
        driver.get(config.getProperty("url"));
        common = new CommonUtils(driver);
    }
//using common utils to reuse the code and reduce the number of codes
    public void SearchAny(String text){
        common.sendText(searchBar,text);
        common.clickElement(searchButton);
    }

    public void assertSearchResults(){
        common.isElementPresent(sampleLink);
    }





}
