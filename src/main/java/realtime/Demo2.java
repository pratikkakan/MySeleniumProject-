package realtime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FileInputStream excel = new FileInputStream("C:/Users/uttu/Desktop/Abc.xlsx");
	
		Sheet a = WorkbookFactory.create(excel).getSheet("Sheet3");
		
		String id = a.getRow(2).getCell(0).getStringCellValue();
		String pass = a.getRow(4).getCell(0).getStringCellValue();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(id);

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	}

}
