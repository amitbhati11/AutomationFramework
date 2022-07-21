package com.projecttest.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.projecttest.utlity.Browserfatcory;
import com.projecttest.utlity.Proprtisfile;
import com.projecttest.utlity.helpclass;


public class Baseclass  {
	 public WebDriver driver;
	public Proprtisfile pf;
public	ExtentReports report;
public ExtentTest logger;
	
	
	@BeforeSuite
	
	public void dataut() throws IOException {
		//adding custom log
		Reporter.log("setting is up", true);
		pf=new Proprtisfile();
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File("C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFramework\\Reports\\Project_"+helpclass.getcurrentime()+".html"));
	report=new ExtentReports();
	report.attachReporter(extent);
	Reporter.log("setting is done", true);
	}

	@Parameters("browser")
	@BeforeClass
	
	public void setup(String browser) {
	Reporter.log("start test", true);
	//	driver=Browserfatcory.browserstart(driver, pf.getbrowser(),pf.getappurl());
		driver=Browserfatcory.browserstart(driver, browser,pf.getappurl());
		Reporter.log("application is started", true);
		
	}

@AfterMethod
public void teardownbr(ITestResult itr) throws IOException {
	Reporter.log("test is about to end", true);
	
	if(itr.getStatus()==ITestResult.FAILURE) {
//	helpclass.capturescreenshot(driver);
	logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(helpclass.capturescreenshot(driver)).build());
	}else if(itr.getStatus()==ITestResult.SUCCESS) {
		logger.pass("Test passed",MediaEntityBuilder.createScreenCaptureFromPath(helpclass.capturescreenshot(driver)).build());
	}
	
	report.flush();
	Reporter.log("Report is generated", true);
}

/*@Afterclass
	public void teardown() {
		Browserfatcory.driverdown(driver);
	}*/
	
}
