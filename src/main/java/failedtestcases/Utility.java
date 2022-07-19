package failedtestcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility extends BASE{

	
	public static void CaptureScreenshot(WebDriver driver, String screenshotname) {
		
		
		File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File down = new File("C:/Users/uttu/Desktop/XYZ.bmp");
		
		try {
			FileUtils.copyFile(sc, down);
			
			System.out.println("Screenshot Taken");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
