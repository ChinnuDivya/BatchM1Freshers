package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.sdk.metrics.data.Data;

public class DataUtility 
{

public String fetchingPropertiesFileData(String key) throws Throwable
{
	 File file = new File("C:\\Oopsconcept\\ShopperStackM1\\src\\test\\resources\\TestData\\Propertyfile.properties");
	 FileInputStream fis = new FileInputStream(file);
	 Properties pro = new Properties();
	 pro.load(fis);
	 String value = pro.getProperty(key);
	 return value;
}
   public String fetchingExelFileDataString(String Sheetname,int rowNum,int cellNum) throws Throwable
   {  
        File file = new File("C:\\Users\\91963\\OneDrive\\Documents\\PersonalData1.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(Sheetname);
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(cellNum);
        String value = cell.getStringCellValue();
        return value;
}
public long fetchingExelFileDataNumeric(String Sheetname,int rowNum,int cellNum) throws Throwable
{
	File file = new File("C:\\Users\\91963\\OneDrive\\Documents\\PersonalData1.xlsx");
    FileInputStream fis = new FileInputStream(file);
    Workbook workbook = WorkbookFactory.create(fis);
    Sheet sheet = workbook.getSheet(Sheetname);
    Row row = sheet.getRow(rowNum);
    Cell cell = row.getCell(cellNum);
    long value =(long) cell.getNumericCellValue();
    return value;  
}
public boolean fetchingExelFileDataBoolean(String Sheetname,int rowNum,int cellNum) throws Throwable
{
	File file = new File("C:\\Users\\91963\\OneDrive\\Documents\\PersonalData1.xlsx");
    FileInputStream fis = new FileInputStream(file);
    Workbook workbook = WorkbookFactory.create(fis);
    Sheet sheet = workbook.getSheet(Sheetname);
    Row row = sheet.getRow(rowNum);
    Cell cell = row.getCell(cellNum);
    boolean value = cell.getBooleanCellValue();
    return value;
}
public Date fetchingExelFileDataDate(String Sheetname,int rowNum,int cellNum) throws Throwable
{
	File file = new File("C:\\Users\\91963\\OneDrive\\Documents\\PersonalData1.xlsx");
    FileInputStream fis = new FileInputStream(file);
    Workbook workbook = WorkbookFactory.create(fis);
    Sheet sheet = workbook.getSheet(Sheetname);
    Row row = sheet.getRow(rowNum);
    Cell cell = row.getCell(cellNum);
    Date value = (Date) cell.getDateCellValue();        
    return value;
}
}

