package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Base.LaunchQuitBrowser;

public class AmazonSearch  extends LaunchQuitBrowser
{
	@Test
	public void SearchAmazon()
	{	
		driver.get("https://www.saucedemo.com/");
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.id("login-button")).click();
		  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	}

}
