package com.autodesk.genericutility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class IListenerImplClass implements ITestListener {
	ExtentSparkReporter sReport;
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		//3:creat a test method during the test execution start
		test=report.createTest(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String screen=null;
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName);
		System.out.println(result.getThrowable());
		test.log(Status.FAIL,result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		
		try {
			 screen = new WebDriverUtility().takeScreenshot(BaseClass.sDriver, methodName);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		test.addScreenCaptureFromPath(screen);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//step 5:log the skip method
		test.log(Status.SKIP,result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		//step 1:extent report congiration
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("./extentReport"+new JavaUtility().getCurrentDate()+".html");
		htmlReporter.config().setReportName("Regrassion execution report");
		htmlReporter.config().setDocumentTitle("comcast automation execution report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		//step 2:Attach the phisical report and do the system congiration
		 report = new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("os", "window 10");
		report.setSystemInfo("environment", "Testiong environment");
		report.setSystemInfo("url", "https://localhost:8888");
		report.setSystemInfo("reporter Name", "milan");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	

}
