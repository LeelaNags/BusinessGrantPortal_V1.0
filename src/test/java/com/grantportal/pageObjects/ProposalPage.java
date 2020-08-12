package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProposalPage {
WebDriver ldriver;
	
	public ProposalPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@class=\"menu-text\" and contains(text(),'Proposal')]")
	public static WebElement Proposal;
	@FindBy(id="react-project-title")
	public static WebElement ProjectTitle;
	@FindBy(id="react-project-start_date")
	public static WebElement StartDate;
	@FindBy(id="react-project-end_date")
	public static WebElement EndDate;
	@FindBy(id="react-project-description")
	public static WebElement ProjectDesc;
	@FindBy(xpath="//*[@id='react-select-project-activity--value']")
	public static WebElement Activity;
	@FindBy(xpath="//*[@id='react-select-project-primary_market--value']")
	public static WebElement TargetMarket;
	@FindBy(xpath="//*[@id=\"react-project-is_first_time_expand-true\" and @value='true']")
	public static WebElement FirstTimeExpand;
	@FindBy(id="react-project-attachments-btn")
	public static WebElement SelectFiles;
	@FindBy(xpath="//*[@id=\"save-btn\"]")
	public static WebElement ContacInfoSave;
	@FindBy(xpath="//*[@id=\"next-btn\"] ")
	public static WebElement ContactInfoNext;
	
	
	
	
	
	
	
}
