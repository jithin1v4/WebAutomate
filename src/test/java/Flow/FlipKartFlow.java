package Flow;

import org.openqa.selenium.WebDriver;
import pages.FlipKartHome;
import pages.Flipkart.LoginPopup;

public class FlipKartFlow
{

    FlipKartHome flipKartHome;
    LoginPopup loginPopup;

    public FlipKartFlow(WebDriver driver){
        flipKartHome = new FlipKartHome(driver);
        loginPopup = new LoginPopup(driver);
    }

    public void searchElement(){
        loginPopup.clickCancelPopup();
        flipKartHome.searchAnyProduct("Laptop");
    }
}
