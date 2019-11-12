package TestCase;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cstudy2 {
	WebDriver driver;
	@Given("user open testmeapp")
	public void user_open_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP6_trng\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp");
		 
		 driver.manage().window().maximize();

	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname); 
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd); 
	}

	@When("click login button")
	public void click_login_button() {
	   driver.findElement(By.name("Login")).click();
	}

	@Then("validates login")
	public void validates_login() {
	    Assert.assertTrue(driver.getTitle().contains("Home"));
	    driver.close();
	}


}
