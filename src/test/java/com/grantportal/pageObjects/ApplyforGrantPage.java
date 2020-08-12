package com.grantportal.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyforGrantPage {
	WebDriver ldriver;

	public ApplyforGrantPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	////input[@id='Market Readiness Assistance 2']
	
	//@FindBy(xpath="//input[@id='Market Readiness Assistance 2']")
	@FindBy(xpath="//div[@class='items-container']//div[1]//div[1]//label[1]//input[@id='Market Readiness Assistance 2']")
	public static WebElement AppplyGrant;
	@FindBy(xpath="//button[@id='go-to-grant']")
	public static WebElement ApplyButton;

	
	
	public void ClickApplyGrant() {
		
		
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", AppplyGrant);
			//AppplyGrant.click();
	}

	public void clickApplyButton() {
		ApplyButton.click();
	}


}