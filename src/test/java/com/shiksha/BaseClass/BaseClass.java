package com.shiksha.BaseClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver=null;
	
	
	public void setDriver()
	{
		System.setProperty("webdriver.chrome.driver", new File("chromedriver_linux").getAbsolutePath() );
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
	}
	 
	 
	 public void clearAll()
	 {
		 driver.quit();
	 }
	
}
