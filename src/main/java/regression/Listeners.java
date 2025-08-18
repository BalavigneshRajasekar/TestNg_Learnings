package regression;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Utilities implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failes");
		screenshot();
	}

}
