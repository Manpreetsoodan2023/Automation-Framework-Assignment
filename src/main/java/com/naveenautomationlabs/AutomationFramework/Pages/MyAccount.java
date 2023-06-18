package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyAccount extends TestBase {

	public MyAccount() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content>h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "ul.nav>li:nth-of-type(3) a")
	private WebElement ComponentsBtn;

	@FindBy(xpath = "//a[text()=\"Monitors (2)\"]")
	private WebElement MonitorsBtn;

	
	public String getMyAccountText() {
		return myAccountText.getText();

	}

	public void clickComponentsBtn() {
		ComponentsBtn.click();
	}

	public void clickMonitorsBtn() {
		MonitorsBtn.click();
	}
	
}
