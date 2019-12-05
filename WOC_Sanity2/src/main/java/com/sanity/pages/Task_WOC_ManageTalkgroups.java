package com.sanity.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task_WOC_ManageTalkgroups {
	/** The driver. */
	WebDriver driver;

	/**
	 * Handling Manage Talk groups
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task_WOC_ManageTalkgroups(WebDriver driver) {
		this.driver = driver;
	}
	/** Users page Talk group Link   */
	@FindBy(how = How.XPATH, using 		= "//a[contains(@href,'group')]")
	WebElement tg_Lnk;
	/** Talk group page Add Talk group Link   */
	@FindBy(how = How.XPATH, using 		= "//div[@id='addGroupBox']")
	WebElement addTG_Lnk;
	/** Talk group title text box   */
	@FindBy(how = How.XPATH, using 		= "//input[@slot='input']")
	WebElement tgName_TxtBx;
	/** Dispatch Talk group Radio Button   */
	@FindBy(how = How.XPATH, using 		= "//label[@for='dispatch_tg']")
	WebElement dipatchTG_RBtn;
	/**  Broadcast Talk group Radio Button   */
	@FindBy(how = How.XPATH, using 		= "//label[@for='broadcast_tg']")
	WebElement broadcastTG_RBtn;
	/**  Broadband/Standard Talk group Radio Button   */
	@FindBy(how = How.XPATH, using 		= "//label[@for='standard_tg']")
	WebElement standardTG_RBtn;
	/**  Yes button to add Talk group */
	@FindBy(how = How.XPATH, using 		= "//button[@class='yes']")
	WebElement yes_Btn;
	/**  TalkGroups Drag Element Location */
	@FindBy(how = How.XPATH, using 		= "//li[@data-draggable='item'][1]")
	WebElement dragLocation;
	/**  TalkGroups Drop Element Location */
	@FindBy(how = How.XPATH, using 		= "//div[@data-draggable='target']")
	WebElement dropLocation;
	/** Default Talk Groups hover*/
	@FindBy(how = How.XPATH, using 		= "//span[contains(text(),'Default TalkGroup')]/parent::h2/parent::div/parent::div//span[@class='icon-edit']")	
	WebElement tgEdit_Btn;
	/** Talk Groups Update button */
	@FindBy(how = How.XPATH, using 		= "//span[contains(text(),'Default TalkGroup')]/parent::h2")	
	WebElement deafultTG_Lnk;
	/** Talk group All Users selection Check box */
	@FindBy(how = How.XPATH, using 		= "//label[@for='all-users-max']")	
	WebElement tgAllUsers_Lnk;
	/** Default Talk group count */
	@FindBy(how = How.XPATH, using 		= "//span[contains(text(),'Default TalkGroup')]/parent::h2/parent::div/parent::div//span[@class='count']")
	WebElement defaultTGCount_Txt;
	/** Users page Talk group Manage Link   */
	@FindBy(how = How.XPATH, using 		= "//a[contains(text(),'Manage') and contains(@href,'javascript')]")
	WebElement tgManage_Lnk;
	/** Talk groups check boxes */
	@FindBy(how = How.XPATH, using 		= "//input[@type='checkbox']/parent::div//label")
	WebElement tg_CheckBx;
	/** Talk groups check boxes */
	@FindBy(how = How.XPATH, using 		= "//input[@id='submitButton']")
	WebElement tgEditPgSave_Btn;
	/** Uncheck boxes Manage Talk groups path */
	@FindBy(how = How.XPATH, using 		= "//div[@class='checkbox']")
	WebElement unCheckTG_CheckBx;
	
	
	String tgCheckBx 					= "//input[@type='checkbox']/parent::div//label";
	String dragLoc						= "//li[@data-draggable='item'][1]";
	String dropLoc						= "//div[@data-draggable='target'][2]";
	String defaultTGCountTxt			= "//span[contains(text(),'Default TalkGroup')]/parent::h2/parent::div/parent::div//span[@class='count']";
	String unCheckTGCheckBx				= "//div[@class='checkbox']";
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTGLnk() throws Exception {
		try {
			BaseUtility.Click(tg_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to Click left navigation talk group link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickAddTGLnk() throws Exception {
		try {
			BaseUtility.Click(addTG_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to Click Add talk group link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void enterTGName(String tgName) throws Exception {
		try {
			BaseUtility.SendKeys(tgName_TxtBx, tgName);
		} catch (Exception e) {
			Reports.fail("Unable to enter talk group Name");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickDispRBtn() throws Exception {
		try {
			BaseUtility.Click(dipatchTG_RBtn);
		} catch (Exception e) {
			Reports.fail("Unable to Click Dispatch Group Radio Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickBCRBtn() throws Exception {
		try {
			BaseUtility.Click(broadcastTG_RBtn);
		} catch (Exception e) {
			Reports.fail("Unable to Click BroadCast Group Radio Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickBBRBtn() throws Exception {
		try {
			BaseUtility.Click(standardTG_RBtn);
		} catch (Exception e) {
			Reports.fail("Unable to Click Broadband/Standard Group Radio Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickYesBtn() throws Exception {
		try {
			BaseUtility.Click(yes_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Yes Button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void tgManageLnk() throws Exception {
		try {
			BaseUtility.Click(tgManage_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to Click Users page talk group Manage link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void mutipleTGCheck() throws Exception {
		try {
			BaseUtility.UnCheckingChkbox(tg_CheckBx, tgCheckBx);
		} catch (Exception e) {
			Reports.fail("Failed to handle Multiple Talkgroups");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void dragAndDrop() throws Exception {
		try {
			BaseUtility.dragAndDrop(dragLoc, dropLoc);
		} catch (Exception e) {
			Reports.fail("Failed to handle Drag and Drop");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void hoverTGEdit() throws Exception {
		try {
			BaseUtility.hoverToElement(deafultTG_Lnk);
		} catch (Exception e) {
			Reports.fail("Failed to hover on Talk group Edit Icon");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTGEdit() throws Exception {
		try {
			BaseUtility.Click(tgEdit_Btn);
		} catch (Exception e) {
			Reports.fail("Failed to click on Edit Icon");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickAllUsersCheckBx() throws Exception {
		try {
			BaseUtility.Click(tgAllUsers_Lnk);
		} catch (Exception e) {
			Reports.fail("Failed to click Talk group All users Checkbox");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void clickTGEditSaveBtn() throws Exception {
		try {
			BaseUtility.Click(tgEditPgSave_Btn);
		} catch (Exception e) {
			Reports.fail("Failed to Click Talk groups edit page Save button");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void ValidtTGCount() throws Exception {
		try {
			BaseUtility.validateTGCount(defaultTGCount_Txt, defaultTGCountTxt);
		} catch (Exception e) {
			Reports.fail("Failed to validate TG count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public void validateMTGChecbx(String tgName) throws IOException {
		try {
			BaseUtility.validateManTGUpdate(unCheckTG_CheckBx, unCheckTGCheckBx, tgName);
		}catch (Exception e2) {
			Reports.fail("Fail to click Talk group check boxes ");
		}
	}
	
}
