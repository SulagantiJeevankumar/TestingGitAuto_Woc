package com.sanity.testcases;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;
import com.sanity.utils.ExcelReader;
import com.sanity.workflows.WOC_AusCustFlow;

public class WOC_AusCustTest {
	/** The driver. */
	public static WebDriver driver;

	/** The config. */
	public Map<String, String> config;

	/** The tc name. */
	public String tcName = this.getClass().getSimpleName();

	/** The report folder. */
	public String reportFolder;

	/** The tc description. */
	public String tcDescription;

	/** The iteration. */
	public int iteration = 0;

	/** The test count. */
	public int testCount = 0;

	/**
	 * Setup.
	 * 
	 * @throws IOException
	 */
	@BeforeClass
	public void setup() throws IOException {
		try {
			config = BaseUtility.getConfigData();
			reportFolder = config.get("reportFolder");
			tcDescription = "WOC Web Application";
		} catch (Exception e) {
			Reports.fail("Exception in setup: " + e.getMessage());
		}
	}

	/**
	 * Start test.s
	 * 
	 * @throws Exception
	 *             the exception
	 */
	@BeforeMethod
	public void startTest() throws Exception {
		try {
			Reports.startTest(reportFolder, tcName, tcDescription, iteration);
			iteration++;
		} catch (Exception e) {
			Reports.fail("Exception in startTest: " + e.getMessage());
		}
	}

	/**
	 * Test data.
	 * 
	 * @return the object[][]
	 * @throws Exception
	 *             the exception
	 */
	@DataProvider
	public Object[][] testData() throws Exception {
		tcName = this.getClass().getSimpleName();
		String fileName = config.get("input_fileName");
		String sheetName = config.get("input_file_sheetName");
		Object[][] arrTestData = ExcelReader.getInputArray(fileName, sheetName, tcName);
		testCount = arrTestData.length;
		return arrTestData;
	}

	/**
	 * User defined test case.
	 * 
	 * @param input
	 *            the input
	 * @throws IOException
	 */
	@Test(dataProvider = "testData")
	public void UserDefinedTestCase(String... input) throws IOException {
		try {
			if (StringUtils.equalsIgnoreCase("YES", input[0])) {
				System.out.println();
				Reports.info("Running... UserDefinedTestCase(String... input)");
				driver = BaseUtility.browserLaunch();
				WOC_AusCustFlow ausCustFlow = PageFactory.initElements(driver, WOC_AusCustFlow.class);
				ausCustFlow.validation(input[1], input[2], input[3], input[4], input[5], input[6], input[7], input[8], input[9]);
				Reports.pass("Task_AusCust: Successfully Created Customer");
			} else {
				Reports.skip(tcName, iteration);
			}
		} catch (Exception e) {
			Reports.finishWithfail("Failed to validate Australia Customer Flow");
		}
	}

	/**
	 * Finish test.
	 */
	@AfterTest
	public void finishTest() {
		try {
			Reports.finishTest();
			if (config.get("Suite_Execution") == null || config.get("Suite_Execution").equals("NO")) {
				Reports.openReport();
			}
		} catch (Exception e) {
			Reports.info("finishTest for " + tcName + " with Exception: " + e.getMessage());
		}
	}
}
