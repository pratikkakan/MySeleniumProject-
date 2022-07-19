package dataprovider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HalfEbayTest extends Utilityfetchdata {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {

		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}

	@DataProvider
	public Iterator<Object> getdata() throws EncryptedDocumentException, IOException {

		ArrayList<Object> testdata = HalfEbayTest.GetExcelData();
		return testdata.iterator();

	}

	@Test(dataProvider = "getdata")
	public void HalfEbayTestDemo (String firstname, String lastname, String mail, String pass) {

		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);

		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);

		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(mail);

		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);

	}

	@AfterMethod
	public void TearDown() {

		driver.quit();
	}

}
