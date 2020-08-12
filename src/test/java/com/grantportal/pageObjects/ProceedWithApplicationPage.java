package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedWithApplicationPage{
	WebDriver ldriver;

	public ProceedWithApplicationPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath="//button[@id='keyPage-form-button']")
	@CacheLookup
	public static WebElement Poceed;



	public void ClickProceed() {
		Poceed.click();
	}


}

