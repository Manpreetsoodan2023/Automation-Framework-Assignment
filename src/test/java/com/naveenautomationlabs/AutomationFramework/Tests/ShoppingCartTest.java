package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages.AppleCinema30;
import com.naveenautomationlabs.AutomationFramework.Pages.Checkout;
import com.naveenautomationlabs.AutomationFramework.Pages.Iphone;
import com.naveenautomationlabs.AutomationFramework.Pages.Monitors;
import com.naveenautomationlabs.AutomationFramework.Pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages.NewsletterSubscription;
import com.naveenautomationlabs.AutomationFramework.Pages.RegisterAccount;
import com.naveenautomationlabs.AutomationFramework.Pages.SearchIphone;
import com.naveenautomationlabs.AutomationFramework.Pages.ShoppingCart;
import com.naveenautomationlabs.AutomationFramework.Pages.SuccessMessage;
import com.naveenautomationlabs.AutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCartTest extends TestBase {

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
	AccountLogin accountLogin;
	NewsletterSubscription newsletter;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();

	}

	@Test
	public void validateShoppingCartMessage() {

		yourStore.enterSearchText();
		searchIphone = yourStore.clickSearchBtn();
		iphone = searchIphone.clickIphoneBtn();
		iphone.InputQuantity();
		iphone.clickAddToCartBtn();
		iphone.clickShoppingCartBtn();
		shoppingCart = new ShoppingCart();

		Assert.assertEquals(shoppingCart.displaySuccessMessage(),"Products marked with *** are not available in the desired quantity or not in stock! ", "Product is available for shopping");

	}

	@AfterMethod
	public void quit() {
//		tearDown();    
	}

}
