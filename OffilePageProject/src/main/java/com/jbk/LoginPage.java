package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;

@FindBy(xpath="//input[@id='email']")
WebElement username;
@FindBy(xpath="//input[@id='password']")
WebElement passsword;
@FindBy(xpath="//button[@type='submit']")
WebElement button;
@FindBy(xpath="//*[@id='email_error']")
WebElement email_error;
@FindBy(xpath="//*[@id='password_error']")
WebElement password_error;
@FindBy(xpath="//*[@src='pages/images/jbk.png']")
WebElement image;


public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public String getEmailError(){
	return email_error.getText();
	
}

public String getPasswordError(){
	return password_error.getText();
	
}
public void Error(){
	getPasswordError();
	getEmailError();
	
}
public void TypeEmail(String uname){
	username.sendKeys(uname);
}

public void TypePassword(String pass){
	passsword.sendKeys(pass);
}

public void clickLoginbtn(){
	button.click();
}

public DashboardPage ValiedLogin(){
	TypeEmail("kiran@gmail.com");
	TypePassword("123456");
	clickLoginbtn();
	return new DashboardPage(driver);

}
public void  InvaliedLogin(String UserName, String UserPass){
	TypeEmail(UserName);
	TypePassword(UserPass);
	clickLoginbtn();
}
public String InvaliedUserName(){
	return email_error.getText();
	
}
public String InvaliedPass(){
	return password_error.getText();
	
}
public void clear(){
	username.clear();
	passsword.clear();
}
public void Login(){
	TypeEmail("kiran@gmail.com");
	TypePassword("123456");
	clickLoginbtn();
	
}
}
