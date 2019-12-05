package com.sanity.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sanity.lib.BaseUtility;
import com.sanity.pages.Task4_AddBYODDispUsers;
import com.sanity.pages.Task_WOC_ManageTalkgroups;

public class Task4_AddOrEditByodOrDispUsersFlow {
	WebDriver driver;

	/** The RI login page. */
	Task4_AddBYODDispUsers byodDipUsers;
	Task_WOC_ManageTalkgroups tgManage;

	/**
	 * Instantiates a adding Byod/ Dispatch Users *
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task4_AddOrEditByodOrDispUsersFlow(WebDriver driver) {
		this.driver = driver;

		byodDipUsers = new Task4_AddBYODDispUsers(driver);
		PageFactory.initElements(driver, byodDipUsers);
		tgManage = new Task_WOC_ManageTalkgroups(driver);
		PageFactory.initElements(driver, tgManage);
	}

	public void validation(String displayTabName, String tabEmail, String displayMobName, String displayDipName,
			String dipEmail, String editTabName, String editMobName, String editDipName, String bbTgName,
			String dispTgName, String bcTgName, String deactiveExpTxt, String activeExpTxt, String displayTLK100DevName,
			String editTlk100Name, String expReactiveMessage) throws Exception {
		try {
			byodDipUsers.addByodDipUsersFlow(displayTabName, tabEmail, displayMobName, displayDipName, dipEmail);
			Thread.sleep(3000);
			byodDipUsers.editUsers(displayTabName, editTabName, displayMobName, editMobName, displayDipName,
					editDipName);
			Thread.sleep(3000);
			byodDipUsers.clickUsersLnk();
			Thread.sleep(3000);
			byodDipUsers.enterSearchTxt(displayTLK100DevName);
			Thread.sleep(3000);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(2000);
			byodDipUsers.clickUserLnk();
			Thread.sleep(3000);
			byodDipUsers.enterTLL100EditName(editTlk100Name);
			Thread.sleep(3000);
			byodDipUsers.scrollpage();
			Thread.sleep(3000);
			byodDipUsers.clickSaveBtn();
			Thread.sleep(3000);
			byodDipUsers.generateCode(displayTabName, displayMobName, displayDipName);
			Thread.sleep(3000);
			byodDipUsers.enterSearchTxt(displayTLK100DevName);
			Thread.sleep(3000);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(2000);
			byodDipUsers.clickReactivateBtn();
			Thread.sleep(3000);
			byodDipUsers.validateExpReactiveMessage(expReactiveMessage);
			Thread.sleep(3000);
			byodDipUsers.clickOkBtn();
			Thread.sleep(3000);
			tgManage.clickTGLnk();
			Thread.sleep(3000);
			tgManage.clickAddTGLnk();
			Thread.sleep(3000);
			tgManage.enterTGName(bbTgName);
			Thread.sleep(3000);
			tgManage.clickYesBtn();
			Thread.sleep(5000);
			tgManage.clickAddTGLnk();
			Thread.sleep(3000);
			tgManage.enterTGName(dispTgName);
			Thread.sleep(3000);
			tgManage.clickDispRBtn();
			Thread.sleep(3000);
			tgManage.clickYesBtn();
			Thread.sleep(5000);
			tgManage.clickAddTGLnk();
			Thread.sleep(3000);
			tgManage.enterTGName(bcTgName);
			Thread.sleep(3000);
			tgManage.clickBCRBtn();
			Thread.sleep(3000);
			tgManage.clickYesBtn();
			Thread.sleep(3000);
			/*tgManage.dragAndDrop();
			Thread.sleep(2000);*/
			tgManage.hoverTGEdit();
			Thread.sleep(3000);
			tgManage.clickTGEdit();
			Thread.sleep(3000);
			tgManage.clickAllUsersCheckBx();
			Thread.sleep(3000);
			tgManage.clickTGEditSaveBtn();
			Thread.sleep(2000);
			byodDipUsers.clickOkBtn();
			Thread.sleep(5000);
			BaseUtility.refreshBrowser();
			Thread.sleep(3000);
			tgManage.ValidtTGCount();
			Thread.sleep(3000);
			byodDipUsers.clickUsersLnk();
			Thread.sleep(3000);
			/*byodDipUsers.enterSearchTxt(displayTabName);
			Thread.sleep(3000);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(2000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(3000);
			byodDipUsers.hoverMTGCheckBx();
			Thread.sleep(2000);
			byodDipUsers.handelTGChecbx();
			Thread.sleep(3000);
			byodDipUsers.clickSaveBtn();
			Thread.sleep(3000);
			byodDipUsers.clickOkBtn();
			Thread.sleep(3000);
			byodDipUsers.enterSearchTxt(displayTabName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(2000);
			tgManage.validateMTGChecbx(displayTabName);
			Thread.sleep(2000);
			byodDipUsers.clickCancelBtn();
			Thread.sleep(3000);
			byodDipUsers.enterSearchTxt(displayMobName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(3000);
			byodDipUsers.hoverMTGCheckBx();
			Thread.sleep(3000);
			byodDipUsers.handelTGChecbx();
			Thread.sleep(3000);
			byodDipUsers.clickSaveBtn();
			byodDipUsers.clickOkBtn();
			Thread.sleep(3000);
			byodDipUsers.enterSearchTxt(displayMobName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(2000);
			tgManage.validateMTGChecbx(displayMobName);
			Thread.sleep(2000);
			byodDipUsers.clickCancelBtn();
			Thread.sleep(2000);
			byodDipUsers.enterSearchTxt(displayDipName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(2000);
			byodDipUsers.hoverMTGCheckBx();
			Thread.sleep(3000);
			byodDipUsers.handelTGChecbx();
			Thread.sleep(3000);
			byodDipUsers.clickSaveBtn();
			byodDipUsers.clickOkBtn();
			Thread.sleep(3000);
			byodDipUsers.enterSearchTxt(displayDipName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(2000);
			tgManage.validateMTGChecbx(displayDipName);
			Thread.sleep(2000);
			byodDipUsers.clickCancelBtn();
			Thread.sleep(2000);
			byodDipUsers.enterSearchTxt(displayTLK100DevName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(3000);
			byodDipUsers.hoverMTGCheckBx();
			Thread.sleep(3000);
			byodDipUsers.handelTGChecbx();
			Thread.sleep(3000);
			byodDipUsers.clickSaveBtn();
			byodDipUsers.clickOkBtn();
			Thread.sleep(2000);
			byodDipUsers.enterSearchTxt(displayTLK100DevName);
			byodDipUsers.clickSearchIcon();
			Thread.sleep(3000);
			byodDipUsers.clickTGManageLNK();
			Thread.sleep(2000);
			tgManage.validateMTGChecbx(displayTLK100DevName);
			Thread.sleep(2000);
			byodDipUsers.clickCancelBtn();*/
			Thread.sleep(2000);
			byodDipUsers.deactiveUsers(deactiveExpTxt);
			Thread.sleep(2000);
			byodDipUsers.activeUsers(activeExpTxt);
			Thread.sleep(2000);
			// byodDipUsers.deleteUsers();
		} catch (Exception e) {
			throw e;
		}
	}
}
