package dtaproviderDss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderReal {
	
	public WebDriver driver;
	
	  @BeforeMethod
		public  void launchBrowser ()   {
		  
			WebDriverManager.chromedriver().create();
		 
			driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
	  }
	  
	  @DataProvider
	  public Object getData1(){
	  	Object data[][] = new Object[3][2];
	  	
	  	data[0][0]="8329080292";
	  	data[0][1]="Sandip@123";
	  	
	  	data[1][0]="user2";
	  	data[1][1]="password2";
	  	
	  	data[2][0]="user3";
	  	data[2][1]="password3";
	  	
			return data;
	  	
	  }
	  @Test(dataProvider="getData1")
	  public void login(String username,String password) throws InterruptedException 
	  {
	  	
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("login")).click();

			driver.close();
			
	 }

}