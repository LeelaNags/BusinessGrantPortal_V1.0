package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessImpact {
WebDriver ldriver;
	
	public BusinessImpact(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@class=\"menu-text\" and contains(text(),'Business Impact')]")
	public static WebElement BusinessImpact;
	@FindBy(id="react-project_impact-fy_end_date_0")
	public static WebElement FYEndDate;
	@FindBy(id="react-project_impact-overseas_sales_1")
	public static WebElement OverseasValue1;
	@FindBy(id="react-project_impact-overseas_sales_2")
	public static WebElement OverseasValue2;
	@FindBy(id="react-project_impact-overseas_sales_3")
	public static WebElement OverseasValue3;
	@FindBy(id="react-project_impact-overseas_sales_1")
	public static WebElement OverseasSales1;
	@FindBy(id="react-project_impact-overseas_sales_1")
	public static WebElement OverseasSales2;
	@FindBy(id="react-project_impact-overseas_sales_1")
	public static WebElement OverseasSales3;
	@FindBy(id="react-project_impact-benefits_remarks")
	public static WebElement NonTangibleBenefits;
	@FindBy(xpath="//*[@id=\"save-btn\"]")
	public static WebElement ContacInfoSave;
	@FindBy(xpath="//*[@id=\"next-btn\"] ")
	public static WebElement ContactInfoNext;
}
