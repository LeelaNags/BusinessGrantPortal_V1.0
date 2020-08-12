package com.grantportal.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddNewGrantPage {
	WebDriver ldriver;
	
	public AddNewGrantPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"dashboard-menubox-app-apply-grant\"]/section/div/div[2]/h4")
	@CacheLookup
	public static WebElement GetNewGrantlink;

	
	public void clickGetNewGrant() {
		
		
		GetNewGrantlink.click();
		
	}

	
}