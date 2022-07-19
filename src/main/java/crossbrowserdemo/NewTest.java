package crossbrowserdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	
	WebDriver driver;

  @Parameters({"browser"})
  @Test
  public void launch(String browser) {
	  
	  System.out.println("Running browser is " +browser);
	  
	  if(browser.equals("chrome")) {
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.cricbuzz.com/");
		  
		  driver.quit();
		  
	  } else if (browser.equals("edge")) {
		  
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  driver.get("https://www.cricbuzz.com/");
		  
	  }
	  
	  
  }
  
  
  
  
  
  
}
