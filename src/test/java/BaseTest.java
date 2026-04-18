import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {

    public ConfigReader config = new ConfigReader();
    protected WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();

    @BeforeMethod
    public void setup() {
        driver = driverFactory.initDriver(config.getProperty("browser"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();   // ✅ IMPORTANT
        }
    }
}