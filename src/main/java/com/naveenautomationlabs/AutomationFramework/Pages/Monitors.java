package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Monitors extends TestBase {

	public Monitors() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "(//span[text()=\"Add to Cart\"])[last()-1]")
	WebElement addToCartBtn;

	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}
}
