package com.grantportal.pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class EligibilityPage {

	WebDriver ldriver;

	public EligibilityPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@class=\"menu-text\" and contains(text(),'Eligibility')]")
	public static WebElement Eligibility;
	@FindBy(xpath="//*[@class='back-title-container']/li")
	public static List<WebElement> VerifyEligibility;
	@FindBy (xpath="//div[4]//div[1]//div[2]//label[1]//input[@id='react-eligibility-sg_registered_check-true']")
	public static  WebElement regradiobutton_true;
	@FindBy (xpath="//input[@id='react-eligibility-sg_registered_check-false']")
	public static  WebElement regradiobutton_false;
	@FindBy (xpath="//input[@id='react-eligibility-turnover_check-true']")
	public static  WebElement turnoverradiobutton_true;
	@FindBy (xpath="//input[@id='react-eligibility-turnover_check-false']")
	public static  WebElement turnoverradiobutton_false;
	@FindBy (xpath="//input[@id='react-eligibility-global_hq_check-true']")
	public static  WebElement globalhqradiobutton_true;
	@FindBy (xpath="//input[@id='react-eligibility-global_hq_check-false']")
	public static  WebElement globalhqradiobutton_false;
	@FindBy (xpath="//input[@id='react-eligibility-new_target_market_check-true']")
	public static  WebElement targetradiobutton_true;
	@FindBy (xpath="//input[@id='react-eligibility-new_target_market_check-false']")
	public static  WebElement targetradiobutton_false;
	@FindBy (xpath="//input[@id='react-eligibility-started_project_check-true']")
	public static  WebElement projectradiobutton_true;
	@FindBy (xpath="//input[@id='react-eligibility-started_project_check-false']")
	public static  WebElement projectradiobutton_false;
	@FindBy (xpath="//button[@id='save-btn']")
	public static  WebElement eligibilitysavebutton;
	@FindBy (xpath="//button[@id='next-btn']")
	public static  WebElement eligibilityNextbutton;
	@FindBy (xpath="//label[contains(text(),'Is the applicant registered in Singapore?')]")
	public static WebElement AppReg;
	@FindBy (xpath="//label[contains(text(),\"Is the applicant's group sales turnover less than\")]")
	public static WebElement GroupSalesTurnover;
	@FindBy (xpath="//a[contains(text(),'local equity')]")
	public static WebElement localEquity;
	@FindBy (xpath="//label[@class='control-label bgp-label']//ul/li")
	public static  List<WebElement> statementTrue;
	@FindBy (xpath="//span[contains(text(),'The applicant may not meet the eligibility criteri')]")
	public static  WebElement RegWarning;



	public void ClickEligibility() {
		Eligibility.click();

	}

	public void Clickregradiobutton_Yes()  {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", regradiobutton_true);
		Assert.assertEquals(true, regradiobutton_true.isSelected());
		System.out.println("Register radio button Yes is selected test case passed....");

	}

	public void Clickregradiobutton_No()  {		
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", regradiobutton_false);
		Assert.assertEquals(true, regradiobutton_false.isSelected());
		System.out.println("Register radio button No is selected test case passed....");
	}

	public void Clickregradiobutton_Warning()  {		
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", regradiobutton_false);

		Assert.assertEquals(true, regradiobutton_false.isSelected());
		System.out.println("Register Radio button 'No' is selected");

		String Expected_Warning ="The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants.";
		String Actual_Warning = RegWarning.getText();
		System.out.println(Actual_Warning);
		Assert.assertEquals(Actual_Warning,Expected_Warning);

	}

	public void Clickregradiobutton_NO_FAQ_Link()  {		
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", regradiobutton_false);
		ldriver.findElement(By.partialLinkText("FAQ")).click();
	}

	//		public void getFAQPageURL() throws InterruptedException {	
	//			String mainwindow=ldriver.getWindowHandle();
	//			Thread.sleep(3000);
	//			Set<String> handles = ldriver.getWindowHandles();
	//			for (String handle : handles){
	//			if (!handle.equals(mainwindow))
	//			{
	//			String currentURL = ldriver.getCurrentUrl().toString();
	//			String ExpectedURL ="https://www.smeportal.sg/content/smeportal/en/moneymatters.html#saText";
	//			assertTrue(currentURL.contains(ExpectedURL));
	//			System.out.println(ldriver.getCurrentUrl().toString());
	//			System.out.println("launchPageURL is 'https://www.smeportal.sg/content/smeportal/en/moneymatters.html#saText' test case passed....");
	//			
	//			}
	//			Thread.sleep(4000);
	//			ldriver.switchTo().window(mainwindow);
	//			}
	//			
	//			}


	public void getFAQPageURL() throws InterruptedException {	

		String currentURL = ldriver.getWindowHandle();
		String urlToClick = ldriver.findElement(By.xpath("//a[text()='FAQ']")).getAttribute("href");

		//opening the new tab   
		((JavascriptExecutor)ldriver).executeScript("window.open()");                  
		//getting all the handles currently available  
		Set<String> handles=ldriver.getWindowHandles();         
		for (String actual: handles) {
			if (!actual.equalsIgnoreCase(currentURL))
			{ 
				//switching to the opened tab      
				ldriver.switchTo().window(actual);   

				//opening the URL saved.  
				ldriver.get(urlToClick);
				
				//String  NewTabURL=ldriver.getCurrentUrl().toString();
				//String ExpectedURL ="https://www.smeportal.sg/content/smeportal/en/moneymatters.html#saText";

			} 			            	 
			Thread.sleep(4000);

			ldriver.switchTo().window(currentURL);

		}       



	}




	public void Clickturnoverradiobutton_Yes() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", turnoverradiobutton_true);

		boolean resTurnAroundRadioBtn=turnoverradiobutton_true.isSelected();
		if(resTurnAroundRadioBtn==true)
		{
			Assert.assertEquals(true, turnoverradiobutton_true.isSelected());
			System.out.println("turnoverradiobutton Yes is selected test case passed....");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("test case failed....");
		}

	}

	public void Clickturnoverradiobutton_No() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", turnoverradiobutton_false);
		Assert.assertEquals(true, turnoverradiobutton_false.isSelected());
		System.out.println("turnoverradiobutton radio button NO is selected test case passed....");
	}


	public void Clickglobalhqradiobutton_Yes() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", globalhqradiobutton_true);
		Assert.assertEquals(true, globalhqradiobutton_true.isSelected());
		System.out.println("globalhqradiobutton radio button Yes is selected test case passed....");


	}
	public void Clickglobalhqradiobutton_No() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", globalhqradiobutton_false);
		Assert.assertEquals(true, globalhqradiobutton_false.isSelected());
		System.out.println("globalhqradiobutton radio button No is selected test case passed....");
	}
	public void Clicktargetradiobutton_Yes() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", targetradiobutton_true);
		Assert.assertEquals(true, targetradiobutton_true.isSelected());
		System.out.println("targetradiobutton_true radio button Yes is selected test case passed....");
	}
	public void Clicktargetradiobutton_No() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", targetradiobutton_false);
		Assert.assertEquals(true, targetradiobutton_false.isSelected());
		System.out.println("targetradiobutton  radio button No is selected test case passed....");
	}

	public void Clickprojectradiobutton_Yes() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", projectradiobutton_true);
		Assert.assertEquals(true, projectradiobutton_true.isSelected());
		System.out.println("projectradiobutton radio button Yes is selected test case passed....");
	}
	public void Clickprojectradiobutton_No() {
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", projectradiobutton_false);
		Assert.assertEquals(true, projectradiobutton_false.isSelected());
		System.out.println("projectradiobutton radio button No is selected test case passed....");
	}

	public void eligibilitysavebutton() {
		eligibilitysavebutton.click();
	}
	public void eligibilityNextbutton() {
		eligibilityNextbutton.click();
	}
	public boolean ApplicationRegQuestion() {

		String Actual_Q1 = AppReg.getText();
		String Expected_Q1 ="Is the applicant registered in Singapore? *";
		assertTrue(Actual_Q1.contains(Expected_Q1));
		System.out.println(Actual_Q1);
		return true;
	}
	public boolean GroupSalesTurnover() {
		String Actual_Q2 = GroupSalesTurnover.getText();
		String Expected_Q2 = "Is the applicant's group sales turnover less than";
		assertTrue(Actual_Q2.contains(Expected_Q2));
		System.out.println(Actual_Q2);
		return true;
	}
	public boolean localEquity() {
		String Actual_Q3 = localEquity.getText();
		String Expected_Q3 ="local equity";
		assertTrue(Actual_Q3.contains(Expected_Q3));
		System.out.println(Actual_Q3);
		return true;
	}

	public void getlabellist() {
		List<WebElement> element=ldriver.findElements(By.xpath("//label[@class='control-label bgp-label']//ul/li"));
		ArrayList<String> labelsList = new ArrayList<String>();
		for (WebElement webElement : element) {
			labelsList.add(webElement.getText());
			//System.out.println(webElement.getText());

		}
		String actual=String.join("\n", labelsList);				
		String expectedText= "The applicant has not started work on this project" + "\n"; 
		expectedText = expectedText + "The applicant has not made any payment to any supplier, vendor, or third party prior to applying for this grant" + "\n";
		expectedText= expectedText + "The applicant has not signed any contractual agreement with any supplier, vendor, or third party prior to applying for this grant" ;
		//System.out.println(expectecText);

		Assert.assertEquals(actual,expectedText);
		System.out.println(actual);
	}

	public void VerifyEligibilityPageReload() {


		if(regradiobutton_true.isEnabled())
		{
			System.out.print("\nregradiobutton is enabled..");
		}
		else
		{
			System.out.print("\nTregradiobutton is disabled. ");
		}
		if(turnoverradiobutton_true.isEnabled())
		{
			System.out.print("\nturnoverradiobutton is enabled..");
		}
		else
		{
			System.out.print("\nturnoverradiobutton is disabled. ");
		}
		if(globalhqradiobutton_true.isEnabled())
		{
			System.out.print("\nglobalhqradiobutton is enabled..");
		}
		else
		{
			System.out.print("\nglobalhqradiobutton is disabled. ");
		}
		if(targetradiobutton_true.isEnabled())
		{
			System.out.print("\ntargetradiobutton is enabled..");
		}
		else
		{
			System.out.print("\ntargetradiobutton is disabled. ");
		}
		if(projectradiobutton_true.isEnabled())
		{
			System.out.print("\nprojectradiobutton is enabled..");
		}
		else
		{
			System.out.print("\nprojectradiobutton is disabled. ");
		}
	}


}


