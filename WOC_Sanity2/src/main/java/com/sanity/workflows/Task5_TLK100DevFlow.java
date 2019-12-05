package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.pages.Task4_AddBYODDispUsers;
import com.sanity.pages.Task5_TLK100Device;

public class Task5_TLK100DevFlow {
	WebDriver driver;

	/** The RI login page. */
	Task5_TLK100Device tlk100Devices;
	Task4_AddBYODDispUsers byodDipUsers;

	/**
	 * Instantiates a adding Byod/ Dispatch Users * 
	 * @param driver
	 *            the driver
	 */
	public Task5_TLK100DevFlow(WebDriver driver) {
		this.driver = driver;

		tlk100Devices = new Task5_TLK100Device(driver);
		PageFactory.initElements(driver, tlk100Devices);
		byodDipUsers = new Task4_AddBYODDispUsers(driver);
		PageFactory.initElements(driver, byodDipUsers);
	}

	public void tlkDevValidation(String imei, String serialNo, String dspyName, String tklNotification) throws Exception {
		try {
			//tlk100Devices.addTLK100DevFlow(imei, serialNo, dspyName);
			Thread.sleep(3000);
			tlk100Devices.clickTLK100Pg();
			Thread.sleep(3000);
			tlk100Devices.clickTLK100RegBtn();
			Thread.sleep(3000);
			//tlk100Devices.clickRegOnlyBtn();
			tlk100Devices.enterIMEI(imei);
			tlk100Devices.enterSrNo(serialNo);
			tlk100Devices.enterTLKDevName(dspyName);
			tlk100Devices.clickADDBtn();
			Thread.sleep(3000);
			tlk100Devices.clickNxtBtn();
			Thread.sleep(30000);
			/*tlk100Devices.clickLangDropdown();
			tlk100Devices.clickEngLang();
			tlk100Devices.clickTGCheckbox();
			tlk100Devices.clickAllConatctsCheckbox();
			tlk100Devices.scrollpage();
			tlk100Devices.clickConfPgNxtLnk();
			Thread.sleep(10000);
			tlk100Devices.clickSubmitBtn();
			Thread.sleep(10000);
			tlk100Devices.clickOkBtn();
			Thread.sleep(10000);
			//tlk100Devices.clickViewDevBtn();
			Thread.sleep(10000);
			byodDipUsers.clickUsersLnk();*/
			Thread.sleep(3000);
			tlk100Devices.clickNotificationLnk();
			Thread.sleep(3000);
			tlk100Devices.validateTLKNotificationLnkTxt(tklNotification);
			Thread.sleep(3000);
			tlk100Devices.clickTlkNotificationLnk();
			Thread.sleep(3000);
			tlk100Devices.validateTLKNotificationPopUpTxt(tklNotification);
			Thread.sleep(3000);
			tlk100Devices.clickPopupDismissBtn();
			Thread.sleep(3000);
			tlk100Devices.validateTLKNotiDismiss();
			Thread.sleep(3000);
		} catch (Exception e) {
			throw e;
		}
	}
}
