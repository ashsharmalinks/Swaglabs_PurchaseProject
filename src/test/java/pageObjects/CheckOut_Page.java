package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CheckOut_Page extends BasePage {

	public CheckOut_Page() throws IOException {
		super();
	}

	public @FindBy(css = "input#first-name") WebElement textfield_FirstName;
	public @FindBy(css = "input#last-name") WebElement textfield_LastName;
	public @FindBy(css = "input#postal-code") WebElement textfield_PostalCode;
	public @FindBy(id = "continue") WebElement button_Continue;

	public CheckOut_Page enterCheckOutDetails(String firstName, String lastName, String postalCode) throws Exception {
		sendKeysToWebElement(textfield_FirstName, firstName);
		sendKeysToWebElement(textfield_LastName, lastName);
		sendKeysToWebElement(textfield_PostalCode, postalCode);

		return new CheckOut_Page();
	}

	public CheckOut_Page enterFirstName(String firstName) throws Exception {
		sendKeysToWebElement(textfield_FirstName, firstName);
		return new CheckOut_Page();
	}

	public CheckOut_Page enterLastName(String lastName) throws Exception {
		sendKeysToWebElement(textfield_FirstName, lastName);
		return new CheckOut_Page();
	}

	public CheckOut_Page enterPostalCode(String postalCode) throws Exception {
		sendKeysToWebElement(textfield_FirstName, postalCode);
		return new CheckOut_Page();
	}

	public void clickOnContinueButton() throws InterruptedException, IOException {
		waitAndClickElement(button_Continue);

	}

}
