package Annotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAndAfterGroup {
    WebDriver driver;


        
    @BeforeGroups("loginTests")
    public void setUpLoginGroup() {
        // Specific setup for loginTests group
        System.out.println("Setting up for login tests - BEFORE GROUP 1");
       // driver.get("https://example.com/login");
    }

    @AfterGroups("loginTests")
    public void tearDownLoginGroup() {
        // Cleanup after loginTests group
        System.out.println("Cleaning up after login tests- AFTER GROUP1");
    }
    
    
    @BeforeGroups("checkoutTests")
    public void setUpCheckoutGroup() {
        // Specific setup for checkoutTests group
        System.out.println("Setting up for checkout tests- BEFORE GROUP 2");
       // driver.get("https://example.com/checkout");
    }

    
    @AfterGroups("checkoutTests ")
    public void tearDownCheckoutGroup() {
        // Cleanup after checkoutTests group
        System.out.println("Cleaning up after checkout tests -AFTER GROUP 2");
    }
    
    

    @Test(groups = "loginTests")
    public void testLoginWithValidCredentials() {
        // Test login with valid credentials
        System.out.println("TC 1");
        // Add your test code here
    }

    @Test(groups = "InvalidLoginloginTests")
    public void testLoginWithInvalidCredentials() {
        // Test login with invalid credentials
        System.out.println("TC 2");
        // Add your test code here
    }
  

    @Test(groups = "checkoutTests")
    public void testCheckoutWithAccount() {
        // Test checkout with logged-in account
        System.out.println("TC 3");
        // Add your test code here
    }

   
 }
