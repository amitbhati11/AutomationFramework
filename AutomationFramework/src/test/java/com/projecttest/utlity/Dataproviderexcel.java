package com.projecttest.utlity;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexcel {
	ExceldataProvider edp;
	
	@DataProvider(name="testdata")
	public Object[][] datap() throws Exception{
		String xlpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFramework\\Datafiles\\datalogin.xlsx";
		String sheetname="Sheet1";
				
		Object value [][]=getdataexl(xlpath, sheetname);
		return value;
	}
	
	/*@Test(dataProvider="testdata")
	public void finaldata(String username,String password,String id) {
		
	}
	*/
	
	public Object [][] getdataexl(String xlpath,String sheetname) throws Exception{
		edp=new ExceldataProvider(xlpath,sheetname );
		
		int Rownum=edp.rownum();
		int colnum=edp.colnum();
		
		Object data[][]=new Object[Rownum-1][colnum];
		for(int i=1;i<Rownum;i++) {
			for(int j=0;j<colnum;j++) {
				data [i-1][j]=edp.getcellstringdata(i, j);
			}
		}
		
		return data;
	}

}
