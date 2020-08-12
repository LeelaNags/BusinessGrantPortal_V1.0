package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DraftFormPage {

	WebDriver ldriver;

	public DraftFormPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//*[@id=\'eyPage-form-button\']")
	@CacheLookup
	public static WebElement DraftFormPageProceed;
	
	
	
	
	
	
	public void isLoaded() throws Error {
        // Initial loading, called when creating the page object to make sure that the page is loaded to a state where it is ready to interact with us, in our case it means that button is present in DOM and visible.
        waitForVisibility(DraftFormPageProceed);
    }

    private void waitForVisibility(WebElement element) throws Error{
           new WebDriverWait(ldriver, 60)
                .until(ExpectedConditions.visibilityOf(DraftFormPageProceed));
    }
	
	
	public void DraftFormPageProceed() {
		DraftFormPageProceed.click();
	}
	
	
	
		
	
	
	
}
