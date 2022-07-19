package failedcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot extends Base {

	@Test
	public void capturescreenshot() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.gog.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		Assert.assertEquals(true, false);

		Thread.sleep(5000);

		driver.close();

	}
}
