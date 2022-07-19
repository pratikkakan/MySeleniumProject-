package waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gog.com/");
		driver.manage().window().maximize();
//
//		FluentWait wait = new FluentWait(driver);
//		wait.withTimeout(20, TimeUnit.SECONDS);
//		wait.pollingEvery(5, TimeUnit.SECONDS);
//		wait.ignoring(NoSuchElementException.class);

	}

}
