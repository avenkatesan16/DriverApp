package Pages;

import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.testng.asserts.Assertion;
import org.testng.log4testng.Logger;

import mobileWrap.AppSpecificMethods;

public class LoginLogoutPageAndroid extends AppSpecificMethods {

	DataRead data = new DataRead();
	String sheetName = "LoginDetails";
	Assertion assertion = new Assertion();
	public static String platform;

	String username = "//android.widget.EditText[@content-desc=\"Username\"]";
	// String usernameclear = "(//XCUIElementTypeOther[@name=\"Password
	// Show\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";
	String password = "//android.widget.EditText[@content-desc=\"Password\"]";
	String login = "//android.view.ViewGroup[@content-desc=\"Login Button\"]/android.view.ViewGroup";
	String show = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	// String seedmobile = "(//XCUIElementTypeOther[@name=\"Username Password Show
	// LOG
	// IN\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage";
	String usernameorpassword = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validpasswordError = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validUsername = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String Operator = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String logout = "//android.view.ViewGroup[@content-desc=\"Logout Button\"]";
	String yes = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]";
	String itemSearch = "//android.widget.EditText[@content-desc=\"Item Search\"]";
	String item = "(//android.widget.TextView[@content-desc=\"Text\"])[4]";
	
	String splashScreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
	String skipUsernamePwdErrorMsg = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validUsernameInCorrectPwdErrorMsg="";
	String blankUsernameValidPwdErrorMsg="//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validUsernameBlankPwdErrorMsg="//android.widget.TextView[@content-desc=\"Error Message\"]";
	String hideOrShow="(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String copyRightText="(//android.widget.TextView[@content-desc=\"Text\"])[3]";
	String version="(//android.widget.TextView[@content-desc=\"Text\"])[4]";
	String blankSpacesErrorMsg="//android.widget.TextView[@content-desc=\"Error Message\"]";
	String usernameInHomescreen="(//android.widget.TextView[@content-desc=\"Text\"])[3]";
	String logoutNo="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";

	/******* Test Data from Excel sheet ********/
	String usernameData = data.getCellData(sheetName, "Username", 2);
	String passwordData = data.getCellData(sheetName, "Password", 2);
	String operatorData = data.getCellData(sheetName, "Operator", 2);
	String warehouseData = data.getCellData(sheetName, "Warehouse", 2);
	String supplierData = data.getCellData(sheetName, "Supplier", 2);
	
	private static Logger LOGGER;

	// Click Operator Search Item
	public LoginLogoutPageAndroid clickOperator() {
		click("xpath", item);

		return this;
	}

	// Verify the Item Search Filter Successfully

	public LoginLogoutPageAndroid VerifyItemSearchFilterSuccessfully() {

		verifyText(operatorData, "xpath", item);
		reportStep("Text is verified successfully", "PASS");
		return this;
	}

	// Enter Search Item
	public LoginLogoutPageAndroid enterSearchItem() {
		enterValue(operatorData, "xpath", itemSearch);
		reportStep("Value is entered successfully", "PASS");
		return this;
	}

	// Verify Item Search Validation

	public LoginLogoutPageAndroid verifyItemSearch() {
		eleIsDisplayed("xpath", itemSearch);
		return this;
	}

	// Click Logout Yes Button
	public LoginLogoutPageAndroid clickLogoutYes() {
		click("xpath", yes);
		reportStep("Logout Yes button is clicked successfully", "PASS");
		return this;
	}

	// Click Logout Button
	public LoginLogoutPageAndroid clickLogout() {
		click("xpath", logout);
		reportStep("Logout button is clicked successfully", "PASS");
		return this;
	}

	// Verify Operator Text Validation

	public LoginLogoutPageAndroid verifyOperatorText() {
		eleIsDisplayed("xpath", Operator);
		return this;
	}

	// Verify Valid UsernameError Message
	public LoginLogoutPageAndroid verifyValidUsernameError() {
		eleIsDisplayed("xpath", validUsername);
		return this;
	}

	// Enter Password
	public LoginLogoutPageAndroid enterValidPassword(String pwd) {
		clear("xpath", password);
		enterValue(pwd, "xpath", password);
//		reportStep("Password is entered successfully", "PASS");
		return this;
	}

	// Enter Password
	public LoginLogoutPageAndroid enterPasswordAlone(String pwd) {
		clear("xpath", username);
		enterValue(pwd, "xpath", password);
		reportStep("Password alone is entered successfully", "PASS");
		return this;
	}

	// Valid Password Error Message Verification

	public LoginLogoutPageAndroid verifyValidPasswordError() {
		eleIsDisplayed("xpath", validpasswordError);
		return this;
	}

	// Enter Username
	public LoginLogoutPageAndroid enterEmailAddress(String emailAddress) {
		String user = usernameData;
		clear("xpath", username);
		enterValue(emailAddress, "xpath", username);
//		reportStep("Username is entered successfully", "PASS");

		return this;
	}

	// Username or Password Error Message Verification
	public LoginLogoutPageAndroid verifyUsernamePasswordError() {
		eleIsDisplayed("xpath", usernameorpassword);

		return this;
	}

	// Click Login Button
	public LoginLogoutPageAndroid clickLogin() {
		click("xpath", login);
//		reportStep("Login button is clicked successfully", "PASS");
		return this;
	}

	// Username Verification
	public LoginLogoutPageAndroid verifyUsername(String version) {
		platform = version;
//		logger.info("Validating Username to be displayed");
		eleIsDisplayed("xpath", username);
//		attachScreenshot(null, platform);
//		logger.pass("Username is displayed as expected");
//		reportStep("Username field is verified successfully", "PASS");
		return this;
	}

	public void driverquit() {
		if (platform.equalsIgnoreCase("iOS")) {
			iOSdriver.closeApp();
			iOSdriver.quit();

		} else if (platform.equalsIgnoreCase("android")) {
			Androiddriver.closeApp();
			Androiddriver.quit();
		}
	}

	// Password Verification
	public LoginLogoutPageAndroid verifyPassword() {
//		logger.info("Validating Password to be displayed");
		eleIsDisplayed("xpath", password);
//		logger.pass("Password is displayed as expected");
//		reportStep("Password is verified successfully", "PASS");
		return this;
	}

	// Show link Verification
	public LoginLogoutPageAndroid verifyShowlink() {
		eleIsDisplayed("xpath", show);
//		reportStep("Show link is verified successfully", "PASS");
		return this;
	}

	// Login Button Verification
	public LoginLogoutPageAndroid verifyLogin() {
//		logger.info("Validating Login button to be displayed");
		eleIsDisplayed("xpath", login);
//		logger.pass(" Login button is displayed as expected");
//		reportStep("Login button is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid validateSplashScreenDisplayed() {
		eleIsDisplayed("xpath", splashScreen);
		reportStep("Splash screen is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifySkipUsernamePwdErrorMsg() {
		eleIsDisplayed("xpath", skipUsernamePwdErrorMsg);
		reportStep("Skip username and password error message is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyValidUsernameInCorrectPwdErrorMsg() {
		eleIsDisplayed("xpath", validUsernameInCorrectPwdErrorMsg);
		reportStep("Valid username and incorrect password error message is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyBlankUsernameValidPwdErrorMsg() {
		eleIsDisplayed("xpath", blankUsernameValidPwdErrorMsg);
		reportStep("Blank username and valid password error message is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyValidUsernameBlankPwdErrorMsg() {
		eleIsDisplayed("xpath", validUsernameBlankPwdErrorMsg);
		reportStep("Valid username and blank password error message is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyHideOrShowDisplayed() {
		eleIsDisplayed("xpath", hideOrShow);
		reportStep("Hide or show is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyCopyrightTextVersionDisplayed() {
		eleIsDisplayed("xpath", copyRightText);
		eleIsDisplayed("xpath", version);
		reportStep("Copyright text and version is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyErrorMsgLoggedInWithBlankSpacesDisplayed() {
		eleIsDisplayed("xpath", blankSpacesErrorMsg);
		reportStep("Error message when logged in with blank spaces in username and password is verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifyUsernameDisplayedInHomescreen(String emailname) {
		String name=emailname.split("@")[1];
		verifyText(name, "xpath", usernameInHomescreen);
		reportStep(name+" is displayed in homescreen and verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid verifySavedUsernameBlankPwdDisplayed(String name) {
		verifyText(name, "xpath", username);
		verifyText("", "xpath", password);
		reportStep(name+" and blank password is displayed and verified successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid enterPwdAlone(String pwd) {
		clear("xpath", username);
		enterValue(pwd, "xpath", password);
		reportStep("Password alone is entered successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid enterPwdForFilledInUsername(String pwd) {
		enterValue(pwd, "xpath", password);
		reportStep("Password alone is entered successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid swipeToElement(String element) {
		if(element.equalsIgnoreCase("login")) {
		swipeUp(2, login);
		}
		reportStep("Swiped and moved to login button successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid clickLogOutAlone() {
		click("xpath", logout);
		reportStep("Logout button alone is clicked successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid validateLogoutYesNo() {
		eleIsDisplayed("xpath", yes);
		eleIsDisplayed("xpath", logoutNo);
		reportStep("Logout yes or no popup is displayed successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid clickUsername() {
		click("xpath", username);
		reportStep("Username field is clicked successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid validateLogoutPopupYes() {
		click("xpath", yes);
		eleIsDisplayed("xpath", login);
		reportStep("Logout pop yes is clicked and  Login button is displayed successfully", "PASS");
		return this;
	}
	
	public LoginLogoutPageAndroid validateLogoutPopupNo() {
		click("xpath", logoutNo);
		eleIsDisplayed("xpath", usernameInHomescreen);
		reportStep("Logout pop no is clicked and  username in homescreen is displayed successfully", "PASS");
		return this;
	}
	
	
	/*
	 * // Seed Mobile Logo Verification public LoginPage verifySeedMobileLogo() { if
	 * (!eleIsDisplayed("xpath", seedmobile) == false) {
	 * reportStep("SeedMobile Logo  Verified  successfully", "PASS");
	 * 
	 * } else {
	 * 
	 * reportStep("SeedMobile Logo  Verified not  successfully", "FAIL");
	 * 
	 * }
	 * 
	 * return this; }
	 */

}
