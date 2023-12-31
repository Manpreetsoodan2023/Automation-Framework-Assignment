package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCart extends TestBase {

	public ShoppingCart() {

		PageFactory.initElements(wd, this);

	}

	@FindBy(xpath = "//a[text()=\"Checkout\"]")
	private WebElement checkoutBtn;

	public Checkout clickCheckoutBtn() {
		checkoutBtn.click();
		return new Checkout();
	}

	
	@FindBy(css = "div.alert")
	private WebElement shoppingCartMessage;

	public String displaySuccessMessage() {
		return shoppingCartMessage.getText();
	}

}
