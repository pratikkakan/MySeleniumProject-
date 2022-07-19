package excelsdet;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//create >> Workbook - sheet -create data using object array - rows - cells

public class writedata {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Emp info");

		Object empdata[][] = {

				{ "EmpID", "NAME", "JOB" }, { 1, "Pratik", "QA" }, { 2, "PRANIT", "jr.QA" }, { 3, "Utkarsh", "DEVOPS" }

		};

		int rows = empdata.length;
		int cols = empdata[0].length;

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.createRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.createCell(c);

				Object value = empdata[r][c];

				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);

			}
		}

		FileOutputStream outstream = new FileOutputStream("C:/Users/uttu/Desktop/empdata.xlsx");
		workbook.write(outstream);
		outstream.close();
		System.out.println("Employee.xls file written successfully...");

	}

}
