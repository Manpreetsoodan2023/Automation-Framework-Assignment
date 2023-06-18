package com.naveenautomationlabs.AutomationFramework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop = new Properties();

	public TestBase() {
		
		
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\parte\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\com\\naveenautomationlabs\\AutomationFramework\\Config\\Config.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void initialisation() {

		String browserName = prop.getProperty("browser");

		switch (browserName) {
		case "chrome":
			wd=WebDriverManager.chromedriver().create();

			break;

		case "Firefox":
			wd = WebDriverManager.firefoxdriver().create();

			break;

		case "Edge":
			wd = WebDriverManager.edgedriver().create();

			break;

		default:
			System.out.println("Not a valid browser");
			break;
		}

		wd.get(prop.getProperty("URL"));
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICIT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();

	}

	public void tearDown() {
		wd.quit();
	}
}
