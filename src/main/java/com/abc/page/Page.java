package com.abc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page{
 
	public WebDriver driver;
	
	public boolean isTextPresent(String textValue){
		return driver.getPageSource().contains(textValue);
	}
	
}
