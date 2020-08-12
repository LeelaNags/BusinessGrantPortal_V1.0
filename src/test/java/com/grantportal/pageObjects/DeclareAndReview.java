package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeclareAndReview {
WebDriver ldriver;
	
	public DeclareAndReview(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@class=\"menu-text\" and contains(text(),'Declare & Review')]")
	public static WebElement DeclareAndReview;
	@FindBy(xpath="//*[@id=\'react-declaration-criminal_liability_check-false\']")
	public static WebElement CriminalLiability;
	@FindBy(xpath="//*[@id=\'react-declaration-civil_proceeding_check-false\']")
	public static WebElement CivilProceeding;
	@FindBy(xpath="//*[@id=\'react-declaration-insolvency_proceeding_check-false\']")
	public static WebElement InsolvencyProceeding;
	@FindBy(xpath="//*[@id=\'react-declaration-project_incentives_check-false\']")
	public static WebElement projectIncentives;
	@FindBy(xpath="//*[@id=\'react-declaration-other_incentives_check-false\']")
	public static WebElement OtherIncentives;
	@FindBy(xpath="//*[@id=\'react-declaration-project_commence_check-false\']")
	public static WebElement ProjectCommerce;
	@FindBy(xpath="//*[@id=\'react-declaration-related_party_check-false\']")
	public static WebElement RelatedParty;
	@FindBy(xpath="//*[@id=\'react-declaration-covid_safe_check-false\']")
	public static WebElement CovidSafeCheck;
	@FindBy(xpath="//*[@id=\'react-declaration-covid_safe_ques_check-false\']")
	public static WebElement CovidSafeQuestionCheck;
	@FindBy(xpath="//*[@id=\'react-declaration-consent_acknowledgement_check\']")
	public static WebElement DeclarationConsentAck;
	@FindBy(xpath="//*[@id=\'save-btn\']")
	public static WebElement DeclarationSave;
	@FindBy(xpath="//*[@id=\'review-btn\']")
	public static WebElement DeclarationReview;
	
}
