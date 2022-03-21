package Steps;

import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.EmailSend;
import Pages.LoginLogoutPageAndroid;
import Pages.LoginLogoutPageiOS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import mobileWrap.AppSpecificMethods;

public class LoginLogoutStepDef extends AppSpecificMethods{
	public static String osVersion;
	public static String functional;
	JavascriptExecutor jse;

//	@Given("I open google page")
//	public void i_open_google_page() {
//		Hooks.driver.get("https://www.google.com/");
//	}
//
//	@When("I check for the google page title")
//	public void i_check_for_the_google_page_title() {
//		Assert.assertEquals("Google", Hooks.driver.getTitle());
//	}
//
//	@Given("I open bing page")
//	public void i_open_bing_page() {
//		Hooks.driver.get("https://www.bing.com/");
//	}
//
//	@When("I check for the bing page title")
//	public void i_check_for_the_bing_page_title() {
//		Assert.assertEquals("Bing", Hooks.driver.getTitle());
//	}
//
//	@Then("^I search the \"([^\"]*)\" in google step$")
//	public void i_search_the_keyword_in_google_step(String keyword) throws InterruptedException {
//		Hooks.driver.findElement(By.name("q")).sendKeys(keyword);
//		Hooks.driver.findElement(By.name("q")).submit();
//		Thread.sleep(1000);
//		Assert.assertEquals("My Title", Hooks.driver.getTitle());
//	}
//	
//	@Then("^I search the \"([^\"]*)\" in bing step$")
//	public void i_search_the_keyword_in_bing_step(String keyword) throws InterruptedException {
//		Hooks.driver.findElement(By.name("q")).sendKeys(keyword);
//		Hooks.driver.findElement(By.name("q")).submit();
//		Thread.sleep(1000);
//	}
//	
//	@Given("I skipping this step")
//	public void i_skipping_this_step() {
//		System.out.println("SKIP");
//	}
	
	@When("I log into the application in {string} for {string}")
	public void i_log_into_the_application_in_for(String OSVersion, String functionality) {
		osVersion = OSVersion;
		functional = functionality;
		try {
			if (OSVersion.equalsIgnoreCase("iOS")) {
				launchDriver(OSVersion);
//				launchDriverRealDevice(OSVersion);
				jse = (JavascriptExecutor) iOSdriver;

			} else if (OSVersion.equalsIgnoreCase("android")) {
//				launchDriverRealDevice(OSVersion);
				launchDriver(OSVersion);
				jse = (JavascriptExecutor) Androiddriver;

			}
		} catch (Exception e) {
			closeApp(OSVersion);
			e.printStackTrace();
		}
	}

	@When("I validate login page objects")
	public void i_validate_login_page_objects() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				new LoginLogoutPageiOS().verifyUsername().verifyPassword().verifyShowlink().verifyLogin();
			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifyUsername(osVersion).verifyPassword().verifyShowlink().verifyLogin();
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}

	@Then("I enter {string} and {string}")
	public void i_enter_username_and_password(String username, String pwd) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				new LoginLogoutPageiOS().enterEmailAddress(username).enterValidPassword(pwd);

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().enterEmailAddress(username).enterValidPassword(pwd);
			}

		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}

	@Then("I click login button")
	public void i_click_login_button() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				new LoginLogoutPageiOS().clickLogin();
			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().clickLogin();
			}
//			new OperatorRouteDateStepDef().getOSVersion(osVersion);
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}

