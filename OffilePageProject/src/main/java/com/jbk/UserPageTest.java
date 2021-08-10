package com.jbk;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserPageTest {
	LoginTest lt;
	LoginPage lp;
	UserPage up;
	DashboardPage dp;
	WebDriver driver;
	@BeforeClass
	  public void Setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///C:/Windows.old/Users/ashis/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	   driver.manage().window().maximize();
	   lp=new LoginPage(driver);
	   up=new UserPage(driver);
	}
	@Test(priority=1)
	public void Login(){
		lp.Login();
		Assert.assertTrue(true);
	
	}
	@Test(priority=3)
	public void TestUserPage(){
		up.EnterUserData();
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void userlist(){
		up.cllickUser();
		up.UserList();
		Assert.assertTrue(true);
	}
}
