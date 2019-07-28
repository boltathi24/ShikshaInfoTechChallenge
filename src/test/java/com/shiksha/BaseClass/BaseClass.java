package com.shiksha.BaseClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver=null;
	
	@BeforeSuite
	public void setDriver()
	{
		System.setProperty("webdriver.chrome.driver", new File("chromedriver_linux").getAbsolutePath() );
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
	}
	 
	 @AfterSuite
	 public void clearAll()
	 {
		 driver.quit();
	 }
	
}
