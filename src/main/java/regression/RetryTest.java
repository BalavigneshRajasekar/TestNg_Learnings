package regression;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	private int count = 0;

	private static final int totalCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		if (count < totalCount) {
			System.out.println(count);
			count++;
			return true;

		}

		return false;
	}

}
