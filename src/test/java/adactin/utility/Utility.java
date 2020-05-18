package adactin.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	Workbook wb;
	Sheet sheet;
	
	public void configExcel(String excelPath) {
		File scr = new File(excelPath);
		try {
			FileInputStream ip = new FileInputStream(scr);
			wb = new XSSFWorkbook(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getData(String sheetName, int row, int colurm) {
		sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(row).getCell(colurm).getStringCellValue();
		return data;
	}
}
