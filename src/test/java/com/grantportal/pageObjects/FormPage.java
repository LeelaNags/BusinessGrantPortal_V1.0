package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	WebDriver ldriver;

	public FormPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"js-app\"]/div/div/div[2]/div[1]/div/div")
	@CacheLookup
	public static WebElement FormPageSections;
	
	
	public void FormPageSections() {
		FormPageSections.click();
	}
	
	
	
	
}
