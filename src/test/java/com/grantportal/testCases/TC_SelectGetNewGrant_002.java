package com.grantportal.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.grantportal.pageObjects.LoginPage;
import com.grantportal.pageObjects.AddNewGrantPage;


public class TC_SelectGetNewGrant_002 extends BaseClass {
	
	@Test
	public void GetNewGrant() throws InterruptedException 	{
		
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
		
		AddNewGrantPage AddGrant = new AddNewGrantPage(driver);
		AddGrant.clickGetNewGrant();
						
	}
	}
