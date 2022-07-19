package realtimeexple;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	WebDriver driver;
	
  @BeforeSuite
  public void broswerparameter() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  System.out.println("Webdriver setup is completed");
	 
  }
  
  @BeforeTest
  public void url()  {
	  
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  System.out.println("URL IS OPENED");
	 
  }
  

  @BeforeClass
  public void verfiyurl() throws InterruptedException {
	  
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://www.facebook.com/");
	  System.out.println("URL IS VERIFIED");
	  System.out.println();
	  Thread.sleep(1000);

  }
  
  @BeforeMethod
  public void inputdata() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratikkakan123@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Licaao2022@");
	  driver.findElement(By.name("Login")).click();
	  System.out.println("Login Successful");
	  System.out.println();
	  
	  Thread.sleep(1000);
  }
  @AfterMethod
  public void screenshot() throws IOException, InterruptedException {
	  
	  File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File d = new File("C:/Users/uttu/Desktop/Facebook.bmp");
	  
	  FileUtils.copyFile(s, d);
	  
	  System.out.println("Screenshot is taken");
	  Thread.sleep(1000);

  }
  
  @AfterClass
  public void closeapllication() {
	  
	  driver.close();
	  System.out.println("Window is closed");
  }
  
  
  
}
