package com.naveenautomationlabs.AutomationFramework.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStore extends TestBase {

	public YourStore() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//span[text()=\"My Account\"]")
	private WebElement myAccountBtn;

//	WebElement myAccountBtn = wd.findElement(By.xpath("//span[text()=\\\"My Account\\\"]"));

	@FindBy(xpath = "//a[text()=\"Register\"]")
	private WebElement registerBtn;

	@FindBy(xpath = "//a[text()=\"Login\"]")
	private WebElement loginBtn;

	public AccountLogin clickLoginBtn() {
		loginBtn.click();
		return new AccountLogin();
	}

	public YourStore clickMyAccountBtn() {
		myAccountBtn.click();
		return new YourStore();

	}

	public RegisterAccount clickRegisterBtn() {
		registerBtn.click();
		return new RegisterAccount();

	}

	@FindBy(css = "input[name='search']")
	public WebElement searchInput;

	@FindBy(css = "button.btn.btn-default.btn-lg")
	WebElement searchBtn;

	public void enterSearchText() {
		searchInput.sendKeys("iphone");

	}

	public SearchIphone clickSearchBtn() {
		searchBtn.click();
		return new SearchIphone();
	}

	public Iphone getRowElement(String text) {

		List<WebElement> rowElements = wd.findElements(By.cssSelector("div.product-layout div.caption a"));

		for (WebElement element : rowElements) {

			if (element.getText().contains(text)) {

				element.click();

			}
		}
		return new Iphone();
	}

	

	}


