package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass{
	  static By txt_loginame = By.name("txtUserName");
	    static By txt_password = By.name("txtPassword");
	    static By btn_login    = By.name("Submit");
	    		 public static void login(String un,String pw) {
	        driver.findElement(txt_loginame).sendKeys(un);
	        driver.findElement(txt_password).sendKeys(pw);
	        driver.findElement(btn_login).click();
	        Reporter.log(" Login Completed ");
	        }
	    }

