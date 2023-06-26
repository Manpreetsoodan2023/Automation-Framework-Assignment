package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
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

public class SuccessMessageTest extends TestBase {

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
	public void validateOrderPlacedSuccessfully() {

		
		yourStore.clickMyAccountBtn();
		registerAccount = yourStore.clickRegisterBtn();
		myAccount = registerAccount.enterRegistrationDetails();
		myAccount.clickComponentsBtn();
		monitors = myAccount.clickMonitorsBtn();
		appleCinema = monitors.clickAppleCinemaBtn();
		appleCinema.cartDetails();
		appleCinema.clickAddToCartButton();
		shoppingCart = appleCinema.clickShoppingCartBtn();
		checkout = shoppingCart.clickCheckoutBtn();
		checkout.enterBillingDetails();
		checkout.confirmFinalOrder();
		success = checkout.clickConfirmOrderBtn();

		String messageText = success.displaySuccessMessage();
		Assert.assertEquals(messageText, "Your order has been placed!", "Correct message is not displayed");
		success.clickContinueBtn();

	}

	
	
	@AfterMethod
	public void quit() {
//	tearDown();    
	}

}
