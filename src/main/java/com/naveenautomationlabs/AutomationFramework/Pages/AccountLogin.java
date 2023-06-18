package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AccountLogin extends TestBase {
	
	public AccountLogin() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailInputField;

	@FindBy(id = "input-password")
	private WebElement passwordInputField;

	@FindBy(css = "input[value=\"Login\"]")
	private WebElement loginBtn;

	
	public void enterEmail() {
		emailInputField.sendKeys("manpreetkaur1991@gmail.com");
	}

	public void enterPassword() {
		passwordInputField.sendKeys("manpreetkaur");
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
}
