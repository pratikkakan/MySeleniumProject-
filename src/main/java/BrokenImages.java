import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImages {

	public static void main(String[] args) throws MalformedURLException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/broken_images");

		List<WebElement> images = driver.findElements(By.tagName("img"));

		System.out.print("Total images ::" + images.size());

		for (WebElement image : images) {

			String imagesrc = image.getAttribute("src");
			URL link = new URL(imagesrc);

			try {

				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();

				if (httpconn.getResponseCode() >= 400) {
					
					System.out.println(link + "is a broken image");

				}
			} catch (IOException e) {

				
			}

		}
	}
}