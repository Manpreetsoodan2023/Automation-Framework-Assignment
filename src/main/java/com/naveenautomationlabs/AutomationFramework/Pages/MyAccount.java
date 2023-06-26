package com.naveenautomationlabs.AutomationFramework.Pages;

import java.util.List;

import org.openqa.selenium.By;
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

	public NewsletterSubscription getSideNavItems() {

//		List<WebElement> columnElements = wd.findElements(By.cssSelector("a.list-group-item"));
//		for (WebElement element : columnElements) {
//
//			if (element.getText().contains("Newsletter")) {
//				
//				element.click();
//			}
		
		wd.findElement(By.cssSelector("div.list-group>a:nth-of-type(12)")).click();
			
		
		
		return new NewsletterSubscription();
	}

	@FindBy(css = "div.alert")
	WebElement subscriptionSuccessMessage;

	public String displaySubscriptionSuccessMessage() {
		return subscriptionSuccessMessage.getText();
	}

}
