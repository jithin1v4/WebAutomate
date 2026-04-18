package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {

    public WebDriver driver;

    public WebDriver initDriver(String browser) {

        String execution = System.getProperty("execution", "local");

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();

            if (execution.equalsIgnoreCase("ci")) {
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }

        // Avoid maximize in CI
        if (!execution.equalsIgnoreCase("ci")) {
            driver.manage().window().maximize();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}