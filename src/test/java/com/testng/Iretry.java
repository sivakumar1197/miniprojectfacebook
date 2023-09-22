package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry implements IRetryAnalyzer {

	int count = 0;
	int maxcount = 5;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count < maxcount) {
			count++;
			return true;
		}

		return false;
	}

}
