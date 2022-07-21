package com.projecttest.utlity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfatcory {
	public WebDriver driver;

	public static WebDriver browserstart(WebDriver driver,String Browser,String appURL) {
		
		if(Browser.contains("Chrome")) {
			String cpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFramework\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",cpath);
			driver=new ChromeDriver();
			
		}else if(Browser.contains("Firefox")) {
			String gpath="C:\\Users\\Admin_SRV\\git\\AutomationFramework\\AutomationFramework\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",gpath);
			driver=new FirefoxDriver();
		}else {
			System.out.println("driver is not found");
		}
		
		driver.get(appURL);
/*		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));*/
		
		return driver;
	}
	
	public static void driverdown(WebDriver driver) {
		driver.quit();
	}
}
