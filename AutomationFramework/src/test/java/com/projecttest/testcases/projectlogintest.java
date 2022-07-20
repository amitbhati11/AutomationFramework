package com.projecttest.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.projecttest.pages.Baseclass;
import com.projecttest.pages.projecttestloginpage;
import com.projecttest.utlity.Browserfatcory;
import com.projecttest.utlity.Dataproviderexcel;
import com.projecttest.utlity.helpclass;

public class projectlogintest extends Baseclass  {

projecttestloginpage ppl;

	@Test(dataProvider="testdata",dataProviderClass=Dataproviderexcel.class)
public void login(String username,String password) throws Exception
{
		logger=report.createTest("login to project");
		ppl=new projecttestloginpage(driver);
		logger.info("started login");
			ppl.us_name(username);
ppl.us_pass(password);
ppl.loginbuton();
Thread.sleep(2000);
ppl.logout();
logger.pass("login success");

	Thread.sleep(1500);
		}
}               