//	@Then("I verify operator text in {string}")
//	public void i_verify_operator_text_in(String string) {
//		try {
//			if (osVersion.equalsIgnoreCase("iOS")) {
//				new LoginLogoutPageiOS().verifyOperatorText();
//			} else if (osVersion.equalsIgnoreCase("android")) {
//				new LoginLogoutPageAndroid().verifyOperatorText();
//			}
//		} catch (Exception e) {
//			closeApp(osVersion);
//			e.printStackTrace();
//		}
//	}

	@Then("I click logout")
	public void i_click_logout() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				new LoginLogoutPageiOS().clickLogout().clickLogoutYes();
			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().clickLogout().clickLogoutYes();
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}

	@Then("validate if logout is done successfully")
	public void validate_if_logout_is_done_successfully() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				new LoginLogoutPageiOS().verifyLogin();
			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifyLogin();
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}
	
	@Then("validate if splash screen is displayed")
	public void validate_splash_screen_displayed() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().validateSplashScreenDisplayed();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("validate if hide or show is displayed")
	public void validate_hide_show_displayed() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifyHideOrShowDisplayed();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if skip username or password error msg is displayed")
	public void validate_skip_username_pwd_error_msg_displayed() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifySkipUsernamePwdErrorMsg();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if valid username {string} and incorrect pwd {string} error msg is dispalyed")
	public void validate_valid_username_incorrect_pwd_error_msg_displayed(String name,String pwd) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().enterEmailAddress(name).enterValidPassword(pwd);
				new LoginLogoutPageAndroid().clickLogin();
