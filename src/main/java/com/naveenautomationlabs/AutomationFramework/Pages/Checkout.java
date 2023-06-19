package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Checkout extends TestBase {

	public Checkout() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#input-payment-firstname")
	private WebElement firstNamePaymentInputField;

	@FindBy(css = "#input-payment-lastname")
	private WebElement lastNamePaymentInputField;

	@FindBy(css = "#input-payment-company")
	private WebElement companyInputField;

	@FindBy(css = "#input-payment-address-1")
	private WebElement addressInputField;

	@FindBy(css = "input-payment-city")
	private WebElement cityInputField;

	@FindBy(css = "#input-payment-postcode")
	private WebElement postalCodeInputField;

	@FindBy(css = "#input-payment-country")
	private WebElement countryDropdown;

	@FindBy(css = "input-payment-zone")
	private WebElement regionDropdown;

	@FindBy(css = "input[id=\"button-payment-address\"]")
	private WebElement billingDetailsContinueBtn;

	@FindBy(xpath = "(//input[@name=\"shipping_address\"])[1]")
	private WebElement existingAddressDelivertyDetailRadioBtn;

	@FindBy(css = "input[id=\"button-shipping-address\"]")
	private WebElement deliveryDetailsContinueBtn;

	@FindBy(css = "textarea[name=\"comment\"]")
	private WebElement commentBoxInput;

	@FindBy(css = "input[id=\"button-shipping-method\"]")
	private WebElement deliveryMethodContinueBtn;

	@FindBy(css = "input[type=\"checkbox\"]")
	private WebElement termsCheckbox;

	@FindBy(css = "input[id=\"button-payment-method\"]")
	private WebElement paymentMethodContinueBtn;

	@FindBy(css = "input[id=\"button-confirm\"]")
	private WebElement confirmOrderBtn;

	
	
	// Methods

	private void enterPaymentFirstName() {
		firstNamePaymentInputField.sendKeys("Manpreet");
	}

	private void enterPaymentLastName() {
		lastNamePaymentInputField.sendKeys("Soodan");

	}

	private void enterCountryName() {
		companyInputField.sendKeys("abctest");
	}

	private void enterPaymentAddress() {
		addressInputField.sendKeys("13 sliprock cres");
	}

	private void enterPaymentCity() {
		cityInputField.sendKeys("London");
	}

	private void enterPaymentPostalCode() {
		postalCodeInputField.sendKeys("N2E4I6");
	}

	private void selectCountryDropdown() {
		Select sc = new Select(countryDropdown);
		sc.selectByValue("38");
	}

	private void selectRegionDropdown() {
		Select sc = new Select(regionDropdown);
		sc.selectByValue("610");
	}
	
	
	

	private void clickBillingDetailContinueBtn() {
		billingDetailsContinueBtn.click();
	}

	private void clickDeliveryDetailsContinueBtn() {
		deliveryDetailsContinueBtn.click();
	}

	private void enterCommentBoxText() {
		commentBoxInput.sendKeys("test comment");
	}

	private void clickDeliveryMethodContinueBtn() {
		deliveryMethodContinueBtn.click();
	}

	private void clickTermsCheckbox() {
		termsCheckbox.click();
	}

	private void clickPaymentMethodContinueBtn() {
		paymentMethodContinueBtn.click();
	}

	public SuccessMessage clickConfirmOrderBtn() {
		confirmOrderBtn.click();
		return new SuccessMessage();
	}
	
	public void enterBillingDetails() {
		enterPaymentFirstName();
		enterPaymentLastName();
		enterCountryName();
		enterPaymentAddress();
		enterPaymentCity();
		enterPaymentPostalCode();
		selectCountryDropdown();
		selectRegionDropdown();
		
	}
	
	public void confirmFinalOrder() {
		clickBillingDetailContinueBtn();
		clickDeliveryDetailsContinueBtn();
		enterCommentBoxText();
		clickDeliveryMethodContinueBtn();
		clickTermsCheckbox();
		clickPaymentMethodContinueBtn();
		clickConfirmOrderBtn();
	}
}
