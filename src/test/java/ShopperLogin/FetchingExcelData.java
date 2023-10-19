package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelData 
{

	public static void main(String[] args) throws Throwable 
	{
		File file = new File("C:\\Users\\91963\\OneDrive\\Documents\\PersonalData1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		 Workbook workbook = WorkbookFactory.create(fis);
		 Sheet sheet = workbook.getSheet("Sheet1");		 
		 Row row = sheet.getRow(0);
		 Cell cell = row.getCell(2);
		 String value = cell.getStringCellValue();
		 System.out.println(value);
		 
		//  String value = workbook.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();

	}

}
