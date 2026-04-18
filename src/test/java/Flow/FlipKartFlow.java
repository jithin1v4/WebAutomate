package Flow;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.FlipKartHome;
import pages.Flipkart.LoginPopup;

public class FlipKartFlow
{

    FlipKartHome flipKartHome;
    LoginPopup loginPopup;


    public FlipKartFlow(WebDriver driver){
        flipKartHome = new FlipKartHome(driver);
        loginPopup = new LoginPopup(driver);
        loginPopup.clickCancelPopup();
    }

    public void searchElement(){

        flipKartHome.searchAnyProduct("Laptop");
    }

    public void getMobileModelsName(){
        flipKartHome.getLatestMobiles();
    }
}
