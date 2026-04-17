package Flow;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.FlipKartHome;
import pages.Flipkart.LoginPopup;

public class FlipKartFlow
{

    FlipKartHome flipKartHome;
    LoginPopup loginPopup;

    @BeforeMethod
    public void ignoreLoginPopup(){
        loginPopup.clickCancelPopup();
    }

    public FlipKartFlow(WebDriver driver){
        flipKartHome = new FlipKartHome(driver);
        loginPopup = new LoginPopup(driver);
    }

    public void searchElement(){

        flipKartHome.searchAnyProduct("Laptop");
    }
}
