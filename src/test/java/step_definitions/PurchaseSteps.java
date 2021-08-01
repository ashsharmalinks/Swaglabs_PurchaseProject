package step_definitions;

import Utilities.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchaseSteps extends DriverFactory {

	@Given("^I logged into the application \"([^\"]*)\" using the valid user credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void loggedIntoApplication(String url, String username,String password) throws Throwable {
		purchasePage.geturl(url);
		purchasePage.enterUserNameAndPassword(username, password);
		purchasePage.clickOnLoginButton();
	}

	@And("^I have sorted the producs by price option \"([^\"]*)\"$")
	public void sortedProducsByPriceOption(String itemsorder) throws Throwable {
		inventoryPage.selectHighToLowPrice(itemsorder);

	}

	@When("^I add to cart the costliest and cheapest items from the product list$")
	public void addItemsToCart() throws Throwable {
		inventoryPage.addFirstAndLastItemToCart();
		inventoryPage.clickOnTrolleyButton();
	}

	@When("^I enter the checkout details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterCheckoutDetails(String firstName, String lastName, String postalCode) throws Throwable {
		cartPage.clickOnCheckOutButton();
		checkOutPage.enterCheckOutDetails(firstName, lastName, postalCode);
		checkOutPage.clickOnContinueButton();
		checkOutOverviewPage.clickOnFinishButton();
	}

	@Then("^I should be able to see the success \"([^\"]*)\" on the confirmation page$")
	public void validationOnConfirmationPage(String message) throws Throwable {
		checkOutCompletePage.validateMessage(message);
	}

}
