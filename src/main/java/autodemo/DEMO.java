package autodemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO  {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//div[@id='msdd']")).click();
//		
//		List<WebElement> abc =  driver.findElements(By.xpath("//li[@class=\"ng-scope\"]"));
//		Actions act = new Actions(driver);
//
//		for(WebElement xyz : abc) {
//			if(xyz.getText().equals("English")) {
//				
//				act.doubleClick(xyz).perform();
//			}
//		}
		
		
//		
//		WebElement firstname =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		firstname.sendKeys("Pranit");
//		
//		
//		List<WebElement> gender = driver.findElements(By.xpath("//input[@type='radio']"));
//		
//		//System.out.println(gender.size());
//		Thread.sleep(1000);
//		
//		for(WebElement ref : gender) {
//			
//			if(ref.getAccessibleName().equals("Male")) {
//				
//				ref.click();
//				continue;
//				
//				
//			}
//				
//		}	
//		
//		List<WebElement> ref = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for(WebElement Lref: ref) {
//			
//			String abc = Lref.getAttribute("value");
//			System.out.println(abc);
//			continue;
//				
//		}
		
		
		
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		List<WebElement> allskill = driver.findElements(By.xpath("//select[@id='Skills']/option"));
		
		System.out.println(allskill.size());
		for(WebElement Rskils : allskill) {
			
			if(Rskils.getText().equals("SQL")) {
				
				Rskils.click();
				continue;
			}
			
		}
//				
		}
		
		
	}


