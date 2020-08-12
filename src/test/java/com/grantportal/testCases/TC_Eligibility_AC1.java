package com.grantportal.testCases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.grantportal.pageObjects.AddGrantPage;
import com.grantportal.pageObjects.AddNewGrantPage;
import com.grantportal.pageObjects.AddSectorPage;
import com.grantportal.pageObjects.ApplyforGrantPage;
import com.grantportal.pageObjects.EligibilityPage;
import com.grantportal.pageObjects.LoginPage;
import com.grantportal.pageObjects.ProceedWithApplicationPage;

public class TC_Eligibility_AC1 extends BaseClass{


	@Test
	public void Eligibiiyt() throws InterruptedException 	{

		LoginPage lp=new LoginPage(driver);	
		lp.ClickLogin();
		lp.setUserNRIC(NRIC);
		logger.info("Enter NRIC");
		lp.setUserName(Name);
		logger.info("Enter username");
		lp.setUserUEN(UEN);
		logger.info("Enter UEN");
		lp.roleDropDownList(0);
		lp.clickSubmit();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().equals("Business Grants Portal"));
		logger.info("Login Test Passed");


		Thread.sleep(3000);
		AddNewGrantPage AddGrant = new AddNewGrantPage(driver);
		AddGrant.clickGetNewGrant();

		AddSectorPage selectSector= new AddSectorPage(driver);
		selectSector.clickGetNewGrant();

		AddGrantPage  Grant= new AddGrantPage(driver);
		Grant.ClickGrant();

		ApplyforGrantPage  ApplyGrant =new ApplyforGrantPage(driver);
		ApplyGrant.ClickApplyGrant();
		ApplyGrant.clickApplyButton();

		ProceedWithApplicationPage ProceedToApply = new ProceedWithApplicationPage(driver);
		ProceedToApply.ClickProceed();
		Thread.sleep(3000);

		EligibilityPage Eligibility = new EligibilityPage(driver);
		Eligibility.ClickEligibility();
		Thread.sleep(3000);
		Eligibility.Clickregradiobutton_Yes();
		Eligibility.Clickglobalhqradiobutton_Yes();
		Eligibility.Clickturnoverradiobutton_Yes();
		Eligibility.Clicktargetradiobutton_Yes();
		Eligibility.Clickprojectradiobutton_Yes();

		//AC 1: The section should contain 4 questions:

		//Check if page contains the applicant registered in Singapore?
		Eligibility.ApplicationRegQuestion();

		//Check if page contains the applicant's group sales turnover less than
		Eligibility.GroupSalesTurnover();


		//Check if page contains Does the applicant have at least 30%
		Eligibility.localEquity();

		//Check if page contains Are all the following statements true for this project? *
		Eligibility.getlabellist();


	}




}



