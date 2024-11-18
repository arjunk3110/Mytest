package Parameterization;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo {
	 public static WebDriver driver;
	 public static String browser = "Firefox"; 

	@Test
	@Parameters({"Param_URL","Param_UserName","Param_Password"})
	
	//public void login(String UserName,String Password,String URL) throws InterruptedException
	
	public void login(@Optional("standard_user") String UserName,
      @Optional("secret_sauce") String Password,
      @Optional("https://www.saucedemo.com") String URL) throws InterruptedException//
	   
	{
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.MINUTES);		
		  driver.findElement(By.id("user-name")).sendKeys(UserName);
		  driver.findElement(By.id("password")).sendKeys(Password);
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(300);
		  driver.findElement(By.xpath(" //button[@id='react-burger-menu-btn']  ")).click();
		  driver.findElement(By.xpath(" //a[@id='logout_sidebar_link']  ")).click();	
	}	

				
	@BeforeMethod
	public void SetBrowser(){
			if (browser.equals("Chrome"))
		    	{
		    	driver=new ChromeDriver();	
		    	}
		    	
	    	else if(browser.equals("Firefox"))
		    	{
		    		driver=new FirefoxDriver();	
		    	}
		    }
}
