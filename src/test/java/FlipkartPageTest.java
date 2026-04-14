import Flow.FlipKartFlow;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlipKartHome;
import pages.Flipkart.LoginPopup;

public class FlipkartPageTest extends BaseTest{

    FlipKartFlow flow;
    @BeforeMethod
    public void initPage() {
        flow = new FlipKartFlow(driver);
    }

    @Test
    public void productSearchChecking(){
        flow.searchElement();
    }
}
