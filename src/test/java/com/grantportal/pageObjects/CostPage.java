package com.grantportal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostPage {
WebDriver ldriver;
	
	public CostPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@class=\"menu-text\" and contains(text(),'Cost')]")
	public static WebElement Cost;
	
	@FindBy(xpath="//*[@id=\"react-project_cost-vendors-accordion-header\"]/div/div[1]")
	public static WebElement ThirdPartyVendors;
	@FindBy(xpath="//*[@id=\"react-project_cost-vendors-0-local_vendor-true\"]")
	public static WebElement VendorRegistered;
	@FindBy(id="react-project_cost-vendors-0-vendor_name")
	public static WebElement NameOfVendor;
	@FindBy(id="react-project_cost-vendors-0-attachments-btn")
	public static WebElement SelectFiles;
	@FindBy(xpath="//*[@id=\'select2-react-project_cost-vendors-0-currency_code-container\']")
	public static WebElement CostinBillingCurrency;
	@FindBy(xpath="//*[@id=\'react-project_cost-vendors-0-amount_in_billing_currency\']")
	public static WebElement EstimatedCostBillingCurrency;
	@FindBy(id="react-project_cost-vendors-0-exchange_rate")
	public static WebElement ExchangedRate ;
	
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-accordion-header\']/div/div[1]")
	public static WebElement OfficeSpaceRentals;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-add-item\']")
	public static WebElement OfficeSpaceRentalsAddItem;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-0-description\']")
	public static WebElement OfficeSpaceRentalDescription;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-0-rental_duration\']")
	public static WebElement OfficeSpaceRentalDuration;
	@FindBy(xpath="//*[@id='select2-react-project_cost-office_rentals-0-currency_code-container']")
	public static WebElement OfficeSpaceRentalCurrency;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-0-amount_in_billing_currency\']")
	public static WebElement OfficeSpaceRentalBillingCurrency;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-0\']/div/div/div[4]/div/div[2]/div")
	public static WebElement OfficeSpaceMonthlyRental;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-0-estimated_cost\']")
	public static WebElement OfficeSpaceRentalEstimatedCost;
	@FindBy(xpath="//*[@id=\'react-project_cost-office_rentals-0-attachments-btn\']")
	public static WebElement OfficeSpaceRentalSElectFiles;

	
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-accordion-header\']")
	public static WebElement Salary;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-add-item\']")
	public static WebElement SalaryAddItem;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-name\']")
	public static WebElement SalaryName;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-designation\']")
	public static WebElement SalaryDesignation;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-nric\']")
	public static WebElement SalaryNRICPassportNumber;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0\']/div/div/div[4]/div/div[2]/div")
	public static WebElement SalaryNationalityType;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-project_role\']")
	public static WebElement RoleInProject;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-involvement_months\']")
	public static WebElement ProjectInvolvment;
	@FindBy(xpath="//*[@id=\'select2-react-project_cost-salaries-0-currency_code-container\']")
	public static WebElement BillingCurrency;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-salary_in_billing_currency\']")
	public static WebElement MonthlySalaryBillinCurrency;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0\']/div/div/div[8]/div/div[2]/div")
	public static WebElement MonthlySalaryy;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-estimated_cost\']")
	public static WebElement EstimatedCost;
	@FindBy(xpath="//*[@id=\'react-project_cost-salaries-0-attachments-btn\']")
	public static WebElement SalarySelectFiles;
	@FindBy(xpath="//*[@id=\"save-btn\"]")
	public static WebElement SalaryInfoSave;
	@FindBy(xpath="//*[@id=\"next-btn\"] ")
	public static WebElement SalaryInfoNext;
	
}
