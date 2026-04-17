package Flow;

import org.openqa.selenium.WebDriver;
import pages.GoogleWeb;

public class GoogleFlow {
    GoogleWeb googleWeb;

   public GoogleFlow(WebDriver driver){
        googleWeb= new GoogleWeb(driver);

    }

    public void searchSomething(){
        googleWeb.SearchAny("NVDA");
        googleWeb.assertSearchResults();
    }

}
