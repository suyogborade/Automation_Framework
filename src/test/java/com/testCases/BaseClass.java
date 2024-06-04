package com.testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import com.utilities.ReadConfig;


public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfig readconfig = new ReadConfig();
	
	String url = readconfig.getBaseURL();
	String browser=readconfig.getbrowser();
	
	@BeforeClass
	public void setUp()
	{
		switch (browser.toLowerCase()) {
		case "chrome": 
			driver = new ChromeDriver();
			break;

		case "safari" :
			driver =new SafariDriver();
			break;
			
		case "firefox" :
			driver = new FirefoxDriver();
			break;
			
		default:
			driver = new ChromeDriver();
			break;
		}
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		//for logging
		
		logger = LogManager.getLogger("MyStore");
		
	}
	
	@AfterClass(enabled =true)
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
