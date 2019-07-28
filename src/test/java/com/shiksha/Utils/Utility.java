package com.shiksha.Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;
import com.shiksha.BaseClass.BaseClass;

public class Utility extends BaseClass
{
	int timeToWait = 15;
	
	
	public void navigate(String url)
	{
		driver.get(url);
	}
	
	 public void waitForElement(By by) throws InterruptedException 
	 {
     
	WebDriverWait wait = new WebDriverWait(driver, timeToWait);
	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	 public WebElement element(By by) throws InterruptedException
	 {
		 waitForElement(by);
		 return driver.findElement(by);
	 }
	 
	 public void selectValue(WebElement element,String value)
	 {
		 new Select(element).selectByVisibleText(value);
	 }
	 
		 
	 public List<WebElement> elementList(By by)
	 {
		 return driver.findElements(by);
	 }
	 
	 public void scrollToElement(WebElement element) throws InterruptedException
	 {
		 
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
		
	 }
	 
	 public void navigateBack()
	 {
		 driver.navigate().back();
	 }
	 public boolean isElementPresent(By by)
	 {
		 if(driver.findElements(by).size()>0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	
	 public boolean isAngularLoaded()
	 {
		 if(((JavascriptExecutor) driver).executeScript("return (window.angular != undefined)").equals(true))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
	 
	  public void waitForangularLoads() {
		  String isAngularRequestsCompleted = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
		  WebDriverWait jsWait = new WebDriverWait(driver, 10);
	        try {
	        	
	            ExpectedCondition<Boolean> angularLoad = driver -> Boolean.valueOf(((JavascriptExecutor) driver)
	                .executeScript(isAngularRequestsCompleted).toString());
	 
	            boolean angularReady = Boolean.valueOf(((JavascriptExecutor) driver).executeScript(isAngularRequestsCompleted).toString());
	 
	            if (!angularReady) {
	                jsWait.until(angularLoad);
	            }
	        } catch (WebDriverException ignored) {
	        	ignored.printStackTrace();
	        }
	    }
	  
	  public int isLinkValid(String url)
	  {
		  return RestAssured.given().get(url).getStatusCode();
	  }
}
