package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AppleCinema30 extends TestBase {

	public AppleCinema30() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.radio>label>input[value=\"5\"]")
	WebElement Radiobtn;

	@FindBy(css = "div.checkbox>label>input[value=\"9\"]")
	WebElement Checkbox;

	@FindBy(css = "#input-option217")
	WebElement Dropdown;
	
	@FindBy(css = "#input-option209") 
	WebElement textInputArea;

	@FindBy(css = "#button-upload222")
	WebElement uploadFileButton;

	@FindBy(css = "#input-quantity")
	WebElement quantityTextField;

	@FindBy(xpath = "//button[text()=\"Add to Cart\"]")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//a[text()=\"shopping cart\"]")
	WebElement shoppingCartBtn;

	public void selectRadioBtn() {
		Radiobtn.click();
	}

	public void selectCheckbox() {
		Checkbox.click();
	}
	
	public void selectDropdown() {
		Select sc = new Select(Dropdown);
		sc.selectByValue("3");
	}

	public void uploadFile() {
		uploadFileButton.sendKeys("C:\\Users\\parte\\Downloads\\test.pdf");
		wd.switchTo().alert().accept();
	}

	public void enterText() {
		textInputArea.sendKeys("test");
	}
	
	public void enterQuantity() {
		quantityTextField.clear();
		quantityTextField.sendKeys("1");

	}

	public void clickAddToCartButton() {
		addToCartBtn.click();
	}
	
	public void clickShoppingCartBtn() {
		
	}
	

}
