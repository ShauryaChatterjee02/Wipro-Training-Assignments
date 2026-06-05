package base;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        System.out.println("Step 1");

        ChromeOptions options = new ChromeOptions();

        System.out.println("Step 2");

        driver = new RemoteWebDriver(
                new URL("http://localhost:4444"),
                options);

        System.out.println("Step 3");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Step 4");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}