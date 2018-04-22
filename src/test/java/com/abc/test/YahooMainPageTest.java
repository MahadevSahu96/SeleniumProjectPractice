package com.abc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abc.page.Page;
import com.abc.page.YahooMainPage;

import junit.framework.Assert;

public class YahooMainPageTest extends Page{


	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahadev\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://twhyderabad.github.io/demo_site/");
	}	
	
	@Test
	public void pageTest() throws InterruptedException {		
		
		YahooMainPage yahooMainPage = new YahooMainPage(driver);
		Thread.sleep(5000);
		Assert.assertTrue(yahooMainPage.isTextPresent("Login"));
	}
}
