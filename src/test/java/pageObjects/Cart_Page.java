package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Cart_Page extends BasePage {
	public @FindBy(id = "checkout") WebElement checkout_button;

	public Cart_Page() throws IOException {
		super();
	}
/*Click checkout button */
	public void clickOnCheckOutButton() throws InterruptedException, IOException {
		waitAndClickElement(checkout_button);

	}

}
