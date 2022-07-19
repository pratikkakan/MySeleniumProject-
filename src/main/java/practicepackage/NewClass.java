package practicepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {

	public static void main(String[] args) throws  IOException {


//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
		
		FileInputStream file  = new FileInputStream("C:/Users/uttu/Desktop/excel data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int i=0 ;i<rows;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0 ;j<cols;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				switch(cell.getCellType()) {
				
				case STRING:
					System.out.println(cell.getStringCellValue());
				case NUMERIC:
					System.out.println();
				
				}
				
			}
			
		}
		
		
			
		}
		
		
}
