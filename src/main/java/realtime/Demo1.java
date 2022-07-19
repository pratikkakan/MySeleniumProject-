package realtime;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		
		List<WebElement> obj = driver.findElements(By.tagName("a"));
		int totalLinks = obj.size();
		int brokenlink = 0;
		// int validlink = 0;

		System.out.print("" + totalLinks);

		Thread.sleep(1000);
		
		for (WebElement att : obj) {

			String url = att.getAttribute("href");

			Thread.sleep(1000);
			
			if (url == null || url.isEmpty()) {

				System.out.println("url is empty");
			}

			URL links = new URL(url);

			Thread.sleep(1000);
			
			try {

				HttpURLConnection ref = (HttpURLConnection) links.openConnection();
				ref.connect();

				if (ref.getResponseCode() >= 400) {
					System.out.print(ref.getResponseCode() + url + "is a broken link");
					brokenlink++;
					continue;

				} else {

					System.out.println(ref.getResponseCode() + url + "is a valid link");
					// validlink++;
				}

			}

			catch (MalformedURLException e) {

			}

		}
		Thread.sleep(1000);
		System.out.print("Number of Broken Links" + brokenlink);

	}

}
