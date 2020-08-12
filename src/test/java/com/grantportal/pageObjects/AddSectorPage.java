package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddSectorPage{WebDriver ldriver;

public AddSectorPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(xpath="//div[(text()='IT')]")
@CacheLookup
public static WebElement IT;



public void clickGetNewGrant() {
	IT.click();
	
}
}


