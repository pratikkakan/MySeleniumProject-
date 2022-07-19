package javascriptexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javademo {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor js = ((JavascriptExecutor) driver) ;
		
		//title
		Object title = js.executeScript(" return document.title");
			
		System.out.println(title);
		
		//alert
		//js.executeScript("alert('THIS IS A POP UP')");
		
		//highlight
//		
//		WebElement el = driver.findElement(By.linkText("Books"));
//		
//		js.executeScript("arguments[0].style.border= '3px solid red'",el);
//		
//		//scroll
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		
//		//zoom
//		js.executeScript("document.body.style.zoom ='50%'");
//		

		
		//scroll to
		js.executeScript("window.scrollBy('0','500')");
		
		
	}

}
