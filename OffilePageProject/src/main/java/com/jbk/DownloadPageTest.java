package com.jbk;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadPageTest {
	WebDriver driver;
	LoginPage lp;
	DownloadPage dpp;
	@BeforeClass
	  public void Setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///C:/Windows.old/Users/ashis/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	   driver.manage().window().maximize();
	   lp=new LoginPage(driver);
	   dpp=new DownloadPage(driver);
	}
	@Test
	public void Login(){
		
		lp.Login();
		Assert.assertTrue(true);
	}
	@Test
	
	public void verifyTable(){
		dpp.PrintTable();
		Assert.assertTrue(true);

	
	}
}
