package com.grantportal.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="login-button")
	@CacheLookup
	public static WebElement loginbutton;
	@FindBy(name="CPUID")
	@CacheLookup
	public static WebElement NRIC;
	@FindBy(name="CPUID_FullName")
	@CacheLookup
	public static WebElement Name;
	@FindBy(name="CPEntID")
	@CacheLookup
	public static WebElement UEN;
	@FindBy(name="CPRole")
	@CacheLookup
	public static WebElement RoleDropDown;
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	public static WebElement Submit;
	public void ClickLogin() {
		loginbutton.click();
	}
	public void setUserNRIC(String nric) {
		NRIC.clear();
		NRIC.sendKeys("S7964753E");
	}
	public void setUserName(String username) {
		Name.clear();
		Name.sendKeys("Leela");
	}

	public void setUserUEN(String uen) {
		UEN.clear();
		UEN.sendKeys("BGPQEDEMO");

	}

	
	public void clickSubmit() {
		Submit.click();
	}


	public  void roleDropDownList(int index) {
		Select drop = new Select(RoleDropDown);
		drop.selectByIndex(0);
	}


	//	public  void roleDropDownList() throws InterruptedException {
	//    Select drop = new Select(RoleDropDown);
	//    Thread.sleep(3000);
	//    drop.selectByValue("Acceptor");
	//  }	

//		public void roleDropDownList()
//		{
//		     Select RoleDropDown=new Select(ldriver.findElement(By.name("CPRole")));
//		     RoleDropDown.selectByVisibleText("Acceptor");
//		}

//	public void setUserRole() {
	//		
	//		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
	//		Select select = new Select(dropdown1);
	//		select.selectByIndex(2);
	//		Thread.sleep(3000);
	//		select.selectByVisibleText("Appium");
	//	}

	//	public void clickOnRoleDropdown(){
	//		Role.click();
	//		
	//	}



}


