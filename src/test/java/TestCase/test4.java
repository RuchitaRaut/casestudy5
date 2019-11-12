package TestCase;

import cucumber.api.java.en.Given;

public class test4 {
	@Given("user login to testme app suing valid credentials")
	public void user_login_to_testme_app_suing_valid_credentials() {
	    System.out.println("Login");
	}

	@Given("user searching for products available in catlog")
	public void user_searching_for_products_available_in_catlog() {
		 System.out.println("Search products");
	}

	@Given("user adding products to cart")
	public void user_adding_products_to_cart() {
		 System.out.println("add to cart");
	}

	@Given("user performing payment using netbanking")
	public void user_performing_payment_using_netbanking() {
		 System.out.println("payment");
	}

	@Given("user perform logout")
	public void user_perform_logout() {
		 System.out.println("Logout");
	}

}
