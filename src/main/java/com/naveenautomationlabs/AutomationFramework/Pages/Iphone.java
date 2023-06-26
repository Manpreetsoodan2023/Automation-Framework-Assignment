package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Iphone extends TestBase {

	public Iphone() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#input-quantity")
	WebElement quantiyText;

	public void InputQuantity() {
		quantiyText.clear();
		quantiyText.sendKeys("2");

	}

	@FindBy(xpath = "//button[text()=\"Add to Cart\"]")
	WebElement addToCartBtn;

	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

	@FindBy(xpath = "//a[text()='shopping cart']")
	WebElement shoppingCartBtn;

	public SuccessMessage clickShoppingCartBtn() {
		shoppingCartBtn.click();
		return new SuccessMessage();
	}

	@FindBy(xpath = "//h1[text()='iPhone']")
	WebElement pageText;
	
	public String displayPageText() {
		return pageText.getText();
	}
	
	
	@FindBy(css = "div.btn-group>button[data-original-title=\"Add to Wish List\"]")
	WebElement wishlistBtn;
	
	public void clickWishListBtn() {
		wishlistBtn.click();
	}

}