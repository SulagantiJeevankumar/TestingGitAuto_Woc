package com.sanity.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sanity.lib.BaseUtility;
import com.sanity.reports.Reports;

public class Task3_ChargifySubscription {
	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new home page.
	 * 
	 * @param driver
	 *            the driver
	 */
	public Task3_ChargifySubscription(WebDriver driver) {
		this.driver = driver;
	}

	/** Add Monthly Subscription button */
	@FindBy(how = How.XPATH, using = "//a[text()='Add Monthly Subscription']")
	WebElement addMonthSub_Btn;
	/** Wave App (Monthly) Licenses Textbox */
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'App (Monthly)')]/parent::div/parent::header//input[@type='tel']")
	WebElement waveAppMonthlyLic_TxtBx;
	/** Wave Dispatch (Monthly) Licenses Textbox */
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Dispatch (Monthly)')]/parent::div/parent::header//input[@type='tel']")
	WebElement waveDisMonthlyLic_TxtBx;
	/** WAVE Wireless (2 YR Contract) Licenses Textbox */
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Two-Way Radio (2 YR Contract)')]/parent::div/parent::header//input[@type='tel']")
	WebElement waveWire2YrsLic_TxtBx;
	/** WAVE Wireless (Monthly) Licenses Textbox */
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Two-Way Radio (Monthly)')]/parent::div/parent::header//input[@type='tel']")
	WebElement waveWireMonthlyLic_TxtBx;
	/** Update Tools button */
	@FindBy(how = How.XPATH, using = "//a[@id='form__section-apply-components']")
	WebElement updateTools_Btn;
	/** Email TextBox */
	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	WebElement email_TxtBx;
	/** Phone Number TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_phone']")
	WebElement phNo_TxtBx;
	/** First Name TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_first_name']")
	WebElement firstName_TxtBx;
	/** Last Name TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_last_name']")
	WebElement lastName_TxtBx;
	/** Shipping Address1 TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_address']")
	WebElement shpAddress1_TxtBx;
	/** Shipping Address2 TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_address_2']")
	WebElement shpAddress2_TxtBx;
	/** City TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_city']")
	WebElement city_TxtBx;
	/** State Dropdown */
	@FindBy(how = How.XPATH, using = "//select[@id='subscription_customer_attributes_state']")
	WebElement state_dropdown;
	/** Pincode TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_customer_attributes_zip']")
	WebElement pinCode_TxtBx;
	/** Credit card Fill Data Button */
	@FindBy(how = How.XPATH, using = "//a[text()='Fill Data']")
	WebElement fillData_btn;
	/** Credit card First Name TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_payment_profile_attributes_first_name']")
	WebElement cardFirstName_btn;
	/** Credit card Last Name TextBox */
	@FindBy(how = How.XPATH, using = "//input[@id='subscription_payment_profile_attributes_last_name']")
	WebElement cardLastName_btn;
	/** Terms and Conditions Check box */
	@FindBy(how = How.XPATH, using = "//input[@id='accept_terms']")
	WebElement tAndC_checkBx;
	/** Place My Order button */
	@FindBy(how = How.XPATH, using = "//button[@id='subscription_submit']")
	WebElement submit_btn;
	/** Go To Home Dashboard button */
	@FindBy(how = How.XPATH, using = "//a[@id='homeDashboard']")
	WebElement goToHmDash_btn;
	/** Settings icon */
	@FindBy(how = How.XPATH, using = "//span[@class='glyphicon glyphicon-cog settings-icon']")
	WebElement settings_Icon;
	/** Annual Subscription Link */
	@FindBy(how = How.XPATH, using = "//a[text()='+ Annual Subscription']")
	WebElement annualSubscri_Lnk;
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
	/** Account Link */
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'subscription')]")
	WebElement account_Lnk;
	/** Monthly Manage Subscription Link */
	@FindBy(how = How.XPATH, using = "//*[text()='WAVE Monthly']/parent::div//*[text()='Manage Subscription']")
	WebElement monManageSub_Lnk;
	/** Annual Manage Subscription Link */
	@FindBy(how = How.XPATH, using = "//*[text()='WAVE Annual']/parent::div//*[text()='Manage Subscription']")
	WebElement annManageSub_Lnk;
	/** Popup Ok button */
	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	WebElement ok_Btn;
	/** Remove Licenses Update Button */
	@FindBy(how = How.XPATH, using = "//div[@id='removeLicenseCountModal']//button[text()='Update']")
	WebElement removeUpdate_Btn;
	/** State dropdown value selecting */
	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Karnataka')]")
	WebElement stateValue_Dd;
	/** Wave Mobile App monthly Licenses Count */
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'WAVE PTT Mobile App (Monthly)')]/parent::div/child::div/child::div")
	WebElement waveApplicCount_Txt;
	/** Wave Mobile App monthly Licenses Count */
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'WAVE Two-Way Radio (Monthly)')]/parent::div/child::div/child::div")
	WebElement waveWirelicCount_Txt;
	/** Wave Mobile App monthly Licenses Count */
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'WAVE Two-Way Radio (2 YR Contract)')]/parent::div/child::div/child::div")
	WebElement waveWire2YrlicCount_Txt;
	/** Wave Mobile App monthly Licenses Count */
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'WAVE PTT Dispatch (Monthly')]/parent::div/child::div/child::div")
	WebElement waveDisplicCount_Txt;
	
	String stateDropdown = "//select[@id='subscription_customer_attributes_state']";
	String value = "karnataka";
	String waveApplicCountTxt = "//*[contains(text(),'WAVE PTT Mobile App (Monthly)')]/parent::div/child::div/child::div";
	String waveWirelicCountTxt = "//*[contains(text(),'WAVE Two-Way Radio (Monthly)')]/parent::div/child::div/child::div"; 
	String waveWire2YrslicCountTxt = "//*[contains(text(),'WAVE Two-Way Radio (2 YR Contract)')]/parent::div/child::div/child::div";
	String waveDisplicCountTxt = "//*[contains(text(),'WAVE PTT Dispatch (Monthly')]/parent::div/child::div/child::div";
	String licensesCount = "10";
	String waveApplicTxt = "WAVE App (Monthly)";
	String waveWirelicTxt = "WAVE Wireless (Monthly)";
	String waveWire2YrslicTxt = "WAVE Wireless (2 Yr Contract)";
	String waveDisplicTxt= "Wave Dispatch";
	
	
	/**
	 * 
	 * @throws Exception
	 */
	public void monthlySubsBtn() throws Exception {
		try {
			BaseUtility.Click(addMonthSub_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click on Add Monthly Subscription Button");
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
			BaseUtility.SendKeys(waveAppMonthlyLic_TxtBx, waveAppLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave App Lic text");
            throw e;
		}
	}
	/**
	 * 
	 * @param disLic
	 * @throws Exception
	 */
	public void enterWaveDipMontLic(String disLic) throws Exception {
		try {
			BaseUtility.SendKeys(waveDisMonthlyLic_TxtBx, disLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave Dispatch Monthly Lic text");
            throw e;
		}
	}
	/**
	 * 
	 * @param wireless2YrsLic
	 * @throws Exception
	 */
	public void enterWaveWire2YrsLic(String wireless2YrsLic) throws Exception {
		try {
			BaseUtility.SendKeys(waveWire2YrsLic_TxtBx, wireless2YrsLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave wire 2Yrs Lic text");
            throw e;
		}
	}
	/**
	 * 
	 * @param wirelessLic
	 * @throws Exception
	 */
	public void enterWaveWireMontLic(String wirelessLic) throws Exception {
		try {
			BaseUtility.SendKeys(waveWireMonthlyLic_TxtBx, wirelessLic);
		} catch (Exception e) {
			Reports.fail("Unable to enter Wave wire Monthly Lic text");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void updateToolsBtn() throws Exception {
		try {
			BaseUtility.Click(updateTools_Btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Upadte Tools Button");
            throw e;
		}
	}
	/**
	 * 
	 * @param emailId
	 * @throws Exception
	 */
	public void enterEmailID(String emailId) throws Exception {
		try {
			BaseUtility.SendKeys(email_TxtBx, emailId);
		} catch (Exception e) {
			Reports.fail("Unable to enter Email Id");
            throw e;
		}
	}
	/**
	 * 
	 * @param phNo
	 * @throws Exception
	 */
	public void enterPhNo(String phNo) throws Exception {
		try {
			BaseUtility.SendKeys(phNo_TxtBx, phNo);
		} catch (Exception e) {
			Reports.fail("Unable to enter Phone Number");
            throw e;
		}
	}
	/**
	 * 
	 * @param firstName
	 * @throws Exception
	 */
	public void enterFirstName(String firstName) throws Exception{
		try {
			BaseUtility.SendKeys(firstName_TxtBx, firstName);
		} catch (Exception e) {
			Reports.fail("Unable to enter FirstName");
            throw e;
		}
	}
	/**
	 * 
	 * @param lastName
	 * @throws Exception
	 */
	public void enterLastName(String lastName) throws Exception {
		try {
			BaseUtility.SendKeys(lastName_TxtBx, lastName);
		} catch (Exception e) {
			Reports.fail("Unable to enter LastName");
            throw e;
		}
	}
	/**
	 * 
	 * @param ShpAddr1
	 * @throws Exception
	 */
	public void enterShpAddr1(String ShpAddr1) throws Exception {
		try {
			BaseUtility.SendKeys(shpAddress1_TxtBx, ShpAddr1);
		} catch (Exception e) {
			Reports.fail("Unable to enter Shipping Address1");
            throw e;
		}
	}
	/**
	 * 
	 * @param ShpAddr2
	 * @throws Exception
	 */
	public void enterShpAddr2(String ShpAddr2) throws Exception {
		try {
			BaseUtility.SendKeys(shpAddress2_TxtBx, ShpAddr2);
		} catch (Exception e) {
			Reports.fail("Unable to enter Shipping Address2");
            throw e;
		}
	}
	/**
	 * 
	 * @param city
	 * @throws Exception
	 */
	public void enterCity(String city) throws Exception {
		try {
			BaseUtility.SendKeys(city_TxtBx, city);
		} catch (Exception e) {
			Reports.fail("Unable to enter City");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void selectState() throws Exception {
		try {
			BaseUtility.Click(state_dropdown);
			Thread.sleep(1000);
			BaseUtility.Click(stateValue_Dd);
		} catch (Exception e) {
			Reports.fail("Unable to Select State Value");
			throw e;
		}
	}
	/**
	 * 
	 * @param pincode
	 * @throws Exception
	 */
	public void enterPincode(String pincode) throws Exception {
		try {
			BaseUtility.SendKeys(pinCode_TxtBx, pincode);
		} catch (Exception e) {
			Reports.fail("Unable to enter Pincode");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void fillDataBtn() throws Exception {
		try {
			BaseUtility.Click(fillData_btn);
		} catch (Exception e) {
			Reports.fail("Unable to click on Credit Card Fill Data Button");
            throw e;
		}
	}	
	/**
	 * 
	 * @param firstName
	 * @throws Exception
	 */
	public void enterCardFirstName(String firstName) throws Exception {
		try {
			BaseUtility.SendKeys(cardFirstName_btn, firstName);
		} catch (Exception e) {
			Reports.fail("Unable to enter Card FirstName");
            throw e;
		}
	}
	/**
	 * 
	 * @param lastName
	 * @throws Exception
	 */
	public void enterCardLastName(String lastName) throws Exception {
		try {
			BaseUtility.SendKeys(cardLastName_btn, lastName);
		} catch (Exception e) {
			Reports.fail("Unable to enter Card LastName");
            throw e;
		}
	}
	/**
	 * 
	 * @throws Exception
	 */
	public void checkBxTnC() throws Exception {
		try {
			BaseUtility.Click(tAndC_checkBx);
		} catch (Exception e) {
			Reports.fail("Unable to check the Terms and Conditions Check box");
            throw e;
		}
	}	
	/**
	 * 
	 * @throws Exception
	 */
	public void submitBtn() throws Exception {
		try {
			BaseUtility.scrollPage();
			BaseUtility.Click(submit_btn);
		} catch (Exception e) {
			Reports.fail("Unable to click Submit button");
            throw e;
		}
	}
	/**
	 * @throws Exception 
	 * 
	 */
	public void gotoHmPgBtn() throws Exception {
		try {
			BaseUtility.Click(goToHmDash_btn);
		} catch (Exception e) {
			Reports.fail("Unable to click GoTo Home Page button");
            throw e;
		}
	}
			
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
	 *//*
	public void validateWaveAppMonthlyLicCount() throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveApplicCount_Txt, waveApplicCountTxt, licensesCount, waveApplicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave App monthly licenses Count");
            throw e;
		}
	}
	*//**
	 * 
	 * @throws Exception
	 *//*
	public void validateWaveWireMonthlyLicCount() throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveWirelicCount_Txt, waveWirelicCountTxt, licensesCount, waveWirelicTxt );
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Wireless Monthly licenses Count");
            throw e;
		}
	}
	*//**
	 * 
	 * @throws Exception
	 *//*
	public void validateWaveWireMonth2YrLicCount() throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveWire2YrlicCount_Txt, waveWire2YrslicCountTxt, licensesCount, waveWire2YrslicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave wireless monthly 2Yrs licenses Count");
            throw e;
		}
	}
	*//**
	 * 
	 * @throws Exception
	 *//*
	public void validateWaveDispMonthlyLicCount() throws Exception {
		try {
			BaseUtility.validatinglicencesCount(waveDisplicCount_Txt, waveDisplicCountTxt, licensesCount, waveDisplicTxt);
		} catch (Exception e) {
			Reports.fail("Unable to validate Wave Dispatch licenses Count");
            throw e;
		}
	}
	*//**
	 * Add Annual Licenses Count
	 * @param licCount
	 * @throws IOException
	 *//*
	public void addAnnualSub(String waveAppLic) throws IOException {
		try {
			BaseUtility.Click(settings_Icon);
			BaseUtility.Click(annualSubscri_Lnk);
			BaseUtility.Click(mangeSubscri_Lnk);
			BaseUtility.Click(addLic_Btn);
			BaseUtility.SendKeys(addWaveAppLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(addWaveDisLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(addVideoLic_TxtBx, waveAppLic);
			BaseUtility.Click(update_Btn);
			BaseUtility.Click(ok_Btn);
			BaseUtility.Click(goToHmDash_btn);
		} catch (Exception e1) {
			Reports.fail("Fail to Add Annual Licences");
		}
	}
	public void clickSettingIcon() throws Exception {
		try {
			BaseUtility.Click(settings_Icon);
		} catch(Exception e) {
			Reports.fail("Fail to click on Setting Icon");
			throw e;
		}
	}
	public void clickAccLnk() throws Exception {
		try {
			BaseUtility.Click(account_Lnk);
		} catch(Exception e) {
			Reports.fail("Fail to click Account Link");
			throw e;
		}
	}
	public void clickMonManageSubScribLnk() throws Exception {
		try {
			BaseUtility.Click(monManageSub_Lnk);
		} catch(Exception e) {
			Reports.fail("Fail to click Monthly Manage Subscrption Link");
			throw e;
		}
	}
	public void clickManageSubScribLnk() throws Exception {
		try {
			BaseUtility.Click(mangeSubscri_Lnk);
		} catch(Exception e) {
			Reports.fail("Fail to click Monthly Manage Subscrption Link");
			throw e;
		}
	} 
	public void clickAddLicBtn() throws Exception {
		try {
			BaseUtility.Click(addLic_Btn);
		} catch(Exception e) {
			Reports.fail("Fail to click Add Licenses Button");
			throw e;
		}
	} 
	public void enterToAddWaveAppMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveAppLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add WaveApp Monthly Licenses count");
			throw e;
		}
	}
	public void enterToAddWaveDispMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveDisLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add WaveDisp Monthly Licenses count");
			throw e;
		}
	}
	public void enterToAddWaveWirelessMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWaveWireLessLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add WaveDisp Monthly Licenses count");
			throw e;
		}
	}
	public void enterToAddWave24WirelessMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addWave24WireLessLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add WaveDisp Monthly Licenses count");
			throw e;
		}
	}
	public void enterToAddVideoMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addVideoLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add Video Monthly Licenses count");
			throw e;
		}
	}
	public void enterToAddDispVideoMonthlyLic(String waveAppLic) throws Exception {
		try {
			BaseUtility.SendKeys(addDispVideoLic_TxtBx, waveAppLic);
		} catch(Exception e) {
			Reports.fail("Fail to enter add Dispatch Video Monthly Licenses count");
			throw e;
		}
	}
	public void clickUpdateBtn() throws Exception {
		try {
			BaseUtility.Click(update_Btn);
		} catch(Exception e) {
			Reports.fail("Fail to click Update button");
			throw e;
		}
	}
	public void clickOkBtn() throws Exception {
		try {
			BaseUtility.Click(ok_Btn);
		} catch(Exception e) {
			Reports.fail("Fail to click Ok button");
			throw e;
		}
	}
	public void clickGoToHMDashBtn() throws Exception {
		try {
			BaseUtility.Click(goToHmDash_btn);
		} catch(Exception e) {
			Reports.fail("Fail to click Go To Home Dashboard button");
			throw e;
		}
	}
	*//**
	 * Add Monthly Subscription Licenses to Customer
	 * @param waveAppLic
	 * @throws IOException
	 *//*
	public void addMonthlySub(String waveAppLic) throws IOException {
		try {
			BaseUtility.Click(settings_Icon);
			BaseUtility.Click(account_Lnk);
			BaseUtility.Click(monManageSub_Lnk);
			BaseUtility.Click(mangeSubscri_Lnk);
			BaseUtility.Click(addLic_Btn);
			BaseUtility.SendKeys(addWaveAppLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(addWaveDisLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(addWaveWireLessLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(addWave24WireLessLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(addVideoLic_TxtBx, waveAppLic);
			BaseUtility.Click(update_Btn);
			BaseUtility.Click(ok_Btn);
			BaseUtility.Click(goToHmDash_btn);
	} catch (Exception e1) {
		Reports.fail("Fail to Add Monthly Licences");
	}
	}
	public void removeMonthlySub(String waveAppLic) throws IOException {
		try {
			BaseUtility.Click(settings_Icon);
			BaseUtility.Click(account_Lnk);
			BaseUtility.Click(monManageSub_Lnk);
			BaseUtility.Click(mangeSubscri_Lnk);
			BaseUtility.Click(removeLic_Btn);
			BaseUtility.SendKeys(removeWaveAppLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(removeWaveDipLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(removeWaveWirelessLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(remove24WaveWirelessLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(removeVideoLic_TxtBx, waveAppLic);
			BaseUtility.Click(removeUpdate_Btn);
			BaseUtility.Click(ok_Btn);
			BaseUtility.Click(goToHmDash_btn);
	} catch (Exception e1) {
		Reports.fail("Fail to Remove Monthly Licences");
	}
	}
	public void removeAnnualSub(String waveAppLic) throws IOException {
		try {
			BaseUtility.Click(settings_Icon);
			BaseUtility.Click(account_Lnk);
			BaseUtility.Click(annManageSub_Lnk);
			BaseUtility.Click(mangeSubscri_Lnk);
			BaseUtility.Click(removeLic_Btn);
			BaseUtility.SendKeys(removeWaveAppLic_TxtBx, waveAppLic);
			BaseUtility.SendKeys(removeWaveDipLic_TxtBx, waveAppLic);
			//BaseUtility.SendKeys(removeVideoLic_TxtBx, waveAppLic);
			BaseUtility.Click(removeUpdate_Btn);
			BaseUtility.Click(ok_Btn);
			BaseUtility.Click(goToHmDash_btn);
	} catch (Exception e1) {
		Reports.fail("Fail to Remove Annual Licences");
	}
	}*/
}
