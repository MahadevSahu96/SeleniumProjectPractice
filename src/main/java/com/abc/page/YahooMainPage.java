package com.abc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class YahooMainPage extends Page {
	
	public YahooMainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="uh-logo")
	WebElement pageHeader;
	
	public String getPageHeader() {
		System.out.println(pageHeader.getText());
		return pageHeader.getText();
	}
}
