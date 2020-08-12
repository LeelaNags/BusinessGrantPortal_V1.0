package com.grantportal.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.grantportal.pageObjects.AddGrantPage;
import com.grantportal.pageObjects.AddNewGrantPage;
import com.grantportal.pageObjects.AddSectorPage;
import com.grantportal.pageObjects.ApplyforGrantPage;
import com.grantportal.pageObjects.LoginPage;

public class TC_ApplyForGrant_005 extends BaseClass{
	
	
	@Test
	public void ApplyForGrant() throws InterruptedException 	{
		
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
		
		AddSectorPage selectSector= new AddSectorPage(driver);
		selectSector.clickGetNewGrant();
		
		AddGrantPage  Grant= new AddGrantPage(driver);
		Grant.ClickGrant();
		
		
		ApplyforGrantPage  ApplyGrant =new ApplyforGrantPage(driver);
		ApplyGrant.ClickApplyGrant();
		ApplyGrant.clickApplyButton();
		
		
}
	
	


}
