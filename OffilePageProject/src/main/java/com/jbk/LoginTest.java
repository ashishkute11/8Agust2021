package com.jbk;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
     LoginPage lp;
     DashboardPage dp;
     UserPage up;
	public WebDriver driver = null;
	@BeforeClass
	  public void Setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///C:/Windows.old/Users/ashis/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	   driver.manage().window().maximize();
	   lp=new LoginPage(driver);
	 //  dp=new  DashboardPage(driver);
	  }
	@BeforeMethod
	public void clear(){
		lp.clear();
	}
	
	 @Test
	public void BlackEmail(){
		 lp.InvaliedLogin("", "123456");
		 Assert.assertEquals(lp.getEmailError(),"Please enter email");
	 }
	 @Test
		public void BlackPassword(){
			 lp.InvaliedLogin("kiran@gmail.com", "");
			 Assert.assertEquals(lp.getPasswordError(),"Please enter password.");
		 }
	 @Test
		public void InavliedEmailPassword(){ 
			 lp.InvaliedLogin("ashish@gmail.com", "12345");
			 Assert.assertEquals(lp.getEmailError(),"Please enter email as kiran@gmail.com");
		 }
	 @Test
		public void WrongEmail(){
			 lp.InvaliedLogin("ashishh@gmail.com", "123456");
			 Assert.assertEquals(lp.getEmailError(),"Please enter email as kiran@gmail.com");
		 }
	 @Test
		public void WrongPassword(){
			 lp.InvaliedLogin("kiran@gmail.com", "12345");
			 Assert.assertEquals(lp.getPasswordError(),"Please enter password 123456");
		 }
	 @Test
		public void InavliedPassword(){
			 lp.InvaliedLogin("Kiran@gmail.com", "12345");
			 Assert.assertEquals(lp.getPasswordError(),"Please enter password 123456");
		 }
	 @Test
		public void InValied(){
			 lp.InvaliedLogin("dgfdhr", "");
			 Assert.assertEquals(lp.getEmailError(),"Please enter valid email.");
		 }
	 @Test
		public void Login(){
			 lp.InvaliedLogin("kiran@gmail.com", "123456");
			 Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
		 }
	 

	 /* @Test()
	  public void listOfxourse(){
		  dp.getAllCourses();
		  Assert.assertTrue( dp.getAllCourses());
	  }
	  @Test()
	  public void ListOfPage(){
		  dp.getAllPageName();
		  Assert.assertTrue( dp.getAllPageName());
	  }*/
}
