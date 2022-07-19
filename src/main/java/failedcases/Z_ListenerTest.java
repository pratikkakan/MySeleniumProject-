package failedcases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Z_ListenerTest implements ITestListener {

	public void onTestfailure(ITestResult result) {
		
		try {
			ScUtility.takesc(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
