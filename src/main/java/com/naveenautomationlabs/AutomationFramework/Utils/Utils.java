package com.naveenautomationlabs.AutomationFramework.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Utils extends TestBase {

	public static void takeScreenshot(String testname) {

		// Time stamp

		String timeStamp = new SimpleDateFormat("dd.mm.YYYY.HH.mm.ss").format(new Date());

		// Take a screenshot

		File screenshotFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		// Save screenshot

		try {
			FileUtils.copyFile(screenshotFile, new File("./FailedTestScreenshots\\" + "_" + timeStamp + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sleep(long milliseconds) {

		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	public static String generateRandomString(int chCnt) {
		return RandomStringUtils.randomAlphabetic(chCnt);
	}

	public static String generateRandomAlphanumeric(int chCnt) {
		return RandomStringUtils.randomAlphanumeric(chCnt);
	}
	
	public static String generateRandomNumber(int cnt) {
		return RandomStringUtils.randomNumeric(cnt);
	}
	
	
	public static String getCurrentDateTimeStamp() {
		return new SimpleDateFormat("dd.mm.YYYY.HH.mm.ss").format(new Date());
	}
}
