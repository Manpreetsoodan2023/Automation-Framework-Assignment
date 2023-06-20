package com.naveenautomationlabs.AutomationFramework.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AppleCinema30 extends TestBase {

	public AppleCinema30() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.radio>label>input[value=\"7\"]")
	WebElement Radiobtn;

	@FindBy(css = "div.checkbox>label>input[value=\"9\"]")
	WebElement Checkbox;

	@FindBy(css = "#input-option217")
	WebElement Dropdown;

	@FindBy(css = "#input-option209")
	WebElement textInputArea;

	@FindBy(css = "#button-upload222")
	WebElement uploadFileButton;

	@FindBy(xpath = "//button[text()=\"Add to Cart\"]")
	WebElement addToCartBtn;

	@FindBy(xpath = "//a[text()=\"shopping cart\"]")
	WebElement shoppingCartBtn;

	private void selectRadioBtn() {
		Radiobtn.click();
	}

	private void selectCheckbox() {
		Checkbox.click();
	}

	private void selectDropdown() {
		Select sc = new Select(Dropdown);
		sc.selectByValue("3");
	}

	private void enterText() {
		textInputArea.sendKeys("test");
	}

	private void uploadFile() {
//		uploadFileButton.sendKeys("C:\\Users\\parte\\Downloads\\test.pdf");

		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click();", uploadFileButton);

		try {
			Robot rb = new Robot();
			rb.delay(2000);

			// put path to file in a clipboard

			StringSelection ss = new StringSelection("C:\\Users\\parte\\Downloads\\test.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			// CTRL+V

			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);

			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);

			// Enter
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_ENTER);

		} catch (AWTException e) {

			e.printStackTrace();
		}

		wd.switchTo().alert().accept();
	}

	public AppleCinema30 clickAddToCartButton() {
		addToCartBtn.click();
		return new AppleCinema30();
	}

	public ShoppingCart clickShoppingCartBtn() {
		shoppingCartBtn.click();
		return new ShoppingCart();

	}

	public void cartDetails() {
		selectRadioBtn();
		selectCheckbox();
		selectDropdown();
		enterText();
		uploadFile();
		clickAddToCartButton();
		clickShoppingCartBtn();

	}

}
