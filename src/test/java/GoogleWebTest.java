import Flow.GoogleFlow;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleWeb;

public class GoogleWebTest extends BaseTest{


    GoogleFlow flow;

    @BeforeMethod
    public void initPage() {
        flow = new GoogleFlow(driver);
    }

    @Test
    public void homePageCheck(){
        flow.searchSomething();
    }

}
