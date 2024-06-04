package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentListenerReport {

	


	public class ExtentReportManager implements ITestListener
	{

		public ExtentSparkReporter sparkReporter; //UI of the report
		public ExtentReports extent; // populate common info on the report
		public ExtentTest test; // create test case entries in the report and update the status of the test methods
		
		public void onStart(ITestContext context) 
		{
			sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myreport.html"); //specify the location
			
			sparkReporter.config().setDocumentTitle("Automation Report"); //Title of the report
			sparkReporter.config().setReportName("Functional Testing"); // name of the report
			sparkReporter.config().setTheme(Theme.STANDARD);
			
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			
			extent.setSystemInfo("Computer Name", "MacBook");
			extent.setSystemInfo("Evironment", "QA Staging");
			extent.setSystemInfo("Tester Name", "Suyog");
			extent.setSystemInfo("os", "Windows 11");
			extent.setSystemInfo("Browser Name", "Safari, Chrome");
		}
		
		public void onTestSuccess(ITestResult result) 
		{
			test = extent.createTest(result.getName()); //create a new entry in the report
			test.log(Status.PASS, "Test is Passed : " + result.getName()); // update status as F/P/S
			
		}
		
		public void onTestFailure(ITestResult result)
		{
			test = extent.createTest(result.getName());
			test.log(Status.FAIL, "Test is Failed : " + result.getName());
			test.log(Status.FAIL, "Test is Failed Cause is : " + result.getThrowable());
		}
		
		public void onTestSkipped(ITestResult result)
		{
			test = extent.createTest(result.getName());
			test.log(Status.SKIP, "Test is Skipped : " + result.getName());
		}
		
		public void onFinish(ITestContext context)
		{
			extent.flush();
		}
	}

	
}
