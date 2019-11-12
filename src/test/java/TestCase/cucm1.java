package TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucm1 {
	WebDriver driver;
	@Given("user open application newtours.demoaut.com")
	public void user_open_application_newtours_demoaut_com() {
		  System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	        driver = new InternetExplorerDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.navigate().to("http://newtours.demoaut.com/");
	        driver.manage().window().maximize();
	  // System.out.println("Click on application");
	}

	@When("user clicks on registration page")
	public void user_clicks_on_registration_page() {
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //System.out.println("Click on registration page")
		//driver.findElement(By.xpath("//a[contains(@href,'mercuryregister.php?osCsid=bd911cd224059b6d2504605836cebe32')]"));
		
	
	}

	@Then("user validates registration page")
	public void user_validates_registration_page() {
	    System.out.println("validation of registration page");
	    Assert.assertTrue(driver.getTitle().contains("Register: Mercury Tours"));
	}

	@When("user enter firstname")
	public void user_enter_firstname() {
		driver.findElement(By.name("firstName")).sendKeys("mercury");
		
	 // System.out.println("user enters first name");
	}

	@When("user enter password")
	public void user_enter_password() {
		driver.findElement(By.name("password")).sendKeys("mercury");
	   //System.out.println("user enters password");
	}

	@When("user enter confirm password")
	public void user_enter_confirm_password() {
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
	   // System.out.println("user confirms the password");
	}

	@When("user click on register button")
	public void user_click_on_register_button() {
		driver.findElement(By.name("register")).click();
	    //System.out.println("Click on register");
	}

	@Then("user registration success")
	public void user_registration_success() {
		Assert.assertTrue(driver.getTitle().contains("Register: Mercury Tours"));
		driver.close();
	   //System.out.println("User validation success");
	}


}
