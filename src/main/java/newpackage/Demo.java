package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

		System.out.println(list.size());

		for (WebElement Rlist : list) {

			if (Rlist.getAttribute("value").equals("Cricket") || Rlist.getAttribute("value").equals("Hockey")) {

				Rlist.click();
				continue;

			}
	}
}
	
}