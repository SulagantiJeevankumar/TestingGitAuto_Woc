package com.sanity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task_WOC_AnnLicSubscr {
	/** The driver. */
	WebDriver driver;

	/**
	 * Annual Subscription 
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task_WOC_AnnLicSubscr(WebDriver driver) {
		this.driver = driver;
	}
	/** Settings icon */
	@FindBy(how = How.XPATH, using 		= "//span[@class='glyphicon glyphicon-cog settings-icon']")
	WebElement settings_Icon;
	/** Annual Subscription Link */
	@FindBy(how = How.XPATH, using 		= "//a[text()='+ Annual Subscription']")
	WebElement annualSubscri_Lnk;
	/** Manage Subscription Link */
	@FindBy(how = How.XPATH, using 		= "//a[contains(text(),'Manage Subscription')]")
	WebElement mangeSubscri_Lnk;
	/** Add Licenses button  */
	@FindBy(how = How.XPATH, using 		= "//a[@data-target='#addLicenseCountModal']")
	WebElement addLic_Btn;
	/** Add Wave App Licenses Text Box  */
	@FindBy(how = How.XPATH, using 		= "//input[@id='addBroadbandLicenseCount']")
	WebElement addWaveAppLic_TxtBx;
	/** Add Wave Dis Licenses Text Box  */
	@FindBy(how = How.XPATH, using 		= "//input[@id='addDispatchLicenseCount']")
	WebElement addWaveDisLic_TxtBx;
	/** Add Wave Wireless Licenses Text Box */
	@FindBy(how = How.XPATH, using 		= "//input[@id='addTlkLicenseCount']")
	WebElement addWaveWireLessLic_TxtBx;
	/** Add 24 months Wave Wireless Licenses Text Box */
	@FindBy(how = How.XPATH, using 		= "//input[@id='addTlk24LicenseCount']")
	WebElement addWave24WireLessLic_TxtBx;
	/** Add Video Licenses Text Box */
	@FindBy(how = How.XPATH, using 		= "//input[@id='addVideoLicenseCount']")
	WebElement addVideoLic_TxtBx;
	/** Add Dispatch Video Licenses Text Box */
	@FindBy(how = How.XPATH, using 		= "//input[@id='addDispVideoLicenseCount']")
	WebElement addDispVideoLic_TxtBx;
	/** Update Button */
	@FindBy(how = How.XPATH, using 		= "//button[text()='Update']")
	WebElement update_Btn;
	/** Cancel Button */
	@FindBy(how = How.XPATH, using 		= "//a[text()='Cancel']")
	WebElement cancel_Btn;
	/** Popup Ok button */
	@FindBy(how = How.XPATH, using 		= "//button[text()='OK']")
	WebElement ok_Btn;
	/** Go To Home Dashboard button */
	@FindBy(how = How.XPATH, using 		= "//a[@id='homeDashboard']")
	WebElement goToHmDash_btn;
	/** Annual Manage Subscription Link */
	@FindBy(how = How.XPATH, using 		= "//*[text()='WAVE Annual']/parent::div//*[text()='Manage Subscription']")
	WebElement annManageSub_Lnk;
	
	
	/**
	 * 
	 * @throws Exception
	 */
	public void settingsIcon() throws Exception {
		try {
			BaseUtility.Click(settings_Icon);
		} catch (Exception e) {
			Reports.fail("Unable to click Settings Icon");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void plusAnnSubscriLnk() throws Exception {
		try {
			BaseUtility.Click(annualSubscri_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click +Annual Subscription link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void manSubscriLnk() throws Exception {
		try {
			BaseUtility.Click(mangeSubscri_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Manage Subscription link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void addLicBtn() throws Exception {
		try {
			BaseUtility.Click(addLic_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Add Licences button");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveAppLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveAppLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave App Licenses");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveDipLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveDisLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Dispatch Licenses");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveVideoLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addVideoLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Video Licenses");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveDispVideoLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addDispVideoLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Dispatch Video Licenses");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void updateBtn() throws Exception {
		try {
			BaseUtility.Click(update_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Update Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void popupOkBtn() throws Exception {
		try {
			BaseUtility.Click(ok_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Popup Ok Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void gotoHmDashBtn() throws Exception {
		try {
			BaseUtility.Click(goToHmDash_btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Goto Home Dashboard Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void annMangaeSubscLnk() throws Exception {
		try {
			BaseUtility.Click(annManageSub_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Annual Subscription Link");
            throw e;
		}
	}
}
