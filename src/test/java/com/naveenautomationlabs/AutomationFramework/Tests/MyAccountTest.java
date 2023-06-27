package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages.NewsletterSubscription;
import com.naveenautomationlabs.AutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyAccountTest extends TestBase {

	private YourStore yourStore;
	private MyAccount myAccount;
	private AccountLogin accountLogin;
	private NewsletterSubscription newsletter;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();

	}

	@Test
	public void validateNewsletterSubscription() {

		yourStore.clickMyAccountBtn();
		accountLogin = yourStore.clickLoginBtn();
		myAccount = accountLogin.loginToPortal();
		newsletter =myAccount.getSideNavItems();
		newsletter.clickYesRadioBtn();
		newsletter.clickContinueBtn();

		Assert.assertEquals(myAccount.displaySubscriptionSuccessMessage(),
				"Success: Your newsletter subscription has been successfully updated!",
				"Correct message is not displayed");

	}

	@AfterMethod
	public void quit() {
//		tearDown();    
	}

}
