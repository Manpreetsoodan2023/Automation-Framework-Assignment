package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Monitors extends TestBase {

	public Monitors() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaBtn;

	public AppleCinema30 clickAppleCinemaBtn() {
		appleCinemaBtn.click();
		return new AppleCinema30();
	}

	@FindBy(css = "button[onclick = \"wishlist.add('42');\"]")
	private WebElement wishListBtn;

	public void clickWishListBtn() {
		wishListBtn.click();
	}

	
	
	public void getWishListText() {
		String wishListText = wd.findElement(By.xpath("//span[text()=\\\"Wish List (0)\\\"]")).getText();
		int quantity = Integer.parseInt(wishListText);
		System.out.println(quantity);
	}

}
