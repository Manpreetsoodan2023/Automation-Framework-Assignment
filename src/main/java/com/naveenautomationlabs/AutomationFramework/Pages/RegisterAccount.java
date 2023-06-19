package com.naveenautomationlabs.AutomationFramework.Pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class RegisterAccount extends TestBase {

	Random random = new Random();
	int randomNumber = random.nextInt(1000);

	String randomEmail = "manpreet" + randomNumber + "@gmail.com";

	public RegisterAccount() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#input-firstname")
	private WebElement firstNameInputField;

	@FindBy(css = "#input-lastname")
	private WebElement lastNameInputField;

	@FindBy(css = "#input-email")
	private WebElement emailInputField;

	@FindBy(css = "#input-telephone")
	private WebElement telephoneInputField;

	@FindBy(css = "#input-password")
	private WebElement passwordInputField;

	@FindBy(css = "#input-confirm")
	private WebElement confirmPasswordInputField;

	@FindBy(css = "input[name = 'agree']")
	private WebElement privacyCheckboxInput;

	@FindBy(css = "input[value ='Continue']")
	private WebElement continueBtn;

	
	
	private void enterFirstName() {
		firstNameInputField.sendKeys("Manpreet");
	}

	private void enterLastName() {
		lastNameInputField.sendKeys("Soodan");
	}

	private void enterEmail() {
		emailInputField.sendKeys(randomEmail);
	}

	private void enterTelephoneNumber() {
		telephoneInputField.sendKeys("6789064539");
	}

	private void enterPassword() {
		passwordInputField.sendKeys("manpreetkaur");

	}

	private void confirmPassword() {
		confirmPasswordInputField.sendKeys("manpreetkaur");
	}

	private void selectPrivacyCheckbox() {
		privacyCheckboxInput.click();
	}

	public MyAccount clickContinueBtn() {
		continueBtn.click();
		return new MyAccount();
	}
	
	public MyAccount enterRegistrationDetails() {
		enterFirstName();
		enterLastName();
		enterEmail();
		enterTelephoneNumber();
		enterPassword();
		confirmPassword();
		selectPrivacyCheckbox();
		clickContinueBtn();
		return new MyAccount();
		
	}
	
	
}