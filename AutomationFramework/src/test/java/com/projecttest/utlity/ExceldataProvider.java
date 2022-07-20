
package com.projecttest.utlity;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataProvider {
XSSFWorkbook workbook;
XSSFSheet sheet;

	public ExceldataProvider(String xlpath,String sheetname) throws IOException {
		
		workbook=new XSSFWorkbook(xlpath);
		sheet=workbook.getSheet(sheetname);
	}
	
	public int rownum() {
		int row=sheet.getPhysicalNumberOfRows();
		return row;
	}
	public int colnum() {
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		return col;
	}
	public String getcellstringdata(int rnum,int clnum) throws Exception {
		DataFormatter formater=new DataFormatter();
		String data=formater.formatCellValue(sheet.getRow(rnum).getCell(clnum));
		return data;
	}
}
