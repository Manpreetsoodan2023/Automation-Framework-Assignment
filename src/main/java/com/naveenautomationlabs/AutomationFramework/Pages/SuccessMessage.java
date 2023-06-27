package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class SuccessMessage extends TestBase {

	public SuccessMessage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//h1[text()=\"Your order has been placed!\"]")
	private WebElement successMessageText;

	@FindBy(css = "//a[text()=\"Continue\"]")
	private WebElement continueBtn;

	public String displaySuccessMessage() {
		return successMessageText.getText();
	}

	public YourStore clickContinueBtn() {
		continueBtn.click();
		return new YourStore();
	}

}
