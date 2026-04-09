import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleWeb;

public class GoogleWebTest extends BaseTest{

GoogleWeb googleWeb;

    @BeforeMethod
    public void initPage() {
        googleWeb =new GoogleWeb(driver);
    }

    @Test
    public void homePageCheck(){
        googleWeb.SearchAny("NVDA");
        googleWeb.assertSearchResults();
    }

}
