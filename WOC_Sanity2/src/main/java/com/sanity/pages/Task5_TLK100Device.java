package com.sanity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task5_TLK100Device {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new home page.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task5_TLK100Device(WebDriver driver) {
		this.driver = driver;
	}
	/** TLK100 link in Users Page  */
	@FindBy(how = How.XPATH, using = "//a[text()='TLK 100s']")
	WebElement tlk100UsersPg_Lnk;
	/** TLK100 device link  */
	@FindBy(how = How.XPATH, using = "//a[text()='Register Device']")
	WebElement tkl100Reg_Btn;
	/** Register Only button*/
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'registeronly')]")
	WebElement registerOnly_Btn;
	/** Register Only button*/
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Register from a configured template device')]")
	WebElement registerFromTemplate_Btn;
	/** IMEI text box  */
	@FindBy(how = How.XPATH, using = "//input[@placeholder='IMEI']")
	WebElement imei_TxtBx;
	/** Serial Number text box  */
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Serial Number']")
	WebElement sn_TxtBx;
	/** Display Name Text box  */
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Display Name']")
	WebElement displayName_TxtBx;
	/** Add Button*/
	@FindBy(how = How.XPATH, using = "//a[text()='Add']")
	WebElement add_Btn;
	/** Next Link*/
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'NEXT')]")
	WebElement nxt_lnk;
	/** Configure page Next Link */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'BACK')]/parent::div/child::a[contains(text(),'NEXT')]")
	WebElement confPgNxt_Lnk;
	/** Remove Link*/
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'remove')]")
	WebElement remove_lnk;
	/** Popup Ok Button */
	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	WebElement ok_Btn;
	/** Submit Button*/
	@FindBy(how = How.XPATH, using = "//a[text()='SUBMIT']")
	WebElement submit_Btn;
	/** View My Devices Button*/
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View My TLK100 Devices')]")
	WebElement viewDevices_Btn;
	/** Languages Dropdown*/
	@FindBy(how = How.XPATH, using = "//select[@id='languageDropDown']")
	WebElement language_Dd;
	/** English Language*/
	@FindBy(how = How.XPATH, using = "//option[text()='English US (en-us)']")
	WebElement engLang_Value;
	/** All Talkgroups Check box */
	@FindBy(how = How.XPATH, using = "//label[contains(@for,'isAssociatedCheckBox')]")
	WebElement talkgroups_Checkbx;
	/** All Contacts Check box */
	@FindBy(how = How.XPATH, using = "//label[@for='all-contacts']")
	WebElement allCont_Checkbx;
	/** Notification Link */
	@FindBy(how = How.XPATH, using = "//a[@id='notificationLink']")
	WebElement notification_Lnk;
	/** TLK 100 Device registration notification link*/
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'TLK 100 registration has completed')]")
	WebElement tlk100DevRegNot_Lnk;
	/** TLK 100 Device registration notification text on Pop up*/
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'TLK 100 registration has completed')]")
	WebElement tlk100DevRegNot_Txt;
	/** Notification Pop up Dismiss button*/
	@FindBy(how = How.XPATH, using = "//button[@id='modal-dismiss-button']")
	WebElement popupDismiss_Btn;
	/** Notification Pop up Ok button*/
	@FindBy(how = How.XPATH, using = "//button[@id='modal-ok-button']")
	WebElement popupOk_Btn;

	String tlk100DevRegNotLnk = "//li[contains(text(),'TLK 100 registration has completed')]";
	String tlk100DevRegNotTxt = "//p[contains(text(),'TLK 100 registration has completed')]";
	String popupDismissBtn	 = "//button[@id='modal-dismiss-button']";
	
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTLK100Pg()throws Exception{
		try {
			BaseUtility.Click(tlk100UsersPg_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to Click TLK 100 page");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTLK100RegBtn()throws Exception{
		try {
			BaseUtility.Click(tkl100Reg_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to Click Register TLK 100 button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickRegOnlyBtn()throws Exception{
		try {
			BaseUtility.Click(registerOnly_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to Click Register Only button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickRegFromTemplateBtn()throws Exception{
		try {
			BaseUtility.Click(registerFromTemplate_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to Click Register From Template button");
			throw e;
		}
	}
	/**
	 * 
	 * @param imei
	 * @throws Exception
	 */
	public void enterIMEI(String imei)throws Exception{
		try {
			BaseUtility.SendKeys(imei_TxtBx, imei);
		} catch (Exception e) {
			Reports.fail("Fail to enter IMEI Number");
			throw e;
		}
	}
	/**
	 * 
	 * @param serialNo
	 * @throws Exception
	 */
	public void enterSrNo(String serialNo)throws Exception{
		try {
			BaseUtility.SendKeys(sn_TxtBx, serialNo);
		} catch (Exception e) {
			Reports.fail("Fail to enter Serial Number");
			throw e;
		}
	}
	/**
	 * 
	 * @param dspyName
	 * @throws Exception
	 */
	public void enterTLKDevName(String dspyName)throws Exception{
		try {
			BaseUtility.SendKeys(displayName_TxtBx, dspyName);
		} catch (Exception e) {
			Reports.fail("Fail to enter TLK100 Device Name");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickADDBtn()throws Exception{
		try {
			BaseUtility.Click(add_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click Add button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickNxtBtn()throws Exception{
		try {
			BaseUtility.Click(nxt_lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Next button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickLangDropdown()throws Exception{
		try {
			BaseUtility.Click(language_Dd);
		} catch (Exception e) {
			Reports.fail("Fail to click Language dropdown");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickEngLang()throws Exception{
		try {
			BaseUtility.Click(engLang_Value);
		} catch (Exception e) {
			Reports.fail("Fail to click/choose English Language");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTGCheckbox()throws Exception{
		try {
			BaseUtility.Click(talkgroups_Checkbx);
		} catch (Exception e) {
			Reports.fail("Fail to click Talkgroups checkbox");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickAllConatctsCheckbox()throws Exception{
		try {
			BaseUtility.Click(allCont_Checkbx);
		} catch (Exception e) {
			Reports.fail("Fail to click Talkgroups checkbox");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void scrollpage()throws Exception{
		try {
			BaseUtility.scrollPage();
		} catch (Exception e) {
			Reports.fail("Fail to scroll page");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickConfPgNxtLnk()throws Exception{
		try {
			BaseUtility.Click(confPgNxt_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click next link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickSubmitBtn()throws Exception{
		try {
			BaseUtility.Click(submit_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click Submit button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickOkBtn()throws Exception{
		try {
			BaseUtility.Click(ok_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click Ok button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickViewDevBtn()throws Exception{
		try {
			BaseUtility.Click(viewDevices_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click View My Devices button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickNotificationLnk()throws Exception{
		try {
			BaseUtility.Click(notification_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click notification link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateTLKNotificationLnkTxt(String object3)throws Exception{
		try {
			BaseUtility.validateExpText(tlk100DevRegNot_Lnk, tlk100DevRegNotLnk, object3);
		} catch (Exception e) {
			Reports.fail("Fail to validate TLK 100 Notification");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTlkNotificationLnk()throws Exception{
		try {
			BaseUtility.Click(tlk100DevRegNot_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Tlk 100 Dev Reg notification link");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateTLKNotificationPopUpTxt(String object3)throws Exception{
		try {
			BaseUtility.validateExpText(tlk100DevRegNot_Txt, tlk100DevRegNotTxt, object3);
		} catch (Exception e) {
			Reports.fail("Fail to validate TLK 100 Notification Popup text");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickPopupDismissBtn()throws Exception{
		try {
			BaseUtility.Click(popupDismiss_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click PopUp notification Dismiss button");
			throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateTLKNotiDismiss()throws Exception{
		try {
			BaseUtility.validateEmptyResults(tlk100DevRegNot_Lnk, tlk100DevRegNotLnk);
		} catch (Exception e) {
			Reports.fail("Fail to validate notification is delete or not");
			throw e;
		}
	}
	
	/**
	 * Add TLK100 Device
	 * @throws Exception
	 *//*
	public void addTLK100DevFlow(String imei, String serialNo, String dspyName )throws Exception {
		try {
			Thread.sleep(2000);
			BaseUtility.Click(tlk100UsersPg_Lnk);
			Thread.sleep(2000);
			BaseUtility.Click(tkl100Reg_Btn);
			BaseUtility.SendKeys(imei_TxtBx, imei);
			BaseUtility.SendKeys(sn_TxtBx, serialNo);
			BaseUtility.SendKeys(displayName_TxtBx, dspyName);
			BaseUtility.Click(add_Btn);
			Thread.sleep(1000);
			BaseUtility.Click(nxt_lnk);
			BaseUtility.Click(language_Dd);
			BaseUtility.Click(engLang_Value);
			BaseUtility.Click(talkgroups_Checkbx);
			BaseUtility.Click(allCont_Checkbx);
			BaseUtility.scrollPage();
			Thread.sleep(5000);
			BaseUtility.Click(confPgNxt_Lnk);
			BaseUtility.Click(submit_Btn);
			BaseUtility.Click(ok_Btn);
			BaseUtility.Click(viewDevices_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to Add TLK100 device");
		}
	}*/
}
