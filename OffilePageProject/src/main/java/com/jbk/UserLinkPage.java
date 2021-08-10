package com.jbk;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLinkPage {
WebDriver driver;

@FindBy(xpath="//table[@class='table table-hover']")
WebElement table;
@FindBy(xpath="//tr")
WebElement CourseName;
@FindBy(xpath="//*[@href='links.html']")
WebElement click;

public UserLinkPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void Alltable(){
	table.getText();
	
}

public void conte(){
	CourseName.getText();
}
public void Userlinkclick(){
	click.click();
}
public void UsreLink(){
	Userlinkclick();
	conte();
}
public void PrintTable(){
	Userlinkclick();
	Alltable();
	
}
public void contentlist(){
	/*ArrayList<String> list=new ArrayList<String>();
	for(WebElement cont:CourseName){
		String text=cont.getText();
		list.add(text);
	}*/

}

}
