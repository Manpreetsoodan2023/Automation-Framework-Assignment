package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class NewsletterSubscription extends TestBase {

	public NewsletterSubscription() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input[value=\"1\"]")
	private WebElement yesRdioBtn;

	public void clickYesRadioBtn() {
		yesRdioBtn.click();

	}

	@FindBy(css = "input[value=\"Continue\"]")
	private WebElement continueBtn;

	public MyAccount clickContinueBtn() {
		continueBtn.click();
		
		return new MyAccount();
	}
}
