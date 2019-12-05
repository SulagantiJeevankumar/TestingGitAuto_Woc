package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.pages.TC1_WOC_Login;
import com.sanity.pages.TC2_WOC_ValidationHomePg;

public class Task1_LoginFlow {
	WebDriver driver;

	/** The WOC login page. */
	TC1_WOC_Login loginToPortal;
	TC2_WOC_ValidationHomePg validateHmPgLnks;

	/**
	 * Instantiates a new login.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task1_LoginFlow(WebDriver driver) {
		this.driver = driver;

		loginToPortal = new TC1_WOC_Login(driver);
		PageFactory.initElements(driver, loginToPortal);
		validateHmPgLnks = new TC2_WOC_ValidationHomePg(driver);
		PageFactory.initElements(driver, validateHmPgLnks);
	}

	public void validation(String WOCUserName, String WOCPass, String homePgExpTxt, String distributorPgExpTxt) throws Exception {
		try {
			//loginToPortal.loginFlow(WOCUserName, WOCPass);
			//loginToPortal.clickLoginLnk();
			Thread.sleep(10000);
			loginToPortal.enterWocUserName(WOCUserName);
			loginToPortal.enterWocPassword(WOCPass);
			loginToPortal.clickSignInBtn();
			/*validateHmPgLnks.clickHomeLnk();
			validateHmPgLnks.validateHmPg(homePgExpTxt);
			Thread.sleep(5000);
			validateHmPgLnks.clickDistributorLnk();
			validateHmPgLnks.validateDistributorPg(distributorPgExpTxt);*/
		} catch (Exception e) {
			throw e;
		}
	}
}
