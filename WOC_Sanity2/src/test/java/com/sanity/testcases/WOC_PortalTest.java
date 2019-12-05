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
import com.sanity.workflows.Task1_LoginFlow;
import com.sanity.workflows.Task2_CustCreationFlow;
import com.sanity.workflows.Task3_ChargifySubscribeFlow;
import com.sanity.workflows.Task4_AddOrEditByodOrDispUsersFlow;
import com.sanity.workflows.Task5_TLK100DevFlow;
import com.sanity.workflows.Task_WOC_DelCustFlow;

public class WOC_PortalTest {
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
				Task1_LoginFlow loginFlow = PageFactory.initElements(driver, Task1_LoginFlow.class);
				loginFlow.validation(input[1], input[2], input[40], input[41]);
				//Thread.sleep(20000);
				Reports.pass("Task_1: Successfully login into Portal");
				Task2_CustCreationFlow custCreateFlow = PageFactory.initElements(driver, Task2_CustCreationFlow.class);
				custCreateFlow.validation(input[3], input[4], input[5], input[6], input[7], input[8], input[9]);
				Reports.pass("Task_2: Successfully Created Customer");
				Task3_ChargifySubscribeFlow chargifySubFlow = PageFactory.initElements(driver,
						Task3_ChargifySubscribeFlow.class);
				chargifySubFlow.validation(input[10], input[10], input[10], input[10], input[9], input[6], input[7],
						input[8], input[11], input[12], input[13], input[14], input[26], input[27], input[28],
						input[29], input[30], input[31], input[42], input[42], input[43], input[42], input[42]);
				Reports.pass("Task_3: Successfully validated All Subscription Licenses");
				/*Task5_TLK100DevFlow tlk100DevFlow = PageFactory.initElements(driver, Task5_TLK100DevFlow.class);
				tlk100DevFlow.tlkDevValidation(input[23], input[24], input[25], input[37]);
				Reports.pass("Task_4: Validated TLK100 Device successfully");
				Task4_AddOrEditByodOrDispUsersFlow addBYODDisUsersFlow = PageFactory.initElements(driver,
						Task4_AddOrEditByodOrDispUsersFlow.class);
				addBYODDisUsersFlow.validation(input[15], input[16], input[17], input[18], input[19], input[20],
						input[21], input[22], input[32], input[33], input[34], input[35], input[36], input[25],
						input[38], input[39]);
				Reports.pass("Task_5: Successfully validated BYOD/Disp Users");*/
				/*
				 * Task5_TLK100DevFlow tlk100DevFlow = PageFactory.initElements(driver,
				 * Task5_TLK100DevFlow.class); tlk100DevFlow.tlkDevValidation(input[23],
				 * input[24], input[25]);
				 * Reports.pass("Task_5: Validated TLK100 Device successfully");
				 */
				/*
				 * Task_WOC_DelCustFlow custDel = PageFactory.initElements(driver,
				 * Task_WOC_DelCustFlow.class); custDel.validation(input[4]);
				 * Reports.pass("Task: Deleted Customer Successfully");
				 */
				BaseUtility.closeDriver();
			} else {
				Reports.skip(tcName, iteration);
			}
		} catch (Exception e) {
			Reports.finishWithfail("Portal validation is failed");
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
