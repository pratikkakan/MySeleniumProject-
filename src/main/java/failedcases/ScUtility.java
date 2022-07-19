package failedcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScUtility extends Base {

	public static String takesc(String screenshotname) throws IOException {

		
		File up = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dn = new File("C:/Users/uttu/Desktop/xyz.bmp");
		
		FileUtils.copyFile(up, dn);
		
		
		
		return screenshotname;

	}

}
