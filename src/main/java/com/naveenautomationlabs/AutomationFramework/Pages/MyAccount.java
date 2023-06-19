package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyAccount extends TestBase {

	public MyAccount() {
		PageFactory.initElements(wd, this);
	}


	@FindBy(css = "ul.nav>li:nth-of-type(3) a")
	private WebElement componentsBtn;

	@FindBy(xpath = "//a[text()=\"Monitors (2)\"]")
	private WebElement monitorsBtn;

	

	public void clickComponentsBtn() {
		componentsBtn.click();
	}

	public Monitors clickMonitorsBtn() {
		monitorsBtn.click();
		return new Monitors();
	}
	
}
