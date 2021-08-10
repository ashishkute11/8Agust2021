package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
	WebDriver driver;

	@FindBy(xpath="//table[@class='table table-hover']")
	WebElement table;
	@FindBy(xpath="//*[@href='downloads.html']")
	WebElement DownloadClick;

	
	public DownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void DownloadClick(){
		DownloadClick.click();
	}
	public void table(){
		table.getText();
		System.out.println(table.getText());
	}
	public void PrintTable(){
		DownloadClick();
		table();
	}
}
