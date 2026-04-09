import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlipKartHome;

public class FlipkartPageTest extends BaseTest{
    FlipKartHome home;

    @BeforeMethod
    public void initPage() {
        home =new FlipKartHome(driver);
    }

    @Test
    public void homePageCheck(){
        home.searchAnyProduct("Laptop");
    }
}
