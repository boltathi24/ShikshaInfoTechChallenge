package com.shiksha.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.shiksha.Utils.Utility;

public class DocumentationHomePage extends Utility {
	
	 	public static By documentationLinks=By.xpath("//div[not(@class='ng-hide')]/div[@class='documentation-link-group']//a[contains(@href,'documentation')]");
	 	
	 	public ArrayList<String> checkDocumentationsLinkRedirection() throws InterruptedException
	 	{
	 		ArrayList<String> links=new ArrayList<String>();
	 		waitForElement(documentationLinks);	 		
	 		for(int i=0;i<1;i++)
	 		{
	 			waitForElement(documentationLinks);
	 			scrollToElement(elementList(documentationLinks).get(i));
	 			String link=elementList(documentationLinks).get(i).getAttribute("href");
	 			links.add(link);
	 			elementList(documentationLinks).get(i).click(); 	
	 			
	 			waitForangularLoads();
	 			Assert.assertTrue(isAngularLoaded(),"***Failure: Angular is not loaded for the link "+link);
	 			navigateBack();
	 		}
	 		return links;
	 	}
	 	
	 	public void validateLinks(ArrayList<String> links)
	 	{
	 		for(String link:links)
	 		{
 			Assert.assertTrue(isLinkValid(link)==200,"***Failure: The link -->"+link+" is not valid ");
	 		}
	 	}
}
