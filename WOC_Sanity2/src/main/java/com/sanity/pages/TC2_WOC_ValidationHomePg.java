package com.sanity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class TC2_WOC_ValidationHomePg {
	/** The driver. */
	WebDriver driver;

	/**
	 * Login to Portal
	 * 
	 * @param driver
	 *            the driver
	 */
	public TC2_WOC_ValidationHomePg(WebDriver driver) {
		this.driver = driver;
	}
	/** WOC Home Page Home Link */
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-sidebar']//a[contains(@href,'dashboard')]")
	WebElement home_Lnk;

	/** WOC Home Page element*/
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Welcome to the WAVE')]")
	WebElement hmPg_Txt;
	
	/** WOC Home Page Distributor Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'distributor')]")
	WebElement distributor_Lnk;

	/** WOC Distributor Page element */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Distributor')]")
	WebElement distributorPg_Txt;
	
	/** WOC Home Page Partners Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'partner')]")
	WebElement partner_Lnk;

	/** WOC Partner Page element */
	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Partner Name')]")
	WebElement partnerPg_Txt;
	
	/** WOC Home Page All Customers Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'customer')]")
	WebElement allCust_Lnk;

	/** WOC All Customers Page element */
	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Company Alias')]")
	WebElement allCustPg_Txt;
	
	/** WOC Home Page All Users Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'users')]")
	WebElement allUsers_Lnk;

	/** WOC All Users Page element */
	@FindBy(how = How.XPATH, using = "//th[@data-sort='UserName']")
	WebElement allUsersPg_Txt;
	
	/** WOC Home Page MSI Customers Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'MSI Customers')]")
	WebElement msiCust_Lnk;

	/** WOC MSI Customers Page element */
	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Company Alias')]")
	WebElement msiCustPg_Txt;
	
	/** WOC MSI Default Partner Page All Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'billing')]")
	WebElement billing_Lnk;

	/** WOC Billing Page element */
	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Next Billing Date')]")
	WebElement billingPg_Txt;
	/** WOC Home page Gateways  Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'GatewayDevice')]")
	WebElement gateways_Lnk;

	/** WOC Gateways Page element */
	@FindBy(how = How.XPATH, using = "//th[@data-sort='machineName']")
	WebElement gatewaysPg_Txt;
	/** WOC Home page Devices  Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'Devices')]")
	WebElement devices_Lnk;
	/** WOC Devices Page element */
	@FindBy(how = How.XPATH, using = "//th[@data-sort='deviceId']")
	WebElement devicesPg_Txt;
	/** WOC Home page Components Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'Components')]")
	WebElement components_Lnk;
	/** WOC Component Page element */
	@FindBy(how = How.XPATH, using = "//a[@id='addComponent']")
	WebElement addComponentPg_Txt;
	/** WOC Home page Component Groups Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'ComponentGroups')]")
	WebElement componentGroups_Lnk;
	/** WOC Component Groups Page element */
	@FindBy(how = How.XPATH, using = "//a[@id='addComponentGroup']")
	WebElement addComponentGroup_Txt;
	/** WOC Home page Voice Stack Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'voicestack')]")
	WebElement voiceStack_Lnk;
	/** WOC Voice Stack Page element */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Voice Stack')]")
	WebElement addVoiceStack_Txt;
	/** WOC Home page Nitro Management Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'nitro')]")
	WebElement nitroManagment_Lnk;
	/** WOC Nitro page element */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'nitro/allnetworks')]")
	WebElement nitro_Txt;
	/** WOC Home page Notification Link */
	@FindBy(how = How.XPATH, using = "//a[@id='notificationLink']")
	WebElement notification_Lnk;
	/** WOC Notification text */
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'no notifications')]")
	WebElement noNotfication_Txt;
	/** WOC Home Page Settings Icon */
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'settings-icon')]")
	WebElement settingsIcon_Lnk;
	/** WOC Home page Settings-Employee Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Employees')]")
	WebElement settingsEmployee_Lnk;
	/** WOC Employee page Add Employee Element */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Employee')]")
	WebElement employeePgAddEmp_Txt;
	/** WOC Home page Settings-Support Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'Help')]")
	WebElement settings_Lnk;
	/** WOC Home page Settings-LogOff Link */
	@FindBy(how = How.XPATH, using = "//form[@id='logoutFormTopNav']")
	WebElement settingsLogOff_Lnk;
	/** WOC Error Popup */
	@FindBy(how = How.XPATH, using = "//div[@class='modal-dialog']//*[contains(text(),'error')]|//*[contains(text(),'Error')]")
	WebElement errorPopup_Txt;
	
	String hmPgTxt = "//li[contains(text(),'Welcome to the WAVE')]";
	String distributorPgTxt = "//a[contains(text(),'Add Distributor')]";
	
	/**
	 * 
	 * @throws Exception
	 */
	public void clickHomeLnk() throws Exception {
		try {
			BaseUtility.Click(home_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to Click Home page Link from Home page");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateHmPg(String homePgExpTxt) throws Exception {
		try {
			BaseUtility.validatelink(errorPopup_Txt, hmPg_Txt, hmPgTxt, homePgExpTxt);
		} catch (Exception e) {
			Reports.fail("Fail to validate Home page element");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickDistributorLnk() throws Exception {
		try {
			BaseUtility.Click(distributor_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to Click Distributor Link from Home page");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateDistributorPg(String distributorPgExpTxt) throws Exception {
		try {
			BaseUtility.validatelink(errorPopup_Txt, distributorPg_Txt, distributorPgTxt, distributorPgExpTxt);
		} catch (Exception e) {
			Reports.fail("Fail to validate Distributor page element");
			throw e;
		}
	}
}
