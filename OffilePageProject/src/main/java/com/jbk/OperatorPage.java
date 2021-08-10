package com.jbk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPage {
	@FindBy(xpath="//*[@class='table table-hover']")
	WebElement table;
	
	public void Table(){
		String a=table.getText();
		System.out.println(a);
	}

}
