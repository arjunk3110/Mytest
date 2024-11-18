package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuitBrowser {

    public static WebDriver driver;

    @BeforeMethod
    @Parameters("Browser")  // This will receive the "Browser" parameter from testng.xml
    public void OpenBrowser(String browsertype) {
        if (browsertype.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browsertype.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
    }

    @AfterMethod
    public void CloseBrowser() {
        if (driver != null) {
            driver.quit();  // Use quit() instead of close() to fully close the browser and free resources
        }
    }
}
