package com.testngannotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
int failedcount=0;
int limit=3;
	@Override
	public boolean retry(ITestResult result) {
		if(failedcount<limit) {
			failedcount++;
			return true;
		}
		return false;
	}

}
