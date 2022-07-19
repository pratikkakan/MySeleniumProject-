package mypomscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HustelFinalRun {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();

		Thread.sleep(1000);

		HustlePom2 obj = new HustlePom2(driver);

		obj.SendData();
		Thread.sleep(1000);

		obj.GenderData();

		Thread.sleep(1000);

		obj.HobbiesData();

		Thread.sleep(1000);

		obj.skilldata();
		
		Thread.sleep(50000);

	}

}
