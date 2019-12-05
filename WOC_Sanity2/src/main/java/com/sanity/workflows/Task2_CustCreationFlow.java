package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.pages.Task2_CustomerCreation;

public class Task2_CustCreationFlow {
	WebDriver driver;

	/** The Customer Creation. */
	Task2_CustomerCreation custCreation;

	/**
	 * Customer Creation
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task2_CustCreationFlow(WebDriver driver) {
		this.driver = driver;

		custCreation = new Task2_CustomerCreation(driver);
		PageFactory.initElements(driver, custCreation);
	}

	public void validation(String partner, String cmpyName, String cmpyAlias, String phNo, String firstName, String lastName, String email) throws Exception {
		try {
			//custCreation.createCustomerFlow(partner, cmpyName, cmpyAlias, phNo, firstName, lastName, email);
			custCreation.clickPartnerLnk();
			custCreation.enterPartnerName(partner);
			Thread.sleep(2000);
			custCreation.clickSearchIcon();
			Thread.sleep(2000);
			custCreation.clickDefaultPartnerLnk();
			Thread.sleep(2000);
			custCreation.clickAddCustomerLnk();
			Thread.sleep(2000);
			custCreation.clickNextLnk();
			Thread.sleep(2000);
			custCreation.enterCmpyName(cmpyName);
			custCreation.enterCmpyAlias(cmpyAlias);
			custCreation.enterPhNumber(phNo);
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
