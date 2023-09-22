package com.xl;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry implements IRetryAnalyzer {

	int maxcount = 3;
	int count = 1;

	@Override
	public boolean retry(ITestResult result) {

		if (count <= maxcount) {
			count++;
			return true;
		}

		return false;
	}

}
