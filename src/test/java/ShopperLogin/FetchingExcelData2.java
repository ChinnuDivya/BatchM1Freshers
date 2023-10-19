package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelData2 {

	public static void main(String[] args) throws Throwable 
	{
		File file = new File("C:\\Users\\91963\\OneDrive\\Documents\\PersonalData1.xlsx");
		
		FileInputStream fis = new FileInputStream(file);	
		 Workbook workbook = WorkbookFactory.create(fis);
		 Sheet sheet = workbook.getSheet("Sheet1");
		 int lastRowIndex = sheet.getLastRowNum();
		 short lastCellValue = sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0; i<lastRowIndex; i++)
		 {
			 for(int j=0; j<lastCellValue; j++)
			 {
				 String value=sheet.getRow(i).getCell(j).getStringCellValue();	
				 
				 System.out.println(value);
				 }
			 System.out.println();
		 }		 		
	}
}
