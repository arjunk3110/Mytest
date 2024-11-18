package Parameterization;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuitBrowser
{
	
	public static  WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("Browser")
	
	public void OpenBrowser(String browsertype)
	{
		if (browsertype.equals("Chrome"))
    	{
    	driver=new ChromeDriver();	
    	}
    	
    	else if(browsertype.equals("Firefox"))
    	{
    		driver=new FirefoxDriver();	
    	}
    
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
