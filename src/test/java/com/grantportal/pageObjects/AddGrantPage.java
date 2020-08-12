package com.grantportal.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGrantPage {
	WebDriver ldriver;
	
	public AddGrantPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//@FindBy(xpath="//div[(text()='Bring my business overseas or establish a stronger international presence')]")
	@FindBy(xpath="//*[@id=\'grant-wizard\']/div[1]/div/div/div[1]/div/label/div")
	public static WebElement AddGrant;
	
	
	public void ClickGrant() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", AddGrant);
		//AddGrant.click();
		}
}
