package androidPages;

import org.testng.asserts.Assertion;
import org.testng.log4testng.Logger;

import Pages.DataRead;
import mobileWrap.MobileWrapper;


public class LoginLogoutPageAndroid extends MobileWrapper {

	DataRead data = new DataRead();
	String sheetName = "LoginDetails";
	Assertion assertion = new Assertion();
	public static String platform;

	String username = "//android.widget.EditText[@content-desc=\"Username, Username\"]";
	String password = "//android.widget.EditText[@content-desc=\"Password, Password\"]";
	String login = "//android.view.ViewGroup[@content-desc=\"Login Button\"]/android.view.ViewGroup";
	String show = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String usernameorpassword = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validpasswordError = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validUsername = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String Operator = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String logout = "//android.view.ViewGroup[@content-desc=\"Logout Button, Logout Button\"]/android.view.ViewGroup[1]";
	String yes = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView";
	String itemSearch = "//android.widget.EditText[@content-desc=\"Item Search\"]";
	String item = "(//android.widget.TextView[@content-desc=\"Text\"])[4]";

	String splashScreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
	String skipUsernamePwdErrorMsg = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validUsernameInCorrectPwdErrorMsg = "";
	String blankUsernameValidPwdErrorMsg = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String validUsernameBlankPwdErrorMsg = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String hideOrShow = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String copyRightText = "(//android.widget.TextView[@content-desc=\"Text\"])[3]";
	String version = "(//android.widget.TextView[@content-desc=\"Text\"])[4]";
	String blankSpacesErrorMsg = "//android.widget.TextView[@content-desc=\"Error Message\"]";
	String usernameInHomescreen = "(//android.widget.TextView[@content-desc=\"Text\"])[3]";
	String logoutNo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";

	/******* Test Data from Excel sheet ********/
	String usernameData = data.getCellData(sheetName, "Username", 2);
	String passwordData = data.getCellData(sheetName, "Password", 2);
	String operatorData = data.getCellData(sheetName, "Operator", 2);
	String warehouseData = data.getCellData(sheetName, "Warehouse", 2);
	String supplierData = data.getCellData(sheetName, "Supplier", 2);

	private static Logger LOGGER;

	public LoginLogoutPageAndroid clickOperator() {
		click("xpath", item);

		return this;
	}

	public LoginLogoutPageAndroid VerifyItemSearchFilterSuccessfully() {

		verifyText(operatorData, "xpath", item);
		return this;
	}

	public LoginLogoutPageAndroid enterSearchItem() {
		enterValue(operatorData, "xpath", itemSearch);
		return this;
	}

	public LoginLogoutPageAndroid verifyItemSearch() {
		eleIsDisplayed("xpath", itemSearch);
		return this;
	}

	public LoginLogoutPageAndroid clickLogoutYes() {
		click("xpath", yes);
		return this;
	}

	public LoginLogoutPageAndroid clickLogout() {
		click("xpath", logout);
		return this;
	}

	public LoginLogoutPageAndroid verifyOperatorText() {
		eleIsDisplayed("xpath", Operator);
		return this;
	}

	public LoginLogoutPageAndroid verifyValidUsernameError() {
		eleIsDisplayed("xpath", validUsername);
		return this;
	}

	public LoginLogoutPageAndroid enterValidPassword(String pwd) {
		clear("xpath", password);
		enterValue(pwd, "xpath", password);
		return this;
	}

	public LoginLogoutPageAndroid enterPasswordAlone(String pwd) {
		clear("xpath", username);
		enterValue(pwd, "xpath", password);
		return this;
	}

	public LoginLogoutPageAndroid verifyValidPasswordError() {
		eleIsDisplayed("xpath", validpasswordError);
		return this;
	}

	public LoginLogoutPageAndroid enterEmailAddress(String emailAddress) {
		String user = usernameData;
		clear("xpath", username);
		enterValue(emailAddress, "xpath", username);

		return this;
	}

	public LoginLogoutPageAndroid verifyUsernamePasswordError() {
		eleIsDisplayed("xpath", usernameorpassword);

		return this;
	}

