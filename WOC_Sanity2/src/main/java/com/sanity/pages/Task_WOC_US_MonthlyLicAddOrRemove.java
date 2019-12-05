package com.sanity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task_WOC_US_MonthlyLicAddOrRemove {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new home page.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task_WOC_US_MonthlyLicAddOrRemove(WebDriver driver) {
		this.driver = driver;
	}
	/** Settings icon */
	@FindBy(how = How.XPATH, using = "//span[@class='glyphicon glyphicon-cog settings-icon']")
	WebElement settings_Icon;
	/** Manage Subscription Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Manage Subscription')]")
	WebElement mangeSubscri_Lnk;
	/** Add Licenses button  */
	@FindBy(how = How.XPATH, using = "//a[@data-target='#addLicenseCountModal']")
	WebElement addLic_Btn;
	/** Remove Licenses button  */
	@FindBy(how = How.XPATH, using = "//a[@data-target='#removeLicenseCountModal']")
	WebElement removeLic_Btn;
	/** Add Wave App Licenses Text Box  */
	@FindBy(how = How.XPATH, using = "//input[@id='addBroadbandLicenseCount']")
	WebElement addWaveAppLic_TxtBx;
	/** Add Wave Dis Licenses Text Box  */
	@FindBy(how = How.XPATH, using = "//input[@id='addDispatchLicenseCount']")
	WebElement addWaveDisLic_TxtBx;
	/** Add Wave Wireless Licenses Text Box */
	@FindBy(how = How.XPATH, using = "//input[@id='addTlkLicenseCount']")
	WebElement addWaveWireLessLic_TxtBx;
	/** Add 24 months Wave Wireless Licenses Text Box */
	@FindBy(how = How.XPATH, using = "//input[@id='addTlk24LicenseCount']")
	WebElement addWave24WireLessLic_TxtBx;
	/** Add Video Licenses Text Box */
	@FindBy(how = How.XPATH, using = "//input[@id='addVideoLicenseCount']")
	WebElement addVideoLic_TxtBx;
	/** Add Dispatch Video Licenses Text Box */
	@FindBy(how = How.XPATH, using = "//input[@id='addDispVideoLicenseCount']")
	WebElement addDispVideoLic_TxtBx;
	/** Update Button */
	@FindBy(how = How.XPATH, using = "//button[text()='Update']")
	WebElement update_Btn;
	/** Remove popup page Update Button */
	@FindBy(how = How.XPATH, using = "//div[@id='removeLicenseCountModal']//button[text()='Update']")
	WebElement remUpdate_Btn;
	/** Go To Home Dashboard button */
	@FindBy(how = How.XPATH, using = "//a[@id='homeDashboard']")
	WebElement goToHmDash_btn;
	/** Cancel Button */
	@FindBy(how = How.XPATH, using = "//a[text()='Cancel']")
	WebElement cancel_Btn;
	/** Remove Wave App Licenses */
	@FindBy(how = How.XPATH, using = "//input[@id='removeBroadbandLicenseCount']")
	WebElement removeWaveAppLic_TxtBx;
	/** Remove Wave Dip Licenses */
	@FindBy(how = How.XPATH, using = "//input[@id='removeDispatchLicenseCount']")
	WebElement removeWaveDipLic_TxtBx;
	/** Remove Wave Wireless Licenses */
	@FindBy(how = How.XPATH, using = "//input[@id='removeTlkLicenseCount']")
	WebElement removeWaveWirelessLic_TxtBx;
	/** Remove 24 Wave Wireless Licenses */
	@FindBy(how = How.XPATH, using = "//input[@id='removeTlk24LicenseCount']")
	WebElement remove24WaveWirelessLic_TxtBx;
	/** Remove Video Licenses */
	@FindBy(how = How.XPATH, using = "//input[@id='removeVideoLicenseCount']")
	WebElement removeVideoLic_TxtBx;
	/** Remove Dispatch Video Licenses */
	@FindBy(how = How.XPATH, using = "//input[@id='removeDispVideoLicenseCount']")
	WebElement removeDispVideoLic_TxtBx;
	/** Account Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'subscription')]")
	WebElement account_Lnk;
	/** Monthly Manage Subscription Link */
	@FindBy(how = How.XPATH, using = "//*[text()='WAVE Monthly']/parent::div//*[text()='Manage Subscription']")
	WebElement monManageSub_Lnk;
	/** Popup Ok button */
	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	WebElement ok_Btn;
	/** Remove Licenses Update Button */
	@FindBy(how = How.XPATH, using = "//div[@id='removeLicenseCountModal']//button[text()='Update']")
	WebElement removeUpdate_Btn;
		
	/**
	 * 
	 * @throws Exception
	 */
	public void settingsIcon() throws Exception {
		try {
			BaseUtility.Click(settings_Icon);
		} catch (Exception e) {
			Reports.fail("Unable to click Settings icon");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void accountLnk() throws Exception {
		try {
			BaseUtility.Click(account_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Account link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void montMangSubscLnk() throws Exception {
		try {
			BaseUtility.Click(monManageSub_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Monthly Manage Subscription link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void mangSubscLnk() throws Exception {
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
			Reports.fail("Unable to click Add Licenses Button");
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
			Reports.fail("Unable to enter Wave App Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveDispLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveDisLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Dispatch Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveWireLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveWireLessLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Wireless Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterWaveWire2YrsLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWave24WireLessLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Wireless 2Yrs Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterVideoLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addVideoLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Video Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param waveAppLic
	 * @throws Exception
	 */
	public void enterToAddDispVideoMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addDispVideoLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add Dispatch Video Monthly Licenses count");
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
	public void remUpdateBtn() throws Exception {
		try {
			BaseUtility.Click(remUpdate_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click remove Update Button");
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
	public void removeLicBtn() throws Exception {
		try {
			BaseUtility.Click(removeLic_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Remove licenses button");
            throw e;
		}
	}
	/**
	 * 
	 * @param rmvWaveLic
	 * @throws Exception
	 */
	public void enterRmvWaveAppLic(String rmvWaveLic) throws Exception {
		try {
			BaseUtility.SendKeys(removeWaveAppLic_TxtBx, rmvWaveLic);
		} catch (Exception e) {
			Reports.fail("Unable to remove Wave App Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param rmvWaveLic
	 * @throws Exception
	 */
	public void enterRmvWaveWireLic(String rmvWaveLic) throws Exception {
		try {
			BaseUtility.SendKeys(removeWaveWirelessLic_TxtBx, rmvWaveLic);
		} catch (Exception e) {
			Reports.fail("Unable to remove Wave wireless Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param rmvWaveLic
	 * @throws Exception
	 */
	public void enterRmvWaveWire2YrsLic(String rmvWaveLic) throws Exception {
		try {
			BaseUtility.SendKeys(remove24WaveWirelessLic_TxtBx, rmvWaveLic);
		} catch (Exception e) {
			Reports.fail("Unable to remove Wave wireless 2Yrs Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param rmvWaveLic
	 * @throws Exception
	 */
	public void enterRmvWaveDipLic(String rmvWaveLic) throws Exception {
		try {
			BaseUtility.SendKeys(removeWaveDipLic_TxtBx, rmvWaveLic);
		} catch (Exception e) {
			Reports.fail("Unable to remove Wave Dispatch Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param rmvWaveLic
	 * @throws Exception
	 */
	public void enterRmvVideoLic(String rmvWaveLic) throws Exception {
		try {
			BaseUtility.SendKeys(removeVideoLic_TxtBx, rmvWaveLic);
		} catch (Exception e) {
			Reports.fail("Unable to remove Wave Video Licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @param rmvWaveLic
	 * @throws Exception
	 */
	public void enterRmvDispVideoLic(String rmvWaveLic) throws Exception {
		try {
			BaseUtility.SendKeys(removeDispVideoLic_TxtBx, rmvWaveLic);
		} catch (Exception e) {
			Reports.fail("Unable to remove Dispatch Video Licenses Count");
            throw e;
		}
	}
}
