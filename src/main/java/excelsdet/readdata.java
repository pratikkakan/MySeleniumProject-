package excelsdet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readdata {

	public static void main(String[] args) throws IOException {

		//WebDriver driver = WebDriverManager.chromedriver().create();

		// driver.get("https://www.facebook.com/");

		// driver.manage().window().maximize();

		FileInputStream file = new FileInputStream("C:/Users/uttu/Desktop/excel data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sh = workbook.getSheet("Sheet1");

		int rows = sh.getLastRowNum();
		int cols = sh.getRow(1).getLastCellNum();

		for (int i = 0; i <= rows; i++) {

			XSSFRow row = sh.getRow(i);

			for (int j = 0; j < cols; j++) {

				XSSFCell cell = row.getCell(j);

				switch (cell.getCellType()) {

				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
                  }
				
				System.out.print(" | ");

			}

			
			System.out.println();
		}
	}
}