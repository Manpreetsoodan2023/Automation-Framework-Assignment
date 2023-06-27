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
	private WebElement quantiyText;

	public void InputQuantity() {
		quantiyText.clear();
		quantiyText.sendKeys("2");

	}

	@FindBy(xpath = "//button[text()=\"Add to Cart\"]")
	private WebElement addToCartBtn;

	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement shoppingCartBtn;

	public SuccessMessage clickShoppingCartBtn() {
		shoppingCartBtn.click();
		return new SuccessMessage();
	}

	@FindBy(xpath = "//h1[text()='iPhone']")
	private WebElement pageText;

	public String displayPageText() {
		return pageText.getText();
	}
	

	@FindBy(css = "div.alert")
	private WebElement shoppingCartMessage;

	public String displaySuccessMessage() {
		return shoppingCartMessage.getText();
	}
	
	@FindBy(css = "div.btn-group>button[data-original-title=\"Add to Wish List\"]")
	private WebElement wishlistBtn;

	public void clickWishListBtn() {
		wishlistBtn.click();
	}

	@FindBy(css = "div.alert")
	private WebElement wishListMessage;
	
	public String displayWishListMessage() {
		return wishListMessage.getText();
	}

}