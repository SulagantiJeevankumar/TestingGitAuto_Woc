/********************************************************************************************************************************
 * 
 * Revision     Date            Updated by                  Comments
 * ---------------------------------------------------------------------------------------------------------------------------
 * 1.0          22-Jul-2019     S Jeevan Kumar        Creating the Reports Class to generate the extent reports
 * 
 * 
 * Copyright (c) Wave OnCloud. All Rights Reserved.
 ********************************************************************************************************************************/

package com.sanity.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sanity.lib.BaseUtility;
import com.sanity.utils.ExcelReader;

/**
 * The Class Reports.
 */
public class Reports {

	/** The extent. */
	public static ExtentReports extent;

	/** The test. */
	public static ExtentTest test;

	/** The config. */
	public static Map<String, String> config;

	/** The report file. */
	public static String reportFile;

	/** The fail count. */
	public static int failCount = 0;

	/** Soft Assertion *. */
	public static SoftAssert softAssert;

	public static Map<String, String> testMap;

	public static String testCaseName;

	public static String screenShortFolder;

	/**
	 * To create the new report.
	 * 
	 * @param reportFolder
	 *            the report folder
	 * @param tcName
	 *            the tc name
	 * @throws Exception
	 *             the exception
	 */
	public static void createNewReport(String reportFolder, String tcName) throws Exception {
		config = BaseUtility.getConfigData();
		if (config.get("Suite_Execution") == null || config.get("Suite_Execution").equals("NO")) {
			BaseUtility.createFolderIfNotExist(reportFolder + "\\report-" + BaseUtility.getDate());
			screenShortFolder = reportFolder + "\\report-" + BaseUtility.getDate();
			reportFile = screenShortFolder + "\\" + tcName + ".html";
			extent = new ExtentReports(reportFile, true);
			testMap = new HashMap<String, String>();
		} else {
			if (reportFile == null || reportFile.equals("")) {
				screenShortFolder = reportFolder + "\\report-" + BaseUtility.getDate("ddMMYYYYhhmmss");
				reportFile = screenShortFolder + "\\testsummary.html";
				extent = new ExtentReports(reportFile, true);
				testMap = new HashMap<String, String>();
			}
		}
	}

	/**
	 * To add the test in report.
	 * 
	 * @param reportFolder
	 *            the report folder
	 * @param tcName
	 *            the tc name
	 * @param description
	 *            the description
	 * @param iteration
	 *            the iteration
	 * @throws Exception
	 *             the exception
	 */
	public static void startTest(String reportFolder, String tcName, String description, int iteration)
			throws Exception {
		if (iteration == 0) {
			createNewReport(reportFolder, tcName);
			testCaseName = tcName;
			test = extent.startTest(tcName, description);
			testMap.put(testCaseName, "PASS");
		} else {
			testCaseName = tcName + "_" + iteration;
			test = extent.startTest(testCaseName, description);
			testMap.put(testCaseName, "PASS");
		}
	}

	/**
	 * To define the success message.
	 * 
	 * @param message
	 *            the message
	 */
	public static void pass(String message) {
		test.log(LogStatus.PASS, message);
	}

	/**
	 * To define the Failure message.
	 * 
	 * @param message
	 *            the message
	 * @throws IOException
	 */
	public static void fail(String message) throws IOException {
		test.log(LogStatus.FAIL, message);
		testMap.put(testCaseName, "FAIL");
		String file_path = screenShortFolder + "\\screenshots\\" + BaseUtility.getDate("hhMMsss") + "_Fail" + ".jpg";
		File scrFile = ((TakesScreenshot) BaseUtility.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(file_path));
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(file_path));
		failCount++;
	}

	/**
	 * To define the finishWithfail.
	 * 
	 * @param message
	 *            the message
	 * @throws IOException
	 */
	public static void finishWithfail(String message) throws IOException {
		test.log(LogStatus.FAIL, message);
		testMap.put(testCaseName, "FAIL");
		failCount++;
	}

	/**
	 * To define the Skip message.
	 * 
	 * @param tcName
	 *            the tc name
	 * @param iteration
	 *            the iteration
	 */
	public static void skip(String tcName, int iteration) {
		info(testCaseName + " Run mode has been mentioned as 'No'");
		testMap.put(testCaseName, "SKIP");
		test.log(LogStatus.SKIP, "Run mode has been mentioned as 'No'");
	}

	/**
	 * To complete the report.
	 * 
	 * @throws Exception
	 */
	public static void finishTest() throws Exception {
		extent.endTest(test);
		extent.flush();
		if (failCount != 0) {
			ExcelReader.writeCellData(testMap);
			softAssert = new SoftAssert();
			softAssert.fail();
		} else {
			ExcelReader.writeCellData(testMap);
		}
	}

	/**
	 * To print the regular output.
	 * 
	 * @param message
	 *            the message
	 */
	public static void info(String message) {
		System.out.println(message);
	}

	/**
	 * To open the extent report after completing the execution.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	public static void openReport() throws Exception {
		try {
			Runtime runTime = Runtime.getRuntime();
			String browser = config.get("browserToOpenReport");
			Desktop.getDesktop().open(new File(config.get("input_fileName")));
			runTime.exec(browser + " " + reportFile);
			if (softAssert != null) {
				softAssert.assertAll();
				softAssert = null;
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
