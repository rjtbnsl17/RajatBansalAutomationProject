package com.extent;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.sun.swing.internal.plaf.metal.resources.metal;
import com.test.RestAssuredSample;

import Weather.GETBookStoreAPI;

public class ExtentReport {
	public static ExtentReports reports;
	public static ExtentHtmlReporter htmlReporter;
	
	public static ExtentReports startTest() {
	
	//public static ExtentTest test;
		reports = new ExtentReports();
		
		
		//timestamp config 	
		htmlReporter = new ExtentHtmlReporter("./test-output/extentreports/extent.html"); //relative path /cannonical path

		// test = reports.createTest("GetBookStoreAPI");
		htmlReporter.config().setDocumentTitle("My new report");
		htmlReporter.config().setReportName("BookStore");

		htmlReporter.config().setTheme(Theme.DARK);
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Tester name", "rajat");
		reports.setSystemInfo("OS", "Mac");
		reports.setSystemInfo("Org", "Paytm");
		reports.setSystemInfo("Browser", "Chrome");

		return reports;
	}

}
