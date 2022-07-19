package cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrows {

	WebDriver driver;

	@Parameters({"Browser"})
	@Test
	public void setup(String Browsername) {

		if (Browsername.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (Browsername.equalsIgnoreCase("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			driver.get("https://www.facebook.com/");

		}else {
			
			System.out.println("Failure");
		}

	}

}
