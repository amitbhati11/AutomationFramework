package com.projecttest.utlity;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class helpclass {
	
	//custom library-capturescreenshot,alerts,handlerames,handlewindows,javascriptexecutor
	
	public static String capturescreenshot(WebDriver driver) throws IOException {
		String  path="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFramework\\Screenshots\\project__"+getcurrentime()+"login.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File(path));
		return path;
	}
public static String getcurrentime() {
	DateFormat dformat=new SimpleDateFormat("MM_dd_yyy_HH_mm_ss");
	Date currdate=new Date();
	
	
	return dformat.format(currdate);
}
}