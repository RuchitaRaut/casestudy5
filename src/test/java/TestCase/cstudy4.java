package TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cstudy4 {
	WebDriver driver;
	@Given("user registerd in testmeapp")
	public void user_registerd_in_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP6_trng\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Ruchita45"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("ruchita25"); 
		 driver.findElement(By.name("Login")).click();
	}
	

	@When("user searches for product")
	public void user_searches_for_product() {
		driver.findElement(By.linkText("All Categories")).click();
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.linkText("Head Phone")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("head");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@And("try to process payment without adding to cart")
	public void try_to_process_payment_without_adding_to_cart() {
		//String menu= driver.findElement(By.className("shop-menu pull-right")).getText();
	  Assert.assertTrue(driver.getTitle().contains("View Cart"));
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
		driver.findElement(By.xpath("//a[@href='#']")).click();
		//String menu= driver.findElement(By.className("shop-menu pull-right")).getText();
		 //Assert.assertTrue(driver.getTitle().contains("Cart"));
		// driver.close();
	}

}
