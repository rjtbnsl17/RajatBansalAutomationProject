package com.extentListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.extent.ExtentReport;

public class Listener implements ITestListener {
	ExtentTest test;

	ExtentReports extentReport = ExtentReport.startTest();

	public void onTestStart(ITestResult result) {

		test = extentReport.createTest(result.getMethod().getMethodName());

	}

	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
	test.log(Status.FAIL, "it is failed due to some code missing");
	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "keep it up");

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		test.log(Status.SKIP, "skipped");
		test.skip(result.getThrowable());
	}
	
	@AfterTest
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

	
	

}
