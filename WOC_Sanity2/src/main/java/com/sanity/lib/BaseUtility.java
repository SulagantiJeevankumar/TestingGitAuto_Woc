/********************************************************************************************************************************
 * Change History:
 * 
 * Revision     Date            Updated by                  Comments
 * ---------------------------------------------------------------------------------------------------------------------------
 * 1.0          22-July-2019     S Jeevan Kumar        Creating the new Function Library
 * 
 * 
 * Copyright (c) Wave OnCloud. All Rights Reserved.
 ********************************************************************************************************************************/
package com.sanity.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sanity.contants.Constants;
import com.sanity.reports.Reports;

/**
 * The Class BaseUtility.
 */
public class BaseUtility {

	/** WebDriver */
	public static WebDriver driver;

	/**
	 * Launch the browser
	 * 
	 * @return driver object
	 * @throws Exception
	 *             to calling place
	 */
	public static WebDriver browserLaunch() throws Exception {
		Reports.info("Running... browserLaunch()");
		Map<String, String> config = getConfigData();
		try {
			// quitAlldrivers();
			if (config.get("browser").equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", config.get("driverPath") + "\\" + "chromedriver.exe");
				driver = new ChromeDriver();
			} else if (config.get("browser").equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", config.get("driverPath") + "\\" + "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (config.get("browser").equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", config.get("driverPath") + "\\" + "geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Reports.fail("Unable to launch the browser: " + e.getMessage());
			throw e;
		}
		driver.get(config.get("mvsUrl"));
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * Launch the browser
	 * 
	 * @return driver object
	 * @throws Exception
	 *             to calling place
	 */
	public static WebDriver gMailbrowserLaunch() throws Exception {
		Reports.info("Running... browserLaunch()");
		Map<String, String> config = getConfigData();
		try {
			// quitAlldrivers();
			if (config.get("browser").equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", config.get("driverPath") + "\\" + "chromedriver.exe");
				driver = new ChromeDriver();
			} else if (config.get("browser").equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", config.get("driverPath") + "\\" + "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (config.get("browser").equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", config.get("driverPath") + "\\" + "geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Reports.fail("Unable to launch the browser: " + e.getMessage());
			throw e;
		}
		driver.get(config.get("gmailLoginURL"));
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * Launch the browser
	 * 
	 * @return driver object
	 * @throws Exception
	 *             to calling place
	 */
	public static WebDriver browserLaunch1() throws Exception {
		Reports.info("Running... browserLaunch()");
		Map<String, String> config = getConfigData();
		try {
			// quitAlldrivers();
			if (config.get("browser").equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", config.get("driverPath") + "\\" + "chromedriver.exe");
				driver = new ChromeDriver();
			} else if (config.get("browser").equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", config.get("driverPath") + "\\" + "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (config.get("browser").equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", config.get("driverPath") + "\\" + "geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Reports.fail("Unable to launch the browser: " + e.getMessage());
			throw e;
		}
		driver.get(config.get("adminurl"));
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * Returns the text value of an Object
	 * 
	 * @param object
	 *            is the WebElement
	 * @return the text
	 * @throws Exception
	 *             to the calling place
	 */
	public static String getText(WebElement object) throws Exception {
		Reports.info("Running... getText(WebElement object)");
		try {
			waitForObjectToBePresent(object, Constants.MAX_WAITING_TIME);
			return object.getText();
		} catch (Exception e) {
			Reports.fail("Unable to read the object: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Returns the text value of an Object
	 * 
	 * @param object
	 *            is the WebElement
	 * @param property
	 *            is the object attribute value
	 * @return the require attribute value
	 * @throws Exception
	 *             to the calling place
	 */
	public static String getProperty(WebElement object, String property) throws Exception {
		Reports.info("Running... getProperty(WebElement object, String property)");
		try {
			waitForObjectToBePresent(object, Constants.MAX_WAITING_TIME);
			return object.getAttribute(property);
		} catch (Exception e) {
			Reports.fail("Unable to read the object: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Clicks on the Object.
	 * 
	 * @param objname
	 *            is the WebElement
	 * @throws Exception
	 *             to the calling place
	 */
	public static void Click(WebElement objname) throws Exception {
		Reports.info("Running... Click(WebElement objname)");
		try {
			waitForObjectToBeClickable(objname, Constants.MAX_WAITING_TIME);
			if (objname.isDisplayed()) {
				objname.click();
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			Reports.fail("Unable to click on the object: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Enters the input value in Object.
	 * 
	 * @param object
	 *            is the WebElement
	 * @param valueClick
	 *            is the input value
	 * @throws Exception
	 *             to the calling place
	 */
	public static void SendKeys(WebElement object, String value) throws Exception {
		Reports.info("Running... SendKeys(WebElement object, String value)");
		try {
			waitForObjectToBePresent(object, Constants.MAX_WAITING_TIME);
			object.clear();
			object.sendKeys(value);
		} catch (Exception e) {
			Reports.fail("Unable to enter the text in the input object: " + e.getMessage());
			throw e;
		}
	}
	/**
	 * Gets the value from table.
	 * 
	 * @param object
	 *            is the WebElement
	 * @param row
	 *            is the table row number
	 * @param col
	 *            is the table column number
	 * @return the value from table
	 * @throws Exception
	 *             to the calling place
	 */
	public static String getValueFromTable(WebElement object, int row, int col) throws Exception {
		Reports.info("Running... getValueFromTable(WebElement object, int row, int col)");
		try {
			waitForObjectToBePresent(object, Constants.MAX_WAITING_TIME);
			List<WebElement> tableRows = object.findElements(By.tagName("tr"));
			WebElement currentRow = tableRows.get(row - 1);
			List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
			String cell = tableCols.get(col - 1).getText();
			return cell;
		} catch (Exception e) {
			Reports.fail(
					"Exception in getValueFromTable(WebElement object, int row, int col) Method: " + e.getMessage());
			throw e;
		}
	}

	/*
	 * 
	 */
	public static void hoverToElement(WebElement object) throws Exception {
		Reports.info("Running... hover on to element(WebElement object)");
		try {
			Actions action = new Actions(driver);
			action.moveToElement(object).build().perform();
		} catch (Exception e) {
			Reports.fail("Exception in hover on to Element object) Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * single click on the Object.
	 * 
	 * @param object
	 *            is the WebElement
	 * @throws Exception
	 *             to the calling place
	 */
	public static void hoverSingleclick(WebElement object) throws Exception {
		Reports.info("Running... hoverSingleclick(WebElement object)");
		try {
			waitForObjectToBeClickable(object, Constants.MAX_WAITING_TIME);
			Actions action = new Actions(driver);
			action.moveToElement(object).build().perform();
			action.click(object).build().perform();
		} catch (Exception e) {
			Reports.fail("Exception in hoverSingleclick(WebElement object) Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Double clicks on the Object.
	 * 
	 * @param object
	 *            is the WebElement
	 * @throws Exception
	 *             to the calling place
	 */
	public static void dobleclick(WebElement object) throws Exception {
		Reports.info("Running... dobleclick(WebElement object)");
		try {
			waitForObjectToBeClickable(object, Constants.MAX_WAITING_TIME);
			Actions action = new Actions(driver);
			action.moveToElement(object).build().perform();
			action.doubleClick(object).build().perform();
		} catch (Exception e) {
			Reports.fail("Exception in dobleclick(WebElement object) Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Checks if is object present or not.
	 * 
	 * @param object
	 *            is the WebElement
	 * @return true, if successful
	 * @throws Exception
	 *             to the calling place
	 */
	public static boolean isElementPresent(WebElement object) {
		Reports.info("Running... isElementPresent(WebElement object)");
		try {
			waitForObjectToBePresent(object, Constants.MIN_WAITING_TIME);
			object.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Wait for object to be clickable.
	 * 
	 * @param object
	 *            is the WebElement
	 * @param time
	 *            is the waiting time
	 * @throws Exception
	 *             to the calling place
	 */
	public static void waitForObjectToBeClickable(WebElement object, int time) throws Exception {
		Reports.info("Running... waitForObjectToBeClickable(WebElement object, int time)");
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(object));
	}

	/**
	 * Wait for object to be present.
	 * 
	 * @param object
	 *            is the WebElement
	 * @param time
	 *            is the waiting time
	 * @throws Exception
	 *             to the calling place
	 */
	public static void waitForObjectToBePresent(WebElement object, int time) throws Exception {
		Reports.info("Running... waitForObjectToBeClickable(WebElement object, int time)");
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(object));
	}

	/**
	 * Select text by visible text.
	 * 
	 * @param object
	 *            is the WebElement
	 * @param time
	 *            is the waiting time
	 * @throws Exception
	 *             to the calling place
	 */
	public static void selectTextByVisibleText(WebElement object, String object1, String text) throws Exception {
		Reports.info("Running... selectTextByVisibleText(WebElement object, String text)");
		try {
			Select select = new Select(driver.findElement(By.xpath(object1)));
			select.selectByVisibleText(text);
		} catch (Exception e) {
			Reports.fail("Unable to Select the value from the drop down object: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Select text by index.
	 * 
	 * @param object
	 *            is the WebElement
	 * @param index
	 *            is the item index value
	 * @throws Exception
	 *             to the calling place
	 */
	public static void selectTextByIndex(WebElement object, int index) throws Exception {
		Reports.info("Running... selectTextByIndex(WebElement object, int index)");
		try {
			Select select = new Select((object));
			select.selectByIndex(index);
		} catch (Exception e) {
			Reports.fail("Unable to Select the value from the drop down object: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Generates the Random string.
	 * 
	 * @param length
	 *            is the length of the random string
	 * @param stringCase
	 *            is the case like [UCASE OR LCASE] (Optional)
	 * @return the random string
	 * @throws Exception
	 *             to the calling place
	 */
	public static String randomString(int length, String... stringCase) throws Exception {
		Reports.info("Running... randomString(int length, String... stringCase)");

		String rndString = "";
		String letters = "";

		if (stringCase.length > 0) {
			if (StringUtils.equalsIgnoreCase("UCASE", stringCase[0])) {
				letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			} else if (StringUtils.equalsIgnoreCase("LCASE", stringCase[0])) {
				letters = "abcdefghijklmnopqrstuvwxyz";
			} else {
				letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			}
		} else {
			letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		}

		for (int i = 0; i < length; i++) {
			double a = Math.random();
			int x = (int) (a * 100);

			if (letters.length() == 26) {
				if (x > 25 && x < 52) {
					x = x - 26;
				} else if (x > 51 && x < 78) {
					x = x - 52;
				} else if (x > 77 && x < 99) {
					x = x - 78;
				} else {
					x = 1;
				}
			} else {
				if (x > 51 && x < 78) {
					x = x - 26;
				} else if (x > 77 && x < 99) {
					x = x - 52;
				} else {
					x = 1;
				}
			}

			char letter = letters.charAt(x);
			rndString = rndString + String.valueOf(letter);
		}

		return rndString;
	}

	/**
	 * Generates the Random number.
	 * 
	 * @param length
	 *            if the the length of the random number
	 * @return the random string
	 * @throws Exception
	 *             to the calling place
	 */
	public static String randomNumber(int length) throws Exception {
		Reports.info("Running... randomNumber(int length)");
		String rndNumber = "";
		String numbers = "1234567890";

		for (int i = 0; i < length; i++) {
			double a = Math.random();
			int x = (int) (a * 10);

			if (x > 9) {
				x = x - 10;
			}
			char number = numbers.charAt(x);
			rndNumber = rndNumber + number;
		}
		return rndNumber;
	}

	/**
	 * Gets the column data.
	 * 
	 * @param inputArray
	 *            the test object array
	 * @param colName
	 *            is the column name
	 * @return the cell data
	 * @throws IOException
	 */
	public static String getColumnData(Object[][] inputArray, String colName) throws IOException {
		Reports.info("Running... getColumnData(Object[][] inputArray, String colName)");
		try {
			for (int i = 0; i < inputArray[0].length; i++) {
				if (inputArray[0][i].equals(colName)) {
					return (String) inputArray[1][i];
				}
			}
		} catch (Exception e) {
			Reports.fail("Exception in getCellData(Object[][] testObjectArray, String colName) Method");
		}
		return null;
	}

	/**
	 * Gets the config data.
	 * 
	 * @return the config data
	 * @throws Exception
	 *             to the calling place
	 */
	public static Map<String, String> getConfigData() throws Exception {
		Reports.info("Running... getConfigData()");
		String configFile = "Configuration\\Config.properties";

		HashMap<String, String> configData = new HashMap<String, String>();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(configFile);
		prop.load(fis);
		Set<Object> keys = prop.keySet();
		for (Object k : keys) {
			configData.put((String) k, prop.getProperty((String) k));
		}
		return configData;
	}

	/**
	 * Sets the config data.
	 * 
	 * @param keyName
	 *            is the key name
	 * @param keyValue
	 *            is the key value
	 * @throws Exception
	 *             to the calling place
	 */
	public static void setConfigData(String keyName, String keyValue) throws Exception {
		Reports.info("Running... setConfigData(String keyName, String keyValue)");
		String configFile = "Configuration\\Config.properties";

		FileInputStream fis = new FileInputStream(configFile);

		Properties sourceProp = new Properties();
		sourceProp.load(fis);
		HashMap<String, String> configData = new HashMap<String, String>();
		Set<Object> keys = sourceProp.keySet();
		for (Object k : keys) {
			configData.put((String) k, sourceProp.getProperty((String) k));
		}
		fis.close();

		Properties destProp = new Properties();
		for (Object k : keys) {
			destProp.setProperty((String) k, configData.get((String) k));
		}
		destProp.setProperty(keyName, keyValue);
		FileOutputStream fos = new FileOutputStream(configFile);
		destProp.store(fos, "dynamic data");
		fos.close();
	}

	/**
	 * Gets the date.
	 * 
	 * @param format
	 *            is the date format
	 * @param days
	 *            is for the future date (Optional)
	 * @return the date value
	 */
	public static String getDate(String format, int... days) {
		Reports.info("Running... getDate(String format, int... days)");
		String date = null;
		int numOfDays = 0;
		if (days.length > 0) {
			numOfDays = days[0];
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, numOfDays);
		date = dateFormat.format(calendar.getTime());
		return date;
	}

	/**
	 * Gets the date.
	 * 
	 * @param days
	 *            is for the future date (for current date: days value should be
	 *            '0')
	 * @param format
	 *            is the date format (Optional)
	 * @return the date value
	 */
	public static String getDate(int days, String... format) {
		Reports.info("Running... getDate(int days, String... format)");
		DateFormat dateFormat = null;
		if (format.length == 0) {
			dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		} else {
			dateFormat = new SimpleDateFormat(format[0]);
		}
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DATE, days);
		Date time = c.getTime();
		String date = dateFormat.format(time);
		return date;
	}

	/**
	 * Gets the current date.
	 * 
	 * @return the date value
	 */
	public static String getDate() {
		Reports.info("Running... getDate(int days, String... format)");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		Date time = c.getTime();
		String date = dateFormat.format(time);
		return date;
	}

	/**
	 * Gets the random email which contains current time stamp.
	 * 
	 * @return the random email
	 */
	public static String getRandomEmail() {
		Reports.info("Running... getRandomEmail()");
		String date = getDate("ddMMYYYYhhmmss");
		return "email_" + date + "@gmail.com";
	}

	/**
	 * Gets the random IP address.
	 * 
	 * @return the random IP address
	 * @throws Exception
	 *             to the calling place
	 */
	public static String getRandomIPAddress() throws Exception {
		Reports.info("Running... getRandomIPAddress()");
		try {
			StringBuilder sb = new StringBuilder();

			Random r = new Random();
			sb.append(r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256));

			return sb.toString();
		} catch (Exception e) {
			Reports.fail("Exceltipn in getRandomIPAddress() Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Gets the time stamp.
	 * 
	 * @param format
	 *            is the time stamp format
	 * @param future
	 *            is for the future time (Optional)
	 * @return the time stamp value
	 * @throws Exception
	 *             to the calling place
	 */
	public static String getTimeStamp(String format, int... future) throws Exception {
		Reports.info("Running... getTimeStamp(String format, int... future)");
		String strDate = null;
		try {
			int next = 0;
			if (future.length != 0) {
				next = future[0];
			}
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date now = new Date(new Date().getTime() + next * 24 * 60 * 60 * 1000);
			strDate = sdf.format(now);
			return strDate;
		} catch (Exception e) {
			Reports.fail("Exception in getTimeStamp(String format, int... future) method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Gets the time stamp.
	 * 
	 * @return the time stamp value
	 * @throws Exception
	 *             to the calling place
	 */
	public static String getTimeStamp() throws Exception {
		Reports.info("Running... getTimeStamp()");
		String date = null;
		try {
			SimpleDateFormat timeFormat = new SimpleDateFormat("ddMMYYYYhhmmss");
			Date now = new Date(new Date().getTime());
			date = timeFormat.format(now);
		} catch (Exception e) {
			Reports.fail("Exception in getTimeStamp() method: " + e.getMessage());
			throw e;
		}
		return date;
	}

	/**
	 * Replace the present value in a string with new value.
	 * 
	 * @param actualString
	 *            is the actual string value
	 * @param strOldWord
	 *            is the Old String
	 * @param strNewWord
	 *            is the new String
	 * @return the string
	 */
	public static String replaceValue(String actualString, String strOldWord, String strNewWord) {
		Reports.info("Running... replaceValue(String actualString, String strOldWord, String strNewWord)");
		String strOutput = actualString.replace(strOldWord, strNewWord);
		return strOutput;
	}

	/**
	 * Deletes the file if it is already exists.
	 * 
	 * @param strFilePath
	 *            is the file path
	 */
	public static void deleteFile(String strFilePath) {
		Reports.info("Running... deleteFile(String strFilePath)");
		File file = new File(strFilePath);
		if (file.exists()) {
			file.delete();
		}
	}

	/**
	 * Creates the file.
	 * 
	 * @param strPath
	 *            is the file path
	 * @param strData
	 *            is the file data to save
	 * @throws Exception
	 *             to the calling place
	 */
	public static void createFile(String strPath, String strData) throws Exception {
		Reports.info("Running... createFile(String strPath, String strData)");
		try {
			FileWriter file = new FileWriter(strPath);
			file.write(strData);
			file.flush();
			file.close();
		} catch (Exception e) {
			Reports.fail("Exception in createFile(String strPath, String strData) Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Creates the file.
	 * 
	 * @param strPath
	 *            is the file path
	 * @throws Exception
	 *             to the calling place
	 */
	public static Boolean isFileExist(String strPath) throws Exception {
		Reports.info("Running... createFile(String strPath, String strData)");
		try {
			File file = new File(strPath);
			if (file.exists()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			Reports.fail("Exception in createFile(String strPath, String strData) Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * create Folder If it is Not Exist
	 * 
	 * @param directory
	 * @throws Exception
	 */
	public static void createFolderIfNotExist(String directory) throws Exception {
		Reports.info("Running... createFolderIfNotExist(String directory)");
		try {
			File fileDirectry = new File(directory);
			if (!fileDirectry.exists()) {
				fileDirectry.mkdir();
			}
		} catch (Exception e) {
			Reports.fail("Exception in createFolderIfNotExist(String directory) Method: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Quit all open drivers.
	 * 
	 * @throws Exception
	 */
	public static void quitAlldrivers() throws Exception {
		Map<String, String> config = getConfigData();
		String browser = config.get("browserToOpenReport").toUpperCase();

		if (!browser.contains("CHROMEDRIVER.EXE") && !browser.contains("CHROME.EXE")) {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM Chrome.exe");
		}

		if (!browser.contains("IEDRIVERSERVER.EXE") && !browser.contains("IEXPLORE.EXE")) {
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
		}

		if (!browser.contains("FIREFOX.EXE")) {
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		}
	}

	public static void isTitleSame(WebElement object1, WebElement object2) throws Exception {
		Reports.info("Running... getText(WebElement object)");
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			object1.getText();
			object1.click();
			// waitForObjectToBeClickable(object1, Constants.MAX_WAITING_TIME);
			BaseUtility.switchToNewTab();
			waitForObjectToBePresent(object2, Constants.MAX_WAITING_TIME);
			object2.getText();
			if ((object1.getText()).contains(object2.getText())) {
				System.out.println("Title of two objects is same");
			} else {
				System.out.println("Title of two objects is not same");
			}
		} catch (Exception e) {
			Reports.fail("Unable to enter the text in the input object: " + e.getMessage());
			throw e;
		}
	}

	public static void compareText(WebElement title1, WebElement title2, WebElement addCartBtn) throws Exception {
		Reports.info("Running... getText(WebElement object)");
		try {
			waitForObjectToBePresent(title1, Constants.MAX_WAITING_TIME);
			title1.getText();
			waitForObjectToBeClickable(addCartBtn, Constants.MAX_WAITING_TIME);
			addCartBtn.click();
			waitForObjectToBePresent(title2, Constants.MAX_WAITING_TIME);
			title2.getText();
			if ((title1.getText()).contains(title2.getText())) {
				Reports.pass("Actual and Expected text is same");
				// System.out.println("Title of two objects is same");
			} else {
				Reports.fail("Expected Result: " + title1 + "/n" + "Actual Result: " + title2);
				// System.out.println("Title of two objects is not same");
			}
		} catch (Exception e) {
			Reports.fail("Unable to process CompareTextMtd " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Scrolling page
	 * 
	 * @throws Exception
	 */
	public static void scrollPage() throws Exception {
		try {
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 250)");
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Switch to New Webpage
	 * 
	 * @throws Exception
	 */
	public static void switchToNewTab() throws Exception {
		try {
			driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * My Cart Add Qty And Verify
	 * 
	 * @param qty1
	 * @param qty2
	 * @param addBtn
	 * @throws Exception
	 */
	public static void myCartAddQtyAndVerify(WebElement qty1, WebElement qty2, WebElement addBtn) throws Exception {
		Reports.info("Running... getText(WebElement object)");
		try {
			waitForObjectToBePresent(qty1, Constants.MAX_WAITING_TIME);
			qty1.getText();
			waitForObjectToBeClickable(addBtn, Constants.MAX_WAITING_TIME);
			addBtn.click();
			waitForObjectToBePresent(qty2, Constants.MAX_WAITING_TIME);
			qty2.getText();
			if ((qty1.getText()).contains(qty2.getText())) {
				System.out.println("Title of two objects is same");
			} else {
				System.out.println("Title of two objects is not same");
			}
		} catch (Exception e) {
			Reports.fail("Unable to process myCartAddQtyAndVerifyMtd: " + e.getMessage());
			throw e;
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void isProductTitleSame(WebElement object1, WebElement object2, String id) throws Exception {
		Reports.info("Running... isProductTitleSame(String object1, String object2)");
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> listOfTitles = object1.findElements(By.xpath(id));
			String prodTitleFromList = listOfTitles.get(0).getText();
			System.out.println(listOfTitles.get(0).getText());
			listOfTitles.get(0).click();
			BaseUtility.switchToNewTab();
			waitForObjectToBePresent(object2, Constants.MAX_WAITING_TIME);
			object2.getText();
			System.out.println(object2.getText());
			if ((object2.getText()).contains(prodTitleFromList)) {
				Reports.pass("Test Case 2: Step:4 Expected and Actual titles are Same");
			} else {
				Reports.pass("Test Case 2: Step:4 Expected Text:" + prodTitleFromList + "\n" + "; Actual Text: "
						+ object2.getText());
			}
		} catch (Exception e) {
			Reports.fail("isProductTitleSame funtion Failed " + e.getMessage());
			throw e;
		}
	}

	public static void findElementFromList(WebElement object1, String object2, int i) throws Exception {
		Reports.info("Running List of Objects... ");
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> listOfTitles = object1.findElements(By.xpath(object2));
			listOfTitles.get(i).click();
		} catch (Exception e) {
			Reports.fail("Unable to read list of products: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * 
	 * @throws Exception
	 */
	public static void checkBrowserAndVersion() throws Exception {
		Reports.info("Running...checkBrowserOS()");
		try {
			Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
			String browserName = capabilities.getBrowserName();
			String browserVersion = capabilities.getVersion();
			String os = System.getProperty("os.name").toLowerCase();

			Reports.pass(
					"OS = " + os + ",\n Browser Name = " + browserName + ", \n Browser version =   " + browserVersion);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void compareTextList(WebElement object1, WebElement object2) throws Exception {
		Reports.info("Running... compareText(WebElement title1, WebElement title2)");
		try {
			List<WebElement> listOfTitles = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
			for (int c = 0; c < listOfTitles.size(); c++) {
				String totalList = listOfTitles.get(c).getText();
				if ((object2.getText()).contains(totalList)) {
					Reports.info(totalList);
					Reports.pass("Text is Present in List of Products");
				} else {
					Reports.fail("Text is not Present in List of products");

				}

			}
		} catch (Exception e) {
			Reports.fail("compareTextList funtion Failed " + e.getMessage());
			// throw e;
		}
	}

	/**
	 * 
	 * @param object1
	 * @param object2
	 * @param i
	 * @throws Exception
	 */
	public static void listOfWebElements(WebElement object1, String object2, int i) throws Exception {
		Reports.info("Running List of Objects... ");
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> listOfWebElements = object1.findElements(By.xpath(object2));
			listOfWebElements.get(i).click();
		} catch (Exception e) {
			Reports.fail("Unable to read list of products: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Validating Licenses count
	 * 
	 * @param object1
	 * @param object2
	 * @param object3
	 * @throws IOException
	 */
	public static void licencesCountValidate(WebElement object1, String object2) throws IOException {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> count = object1.findElements(By.xpath(object2));
			System.out.println(count.size());
			for (int i = 0; i < count.size(); i++) {
				String totalList = count.get(i).getText();
				if ((object2).contains(totalList)) {
					System.out.println("Licenses count is " + object2 + " and matched");
					Reports.pass("Licenses count is " + object2 + " and matched");
				} else {
					Reports.fail("Text is not Present in List of products");
					System.out.println("Licenses count is " + object2 + " and not matched");
					Reports.pass("Licenses count is " + object2 + " and not matched");
				}
			}
		} catch (Exception e) {
			System.out.println("Failed to validate Licenses");
			Reports.fail("Failed to validate Licenses");
		}
	}

	/**
	 * Page Scrolling vertically
	 * 
	 * @throws InterruptedException
	 */
	public static void pageScrollHeight() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Page scrolling till Element visible
	 */
	public static void pageScrollTillEleVisible(WebElement object1, String object2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Find element by xpath and store in variable "Element"
		WebElement Element = object1.findElement(By.xpath(object2));
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	/**
	 * Switch to Main Window
	 */
	public static void switchtoMainWindow() {
		String parentWindowHandle = driver.getWindowHandle();
		/* You code to move to child window */
		// After you done with child window
		driver.switchTo().window(parentWindowHandle);
	}

	/**
	 * Webpage Zoom Out
	 * 
	 * @throws AWTException
	 */
	public static void webpgZoomOut() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}

	/**
	 * Webpage Zoom Out
	 * 
	 * @throws AWTException
	 */
	public static void webpgZoomIn() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}

	/**
	 * Tapping Escape Key
	 * 
	 * @throws AWTException
	 * 
	 */
	public static void pressKeyALT() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	/**
	 * Scrolling page Upwards
	 * 
	 * @throws AWTException
	 * 
	 */
	public static void pageUpKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	/**
	 * Scrolling page Downwards
	 * 
	 * @throws AWTException
	 * 
	 */
	public static void pageDownKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	/**
	 * Pressing Escape Button
	 * 
	 * @throws AWTException
	 * 
	 */
	public static void escapeKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	/**
	 * Pressing Escape Button
	 * 
	 * @throws AWTException
	 * 
	 */
	public static void tabKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	/**
	 * Pressing Enter Button
	 * 
	 * @throws AWTException
	 * 
	 */
	public static void enterKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/**
	 * Waiting for minimum time
	 * 
	 * @throws Exception
	 */
	public static void minWaitTimeToElement(WebElement Object1) throws Exception {
		try {
			waitForObjectToBePresent(Object1, Constants.MIN_WAITING_TIME);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Closing Driver
	 */
	public static void closeDriver() {
		driver.close();
	}

	/**
	 * Allowing Alert
	 */
	public static void switchToAlertToAllow() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	/**
	 * Validating licenses count
	 * @param object1
	 * @param object2
	 * @param expectedTxt
	 * @param Licences
	 * @throws Exception
	 */
	public static void validatinglicencesCount(WebElement object1, String object2, String expectedTxt, String Licences)
			throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			WebElement verifyPg = object1.findElement(By.xpath(object2));
			System.out.println(verifyPg.getText());
			String countTxt = verifyPg.getText();
			String count = countTxt.replaceAll("[^0-9.]", "");
			System.out.println(count);
			if (count.equals(expectedTxt)) {
				Reports.pass("The " + Licences + " Expected licenses Count " + expectedTxt
						+ " and Actual licenses Count " + count + " is matching");
			} else {
				/// System.out.println("The "+Licences+" Expected licenses Count " + expectedTxt
				/// + " and Actual licenses Count "+count+" is not matching");
				Reports.fail("The " + Licences + " Expected licenses Count " + expectedTxt
						+ " and Actual licenses Count " + count + " is not matching");
				// Reports.finishTest();
			}
		} catch (Exception e) {
			Reports.fail("Licences count validation is Failed");
			throw e;
		}
	}
	/**
	 * Validating Users page licenses count
	 * @param object1
	 * @param object2
	 * @param expectedTxt
	 * @param Licences
	 * @throws Exception
	 */
	public static void validatingUsersPglicCount(WebElement object1, String object2, String expectedTxt)
			throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			WebElement verifyPg = object1.findElement(By.xpath(object2));
			System.out.println(verifyPg.getText());
			String countTxt = verifyPg.getText();
			System.out.println(countTxt);
			if (countTxt.equals(expectedTxt)) {
				Reports.pass("The Users page Expected licenses Count " + expectedTxt
						+ " and Actual licenses Count " + countTxt + " is matching");
			} else {
				Reports.fail("The Users page Expected licenses Count " + expectedTxt
						+ " and Actual licenses Count " + countTxt + " is not matching");
			}
		} catch (Exception e) {
			Reports.fail("Licences count validation is Failed");
			throw e;
		}
	}

	/**
	 * Navigate to Back
	 * 
	 * @throws Exception
	 */
	public static void navigateToBack() throws Exception {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Scrolling page till object visible
	 * 
	 * @param object1
	 * @param object2
	 */
	public static void scrollTillObjVisble(WebElement object1, String object2) {
		try {
			WebElement element = object1.findElement(By.xpath(object2));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {

		}
	}

	/**
	 * 
	 */
	public static void validatingProfiles(WebElement object1, String object2, WebElement object3, String object4,
			String object5) {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> listOfProfiles = object1.findElements(By.xpath(object2));
			for (WebElement ele : listOfProfiles) {
				waitForObjectToBePresent(ele, Constants.MAX_WAITING_TIME);
				// Thread.sleep(3000);
				ele.click();
				Thread.sleep(4000);
				WebElement skill = object3.findElement(By.xpath(object4));
				String skillName = skill.getText();
				try {
					if (skillName.contains(object5)) {
						System.out.println("Search Skill is reflecting in Profile");
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
					}
				} catch (Exception e1) {
					System.out.println("Search Skill is not reflecting in Profile");
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
				}
			}

		} catch (Exception e) {
			System.out.println("Search Profiles validation failed");
		}
	}

	/**
	 * Selecting dropdown values
	 * 
	 * @param object
	 * @param object2
	 * @param value
	 * @throws Exception
	 */
	public static void dropdown(WebElement object, String value) throws Exception {
		Reports.info("Running... dropdown value selction (WebElement object)");
		try {
			waitForObjectToBePresent(object, Constants.MAX_WAITING_TIME);
			Select select = new Select(object);
			select.selectByValue(value);
		} catch (Exception e) {
			Reports.fail("Unable to select the dropdown object: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Validating Customer Empty Result
	 * 
	 * @param object1
	 * @throws Exception
	 */
	public static void validateEmptyResults(WebElement object1, String object2) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MIN_WAITING_TIME);
			WebElement verifyPg = object1.findElement(By.xpath(object2));
			verifyPg.click();
			Reports.fail("Failed to Delete");
		} catch (Exception e) {
			Reports.pass("Successfully deleted");
		}
	}

	/**
	 * Manage Talk groups Check boxes
	 * 
	 * @param object1
	 * @param object2
	 * @throws Exception
	 */
	public static void handelMultipleCheckBoxs(WebElement object1, String object2) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MIN_WAITING_TIME);
			List<WebElement> listOfCheckbxs = object1.findElements(By.xpath(object2));
			System.out.println(listOfCheckbxs.size());
			for (WebElement ele : listOfCheckbxs) {
				if (!ele.isSelected()) {
					ele.click();
				}
			}
		} catch (Exception e) {
			Reports.fail("Failed to select all Check boxes");
			throw e;
		}
	}

	/**
	 * Validating Notification
	 * 
	 * @param object1
	 * @param object2
	 * @param object3
	 * @throws Exception
	 */
	public static void validateExpText(WebElement object1, String object2, String object3) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			WebElement verifyTxt = object1.findElement(By.xpath(object2));
			String notifTxt = verifyTxt.getText();
			if (notifTxt.contains(object3)) {
				System.out.println(notifTxt);
				Reports.pass(notifTxt + " is validated Successfully");
			} else {
				Reports.fail("Failed to validate " + object3 + " user Message/Notification");
			}
		} catch (Exception e) {
			Reports.fail("Failed to validate Message/Notification");
			throw e;
		}
	}

	/**
	 * 
	 * @param object1
	 * @param object2
	 * @param expectedTxt
	 * @param userName
	 * @throws Exception
	 */
	public static void validateMultipleExpTxt(WebElement object1, String object2, String expectedTxt) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> expTxt = object1.findElements(By.xpath(object2));
			System.out.println("List of Users count: " + expTxt.size());
			for (WebElement eleTxt : expTxt) {
				String Txt = eleTxt.getText();
				if (Txt.contains(expectedTxt)) {
					Reports.pass("Users are " + expectedTxt + " Successfully");
				} else {
					Reports.fail("Users are fail to Update");
				}
			}
		} catch (Exception e) {
			Reports.fail("Failed to validate Notification");
			throw e;
		}
	}

	/**
	 * Refreshing Browser
	 * 
	 * @throws Exception
	 */
	public static WebDriver refreshBrowser() throws Exception {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			Reports.fail("Failed to Refresh Browser");
			throw e;
		}
		return driver;
	}

	/**
	 * Drag and Drop the Element
	 * 
	 * @param drag1
	 * @param drag2
	 * @param drop1
	 * @param drop2
	 * @throws Exception
	 */
	public static WebDriver dragAndDrop(String drag2, String drop2) throws Exception {
		try {
			// waitForObjectToBePresent(drag1, Constants.MAX_WAITING_TIME);
			// WebElement dragLoc = drag1.findElement(By.xpath(drag2));
			WebElement dragLoc = driver.findElement(By.xpath(drag2));
			// waitForObjectToBePresent(drop1, Constants.MAX_WAITING_TIME);
			// WebElement dropLoc = drop1.findElement(By.xpath(drop2));
			WebElement dropLoc = driver.findElement(By.xpath(drop2));
			/*
			 * Actions act=new Actions(driver); Thread.sleep(2000);
			 * act.dragAndDrop(dragLoc,dropLoc).perform();
			 */
			Actions act = new Actions(driver);
			act.clickAndHold(dragLoc);
			act.moveToElement(dropLoc);
			// act.click(dropLoc);
			act.release(dropLoc);
			act.build().perform();
		} catch (Exception e) {
			Reports.fail("Failed to Drag and Drop");
			throw e;
		}
		return driver;
	}

	/**
	 * Validating update Talk group count
	 * 
	 * @param object1
	 * @param object2
	 * @throws Exception
	 */
	public static void validateTGCount(WebElement object1, String object2) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			WebElement verifyTxt = object1.findElement(By.xpath(object2));
			String CountTxt = verifyTxt.getText();
			Integer i = Integer.valueOf(CountTxt);
			if (i > 1) {
				Reports.pass("Talkgroups is updated Successfully");
			} else {
				Reports.fail("Failed to update Talkgroup all Users");
			}
		} catch (Exception e) {
			Reports.fail("Failed to validate Talkgroups Edit");
			throw e;
		}
	}

	public static void validateManTGUpdate(WebElement object1, String object2, String Object3) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			List<WebElement> updatedCheckbxs = object1.findElements(By.xpath(object2));
			int noOfNotupdatedCheckBxs = updatedCheckbxs.size();
			System.out.println(noOfNotupdatedCheckBxs);
			int checkedCount = 0;
			int uncheckedCount = 0;
			for (int i = 0; i < updatedCheckbxs.size(); i++) {
				if (updatedCheckbxs.get(i).isSelected() == true) {
					checkedCount++;
				} else {
					uncheckedCount++;
				}
			}
			/*
			 * Reports.pass("Number of Checked boxes " + checkedCount);
			 * System.out.println("Number of Checked boxes " + checkedCount);
			 * Reports.pass("Number of UnChecked boxes " + uncheckedCount);
			 * System.out.println("Number of UnChecked boxes " + uncheckedCount);
			 */
		} catch (Exception e) {
			Reports.fail("Failed to validate Talkgroups Edit");

			throw e;
		}
	}

	/**
	 * Validating Notification
	 * 
	 * @param object1
	 * @param object2
	 * @param object3
	 * @throws Exception
	 */
	public static void validateNotification(WebElement object1, String object2, String object3, WebElement object4,
			String object5, WebElement object6, String object7) throws Exception {
		try {
			waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			WebElement verifyTxt = object1.findElement(By.xpath(object2));
			String notifTxt = verifyTxt.getText();
			if (notifTxt.contains(object3)) {
				verifyTxt.click();
				WebElement verifyPopupTxt = object4.findElement(By.xpath(object5));
				String popUpNotifTxt = verifyPopupTxt.getText();
				if (popUpNotifTxt.contains(object3)) {
					WebElement dismissBtn = object6.findElement(By.xpath(object7));
					dismissBtn.click();
					Reports.pass("Successfully validated " + object3 + " notification");
				}
			} else {
				Reports.fail("Failed to validate " + object3 + " notification");
			}
		} catch (Exception e) {
			Reports.fail("Failed to validate Notification");
			throw e;
		}
	}

	/**
	 * Validating WOC Portal Link
	 * @param object1
	 * @param object2
	 * @param object3
	 * @param object4
	 * @param object5
	 * @throws Exception
	 */
	public static void validatelink(WebElement object2, WebElement object3, String object4, String object5 ) throws Exception {
		try {
			/*waitForObjectToBePresent(object1, Constants.MAX_WAITING_TIME);
			// WebElement linkElement = object1.findElement(By.xpath(object2));
			// linkElement.click();
			object1.click();*/
			try {
				waitForObjectToBePresent(object2, Constants.MAX_WAITING_TIME);
				//WebElement pageElement = object2.findElement(By.xpath(object2));
				//pageElement.isDisplayed();
				object2.isDisplayed();
				Reports.fail("Shown with Error Popup");
			} catch (Exception e) {
				waitForObjectToBePresent(object3, Constants.MAX_WAITING_TIME);
				WebElement pageElement = object3.findElement(By.xpath(object4));
				String pageElementTxt = pageElement.getText();
				if (pageElementTxt.contains(object5)) {
					String url = driver.getCurrentUrl();
					Reports.pass(object5+": Page Url is "+url);
					System.out.println(object5+": Page Url is "+url);
					Reports.pass("Successfully validated link");
				}
			}
		} catch (Exception e1) {
			Reports.fail("Failed to validate Link");
		}
	}

	/**
	 * 
	 * @param chkbx1
	 * @throws IOException
	 */
	public static void UnCheckingChkbox(WebElement chkbx1, String object2) throws IOException {
		try {
			waitForObjectToBePresent(chkbx1, Constants.MIN_WAITING_TIME);
			List<WebElement> listOfCheckbxs = chkbx1.findElements(By.xpath(object2));
			System.out.println(listOfCheckbxs.size());
			boolean checkstatus;
			for (WebElement ele : listOfCheckbxs) {
				checkstatus = ele.isSelected();
				if (checkstatus == true) {
					chkbx1.click();
					System.out.println("Checkbox is unchecked");
				} else {
					System.out.println("Checkbox is already unchecked");
				}
			}
		} catch (Exception e) {
			Reports.fail("Validating Checkbox is failed");
		}
	}
}
