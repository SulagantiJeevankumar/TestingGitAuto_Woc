package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.pages.TC1_WOC_Login;
import com.sanity.pages.Task2_CustomerCreation;

public class WOC_AusCustFlow {
	WebDriver driver;

	/** The WOC login page. */
	TC1_WOC_Login loginToPortal;
	Task2_CustomerCreation custCreation;

	/**
	 * Instantiates a new login.
	 * 
	 * @param driver
	 *            the driver
	 */
	public WOC_AusCustFlow(WebDriver driver) {
		this.driver = driver;

		loginToPortal = new TC1_WOC_Login(driver);
		PageFactory.initElements(driver, loginToPortal);
		custCreation = new Task2_CustomerCreation(driver);
		PageFactory.initElements(driver, custCreation);
	}

	public void validation(String WOCUserName, String WOCPass, String partner, String cmpyName, String cmpyAlias, String phNo, String firstName, String lastName, String email) throws Exception {
		try {
			loginToPortal.clickLoginLnk();
			loginToPortal.enterWocUserName(WOCUserName);
			loginToPortal.enterWocPassword(WOCPass);
			loginToPortal.clickSignInBtn();
			custCreation.clickPartnerLnk();
			custCreation.enterPartnerName(partner);
			custCreation.clickSearchIcon();
			custCreation.clickDefaultPartnerLnk();
			custCreation.clickAddCustomerLnk();
			custCreation.clickNextLnk();
			custCreation.enterCmpyName(cmpyName);
			custCreation.enterCmpyAlias(cmpyAlias);
			custCreation.enterPhNumber(phNo);
			custCreation.clickcountryDropdown();
			custCreation.clickAusDropdownValue();
			custCreation.enterFirstName(firstName);
			custCreation.enterLastName(lastName);
			custCreation.enterEmail(email);
			custCreation.enterAdminPhNum(phNo);
			custCreation.clickWelcomeMailCheckBx();
			custCreation.clickCustPgNxtLnk();
			custCreation.clickCustSubPgNxtLnk();
			custCreation.clickCustSaveBtn();
		} catch (Exception e) {
			throw e;
		}
	}
}
