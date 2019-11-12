package TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cstudy3 {
	WebDriver driver;


@Given("user logged in testmeapp")
public void user_logged_in_testmeapp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP6_trng\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost:8083/TestMeApp");
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("Ruchita45"); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("password")).sendKeys("ruchita25"); 
	 driver.findElement(By.name("Login")).click();
}
@When("user searches for products")
public void user_searches_for_products() {
	driver.findElement(By.linkText("All Categories")).click();
	driver.findElement(By.linkText("Electronics")).click();
	driver.findElement(By.linkText("Head Phone")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("head");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@And("user gets all suggestions")
public void user_gets_all_suggestions() {
	Assert.assertTrue(driver.getTitle().contains("Search"));
  //driver.close();
}  // case study 3 ends here.

@Then("user adds product to cart")
public void user_adds_product_to_cart() {
   driver.findElement(By.linkText("Add to cart")).click();
   driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
   driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
}
}
