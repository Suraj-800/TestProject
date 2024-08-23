package TestPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestWebsite.LoginPage;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
	@BeforeClass
	void setup() {
        // Initialize ChromeDriver and set up basic configurations

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Initialize the LoginPage object
        loginPage = new LoginPage(driver);
        
        // Navigate to the login page
        driver.get("https://app.germanyiscalling.com/common/login/");
        

		
	}
	@Test(priority=1)
	public void testSuccessfulLogin() throws InterruptedException {
        // Perform login with valid credentials

		loginPage.login("Suraj.mane3342@gmail.com", "Test@123");
		
        // Verify if the user is redirected to the correct URL after login

        String expectedUrl = "https://app.germanyiscalling.com/cv/upload/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "User should be redirected to the upload CV section.");
    

	// Logout after successful login
       loginPage.clickLogoutButton();
	}
	
    @Test(priority=2)
    public void testUnsuccessfulLogin() {
        // Navigate to the login page
          driver.get("https://app.germanyiscalling.com/common/login/");
          // Perform login with invalid credentials
          loginPage.login("suraj.com", "ancd");
          // Wait for the error messages to be displayed
         loginPage.waitForErrorMessage();

    
    }
    @Test(priority = 3)
    public void testLoginWithEmptyFields() throws InterruptedException {
        
    	// Perform login with empty email and password fields
           loginPage.login("", "");
        
        // Wait for the error messages to be displayed
        Thread.sleep(3000);
        
        loginPage.testEmptyFieldsLogin();
    }

    @Test(priority = 4)
    public void testLoginWithSpecialCharacters() throws InterruptedException {
    	
    	 // Perform login with special characters in email and password fields
        loginPage.login("!@#$%^&*", "!@#$%^&*");
        
        // Wait for the error messages to be displayed
        Thread.sleep(3000);

        loginPage.testSpecialCharactersLogin();
    }


	@AfterClass
	void teardown() {
		// Close the browser and clean up resources
		driver.quit();
	
	}
	
}
	
	
	

