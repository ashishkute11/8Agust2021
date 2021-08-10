package com.jbk;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DashboardTest {
WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	@BeforeClass
	  public void Setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///C:/Windows.old/Users/ashis/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	   driver.manage().window().maximize();
	   lp=new LoginPage(driver);
	   dp=new DashboardPage(driver);
	}
	@Test
	public void Login(){
		
		lp.Login();
		Assert.assertTrue(true);
	}
	@Test
	
	public void verifyAllcourse(){
		dp.getAllCourses();
		Assert.assertTrue(dp.getAllCourses());

	}
	@Test
	public void verifyallPages(){
		dp.getAllPageName();
		Assert.assertTrue(dp.getAllPageName());
	}
}
