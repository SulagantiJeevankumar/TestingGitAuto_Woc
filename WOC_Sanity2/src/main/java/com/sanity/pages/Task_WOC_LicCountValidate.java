package com.sanity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task_WOC_LicCountValidate {
	/** The driver. */
	WebDriver driver;

	/**
	 * Validating Licenses count
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task_WOC_LicCountValidate(WebDriver driver) {
		this.driver = driver;
	}
	/** Settings icon */
	@FindBy(how = How.XPATH, using 			= "//span[@class='glyphicon glyphicon-cog settings-icon']")
	WebElement settings_Icon;
	/** Account Link */
	@FindBy(how = How.XPATH, using 			= "//a[contains(@href,'subscription')]")
	WebElement account_Lnk;
	/** Manage Subscription Link */
	@FindBy(how = How.XPATH, using 			= "//a[contains(text(),'Manage Subscription')]")
	WebElement mangeSubscri_Lnk;
	/** Wave Mobile App monthly Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//*[contains(text(),'WAVE PTT Mobile App')]/parent::div/child::div/child::div")
	WebElement waveApplicCount_Txt;
	/** Wave Wireless monthly Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//*[contains(text(),'WAVE Two-Way Radio (Monthly)')]/parent::div/child::div/child::div")
	WebElement waveWirelicCount_Txt;
	/** Wave Wireless 2Yrs Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//*[contains(text(),'WAVE Two-Way Radio (2 YR Contract)')]/parent::div/child::div/child::div")
	WebElement waveWire2YrlicCount_Txt;
	/** Wave Disp monthly Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//*[contains(text(),'Dispatch')]/parent::div/child::div/child::div")
	WebElement waveDisplicCount_Txt;
	/** Wave Video monthly Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//*[contains(text(),'Video')]/parent::div/child::div/child::div")
	WebElement waveVideolicCount_Txt;
	/** Wave Dispatch Video monthly Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//*[contains(text(),'Dispatcher video')]/parent::div/child::div/child::div")
	WebElement waveDispVideolicCount_Txt;
	/** Users Page WAVE PTT Mobile App licenses used Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[1]")
	WebElement userPgPTTMobUsedLicCount_Txt;
	/** Users Page WAVE PTT Mobile App licenses Limit Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[2]")
	WebElement userPgPTTMobLimitLicCount_Txt;
	/** Users Page WAVE PTT Dispatch licenses used Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[3]")
	WebElement userPgPTTDispUsedLicCount_Txt;
	/** Users Page WAVE PTT Dispatch licenses Limit Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[4]")
	WebElement userPgPTTDispLimitLicCount_Txt;
	/** Users Page WAVE MOTOTRBO Client licenses used Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[5]")
	WebElement userPgMotoClientUsedLicCount_Txt;
	/** Users Page WAVE  MOTOTRBO Client licenses Limit Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[6]")
	WebElement userPgMotoClientLimitLicCount_Txt;
	/** Users Page WAVE Two Way Radio licenses used Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[7]")
	WebElement userPgTwoWayRadioUsedLicCount_Txt;
	/** Users Page WAVE Two Way Radio licenses Limit Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[8]")
	WebElement userPgTwoWayRadioLimitLicCount_Txt;
	/** Users Page WAVE PTT Streaming Video licenses used Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[9]")
	WebElement userPgPTTVideoUsedLicCount_Txt;
	/** Users Page WAVE PTT Streaming Video licenses Limit Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[10]")
	WebElement userPgPTTVideoLimitLicCount_Txt;
	/** Users Page WAVE PTT Dispatch Streaming Video licenses used Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[11]")
	WebElement userPgPTTDispVideoUsedLicCount_Txt;
	/** Users Page WAVE PTT Dispatch Streaming Video licenses Limit Licenses Count */
	@FindBy(how = How.XPATH, using 			= "//span[@class='license-count']/child::span[12]")
	WebElement userPgPTTDispVideoLimitLicCount_Txt;
	
	
	String waveApplicCountTxt 					= "//*[contains(text(),'WAVE PTT Mobile App ')]/parent::div/child::div/child::div";
	String waveWirelicCountTxt 					= "//*[contains(text(),'WAVE Two-Way Radio (Monthly)')]/parent::div/child::div/child::div"; 
	String waveWire2YrslicCountTxt 				= "//*[contains(text(),'WAVE Two-Way Radio (2 YR Contract)')]/parent::div/child::div/child::div";
	String waveDisplicCountTxt 					= "//*[contains(text(),'Dispatch')]/parent::div/child::div/child::div";
	String waveVideolicCountTxt					= "//*[contains(text(),'Video')]/parent::div/child::div/child::div";
	String waveDispVideolicCountTxt				= "//*[contains(text(),'Dispatcher video')]/parent::div/child::div/child::div";		
	String waveAppMonlicTxt 					= "WAVE App (Monthly)";
	String waveWireMonlicTxt 					= "WAVE Wireless (Monthly)";
	String waveWireMon2YrslicTxt 				= "WAVE Wireless (2 Yr Contract)";
	String waveDispMonlicTxt					= "Wave Dispatch (Monthly)";
	String waveVideoMonlicTxt					= "Wave Video (Monthly)";
	String waveDispVideoMonlicTxt				= "Wave Disp Video (Monthly)";
	String waveAppAnnlicTxt 					= "WAVE App (Annual)";
	String waveDispAnnlicTxt					= "Wave Dispatch (Annual)";
	String waveVideoAnnlicTxt					= "Wave Video (Annual)";
	String waveDispVideoAnnlicTxt				= "Wave Dispatch Video (Annual)";
	//String licensesCount 						= "10";
	String userPgPTTMobUsedLicCountTxt 			= "//span[@class='license-count']/child::span[1]";
	String userPgPTTMobLimitLicCountTxt 		= "//span[@class='license-count']/child::span[2]";
	String userPgPTTDispUsedLicCountTxt 		= "//span[@class='license-count']/child::span[3]";
	String userPgPTTDispLimitLicCountTxt 		= "//span[@class='license-count']/child::span[4]";
	String userPgMotoClientUsedLicCountTxt 		= "//span[@class='license-count']/child::span[5]";
	String userPgMotoClientLimitLicCountTxt 	= "//span[@class='license-count']/child::span[6]";
	String userPgTwoWayRadioUsedLicCountTxt 	= "//span[@class='license-count']/child::span[7]";
	String userPgTwoWayRadioLimitLicCountTxt 	= "//span[@class='license-count']/child::span[8]";
	String userPgPTTVideoUsedLicCountTxt 		= "//span[@class='license-count']/child::span[11]";
	String userPgPTTVideoLimitLicCountTxt		= "//span[@class='license-count']/child::span[12]";
	String userPgPTTDispVideoUsedLicCountTxt 	= "//span[@class='license-count']/child::span[13]";
	String userPgPTTDispVideoLimitLicCountTxt 	= "//span[@class='license-count']/child::span[14]";
	
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
	public void accountLnk() throws Exception {
		try {
			BaseUtility.Click(account_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Account Link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void manageSubscrbLnk() throws Exception {
		try {
			BaseUtility.Click(mangeSubscri_Lnk);
		} catch (Exception e) {
			Reports.fail("Unable to click Account Link");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveAppMonthlyLicCount(String expLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveApplicCount_Txt, waveApplicCountTxt, expLicCount, waveAppMonlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave App monthly licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveWireMonthlyLicCount(String expLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveWirelicCount_Txt, waveWirelicCountTxt, expLicCount, waveWireMonlicTxt );
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Wireless Monthly licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveWireMonth2YrLicCount(String expLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveWire2YrlicCount_Txt, waveWire2YrslicCountTxt, expLicCount, waveWireMon2YrslicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave wireless monthly 2Yrs licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveDispMonthlyLicCount(String expLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveDisplicCount_Txt, waveDisplicCountTxt, expLicCount, waveDispMonlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Dispatch licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveVideoLicCount(String expVidLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveVideolicCount_Txt, waveVideolicCountTxt, expVidLicCount, waveVideoMonlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Video licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveDispVideoLicCount(String expVidLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveDispVideolicCount_Txt, waveDispVideolicCountTxt, expVidLicCount, waveDispVideoMonlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Dispatch Video licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveAppAnnLicCount(String expLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveApplicCount_Txt, waveApplicCountTxt, expLicCount, waveAppAnnlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave App Annual licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveDispAnnLicCount(String expLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveDisplicCount_Txt, waveDisplicCountTxt, expLicCount, waveDispAnnlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Dispatch Annual licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveVideoAnnLicCount(String expVidLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveVideolicCount_Txt, waveVideolicCountTxt, expVidLicCount, waveVideoAnnlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Video Annual licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateWaveDispVideoAnnLicCount(String expVidLicCount) throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveDispVideolicCount_Txt, waveDispVideolicCountTxt, expVidLicCount, waveDispVideoAnnlicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Video Annual licenses Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateUserPgWavePTTMobLimitLicCount(String pttMobLimitLicCountExpTxt) throws Exception {
		try {
			BaseUtility.validatingUsersPglicCount(userPgPTTMobLimitLicCount_Txt, userPgPTTMobLimitLicCountTxt, pttMobLimitLicCountExpTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave PTT Mobile Liceses Limit Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateUserPgWavePTTDispLimitLicCount(String pttDispLimitLicCountExpTxt) throws Exception {
		try {
			BaseUtility.validatingUsersPglicCount(userPgPTTDispLimitLicCount_Txt, userPgPTTDispLimitLicCountTxt, pttDispLimitLicCountExpTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave PTT Dispatch Liceses Limit Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateUserPgTwoWayRadioLimitLicCount(String waveTwoWayRadioLimitLicCountExpTxt) throws Exception {
		try {
			BaseUtility.validatingUsersPglicCount(userPgTwoWayRadioLimitLicCount_Txt, userPgTwoWayRadioLimitLicCountTxt, waveTwoWayRadioLimitLicCountExpTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Two Way Radio Liceses Limit Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateUserPgPTTVideoLimitLicCount(String pttVideoLicCountExpTxt) throws Exception {
		try {
			BaseUtility.validatingUsersPglicCount(userPgPTTVideoLimitLicCount_Txt, userPgPTTVideoLimitLicCountTxt, pttVideoLicCountExpTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave PTT Video Liceses Limit Count");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void validateUserPgPTTDispVideoLimitLicCount(String pttDispVideoLicCountExpTxt) throws Exception {
		try {
			BaseUtility.validatingUsersPglicCount(userPgPTTDispVideoLimitLicCount_Txt, userPgPTTDispVideoLimitLicCountTxt, pttDispVideoLicCountExpTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave PTT Dispatch Streaming Video Liceses Limit Count");
            throw e;
		}
	}
}
