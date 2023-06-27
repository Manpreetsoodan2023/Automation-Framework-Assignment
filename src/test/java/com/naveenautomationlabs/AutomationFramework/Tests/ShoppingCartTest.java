package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages.Iphone;
import com.naveenautomationlabs.AutomationFramework.Pages.SearchIphone;
import com.naveenautomationlabs.AutomationFramework.Pages.ShoppingCart;
import com.naveenautomationlabs.AutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCartTest extends TestBase {

	private YourStore yourStore;
	private ShoppingCart shoppingCart;
	private SearchIphone searchIphone;
	private Iphone iphone;
	

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
		iphone.clickAddToCartBtn();
		iphone.clickShoppingCartBtn();
		shoppingCart = new ShoppingCart();

		Assert.assertEquals(shoppingCart.displaySuccessMessage(),"Products marked with *** are not available in the desired quantity or not in stock!\r\n"
				+ "×", "Product is available for shopping");

	}

	@AfterMethod
	public void quit() {
//		tearDown();    
	}

}
