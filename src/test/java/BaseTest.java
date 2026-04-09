import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {

        public ConfigReader config= new ConfigReader();
        protected WebDriver driver;

        @BeforeMethod
        public void setup() {
//            driver = new ChromeDriver();
//            driver.get("https://example.com");
            DriverFactory driverFactory = new DriverFactory();
            driver = driverFactory.initDriver(config.getProperty("browser"));

        }

        @AfterMethod
        public void tearDown() {
           // driver.quit();
        }

}
