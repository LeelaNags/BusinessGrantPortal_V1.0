package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	
	
WebDriver ldriver;
	
	public ContactPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@class=\"menu-text\" and contains(text(),'Contact Details')]")
	public static WebElement contactDetails;
	@FindBy(id="//*[@id=\"react-contact_info-name\"]")
	public static WebElement ContactInfoName;
	@FindBy(id="react-contact_info-offeree_designation")
	public static WebElement ContactinfoJobTitle1;
	@FindBy(id="react-contact_info-phone")
	public static WebElement ContactinfoPhone;
	@FindBy(id="react-contact_info-primary_email")
	public static WebElement ContactinfoEmail;
	@FindBy(id="react-contact_info-secondary_email")
	public static WebElement ContactinfoAlternateEmail;
	@FindBy(id="react-contact_info-correspondence_address-copied")
	public static WebElement ContactinfoMailingAddress;
	@FindBy(id="react-contact_info-correspondence_address-postal")
	public static WebElement ContactInfoPostalCode;
	@FindBy(xpath="//*[@id=\"react-contact_info-correspondence_address-postal-postal\" and @class=\"input-group-addon bgp-search-group-addon\"]")
	public static WebElement PostalCodeSearch;
	@FindBy(id="react-contact_info-correspondence_address-block")
	public static WebElement BlkNo;
	@FindBy(id="react-contact_info-correspondence_address-street")
	public static WebElement Street;
	@FindBy(id="react-contact_info-correspondence_address-level")
	public static WebElement Level;
	@FindBy(id="react-contact_info-correspondence_address-unit")
	public static WebElement Unit;
	@FindBy(id="react-contact_info-correspondence_address-building_name")
	public static WebElement BuildingName;
	@FindBy(id="react-contact_info-copied")
	public static WebElement ContactInfoOfferee;
	@FindBy(id="react-contact_info-offeree_name")
	public static WebElement ContacInfoOffereName;
	@FindBy(id="react-contact_info-offeree_designation")
	public static WebElement ContacInfoOffereDesignation;
	@FindBy(id="react-contact_info-offeree_email")
	public static WebElement ContacInfoOffereEmail;
	@FindBy(xpath="//*[@id=\"save-btn\"]")
	public static WebElement ContacInfoSave;
	@FindBy(xpath="//*[@id=\"next-btn\"] ")
	public static WebElement ContactInfoNext;
	
	
	
	
	
	
	
	
}
