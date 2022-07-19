package practicepackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDua {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		WebElement  el = driver.findElement(By.linkText("click"));
		el.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement wb  = wait.until(visi)

		
		
		
//		
//		Set<String> tabs = driver.getWindowHandles();
//		
//		
//		
//		System.out.println(tabs);
//		
//		Iterator<String> it = tabs.iterator();
//		String w1 = it.next();
//		String w2 = it.next();
//		
//		driver.switchTo().window(w2);
//		
//		
		
	}
}