package TestWebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	
	
	private WebDriver driver;


	public LoginPage(WebDriver driver){
	
		this.driver=driver;
		
	}
                  // Locators for the web elements on the login page
	              By txt_username=By.xpath("//input[@id='username']");
                  By txt_Password=By.xpath("//input[@id='password']");
                  By btn_Login=By.xpath("//button[normalize-space()='Log In']");
                  By error_message = By.xpath("//div[@id='error-message']"); // Assuming this is the error message locator
                  By btn_logout = By.xpath("//div[@class='dropdown pb-4']//a[@href='/common/logout/']");


                
                  // Method to enter the email address
                  public void enterEmail(String user) {
                	  driver.findElement(txt_username).sendKeys(user);
                      
                  }
                  // Method to enter the password
                  public void enterPassword(String password) {
                	  driver.findElement(txt_Password).sendKeys(password);
                  }
                  // Method to click the login button
                  public void clickLoginButton() {
                      driver.findElement(btn_Login).click();
                  }

                  // Method to click the logout button
                  public void clickLogoutButton() throws InterruptedException {
                //	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                 //     WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(btn_logout));
                 //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoutButton);
                	  WebElement logoutButton = driver.findElement(By.id("dropdownUser1"));
                      logoutButton.click();
                      
                   // Use Actions to interact with dropdown menu
                      Actions act = new Actions(driver);
                      for(int i=1;i<=2;i++) {
                      act.sendKeys(Keys.ARROW_DOWN).build().perform();
                      Thread.sleep(1000);
                  
                      }
                      act.sendKeys(Keys.ENTER).build().perform();
                      
                  }
                  // Method to get the text of the error message
                  public String getErrorMessage() {
                      return driver.findElement(error_message).getText();
                  }
                  // Method to wait for and print the error message
                  public void waitForErrorMessage() {
                	  WebElement err_msg = driver.findElement(By.xpath("//div//div//div//form//div[3]"));
                	 String txt =  err_msg.getText();
                	 System.out.println(txt);
                  }
              
                 
               // Additional test case: Test login with empty fields
                  public void testEmptyFieldsLogin() {
                      enterEmail("");
                      enterPassword("");
                      clickLoginButton();
                      WebElement err_msgempty=driver.findElement(By.xpath("//div//div//div//form//div[3]"));
                      String txtEmpty=err_msgempty.getText();
                      System.out.println(txtEmpty);
                  }

                  // Additional test case: Test login with special characters
                  public void testSpecialCharactersLogin() {
                      enterEmail("!@#$%^&*()");
                      enterPassword(")(*&^%$#@!");
                      clickLoginButton();
                     WebElement Wrong_chracrter_error=driver.findElement(By.xpath("//div//div//div//form//div[3]"));
                     String Chracter_filled=Wrong_chracrter_error.getText();
                     System.out.println(Chracter_filled);
                      
                  }
                  // Page interaction methods
                  public void login(String email, String password) {
                      enterEmail(email);
                      enterPassword(password);
                      clickLoginButton();
                  }
              }
	
	


