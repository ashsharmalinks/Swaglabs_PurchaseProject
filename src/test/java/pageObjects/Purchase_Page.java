package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Purchase_Page extends BasePage {

	public Purchase_Page() throws IOException {
		super();
	}

	public @FindBy(css = "input#user-name") WebElement textfield_UserName;
	public @FindBy(css = "input#password") WebElement textfield_Password;
	public @FindBy(css = "input#login-button") WebElement button_Submit;
	public @FindBy(css = "input#login-button") WebElement dropdown_Filter;

	public Purchase_Page geturl(String url) throws InterruptedException, IOException {
		driver.get(url);
		return new Purchase_Page();

	}

	public Purchase_Page enterUserNameAndPassword(String userName, String password) throws Exception {
		sendKeysToWebElement(textfield_UserName, userName);
		sendKeysToWebElement(textfield_Password, password);
		return new Purchase_Page();
	}

	public Purchase_Page clickOnLoginButton() throws Exception {
		waitAndClickElement(button_Submit);
		return new Purchase_Page();
	}

}
