package com.naveenautomationlabs.AutomationFramework.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class RetryFailedTests extends TestBase implements IRetryAnalyzer {

	int maxCounter = 2;
	int cnt = 1;

	@Override
	public boolean retry(ITestResult result) {
		logger.info("Retrying Failed test !!!!!!!!!!!! " + result.getMethod().getMethodName() + " for " + cnt + " times " );

		if (cnt < maxCounter) {
			cnt++;
			return true;
		}

		return false;
	}

}
