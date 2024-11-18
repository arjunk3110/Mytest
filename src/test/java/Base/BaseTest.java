package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest
{

	public static String browser = "Chrome";
	 public static WebDriver driver;

	 
	  @BeforeSuite
	    public void BrowsersetUp() 
	    {
	    	if (browser.equals("Chrome"))
	    	{
	    	driver=new ChromeDriver();	
	    	}
	    	
	    	else if(browser.equals("Firefox"))
	    	{
	    		driver=new FirefoxDriver();	
	    	}
	    }
	
	 
	
	@AfterSuite
	public void BrowserClose()
	{
		
		driver.close();
	}

}

