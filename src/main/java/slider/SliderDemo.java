package slider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Slider.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement el = driver.findElement(By.xpath("//div[@id=\"slider\" ]//a[@class=\"ui-slider-handle ui-state-default ui-corner-all\"]"));
		
		
		System.out.println(el.getLocation().getX());
		System.out.println(el.getLocation().getY());
		
		Actions act = new Actions(driver); 
		
		act.dragAndDropBy(el,300,100).perform();
		
		act.sendKeys(Keys.HOME).build().perform();
		
	}

}
