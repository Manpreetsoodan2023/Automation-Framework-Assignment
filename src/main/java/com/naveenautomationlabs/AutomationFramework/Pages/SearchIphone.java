package com.naveenautomationlabs.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class SearchIphone extends TestBase {
	
	public SearchIphone() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath = "//a[text()='iPhone']")
	WebElement iphoneBtn;
	
	
    public Iphone clickIphoneBtn() {
    	iphoneBtn.click();
    	return new Iphone();
    }
}
