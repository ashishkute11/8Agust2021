package com.jbk;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DashboardPage {
	LoginPage lp;
	
	WebDriver driver;
	@FindBy(xpath="//h3")
	List<WebElement> courses;
	
	@FindBy(xpath="//li/a/span")
	List<WebElement> Allpage;
	
	@FindBy(xpath="//li/a/span")
	Select Page;
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	public boolean getAllCourses(){
		ArrayList<String> actualArraylist=new ArrayList();
		for(WebElement course:courses){
			String text=course.getText();
			actualArraylist.add(text);
		}
			ArrayList<String> ExpectedArraylist=new ArrayList();
			ExpectedArraylist.add("Selenium");
			ExpectedArraylist.add("Java / J2EE");
			ExpectedArraylist.add("Python");
			ExpectedArraylist.add("Php");
			if(actualArraylist.equals(ExpectedArraylist))
				return true;
			return false;
	}
	
	
	public boolean getAllPageName(){
		ArrayList<String> actualAllPageName=new ArrayList();
		for(WebElement course:Allpage){
			String text=course.getText();
			actualAllPageName.add(text);
		}
			ArrayList<String> ExpectedAllPageName=new ArrayList();
			ExpectedAllPageName.add("Dashboard");
			ExpectedAllPageName.add("Users");
			ExpectedAllPageName.add("Operators");
			ExpectedAllPageName.add("Useful Links");
			ExpectedAllPageName.add("Downloads");
			ExpectedAllPageName.add("Logout");

			if(actualAllPageName.equals(ExpectedAllPageName)){
				return true;
			}else
			return false;
		
	
			}
	public UserPage User(){
		lp.ValiedLogin();
		return new UserPage(driver);
	
		
	}
	
}
