package Capture_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest;
import Base.LaunchQuitBrowser;

public class CaptureScreenUtility extends LaunchQuitBrowser
{	
	
	
    public void GetScreenShot(ITestResult testResult) throws IOException
    {
    	
    	 if(testResult.FAILURE==testResult.getStatus())
    	 {
    		 Date currentdate= new Date();
    		 
  // System.out.println(currentdate);
         String ScreenshotFileName=currentdate.toString().replace("","-").replace(":"," -");
         System.out.println(ScreenshotFileName);
         
         //TAKE SCREENSHORT
         TakesScreenshot screenshot = (TakesScreenshot) driver;
         File source = screenshot.getScreenshotAs(OutputType.FILE);
         
     
         //STORE IN THE PROJECT DIRECTORY
         FileUtils.copyFile(source, new File(".//screenshot//"+ScreenshotFileName+".png"));
         
    }
	  
    }
}

    	
    	
    	
    	
    	
 
    	
	
	 