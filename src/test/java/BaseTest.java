import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;
import java.time.Duration;

public class BaseTest {

    public ConfigReader config = new ConfigReader();
    protected WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();

    @BeforeClass
    public void setup() {
        driver = driverFactory.initDriver(config.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();   // ✅ IMPORTANT
        }
    }
}