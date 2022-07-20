package com.projecttest.utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Proprtisfile {

	Properties pp;
	
	public Proprtisfile() throws IOException {
		String configpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFramework\\Config\\config.properties";
		File file=new File(configpath);
		FileInputStream fis=new FileInputStream(file);
		pp=new Properties();
		pp.load(fis);
	}
	
	public String getbrowser() {
		return pp.getProperty("Browser");
	}
	public String getappurl() {
		return pp.getProperty("prodURL");
	}
}
