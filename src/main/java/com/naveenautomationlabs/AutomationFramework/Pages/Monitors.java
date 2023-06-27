package com.naveenautomationlabs.AutomationFramework.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Monitors extends TestBase {

	public Monitors() {
		PageFactory.initElements(wd, this);
	}

	public int count = 0;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaBtn;

	public AppleCinema30 clickAppleCinemaBtn() {
		appleCinemaBtn.click();
		return new AppleCinema30();
	}

	
	@FindBy(xpath = "//span[contains(text(),'Wish List')]")
	public WebElement wishListBtn;
	
	public boolean getWishListBtnText() {

		List<WebElement> wishListElements = wd.findElements(By.cssSelector("button>i.fa.fa-heart"));
		for (WebElement webElement : wishListElements) {
			
			webElement.click();
			
			count++;
		}

		return true;
	}

}
