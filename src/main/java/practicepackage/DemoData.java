package practicepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		FileInputStream obj = new FileInputStream("C:/Users/uttu/Desktop/Abc.xlsx");
		
		Sheet a = WorkbookFactory.create(obj).getSheet("3");
		
		String id = a.getRow(2).getCell(0).getStringCellValue();
		
		String pass = a.getRow(4).getCell(0).getStringCellValue();
		
		
		driver.findElement(By.id("email")).sendKeys(id);
		
		driver.findElement(By.id("email")).sendKeys(pass);
		
		driver.findElement(By.linkText("Log in")).click();
		
		
		
	}

}
