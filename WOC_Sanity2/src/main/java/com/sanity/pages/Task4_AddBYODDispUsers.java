package com.sanity.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task4_AddBYODDispUsers {
	/** The driver. */
	WebDriver driver;

	/**
	 *Validating BOYD/Dispatch Users
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task4_AddBYODDispUsers(WebDriver driver) {
		this.driver = driver;
	}

	/** Users link from Customer Dashboard */
	@FindBy(how = How.XPATH, using 				= "//a[text()='Users']")
	WebElement users_Lnk;
	/** Add User Button */
	@FindBy(how = How.XPATH, using 				= "//a[@id='addUserButton']")
	WebElement addUser_Btn;
	/** Tablet/Mobile button*/
	@FindBy(how = How.XPATH, using 				= "//a[@id='addMobileUserButton']")
	WebElement tabMob_Btn;
	/** Display Name Text Box */
	@FindBy(how = How.XPATH, using 				= "//input[@id='DisplayName']")
	WebElement disName_TxtBx;
	/** Active Check Box */
	@FindBy(how = How.XPATH, using 				= "//label[@for='userIsActive']")
	WebElement active_CheckBx;
	/** Phone Number text box */
	@FindBy(how = How.XPATH, using 				= "//input[@id='PhoneInput']")
	WebElement phNum_TxtBx;
	/** Tablet User Checkbox */
	@FindBy(how = How.XPATH, using 				= "//label[@for='userIsWifi']")
	WebElement tabUser_CheckBx;
	/** Email Textbox */
	@FindBy(how = How.XPATH, using 				= "//input[@id='Email']")
	WebElement byodEmail_TxtBx;
	/** Video Package Checkbox */
	@FindBy(how = How.XPATH, using 				= "//label[@for='userIsVideoStream']")
	WebElement videoPkg_CheckBx;
	/** Save button */
	@FindBy(how = How.XPATH, using 				= "//button[text()='Save']")
	WebElement save_Btn;
	/** Add Dispatch Button */
	@FindBy(how = How.XPATH, using 				= "//a[@id='addDispatchUserButton']")
	WebElement addDisp_Btn;
	/** Dispatch Email Text Box */
	@FindBy(how = How.XPATH, using 				= "//input[@id='EmailRequired']")
	WebElement disEmail_TxtBx;
	/** Users page Search Text Box */
	@FindBy(how = How.XPATH, using 				= "//input[@id='search-text']")
	WebElement searchUsers_TxtBx;
	/** Users page Search Icon */
	@FindBy(how = How.XPATH, using 				= "//span[@class='icon-search']/parent::button")
	WebElement searchIconUsers_Btn;
	/** User link */
	@FindBy(how = How.XPATH, using 				= "//a[@title='Edit User']")
	WebElement user_Lnk;
	/** Generate Activation Code */
	@FindBy(how = How.XPATH, using 				= "//a[text()='Generate']")
	WebElement generateCode_Lnk;
	/** Popup Ok Button */
	@FindBy(how = How.XPATH, using 				= "//button[text()='OK']")
	WebElement ok_Btn;
	/** Regenerate Activation Code */
	@FindBy(how = How.XPATH, using 				= "//a[text()='Reactivate']")
	WebElement reactivateCode_Lnk;
	/** Regenerate Activation Message */
	@FindBy(how = How.XPATH, using 				= "//div[contains(text(),'Device reactivation message sent')]")
	WebElement reactivateMessage_Txt;
	/** All CheckIn Check box */
	@FindBy(how = How.XPATH, using 				= "//div[@class='checkbox']")
	WebElement allUsers_CheckBx;
	/** Actions Drop down */
	@FindBy(how = How.XPATH, using 				= "//button[@data-toggle='dropdown']")
	WebElement actions_Dropdown;
	/** Active value form Drop down */
	@FindBy(how = How.XPATH, using 				= "//a[text()='Activate']")
	WebElement active_Lnk;
	/** Deactivate value form Drop down */
	@FindBy(how = How.XPATH, using 				= "//a[text()='Deactivate']")
	WebElement deactive_Lnk;
	/** Delete value form Drop down */
	@FindBy(how = How.XPATH, using 				= "//a[text()='Delete']")
	WebElement delete_Lnk;
	/** Notification Link */
	@FindBy(how = How.XPATH, using 				= "//a[@id='notificationLink']")
	WebElement notification_Lnk;
	/** Talk groups related notification xpath */
	@FindBy(how = How.XPATH, using 				= "//*[contains(text(),'Talk Groups')]")
	WebElement tgNotif_Lnk;
	/** Notification body text Xpath */
	@FindBy(how = How.XPATH, using 				= "//div[@id='notification-message-modal']//div[@class='modal-body']/p")
	WebElement notifBody_Txt;
	/** Users page Talk group Manage link */
	@FindBy(how = How.XPATH, using 				= "//a[@class='ManageTalkgroup']")
	WebElement tgManage_Lnk;
	/** Manage Talk group Check box*/
	@FindBy(how = How.XPATH, using 				= "//div[@class='checkbox']")
	WebElement manageTG_Checkbx;
	/** Manage Talk group page Save button */
	@FindBy(how = How.XPATH, using 				= "//button[contains(text(),'Save')]|//input[@id='submit-groups-button']")
	WebElement manageTGSave_Btn;
	/** Manage Talk group page Cancel button */
	@FindBy(how = How.XPATH, using 				= "//a[contains(text(),'Cancel')]")
	WebElement manageTGCancel_Btn;
	/** Uncheck boxes Manage Talk groups path */
	@FindBy(how = How.XPATH, using 				= "//input[@value='false']")
	WebElement unCheckTG_CheckBx;
	/** User disabled status text */
	@FindBy(how = How.XPATH, using 				= "//span[text()='Disabled']")
	WebElement disableStatus_Txt;
	/** User active status text */
	@FindBy(how = How.XPATH, using 				= "//span[text()='Active']")
	WebElement activeStatus_Txt;
	
	
	String manageTGCheckbx 						= "//div[@class='checkbox']";
	String allUsersCheckBx						= "//div[@class='checkbox']";
	String disableStatusTxt						= "//span[text()='Disabled']";
	String activeStatusTxt						= "//span[text()='Active']";
	String reactivateMessageTxt					= "//div[contains(text(),'Device reactivation message sent')]";
	/**
	 * Add/Edit BYOD/Disp Users
	 * @param displayTabName
	 * @param tabEmail
	 * @param displayMobName
	 * @param displayDipName
	 * @param dipEmail
	 * @throws Exception
	 */
	public void addByodDipUsersFlow(String displayTabName, String tabEmail, String displayMobName, String displayDipName, String dipEmail) throws Exception {
		try {
			BaseUtility.Click(users_Lnk);
			Thread.sleep(2000);
			BaseUtility.Click(addUser_Btn);
			BaseUtility.Click(tabMob_Btn);
			BaseUtility.SendKeys(disName_TxtBx, displayTabName);
			BaseUtility.Click(tabUser_CheckBx);
			BaseUtility.SendKeys(byodEmail_TxtBx, tabEmail);
			BaseUtility.Click(active_CheckBx);
			BaseUtility.Click(active_CheckBx);
			BaseUtility.Click(videoPkg_CheckBx);
			BaseUtility.Click(save_Btn);
			Thread.sleep(3000);
			BaseUtility.Click(addUser_Btn);
			BaseUtility.Click(tabMob_Btn);
			BaseUtility.SendKeys(disName_TxtBx, displayMobName);
			BaseUtility.SendKeys(phNum_TxtBx, "1911201901");
			//BaseUtility.SendKeys(byodEmail_TxtBx, tabEmail);
			BaseUtility.Click(active_CheckBx);
			BaseUtility.Click(active_CheckBx);
			BaseUtility.Click(videoPkg_CheckBx);
			BaseUtility.Click(save_Btn);
			Thread.sleep(3000);
			BaseUtility.Click(addUser_Btn);
			BaseUtility.Click(addDisp_Btn);
			BaseUtility.SendKeys(disName_TxtBx, displayDipName);
			BaseUtility.SendKeys(disEmail_TxtBx, dipEmail);
			BaseUtility.Click(active_CheckBx);
			BaseUtility.Click(active_CheckBx);
			BaseUtility.Click(save_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to Add BYOD/Dispatch Users");
		}
	}
	/**
	 * 
	 * @param displayTabName
	 * @throws IOException
	 */
	public void searchTabUser(String displayTabName) throws IOException {
		try {
			BaseUtility.SendKeys(searchUsers_TxtBx, displayTabName);
		}catch (Exception e2) {
			Reports.fail("Fail to enter text in Users page Search box");
		}
	}
	/**
	 * Edit Byod/Dispatch User
	 * @param displayTabName
	 * @param editTabName
	 * @param displayMobName
	 * @param editMobName
	 * @param displayDipName
	 * @param editDipName
	 * @throws IOException 
	 */
	public void editUsers(String displayTabName, String editTabName, String displayMobName, String editMobName, String displayDipName, String editDipName) throws IOException {
		try {
			BaseUtility.SendKeys(searchUsers_TxtBx, displayTabName );
			BaseUtility.Click(searchIconUsers_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(user_Lnk);
			BaseUtility.SendKeys(disName_TxtBx, editTabName);
			BaseUtility.Click(save_Btn);
			BaseUtility.SendKeys(searchUsers_TxtBx, displayMobName);
			BaseUtility.Click(searchIconUsers_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(user_Lnk);
			BaseUtility.SendKeys(disName_TxtBx, editMobName);
			BaseUtility.Click(save_Btn);
			BaseUtility.SendKeys(searchUsers_TxtBx, displayDipName);
			BaseUtility.Click(searchIconUsers_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(user_Lnk);
			BaseUtility.SendKeys(disName_TxtBx, editDipName);
			BaseUtility.Click(save_Btn);
		}catch (Exception e1){
			Reports.fail("Fail to Edit BYOD/Dispatch Users");	
		}
	}
	/**
	 * Generate Activation Code for BYOD and Dispatch User
	 * @param displayTabName
	 * @param displayMobName
	 * @param displayDipName
	 * @throws IOException
	 */
	public void generateCode(String displayTabName, String displayMobName, String displayDipName) throws IOException {
		try {
			BaseUtility.SendKeys(searchUsers_TxtBx, displayTabName );
			BaseUtility.Click(searchIconUsers_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(generateCode_Lnk);
			BaseUtility.Click(ok_Btn);
			Thread.sleep(2000);
			BaseUtility.SendKeys(searchUsers_TxtBx, displayMobName);
			BaseUtility.Click(searchIconUsers_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(generateCode_Lnk);
			BaseUtility.Click(ok_Btn);
			Thread.sleep(2000);
			BaseUtility.SendKeys(searchUsers_TxtBx, displayDipName);
			BaseUtility.Click(searchIconUsers_Btn);
			Thread.sleep(2000);
			BaseUtility.Click(users_Lnk);
		} catch (Exception e2) {
			Reports.fail("Fail to generate activation code for BYOD Users");
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickReactivateBtn() throws Exception{
		try {
			BaseUtility.Click(reactivateCode_Lnk);
		} catch(Exception e) {
			Reports.fail("Fail to click reactivate code");
		}
	}
	/**
	 * 
	 * @param expReactiveMessage
	 * @throws IOException
	 */
	public void validateExpReactiveMessage(String expReactiveMessage) throws IOException {
		try {
			BaseUtility.validateExpText(reactivateMessage_Txt, reactivateMessageTxt, expReactiveMessage);
		} catch (Exception e) {
			Reports.fail("Fail to validate Reactive Popup Message");
		}
	}
	/**
	 * Deactivate Users
	 * @throws IOException
	 */
	public void deactiveUsers(String deactiveExpTxt) throws IOException {
		try {
			Thread.sleep(5000);
			BaseUtility.handelMultipleCheckBoxs(allUsers_CheckBx, allUsersCheckBx);
			BaseUtility.Click(actions_Dropdown);
			BaseUtility.Click(deactive_Lnk);
			BaseUtility.Click(ok_Btn);
			BaseUtility.validateMultipleExpTxt(disableStatus_Txt, disableStatusTxt, deactiveExpTxt);
		}catch (Exception e2) {
			Reports.fail("Fail to deactivate BYOD/Dispatch/TLk 100 Users");
		}
	}
	/**
	 * activate Users
	 * @throws IOException
	 */
	public void activeUsers(String activeExpTxt) throws IOException {
		try {
			Thread.sleep(3000);
			BaseUtility.handelMultipleCheckBoxs(allUsers_CheckBx, allUsersCheckBx);
			BaseUtility.Click(actions_Dropdown);
			BaseUtility.Click(active_Lnk);
			BaseUtility.Click(ok_Btn);
			BaseUtility.validateMultipleExpTxt(activeStatus_Txt, activeStatusTxt, activeExpTxt);
		}catch (Exception e2) {
			Reports.fail("Fail to activate BYOD/Dispatch/TLK 100 Users");
		}
	}
	/**
	 * Delete Users
	 * @throws IOException
	 */
	public void deleteUsers() throws IOException {
		try {
			Thread.sleep(3000);
			BaseUtility.handelMultipleCheckBoxs(allUsers_CheckBx, allUsersCheckBx);
			BaseUtility.Click(actions_Dropdown);
			BaseUtility.Click(delete_Lnk);
			BaseUtility.Click(ok_Btn);
		}catch (Exception e2) {
			Reports.fail("Fail to delete BYOD/Dispatch Users");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickUsersLnk() throws IOException {
		try {
			BaseUtility.Click(users_Lnk);
		}catch (Exception e2) {
			Reports.fail("Fail to click Users link from left naviagtion menu");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickAddUserBtn() throws IOException {
		try {
			BaseUtility.Click(addUser_Btn);
		}catch (Exception e2) {
			Reports.fail("Fail to click AddUser Button");
		}
	}
	/**
	 * 
	 * @param userName
	 * @throws IOException
	 */
	public void enterSearchTxt(String userName) throws IOException {
		try {
			BaseUtility.SendKeys(searchUsers_TxtBx, userName);
		}catch (Exception e2) {
			Reports.fail("Fail to enter text in Search box");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickSearchIcon() throws IOException {
		try {
			BaseUtility.Click(searchIconUsers_Btn);
		}catch (Exception e2) {
			Reports.fail("Fail to click Search icon");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickTGManageLNK() throws IOException {
		try {
			BaseUtility.Click(tgManage_Lnk);
		}catch (Exception e2) {
			Reports.fail("Fail to click Users page Manage Talk groups link ");
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void hoverMTGCheckBx() throws Exception {
		try {
			BaseUtility.hoverToElement(manageTG_Checkbx);
		} catch (Exception e) {
			Reports.fail("Failed to hover on Manage Talk group Check box");
            throw e;
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void handelTGChecbx() throws IOException {
		try {
			BaseUtility.handelMultipleCheckBoxs(manageTG_Checkbx, manageTGCheckbx);
		}catch (Exception e2) {
			Reports.fail("Fail to click Talk group check boxes ");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickSaveBtn() throws IOException {
		try {
			BaseUtility.Click(manageTGSave_Btn);
		}catch (Exception e2) {
			Reports.fail("Fail to click Manage Talkgroups page Save button");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickCancelBtn() throws IOException {
		try {
			BaseUtility.Click(manageTGCancel_Btn);
		}catch (Exception e2) {
			Reports.fail("Fail to click Manage Talkgroups page Cancel button");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickOkBtn() throws IOException {
		try {
			BaseUtility.Click(ok_Btn);
		}catch (Exception e2) {
			Reports.fail("Fail to click Popup Ok button");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickNotifLnk() throws IOException {
		try {
			BaseUtility.Click(notification_Lnk);
		}catch (Exception e2) {
			Reports.fail("Fail to click Notification link");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickTGNotifLnk() throws IOException {
		try {
			BaseUtility.Click(tgNotif_Lnk);
		}catch (Exception e2) {
			Reports.fail("Fail to click Notification link");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void readNotifBodyTxt() throws IOException {
		try {
			BaseUtility.Click(notifBody_Txt);
		}catch (Exception e2) {
			Reports.fail("Fail to read Notification body text");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void clickUserLnk() throws IOException {
		try {
			BaseUtility.Click(user_Lnk);
		}catch (Exception e2) {
			Reports.fail("Fail to click Search result user link");
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void enterTLL100EditName(String editTlk100Name) throws IOException {
		try {
			BaseUtility.SendKeys(disName_TxtBx, editTlk100Name);
		}catch (Exception e2) {
			Reports.fail("Fail to edit TLK 100 device name");
		}
	}
	public void scrollpage() throws IOException {
		try {
			BaseUtility.scrollPage();
		}catch (Exception e2) {
			Reports.fail("Fail to scroll page");
		}
	}
}