	public LoginLogoutPageAndroid clickLogin() {
		click("xpath", login);
		return this;
	}

	public LoginLogoutPageAndroid verifyUsername(String version) {
		platform = version;
		eleIsDisplayed("xpath", username);
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

	public LoginLogoutPageAndroid verifyPassword() {
		eleIsDisplayed("xpath", password);
		return this;
	}

	public LoginLogoutPageAndroid verifyShowlink() {
		eleIsDisplayed("xpath", show);
		return this;
	}

	public LoginLogoutPageAndroid verifyLogin() {
		eleIsDisplayed("xpath", login);
		return this;
	}

	public LoginLogoutPageAndroid validateSplashScreenDisplayed() {
		eleIsDisplayed("xpath", splashScreen);
		return this;
	}

	public LoginLogoutPageAndroid verifySkipUsernamePwdErrorMsg() {
		eleIsDisplayed("xpath", skipUsernamePwdErrorMsg);
		return this;
	}

	public LoginLogoutPageAndroid verifyValidUsernameInCorrectPwdErrorMsg() {
		eleIsDisplayed("xpath", validUsernameInCorrectPwdErrorMsg);
		return this;
	}

	public LoginLogoutPageAndroid verifyBlankUsernameValidPwdErrorMsg() {
		eleIsDisplayed("xpath", blankUsernameValidPwdErrorMsg);
		return this;
	}

	public LoginLogoutPageAndroid verifyValidUsernameBlankPwdErrorMsg() {
		eleIsDisplayed("xpath", validUsernameBlankPwdErrorMsg);
		return this;
	}

	public LoginLogoutPageAndroid verifyHideOrShowDisplayed() {
		eleIsDisplayed("xpath", hideOrShow);
		return this;
	}

	public LoginLogoutPageAndroid verifyCopyrightTextVersionDisplayed() {
		eleIsDisplayed("xpath", copyRightText);
		eleIsDisplayed("xpath", version);
		return this;
	}

	public LoginLogoutPageAndroid verifyErrorMsgLoggedInWithBlankSpacesDisplayed() {
		eleIsDisplayed("xpath", blankSpacesErrorMsg);
		return this;
	}

	public LoginLogoutPageAndroid verifyUsernameDisplayedInHomescreen(String emailname) {
		String name = emailname.split("@")[1];
		verifyText(name, "xpath", usernameInHomescreen);
		return this;
	}

	public LoginLogoutPageAndroid verifySavedUsernameBlankPwdDisplayed(String name) {
		verifyText(name, "xpath", username);
		verifyText("", "xpath", password);
		return this;
	}

	public LoginLogoutPageAndroid enterPwdAlone(String pwd) {
		clear("xpath", username);
		enterValue(pwd, "xpath", password);
		return this;
	}

	public LoginLogoutPageAndroid enterPwdForFilledInUsername(String pwd) {
		enterValue(pwd, "xpath", password);
		return this;
	}

	public LoginLogoutPageAndroid swipeToElement(String element) {
		if (element.equalsIgnoreCase("login")) {
			swipeUp(2, login);
		}
		return this;
	}

	public LoginLogoutPageAndroid clickLogOutAlone() {
		click("xpath", logout);
		return this;
	}

	public LoginLogoutPageAndroid validateLogoutYesNo() {
		eleIsDisplayed("xpath", yes);
		eleIsDisplayed("xpath", logoutNo);
		return this;
	}

	public LoginLogoutPageAndroid clickUsername() {
		click("xpath", username);
		return this;
	}

	public LoginLogoutPageAndroid validateLogoutPopupYes() {
		click("xpath", yes);
		eleIsDisplayed("xpath", login);
		return this;
	}

	public LoginLogoutPageAndroid validateLogoutPopupNo() {
		click("xpath", logoutNo);
		eleIsDisplayed("xpath", usernameInHomescreen);
		return this;
	}
	
	public LoginLogoutPageAndroid clickOnOperator(String operator) {
		click("xpath", logout);
		return this;
	}

}
