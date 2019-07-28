package com.shiksha.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.shiksha.Utils.Utility;

public class DocumentationHomePage extends Utility {
	
	 	public static By documentationLinks=By.xpath("//div[not(@class='ng-hide')]/div[@class='documentation-link-group']//a[contains(@href,'documentation')]");
	 	
	 	public void checkDocumentationsLinkRedirection() throws InterruptedException
	 	{
	 		waitForElement(documentationLinks);	 		
	 		for(int i=0;i<elementList(documentationLinks).size();i++)
	 		{
	 			waitForElement(documentationLinks);
	 			scrollToElement(elementList(documentationLinks).get(i));
	 			String link=elementList(documentationLinks).get(i).getAttribute("href");	 			
	 			elementList(documentationLinks).get(i).click(); 			
	 			waitForangularLoads();
	 			Assert.assertTrue(isAngularLoaded(),"***Failure: Angular is not loaded for the link "+link);
	 			Assert.assertTrue(isLinkValid(link)==200,"***Failure: The link -->"+link+" is not valid ");
	 			navigateBack();
	 		}
	 	}
}
