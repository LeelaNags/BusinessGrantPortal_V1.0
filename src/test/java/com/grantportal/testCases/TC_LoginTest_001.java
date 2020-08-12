package com.grantportal.testCases;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.grantportal.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws InterruptedException {

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

		if(driver.getTitle().equals("Business Grants Portal")){
			Assert.assertTrue(true);
			//Assert.assertTrue(driver.getPageSource().contains("Business Grants Portal"));
			logger.info("Login Test Passed");
			//Logger.info("Login Test Passed");
		}else{
			//captureScreen(driver,"login");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
			//Logger.info("Login Test Failed");
		}
	}











	//WebElement dropdown1=driver.findElement(By.id("dropdown1"));
	//Select select = new Select(dropdown1);
	//select.selectByIndex(2);
	//select.selectByVisibleText("Appium");
















}
