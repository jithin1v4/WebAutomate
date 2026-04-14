import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlipKartHome;
import pages.Flipkart.LoginPopup;

public class FlipkartPageTest extends BaseTest{
    FlipKartHome home;
    LoginPopup login ;

    @BeforeMethod
    public void initPage() {
        home =new FlipKartHome(driver);
        login = new LoginPopup(driver);

    }

    @Test
    public void homePageCheck(){
        login.clickCancelPopup();
        home.searchAnyProduct("Laptop");

    }
}
