package com.projecttest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projecttest.utlity.Browserfatcory;



public class projecttestloginpage {
	
 public  WebDriver driver;

	By fullname=By.xpath("//input[@placeholder='Enter your full name']");
	
	By passwd=By.xpath("//input[@placeholder='Enter your password']");
	
	By lgnbtn=By.id("login");
	
	By logoff=By.id("logout");

 /*   @FindBy(xpath="//input[@placeholder='Enter your full name']")
	WebElement usname;
     @FindBy(xpath="//input[@placeholder='Enter your password']") 
     WebElement uspwd;
     @FindBy(id="login")
     WebElement lognbtn;*/
	public projecttestloginpage(WebDriver driver) {
	this.driver=driver;
		
	}
	
	public void us_name(String username) {
	
driver.findElement(fullname).sendKeys(username);

		
	}
	public void us_pass(String password) {
	driver.findElement(passwd).sendKeys(password);
	}
	
	public void loginbuton() {
		driver.findElement(lgnbtn).click();
	}
	
	public void logout() {
		driver.findElement(logoff).click();
	}
	

}