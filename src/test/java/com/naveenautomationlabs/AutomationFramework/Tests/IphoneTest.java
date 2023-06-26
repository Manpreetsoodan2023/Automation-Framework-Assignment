package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages.AppleCinema30;
import com.naveenautomationlabs.AutomationFramework.Pages.Checkout;
import com.naveenautomationlabs.AutomationFramework.Pages.Iphone;
import com.naveenautomationlabs.AutomationFramework.Pages.Monitors;
import com.naveenautomationlabs.AutomationFramework.Pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages.RegisterAccount;
import com.naveenautomationlabs.AutomationFramework.Pages.SearchIphone;
import com.naveenautomationlabs.AutomationFramework.Pages.ShoppingCart;
import com.naveenautomationlabs.AutomationFramework.Pages.SuccessMessage;
import com.naveenautomationlabs.AutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class IphoneTest extends TestBase {

	YourStore yourStore;
	RegisterAccount registerAccount;
	MyAccount myAccount;
	Monitors monitors;
	AppleCinema30 appleCinema;
	ShoppingCart shoppingCart;
	Checkout checkout;
	SuccessMessage success;
	SearchIphone searchIphone;
	Iphone iphone;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();
	}

	@Test
	public void ValidateIfSelectedItemIsDisplayed() {

		yourStore.getRowElement("Canon EOS 5D");
		
		
	}

	@AfterMethod
	public void quit() {
//	tearDown();    
	}

}
