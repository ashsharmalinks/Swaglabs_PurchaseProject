package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CheckOutComplete_Page extends BasePage {
	public @FindBy(css = "#checkout_complete_container> h2") WebElement successMessage;

	public CheckOutComplete_Page() throws IOException {
		super();
	}

	public String validateMessage(String message) throws InterruptedException, IOException {
		WaitUntilWebElementIsVisible(successMessage);
		String successMessageValue = successMessage.getText();
		Assert.assertEquals(message, successMessageValue);
		return successMessageValue;
	}
}
