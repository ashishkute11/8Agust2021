package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
WebDriver driver;
	
@FindBy(xpath="//*[text()='Add User']")	
WebElement AddNewUser;
@FindBy(xpath="//*[@id='username']")
WebElement Username;
@FindBy(xpath="//*[@id='mobile']")
WebElement Mobile;
@FindBy(xpath="//*[@id='email']")
WebElement Email;
@FindBy(xpath="//*[@id='course']")
WebElement Course;
@FindBy(xpath="//*[@id='password']")
WebElement Password;
@FindBy(xpath="//*[@id='Male']")
WebElement Gender;
@FindBy(xpath="//*[text()='Maharashtra']")
WebElement State;
@FindBy(xpath="//*[text()='Users']")
WebElement User;
@FindBy(xpath="//button[@id='submit']")
WebElement Button;
@FindBy(xpath="//table[@class='table table-hover']")
WebElement UserList;
public void AddNewUser(){
	AddNewUser.click();
}
public void cllickUser(){
	User.click();
}
public void submit(){
	Button.submit();

}


public UserPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
public void TypeUserName(){
	Username.sendKeys("ashishkute");
	
}
public void TypeMobile(){
	Mobile.sendKeys("7875224192");
}
public void TypeEmail(){
	Email.sendKeys("ashishkute@gmail.com");
}
public void SelectCourse(){
	Course.sendKeys("Selenium Automation Testing");
}
public void SelectGender(){
	Gender.click();
}
public void SelectState(){
	
	State.click();
}
public void Password(){
	Password.sendKeys("Ashish123");
}
public void UserList(){
	
	String a=UserList.getText();
	System.out.println(a);
	
}
public boolean EnterUserData(){
	cllickUser();
	AddNewUser();
	TypeUserName();
	TypeMobile();
	TypeEmail();
	SelectCourse();
	SelectGender();
	SelectState();
	Password();
	submit();
	driver.switchTo().alert().accept();
	return true;
	
	
	
	
	
}
}
