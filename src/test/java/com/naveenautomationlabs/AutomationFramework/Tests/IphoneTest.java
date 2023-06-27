package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages.Iphone;
import com.naveenautomationlabs.AutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class IphoneTest extends TestBase {

	private YourStore yourStore;
	private Iphone iphone;


	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();
	}

	@Test
	public void ValidateIfSelectedItemIsDisplayed() {

		yourStore.getRowElement();
		iphone = new Iphone();
		Assert.assertEquals(iphone.displayPageText(), "iPhone", "Incorrect text");
		
	}

	@AfterMethod
	public void quit() {
//	tearDown();    
	}

}
