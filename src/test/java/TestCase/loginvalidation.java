package TestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class loginvalidation {
	WebDriver driver;
	@Given("user open application")
	public void user_open_application() {
	   System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	   driver= new InternetExplorerDriver();
	   driver.navigate().to("http://newtours.demoaut.com/");
	      driver.manage().window().maximize();
     }

	@When("user enters user as {string} in username field")
	public void user_enters_user_as_in_username_field(String a) {
	  driver.findElement(By.name("userName")).sendKeys(a); 
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pwd) {
	  driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("click signin")
	public void click_signin() {
		driver.findElement(By.name("login")).click();
	}

	@Then("validates login success")
	public void validates_login_success() {
	 Assert.assertTrue(driver.getTitle().contains("Find a Flight: Mercury Tours:"));
	 driver.close();
	}

}
