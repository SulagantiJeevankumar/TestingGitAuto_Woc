package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.pages.TC2_WOC_ValidationHomePg;
import com.sanity.pages.Task3_ChargifySubscription;
import com.sanity.pages.Task4_AddBYODDispUsers;
import com.sanity.pages.Task_WOC_AnnLicSubscr;
import com.sanity.pages.Task_WOC_LicCountValidate;
import com.sanity.pages.Task_WOC_US_MonthlyLicAddOrRemove;

public class Task3_ChargifySubscribeFlow {
	WebDriver driver;

	/** The WOC US Customer Subscription. */
	Task3_ChargifySubscription chargifySub;
	Task_WOC_LicCountValidate licValidate;
	Task_WOC_AnnLicSubscr annLicSubscr;
	Task_WOC_US_MonthlyLicAddOrRemove monAddrRmvLic;
	Task4_AddBYODDispUsers byodDipUsers;

	/**
	 * Instantiates US Customer Subscription.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task3_ChargifySubscribeFlow(WebDriver driver) {
		this.driver = driver;

		chargifySub = new Task3_ChargifySubscription(driver);
		PageFactory.initElements(driver, chargifySub);
		licValidate = new Task_WOC_LicCountValidate(driver);
		PageFactory.initElements(driver, licValidate);
		annLicSubscr = new Task_WOC_AnnLicSubscr(driver);
		PageFactory.initElements(driver, annLicSubscr);
		monAddrRmvLic = new Task_WOC_US_MonthlyLicAddOrRemove(driver);
		PageFactory.initElements(driver, monAddrRmvLic);
		byodDipUsers = new Task4_AddBYODDispUsers(driver);
		PageFactory.initElements(driver, byodDipUsers);
	}

	public void validation(String waveAppLic, String disLic, String wireless2YrsLic, String wirelessLic, String emailId,
			String phNo, String firstName, String lastName, String ShpAddr1, String ShpAddr2, String city,
			String pincode, String expMAddLicCount, String expMAddVidLicCount, String expMRmvLic,
			String expAAddLicCount, String expARmvLicCount, String expAnnRemoveLicCount,
			String pttMobLimitLicCountExpTxt, String pttDispLimitLicCountExpTxt,
			String waveTwoWayRadioLimitLicCountExpTxt, String pttVideoLicCountExpTxt, String pttDispVideoLicCountExpTxt)
			throws Exception {
		try {
			chargifySub.monthlySubsBtn();
			chargifySub.enterWaveAppLic(waveAppLic);
			chargifySub.enterWaveDipMontLic(disLic);
			/*
			 * chargifySub.enterWaveWire2YrsLic(wireless2YrsLic);
			 * chargifySub.enterWaveWireMontLic(wirelessLic);
			 */
			chargifySub.updateToolsBtn();
			chargifySub.enterEmailID(emailId);
			chargifySub.enterPhNo(phNo);
			chargifySub.enterFirstName(firstName);
			chargifySub.enterLastName(lastName);
			chargifySub.enterShpAddr1(ShpAddr1);
			chargifySub.enterShpAddr2(ShpAddr2);
			chargifySub.enterCity(city);
			chargifySub.selectState();
			chargifySub.enterPincode(pincode);
			chargifySub.fillDataBtn();
			chargifySub.enterCardFirstName(firstName);
			chargifySub.enterCardLastName(lastName);
			chargifySub.checkBxTnC();
			Thread.sleep(10000);
			chargifySub.submitBtn();
			chargifySub.gotoHmPgBtn();
			chargifySub.settingsIcon();
			chargifySub.accountLnk();
			chargifySub.manageSubscrbLnk();
			licValidate.validateWaveAppMonthlyLicCount(waveAppLic);
			/*
			 * licValidate.validateWaveWireMonthlyLicCount(waveAppLic);
			 * licValidate.validateWaveWireMonth2YrLicCount(waveAppLic);
			 */
			licValidate.validateWaveDispMonthlyLicCount(waveAppLic);
			monAddrRmvLic.settingsIcon();
			annLicSubscr.plusAnnSubscriLnk();
			annLicSubscr.manSubscriLnk();
			monAddrRmvLic.addLicBtn();
			monAddrRmvLic.enterWaveAppLic(waveAppLic);
			monAddrRmvLic.enterWaveDispLic(waveAppLic);
			monAddrRmvLic.enterVideoLic(waveAppLic);
			monAddrRmvLic.enterToAddDispVideoMonthlyLic(waveAppLic);
			monAddrRmvLic.updateBtn();
			monAddrRmvLic.popupOkBtn();
			monAddrRmvLic.gotoHmDashBtn();
			chargifySub.settingsIcon();
			chargifySub.accountLnk();
			annLicSubscr.annMangaeSubscLnk();
			monAddrRmvLic.mangSubscLnk();
			licValidate.validateWaveAppAnnLicCount(expAAddLicCount);
			licValidate.validateWaveDispAnnLicCount(expAAddLicCount);
			licValidate.validateWaveVideoAnnLicCount(expAAddLicCount);
			licValidate.validateWaveDispVideoAnnLicCount(expAAddLicCount);
			monAddrRmvLic.settingsIcon();
			monAddrRmvLic.accountLnk();
			monAddrRmvLic.montMangSubscLnk();
			monAddrRmvLic.mangSubscLnk();
			monAddrRmvLic.addLicBtn();
			monAddrRmvLic.enterWaveAppLic(waveAppLic);
			monAddrRmvLic.enterWaveWireLic(waveAppLic);
			monAddrRmvLic.enterWaveWire2YrsLic(waveAppLic);
			monAddrRmvLic.enterWaveDispLic(waveAppLic);
			monAddrRmvLic.enterVideoLic(waveAppLic);
			monAddrRmvLic.enterToAddDispVideoMonthlyLic(waveAppLic);
			monAddrRmvLic.updateBtn();
			monAddrRmvLic.popupOkBtn();
			monAddrRmvLic.gotoHmDashBtn();
			monAddrRmvLic.settingsIcon();
			monAddrRmvLic.accountLnk();
			monAddrRmvLic.montMangSubscLnk();
			monAddrRmvLic.mangSubscLnk();
			licValidate.validateWaveAppMonthlyLicCount(expMAddLicCount);
			/*
			 * licValidate.validateWaveWireMonthlyLicCount(expMAddLicCount);
			 * licValidate.validateWaveWireMonth2YrLicCount(expMAddLicCount);
			 */ licValidate.validateWaveDispMonthlyLicCount(expMAddLicCount);
			licValidate.validateWaveVideoLicCount(expMAddVidLicCount);
			licValidate.validateWaveDispVideoLicCount(expMAddVidLicCount);
			monAddrRmvLic.removeLicBtn();
			monAddrRmvLic.enterRmvWaveAppLic(waveAppLic);
			monAddrRmvLic.enterRmvWaveWireLic(waveAppLic);
			monAddrRmvLic.enterRmvWaveWire2YrsLic(waveAppLic);
			monAddrRmvLic.enterRmvWaveDipLic(waveAppLic);
			monAddrRmvLic.remUpdateBtn();
			monAddrRmvLic.popupOkBtn();
			monAddrRmvLic.gotoHmDashBtn();
			monAddrRmvLic.settingsIcon();
			monAddrRmvLic.accountLnk();
			monAddrRmvLic.montMangSubscLnk();
			monAddrRmvLic.mangSubscLnk();
			licValidate.validateWaveAppMonthlyLicCount(waveAppLic);
			/*
			 * licValidate.validateWaveWireMonthlyLicCount(waveAppLic);
			 * licValidate.validateWaveWireMonth2YrLicCount(waveAppLic);
			 */
			licValidate.validateWaveDispMonthlyLicCount(waveAppLic);
			licValidate.validateWaveVideoLicCount(expMAddVidLicCount);
			licValidate.validateWaveDispVideoLicCount(expMAddVidLicCount);
			monAddrRmvLic.settingsIcon();
			monAddrRmvLic.accountLnk();
			annLicSubscr.annMangaeSubscLnk();
			annLicSubscr.manSubscriLnk();
			monAddrRmvLic.removeLicBtn();
			monAddrRmvLic.enterRmvWaveAppLic(expAnnRemoveLicCount);
			monAddrRmvLic.enterRmvWaveDipLic(expAnnRemoveLicCount);
			monAddrRmvLic.enterRmvVideoLic(expAnnRemoveLicCount);
			monAddrRmvLic.enterRmvDispVideoLic(expAnnRemoveLicCount);
			monAddrRmvLic.remUpdateBtn();
			monAddrRmvLic.popupOkBtn();
			monAddrRmvLic.gotoHmDashBtn();
			monAddrRmvLic.settingsIcon();
			monAddrRmvLic.accountLnk();
			annLicSubscr.annMangaeSubscLnk();
			annLicSubscr.manSubscriLnk();
			licValidate.validateWaveAppAnnLicCount(expARmvLicCount);
			licValidate.validateWaveDispAnnLicCount(expARmvLicCount);
			licValidate.validateWaveVideoAnnLicCount(expARmvLicCount);
			licValidate.validateWaveDispVideoAnnLicCount(expARmvLicCount);
			byodDipUsers.clickUsersLnk();
			licValidate.validateUserPgWavePTTMobLimitLicCount(pttMobLimitLicCountExpTxt);
			licValidate.validateUserPgWavePTTDispLimitLicCount(pttDispLimitLicCountExpTxt);
			licValidate.validateUserPgTwoWayRadioLimitLicCount(waveTwoWayRadioLimitLicCountExpTxt);
			licValidate.validateUserPgPTTVideoLimitLicCount(pttVideoLicCountExpTxt);
			licValidate.validateUserPgPTTDispVideoLimitLicCount(pttDispVideoLicCountExpTxt);
			/*
			 * //chargifySub.addAnnualSub(waveAppLic);
			 * chargifySub.addMonthlySub(waveAppLic);
			 * chargifySub.removeMonthlySub(waveAppLic);
			 * chargifySub.removeAnnualSub(waveAppLic);
			 */
		} catch (Exception e) {
			throw e;
		}
	}
}
