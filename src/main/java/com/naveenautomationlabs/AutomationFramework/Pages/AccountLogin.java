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

	@FindBy(css = "input[value='Login']")
	private WebElement loginBtn;

	@FindBy(css = "div.form-group a")
	private WebElement forgotPasswordLink;

	@FindBy(css = "div.alert")
	private WebElement passwordResetLinkText;

	private void enterEmail() {
		emailInputField.sendKeys("manpreetkaur1991@gmail.com");
	}

	private void enterPassword() {
		passwordInputField.sendKeys("manpreetkaur");
	}
	
	private MyAccount clickLoginBtn() {
		loginBtn.click();
		return new MyAccount();
	}

	public MyAccount loginToPortal() {
		enterEmail();
		enterPassword();
		return clickLoginBtn();
	}
	
}
