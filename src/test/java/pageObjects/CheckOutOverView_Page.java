package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CheckOutOverView_Page extends BasePage {
	public @FindBy(id = "finish") WebElement finish_Continue;

	public CheckOutOverView_Page() throws IOException {
		super();
	}

	public void clickOnFinishButton() throws InterruptedException, IOException {
		waitAndClickElement(finish_Continue);

	}

}
