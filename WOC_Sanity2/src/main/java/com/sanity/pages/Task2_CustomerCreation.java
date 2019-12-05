package com.sanity.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task2_CustomerCreation {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new home page.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task2_CustomerCreation(WebDriver driver) {
		this.driver = driver;
	}

	/** WOC All Customers Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Partners')]")
	WebElement partners_Lnk;
	/** WOC Search Text Box */
	@FindBy(how = How.XPATH, using = "//input[@id='search-text']")
	WebElement search_TxtBx;
	/** WOC Search Icon */
	@FindBy(how = How.XPATH, using = "//span[@class='icon-search']/parent::button")
	WebElement searchIcon_Btn;
	/** WOC Default Partner Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'MSI Default Partner')]")
	WebElement defaultPartner_Lnk;
	/** WOC Add Customer Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Customers')]")
	WebElement allCustomers_Lnk;
	/** WOC All Customers Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement addCustomer_Lnk;
	/** WOC Customer creation Email info page Next Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Next')]")
	WebElement next_Lnk;
	/** WOC Customer creation customer info page Company Name Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='CompanyName']")
	WebElement cmpyName_TxtBx;
	/** WOC Customer creation customer info page Company Alias Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='Domain']")
	WebElement cmpyAlias_TxtBx;
	/** WOC Customer creation customer info page Phone Number Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='PhoneInput']")
	WebElement phNumber_TxtBx;
	/** WOC Customer creation customer info page Country drop down */
	@FindBy(how = How.XPATH, using = "//select[@id='Country']")
	WebElement country_Dropdown;
	/** WOC Customer creation customer info page Country drop down Australia */
	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Australia')]")
	WebElement aus_DropdownValue;
	/** WOC Customer creation customer info page First Name Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='AdminFirstName']")
	WebElement fistName_TxtBx;
	/** WOC Customer creation customer info page Last Name Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='AdminLastName']")
	WebElement lastName_TxtBx;
	/** WOC Customer creation customer info page Email Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='AdminEmail']")
	WebElement email_TxtBx;
	/** WOC Customer creation customer info page phone Number Text box */
	@FindBy(how = How.XPATH, using = "//input[@id='AdminPhoneInput']")
	WebElement adminPhNum_TxtBx;
	/** WOC Customer creation customer info page welcome mail check box */
	@FindBy(how = How.XPATH, using = "//label[@id='labelCustomerManage']")
	WebElement welMail_checkBx;
	/** WOC Customer creation customer info page Next Link */
	@FindBy(how = How.XPATH, using = "//a[@data-next='#customer-subscription']")
	WebElement custPgNxt_Lnk;
	/** WOC Customer creation customer info page Next Link */
	@FindBy(how = How.XPATH, using = "//a[@data-next='#customer-review']")
	WebElement custSubPgNxt_Lnk;
	/** WOC Customer creation review page Next Link */
	@FindBy(how = How.XPATH, using = "//a[@data-next='#customer-info']")
	WebElement revPgNxt_Lnk;
	/** WOC Customer creation Finish page SAVE button */
	@FindBy(how = How.XPATH, using = "//a[@id='submitButton']")
	WebElement custSave_Btn;
	
	/**
	 * 
	 * @throws Exception
	 */
	public void clickPartnerLnk() throws Exception {
		try {
			BaseUtility.Click(partners_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Partner Link");
			throw e;
		}
	}
	/**
	 * 
	 * @param partner
	 * @throws Exception
	 */
	public void enterPartnerName(String partner) throws Exception {
		try {
			BaseUtility.SendKeys(search_TxtBx, partner);
		} catch (Exception e) {
			Reports.fail("Fail to enter Partner name");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickSearchIcon() throws Exception {
		try {
			BaseUtility.Click(searchIcon_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click Search Icon");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickDefaultPartnerLnk() throws Exception {
		try {
			BaseUtility.Click(defaultPartner_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click MSI Default Partner");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickAddCustomerLnk() throws Exception {
		try {
			BaseUtility.Click(addCustomer_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Add Customer link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickNextLnk() throws Exception {
		try {
			BaseUtility.Click(next_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Next link");
			throw e;
		}
	}
	/**
	 * 
	 * @param cmpyName
	 * @throws Exception
	 */
	public void enterCmpyName(String cmpyName) throws Exception {
		try {
			BaseUtility.SendKeys(cmpyName_TxtBx, cmpyName);
		} catch (Exception e) {
			Reports.fail("Fail to enter Company Name");
			throw e;
		}
	}
	/**
	 * 
	 * @param cmpyAlias
	 * @throws Exception
	 */
	public void enterCmpyAlias(String cmpyAlias) throws Exception {
		try {
			BaseUtility.SendKeys(cmpyAlias_TxtBx, cmpyAlias);
		} catch (Exception e) {
			Reports.fail("Fail to enter Company Alias");
			throw e;
		}
	}
	
	/**
	 * 
	 * @param phNo
	 * @throws Exception
	 */
	public void enterPhNumber(String phNo) throws Exception {
		try {
			BaseUtility.SendKeys(phNumber_TxtBx, phNo);
		} catch (Exception e) {
			Reports.fail("Fail to enter Phone number");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickcountryDropdown() throws Exception {
		try {
			BaseUtility.Click(country_Dropdown);
		} catch (Exception e) {
			Reports.fail("Fail to click Country Dropdown link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickAusDropdownValue() throws Exception {
		try {
			BaseUtility.Click(aus_DropdownValue);
		} catch (Exception e) {
			Reports.fail("Fail to click Aus Country from Dropdown");
			throw e;
		}
	}
	/**
	 * 
	 * @param firstName
	 * @throws Exception
	 */
	public void enterFirstName(String firstName) throws Exception {
		try {
			BaseUtility.SendKeys(fistName_TxtBx, firstName);
		} catch (Exception e) {
			Reports.fail("Fail to enter First Name");
			throw e;
		}
	}
	/**
	 * 
	 * @param lastName
	 * @throws Exception
	 */
	public void enterLastName(String lastName) throws Exception {
		try {
			BaseUtility.SendKeys(lastName_TxtBx, lastName);
		} catch (Exception e) {
			Reports.fail("Fail to enter Last Name");
			throw e;
		}
	}
	/**
	 * 
	 * @param email
	 * @throws Exception
	 */
	public void enterEmail(String email) throws Exception {
		try {
			BaseUtility.SendKeys(email_TxtBx, email);
		} catch (Exception e) {
			Reports.fail("Fail to enter Email");
			throw e;
		}
	}
	/**
	 * 
	 * @param phNo
	 * @throws Exception
	 */
	public void enterAdminPhNum(String phNo) throws Exception {
		try {
			BaseUtility.SendKeys(adminPhNum_TxtBx, phNo);
		} catch (Exception e) {
			Reports.fail("Fail to enter Admin Phone Number");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickWelcomeMailCheckBx() throws Exception {
		try {
			BaseUtility.Click(welMail_checkBx);
		} catch (Exception e) {
			Reports.fail("Fail to click Welcome mail checkbox");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickCustPgNxtLnk() throws Exception {
		try {
			BaseUtility.Click(custPgNxt_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Customer page Next Link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickCustSubPgNxtLnk() throws Exception {
		try {
			BaseUtility.Click(custSubPgNxt_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Customer sub page Next Link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickCustSaveBtn() throws Exception {
		try {
			BaseUtility.Click(custSave_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click Customer creation Save button");
			throw e;
		}
	}
	/*public void createCustomerFlow(String partner, String cmpyName, String cmpyAlias, String phNo, String firstName,
			String lastName, String email) throws Exception {
		try {
			BaseUtility.Click(partners_Lnk);
			Thread.sleep(2000);
			BaseUtility.SendKeys(search_TxtBx, partner);
			Thread.sleep(3000);
			BaseUtility.Click(searchIcon_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(defaultPartner_Lnk);
			BaseUtility.Click(addCustomer_Lnk);
			BaseUtility.Click(next_Lnk);
			BaseUtility.SendKeys(cmpyName_TxtBx, cmpyName);
			BaseUtility.SendKeys(cmpyAlias_TxtBx, cmpyAlias);
			BaseUtility.SendKeys(phNumber_TxtBx, phNo);
			BaseUtility.SendKeys(fistName_TxtBx, firstName);
			BaseUtility.SendKeys(lastName_TxtBx, lastName);
			BaseUtility.SendKeys(email_TxtBx, email);
			BaseUtility.SendKeys(adminPhNum_TxtBx, phNo);
			BaseUtility.Click(welMail_checkBx);
			BaseUtility.Click(custPgNxt_Lnk);
			BaseUtility.Click(custSubPgNxt_Lnk);
			BaseUtility.Click(custSave_Btn);
		} catch (Exception e) {
			Reports.fail("US Customer Creation is Failed");
			throw e;
		}
	}*/
}
