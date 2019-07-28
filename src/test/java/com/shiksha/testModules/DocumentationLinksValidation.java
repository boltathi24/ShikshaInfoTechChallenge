package com.shiksha.testModules;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shiksha.pages.DocumentationHomePage;

public class DocumentationLinksValidation extends DocumentationHomePage{

	@BeforeClass
	public void loadApp() {
		navigate("https://developer.here.com/documentation");
	}

    @Test
    public void validateDocumentationLinks() throws InterruptedException 
    {
    	checkDocumentationsLinkRedirection();
    }

    @AfterClass
	public void windUp() {
    	driver.close();
    	
	}


 


    

}
