package com.jbk;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserPageexample {
	
	WebDriver driver;
	@BeforeClass
	  public void Setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///C:/Windows.old/Users/ashis/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/add_user.html?gender=Male");
	   driver.manage().window().maximize();
	  
	}
	
	@Test
	public void drpdwn(){
		WebElement DrpDwn=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select=new Select(DrpDwn);
		//select.selectByVisibleText("Maharashtra");
		
		List<WebElement> list=select.getOptions();
		for(WebElement option:list){
			
			if(option.getText().equals("Maharashtra")){
				
				option.click();
				
			}
		}
		
		
		WebElement radio=driver.findElement(By.xpath("//*[@name='gender']"));
		Actions action=new Actions(driver);
		action.click(radio).perform();
		
		
		System.out.println(1);
		Assert.assertTrue(true);
	}
}
