package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages.Monitors;
import com.naveenautomationlabs.AutomationFramework.Pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MonitorsTest extends TestBase {

	private YourStore yourStore;
	private MyAccount myAccount;
	private Monitors monitors;
	private AccountLogin accountLogin;
	

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();

	}

	@Test
	public void validateWishListText() {
		yourStore.clickMyAccountBtn();
		accountLogin = yourStore.clickLoginBtn();
		myAccount = accountLogin.loginToPortal();
		myAccount.clickComponentsBtn();
		monitors = myAccount.clickMonitorsBtn();
		monitors.getWishListBtnText();
		
		String wishListText = "Wish List" + " ("+ monitors.count +")";
		
		Assert.assertEquals(monitors.wishListBtn.getText(), wishListText, "Wishlist is not getting updated");
	}

	@AfterMethod
	public void quit() {
//		tearDown();    
	}

}
