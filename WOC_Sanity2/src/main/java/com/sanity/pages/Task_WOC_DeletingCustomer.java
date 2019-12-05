package com.sanity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task_WOC_DeletingCustomer {
	/** The driver. */
	WebDriver driver;

	/**
	 * Deleting Customer
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task_WOC_DeletingCustomer(WebDriver driver) {
		this.driver = driver;
	}
	/** MSI Default Partner  */
	@FindBy(how = How.XPATH, using 		= "//a[text()='MSI Default Partner']")
	WebElement msiDefPart_Lnk;
	/** Operator Link */
	@FindBy(how = How.XPATH, using 		= "//a[contains(text(),'Operator')]")
	WebElement operator_Lnk;
	/** All Customers Link */
	@FindBy(how = How.XPATH, using 		= "//a[contains(text(),'All Customers')]")
	WebElement allCust_Lnk;
	/** All Customers page Search Text box  */
	@FindBy(how = How.XPATH, using 		= "//input[@id='search-text']")
	WebElement search_TxtBx;
	/** All Customers page Search Icon  */
	@FindBy(how = How.XPATH, using 		= "//span[@class='icon-search']/parent::button")
	WebElement search_Icon;
	/** All Customers page customer check box  */
	@FindBy(how = How.XPATH, using 		= "//input[@type='checkbox']/parent::div//label")
	WebElement cust_CheckBx;
	/** Actions Dropdown */
	@FindBy(how = How.XPATH, using 		= "//div[@id='actions']")
	WebElement actions_DrpDw;
	/** Delete Link */
	@FindBy(how = How.XPATH, using 		= "//a[@class='delete-item']")
	WebElement delete_Lnk;
	/** Created Customer */
	@FindBy(how = How.XPATH, using 		= "//a[contains(text(),'Testing US Cust Auto 001')]")
	WebElement Cust_Lnk ;
	
	String CustLnk = "//a[contains(text(),'Testing US Cust Auto 001')]";
	
	/**
	 * 
	 * @throws Exception
	 */
	public void msiDefParLnk() throws Exception {
		try {
			BaseUtility.Click(msiDefPart_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to Click MSI Default link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void operatorLnk() throws Exception {
		try {
			BaseUtility.Click(operator_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Operator link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void allCustLnk() throws Exception {
		try {
			BaseUtility.Click(allCust_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click All Customers link");
            throw e;
		}
	}
	/**
	 * 
	 * @param Cust_CmpyName
	 * @throws Exception
	 */
	public void enterCust(String Cust_CmpyName) throws Exception {
		try {
			BaseUtility.SendKeys(search_TxtBx, Cust_CmpyName);
		} catch (Exception e) {
			Reports.fail("Unable to enter Customer name in search box");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void srchIcon() throws Exception {
		try {
			BaseUtility.Click(search_Icon);
		} catch (Exception e) {
			Reports.fail("Unable to click Search Icon");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void custCheckBx() throws Exception {
		try {
			BaseUtility.Click(cust_CheckBx);
		} catch (Exception e) {
			Reports.fail("Unable to click Customer Check Box");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void actionsDrpDw() throws Exception {
		try {
			BaseUtility.Click(actions_DrpDw);
		} catch (Exception e) {
			Reports.fail("Unable to click Actions Dropdown");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void delLnk() throws Exception {
		try {
			BaseUtility.Click(delete_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Delete link from actions");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateCustDel() throws Exception {
		try {
			BaseUtility.validateEmptyResults(Cust_Lnk, CustLnk);
		} catch (Exception e) {
			Reports.fail("Falied to validate deleted customer");
            throw e;
		}
	}
}
