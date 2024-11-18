package ParallelExecution;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base.LaunchQuitBrowser;


public class AmazonLogin extends LaunchQuitBrowser
{

	@Test
	public void LoginAmazon() throws InterruptedException
	{
		
		driver.get("https://www.saucedemo.com/");
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  Thread.sleep(2000);
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  Thread.sleep(2000);
		  driver.findElement(By.id("login-button")).click();
	
	}
}
