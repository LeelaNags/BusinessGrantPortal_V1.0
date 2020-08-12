package com.grantportal.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.grantportal.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL=readconfig.getApplicationURL();
	public String Name=readconfig.getName();
	public String NRIC=readconfig.getNRIC();
	public String UEN=readconfig.getUEN();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters({"browser", "baseURL"})
	@BeforeClass
	public void setup(String br, String baseURL) {
		
		logger = Logger.getLogger("AccessGrantPortal");
		PropertyConfigurator.configure("Log4j.properties");
			
		
		if(br.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webDriver.chrome.driver",readconfig.getchromepath());
			logger.info("launch Chrome");
			driver= new ChromeDriver();
			
		}
		else if (br.equalsIgnoreCase("firefox")) {
			System.setProperty ("webdriver.gecko.driver",readconfig.getfirefoxpath());
			logger.info("launch firefox");
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("ie")) {
			System.setProperty ("webdriver.ie.driver",readconfig.getiepath());
			logger.info("launch Internet Explorer");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}

