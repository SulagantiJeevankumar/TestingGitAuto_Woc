package com.sanity.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class TC1_WOC_Login {
	/** The driver. */
	WebDriver driver;

	/**
	 * Login to Portal
	 * 
	 * @param driver
	 *            the driver
	 */
	public TC1_WOC_Login(WebDriver driver) {
		this.driver = driver;
	}
	/** WOC Login Link */
	@FindBy(how = How.XPATH, using = "//button[@id='buddy-anchor']/div")
	WebElement login_Lnk;

	/** WOC UserName Text Box*/
	@FindBy(how = How.XPATH, using = "//input[@id='Email']")
	WebElement userName_TxtBx;
	
	/** WOC Password Text Box */
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	WebElement password_TxtBx;

	/** WOC SignIn Button */
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement signIn_Btn;
	
	/**
	 * Woc portal Login Link
	 * @throws Exception 
	 * 
	 */
	public void clickLoginLnk() throws Exception {
		try {
			BaseUtility.Click(login_Lnk);
		} catch (Exception e) {
			Reports.fail("Fail to click Portal Login link");
			throw e;
		}
	}
	/**
	 * 
	 * @param WOCUserName
	 * @throws Exception
	 */
	public void enterWocUserName(String WOCUserName) throws Exception {
		try {
			BaseUtility.SendKeys(userName_TxtBx, WOCUserName);
		} catch (Exception e) {
			Reports.fail("Fail to enter Woc portal UserName");
			throw e;
		}
	}
	/**
	 * 
	 * @param WOCPass
	 * @throws Exception
	 */
	public void enterWocPassword(String WOCPass) throws Exception {
		try {
			BaseUtility.SendKeys(password_TxtBx, WOCPass);
		} catch (Exception e) {
			Reports.fail("Fail to enter Woc portal Password");
			throw e;
		}
	}
	/**
	 * Woc Portal Login page SignIn button
	 * @throws Exception 
	 * 
	 */
	public void clickSignInBtn() throws Exception {
		try {
			BaseUtility.Click(signIn_Btn);
		} catch (Exception e) {
			Reports.fail("Fail to click Portal Sigin button");
			throw e;
		}
	}
	/*public void loginFlow(String WOCUserName, String WOCPass) throws Exception {
		try {
			BaseUtility.Click(login_Lnk);
			BaseUtility.SendKeys(userName_TxtBx, WOCUserName);
			BaseUtility.SendKeys(password_TxtBx, WOCPass);
			BaseUtility.Click(signIn_Btn);
		} catch (Exception e) {
			Reports.fail("Login to Portal is Failed");
			throw e;
		}
	}*/
}
