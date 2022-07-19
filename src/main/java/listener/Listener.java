package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Start");
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Success");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Failure");
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Skipped");
	}

}
