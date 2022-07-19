import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionssss {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement el = driver.findElement(By.xpath("//a[normalize-space()='Careers']"));
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		act.moveToElement(el).build().perform();
		
		

	}

}
