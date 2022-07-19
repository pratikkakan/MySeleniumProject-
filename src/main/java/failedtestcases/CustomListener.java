package failedtestcases;

import org.testng.ITestListener;

public class CustomListener extends Utility implements ITestListener{
	
	public void onTestFailure() {
		
		
		CustomListener.CaptureScreenshot(driver,this.getClass().getName());
		
		System.out.println("Failed Test");
		
	}
	

}