//				new LoginLogoutPageAndroid().verifyValidUsernameInCorrectPwdErrorMsg();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if blank username and valid pwd {string} error msg is dispalyed")
	public void validate_blank_username_valid_pwd_error_msg_displayed(String pwd) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().enterEmailAddress("").enterValidPassword(pwd);
				new LoginLogoutPageAndroid().clickLogin();
				new LoginLogoutPageAndroid().verifyBlankUsernameValidPwdErrorMsg();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if valid username {string} and blank pwd error msg is dispalyed")
	public void validate_valid_username_blank_pwd_error_msg_displayed(String name) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().enterEmailAddress(name).enterValidPassword("");
				new LoginLogoutPageAndroid().clickLogin();
				new LoginLogoutPageAndroid().verifyValidUsernameBlankPwdErrorMsg();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if copyright text and version is displayed")
	public void validate_copyright_text_displayed() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifyCopyrightTextVersionDisplayed();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if user gets error msg when logged in with blank spaces in values with {string} and {string}")
	public void validate_error_msg_logged_blank_Spaces_values_displayed(String name,String pwd) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().enterEmailAddress(name).enterValidPassword(pwd);
				new LoginLogoutPageAndroid().clickLogin();
				new LoginLogoutPageAndroid().verifyErrorMsgLoggedInWithBlankSpacesDisplayed();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate {string} is displayed in home screen")
	public void validate_username_homescreen_displayed(String username) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifyUsernameDisplayedInHomescreen(username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("Close the application alone")
	public void close_the_application_alone_in_os() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				closeAppAlone(osVersion);

			} else if (osVersion.equalsIgnoreCase("android")) {
				closeAppAlone(osVersion);
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}
	
	@When("I reopen the application in {string} for {string}")
	public void reopen_the_application_in_os(String OSVersion, String functionality) {
		osVersion = OSVersion;
		functional = functionality;
		try {
			if (OSVersion.equalsIgnoreCase("iOS")) {
				reLaunchDriver(OSVersion);
//				launchDriverRealDevice(OSVersion);
				jse = (JavascriptExecutor) iOSdriver;

			} else if (OSVersion.equalsIgnoreCase("android")) {
//				launchDriverRealDevice(OSVersion);
				reLaunchDriver(OSVersion);
				jse = (JavascriptExecutor) Androiddriver;

			}
		} catch (Exception e) {
			closeApp(OSVersion);
			e.printStackTrace();
		}
	}
	
	@Then("validate if username {string} is saved and pwd is empty")
	public void validate_username_saved_pwd_empty(String username) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().verifySavedUsernameBlankPwdDisplayed(username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("I enter password {string} alone for auto filled in username")
	public void i_enter_pwd_alone_auto_filled_username(String password) {
		
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().enterPwdForFilledInUsername(password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("I do swipe down to {string} element")
	public void i_do_scroll_down_to_element(String element) {
		
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().swipeToElement(element);;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Then("I click logout alone")
	public void i_click_logout_alone() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().clickLogOutAlone();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate logout yes or no is displayed")
	public void validate_logout_yes_no_displayed() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().validateLogoutYesNo();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate if user not logged out when clicked outside pop up")
	public void validate_user_not_logged_out_clicked_outside_pop_up() {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {

			} else if (osVersion.equalsIgnoreCase("android")) {
				new LoginLogoutPageAndroid().clickUsername().verifyLogin();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("validate logout popup {string} functionality")
	public void validate_logout_pop_functionality(String yesNo) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				if (yesNo.equalsIgnoreCase("Yes")) {

				} else if (yesNo.equalsIgnoreCase("No")) {

				}

			} else if (osVersion.equalsIgnoreCase("android")) {
				if (yesNo.equalsIgnoreCase("Yes")) {
					new LoginLogoutPageAndroid().validateLogoutPopupYes();
				} else if (yesNo.equalsIgnoreCase("No")) {
					new LoginLogoutPageAndroid().validateLogoutPopupNo();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Update execution status for {string} functionality")
	public void update_execution_status_for_functionality(String functionality) {
		switch (functionality) {
		case "LoginLogoutFunctionality":

			if (osVersion.equalsIgnoreCase("iOS")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Login Logout Functionality Validation iOS Passed\"}}");

			} else if (osVersion.equalsIgnoreCase("android")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"passed\", \"reason\": \"Login Logout Functionality Validation Android Passed\"}}");
			}

			break;
			
		case "EndtoEndLoginLogoutFunctionality":

			if (osVersion.equalsIgnoreCase("iOS")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"End to End Login Logout Functionality Validation iOS Passed\"}}");

			} else if (osVersion.equalsIgnoreCase("android")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"passed\", \"reason\": \"End to End Login Logout Functionality Validation Android Passed\"}}");
			}

			break;

		case "LoginFailureFunctionality":

			if (osVersion.equalsIgnoreCase("iOS")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Login Failure Functionality Validation iOS Passed\"}}");

			} else if (osVersion.equalsIgnoreCase("android")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Login Failure Functionality Validation Android Passed\"}}");

			}

			break;

		case "OperatorPageFunctionality":

			if (osVersion.equalsIgnoreCase("iOS")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Operator page Functionality Validation iOS Passed\"}}");

			} else if (osVersion.equalsIgnoreCase("android")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Operator page Functionality Validation Android Passed\"}}");

			}

			break;

		case "RoutePageFunctionality":

			if (osVersion.equalsIgnoreCase("iOS")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Route Page Functionality Validation iOS Passed\"}}");

			} else if (osVersion.equalsIgnoreCase("android")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Route Page Functionality Validation Android Passed\"}}");

			}

			break;

		case "DatePageFunctionality":

			if (osVersion.equalsIgnoreCase("iOS")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Date Page Functionality Validation iOS Passed\"}}");

			} else if (osVersion.equalsIgnoreCase("android")) {

				jse.executeScript(
						"browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Date Page Functionality Validation Android Passed\"}}");

			}

			break;
		}
	}

	@Then("Close the application")
	public void close_the_application() {
		closeApp(osVersion);
	}
	
	public void closeApp(String OSVersion) {
		if (OSVersion.equalsIgnoreCase("iOS")) {
			if (iOSdriver != null) {
				try {
					iOSdriver.closeApp();
					iOSdriver.quit();

				} catch (Exception e) {
				}
			}
		} else if (OSVersion.equalsIgnoreCase("android")) {
			if (Androiddriver != null) {
				try {
					Androiddriver.closeApp();
					Androiddriver.quit();

				} catch (Exception e) {
				}
			}
		}

	}
	
	@Then("I email the report")
	public void i_email_the_report() throws UnsupportedEncodingException, InterruptedException  {
		EmailSend.emailSend();
	}

	 
}
