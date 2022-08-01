package hashmap;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMap {

	@BeforeTest
//	public void setUp() {
//
//		WebDriverManager.chromedriver().setup();
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://demo.automationtesting.in/Register.html");
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//		
//		//driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//		
//
//	}

	@BeforeSuite
	public static HashMap<String, String> UserData() {

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("CFD_Individual", "shubham.chopde:schopde321");
		hm.put("Professional", "sumit.deshmukh: sdeshmukh321");
		hm.put("Company", "pratik.kakan :pkakan123");
		return hm;

	}

	@Test
	public void print() {

		System.out.println(UserData());

	}

}
