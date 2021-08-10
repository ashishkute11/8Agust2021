package com.jbk;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class UserLinkPageTest {
	LoginPage lp;
	UserLinkPage ulp;
	 WebDriver driver;
	@BeforeClass
	public void setup(){
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///C:/Windows.old/Users/ashis/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	   driver.manage().window().maximize();
	   lp=new LoginPage(driver);
	   ulp=new UserLinkPage(driver);
	
	}
	@Test(priority=1)
	public void Loginpage(){
		lp.Login();
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void TablePrint(){
		ulp.PrintTable();
		Assert.assertTrue(true);

	}

}
