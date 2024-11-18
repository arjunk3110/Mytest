package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

    public static WebDriver driver;

    @Parameters("browser")
    
    
    @BeforeMethod
    public void BrowsersetUp(String browser) {
    
 	    	if (browser.equals("Chrome"))
 	    	{
 	    	driver=new ChromeDriver();	
 	    	}
 	    	
 	    	else if(browser.equals("Firefox"))
 	    	{
 	    		driver=new FirefoxDriver();	
 	    	}
 	    }
 	

    @AfterMethod
    public void CloseBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
        driver.get("https://www.saucedemo.com/");
    }
}
