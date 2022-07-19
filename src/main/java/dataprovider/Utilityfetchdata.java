package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilityfetchdata {

	public static ArrayList<Object> GetExcelData() throws EncryptedDocumentException, IOException {

		ArrayList<Object> mydata = new ArrayList<Object>();

		FileInputStream obj = new FileInputStream("C:/Users/uttu/Desktop/automation/EbayReg.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(obj);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		for (int i = 2; i < sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);

			String firstname = row.getCell(0).getStringCellValue();

			String lastname = row.getCell(1).getStringCellValue();

			String mail = row.getCell(2).getStringCellValue();

			String pass = row.getCell(3).getStringCellValue();
			
			Object ob[] = {firstname,lastname,mail,pass};
			
			mydata.add(ob);
			
		}

		return mydata;

	}

}
