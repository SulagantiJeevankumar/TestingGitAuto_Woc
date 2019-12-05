package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.pages.Task3_ChargifySubscription;
import com.sanity.pages.Task_WOC_AnnLicSubscr;
import com.sanity.pages.Task_WOC_DeletingCustomer;
import com.sanity.pages.Task_WOC_LicCountValidate;
import com.sanity.pages.Task_WOC_US_MonthlyLicAddOrRemove;

public class Task_WOC_DelCustFlow {
	WebDriver driver;

	/** The WOC Deleting Customer */
	Task_WOC_DeletingCustomer delCust;
	Task3_ChargifySubscription chargifySub;
	Task_WOC_LicCountValidate montLicValidate;
	Task_WOC_AnnLicSubscr annLicSubscr;
	Task_WOC_US_MonthlyLicAddOrRemove monAddrRmvLic;

	/**
	 * Instantiates US Customer Subscription.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task_WOC_DelCustFlow(WebDriver driver) {
		this.driver = driver;
		delCust = new Task_WOC_DeletingCustomer(driver);
		PageFactory.initElements(driver, delCust);
		chargifySub = new Task3_ChargifySubscription(driver);
		PageFactory.initElements(driver, chargifySub);
		montLicValidate = new Task_WOC_LicCountValidate(driver);
		PageFactory.initElements(driver, montLicValidate);
		annLicSubscr = new Task_WOC_AnnLicSubscr(driver);
		PageFactory.initElements(driver, annLicSubscr);
		monAddrRmvLic = new Task_WOC_US_MonthlyLicAddOrRemove(driver);
		PageFactory.initElements(driver, monAddrRmvLic);
	}

	public void validation(String Cust_CmpyName) throws Exception {
		try {
			delCust.msiDefParLnk();
			Thread.sleep(3000);
			delCust.operatorLnk();
			Thread.sleep(3000);
			delCust.allCustLnk();
			Thread.sleep(3000);
			delCust.enterCust(Cust_CmpyName);
			Thread.sleep(3000);
			delCust.srchIcon();
			Thread.sleep(3000);
			delCust.custCheckBx();
			Thread.sleep(3000);
			delCust.actionsDrpDw();
			Thread.sleep(3000);
			delCust.delLnk();
			Thread.sleep(3000);
			monAddrRmvLic.popupOkBtn();
			Thread.sleep(10000);
			delCust.enterCust(Cust_CmpyName);
			Thread.sleep(5000);
			delCust.srchIcon();
			Thread.sleep(10000);
			delCust.validateCustDel();	
			Thread.sleep(10000);
		} catch (Exception e) {
			throw e;
		}
	}
}
