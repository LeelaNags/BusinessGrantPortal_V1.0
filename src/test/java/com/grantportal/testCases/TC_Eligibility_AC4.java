package com.grantportal.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.grantportal.pageObjects.AddGrantPage;
import com.grantportal.pageObjects.AddNewGrantPage;
import com.grantportal.pageObjects.AddSectorPage;
import com.grantportal.pageObjects.ApplyforGrantPage;
import com.grantportal.pageObjects.EligibilityPage;
import com.grantportal.pageObjects.LoginPage;
import com.grantportal.pageObjects.ProceedWithApplicationPage;

public class TC_Eligibility_AC4 extends BaseClass{


	public void login() throws InterruptedException {
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
	}
	public void GetNewwGrant() {
		AddNewGrantPage AddGrant = new AddNewGrantPage(driver);
		AddGrant.clickGetNewGrant();
	}
	public void selectSector(){

		AddSectorPage selectSector= new AddSectorPage(driver);
		selectSector.clickGetNewGrant();
	}
	public void selectDeveArea(){

		AddGrantPage  Grant= new AddGrantPage(driver);
		Grant.ClickGrant();
	}
	public void SelectFunctionalArea(){

		ApplyforGrantPage  ApplyGrant =new ApplyforGrantPage(driver);
		ApplyGrant.ClickApplyGrant();
		ApplyGrant.clickApplyButton();
	}
	public void ProeedToform() throws InterruptedException{

		ProceedWithApplicationPage ProceedToApply = new ProceedWithApplicationPage(driver);
		ProceedToApply.ClickProceed();
		Thread.sleep(3000);
	}
	
	public void Eligibility() throws InterruptedException {
		EligibilityPage Eligibility = new EligibilityPage(driver);
		//Eligibility.Clickregradiobutton_NO_FAQ_Link();
		//Eligibility.getFAQPageURL();
		Eligibility.Clickregradiobutton_No();
		Eligibility.getFAQPageURL();
	}
	
		
//AC 3: Answering No for any of the questions should display a warning message �Visit Smart Advisor
//on the SME Portal for more information on other government assistance.�
	
				
	@Test
	public void verifyEligibilityQuestions() throws InterruptedException {
			login();
			GetNewwGrant();
			selectSector();
			selectDeveArea();
			SelectFunctionalArea();
			ProeedToform();
			Eligibility();
							 
	}
				
		
	}

	

