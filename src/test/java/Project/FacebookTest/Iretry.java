package Project.FacebookTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry implements IRetryAnalyzer {
	int maxcount = 5;
	int count = 0;

	@Override
	public boolean retry(ITestResult result) {

		if (count < maxcount) {
			count++;
			return true;
		}

		return false;
	}

}
