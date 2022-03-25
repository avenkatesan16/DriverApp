package Steps;

import org.openqa.selenium.JavascriptExecutor;

import androidPages.LoginLogoutPageAndroid;
import androidPages.RoutePageAndroid;
import androidPages.OperatorPage;
import iOSPages.LoginLogoutPageiOS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mobileWrap.MobileWrapper;

public class OperatorStepDef extends MobileWrapper {
	public static String osVersion;
	public static String functional;
	JavascriptExecutor jse;

	@Then("I verify operator text in {string}")
	public void i_verify_operator_text_in(String OSVersion) {
		osVersion = OSVersion;
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
				new LoginLogoutPageiOS().verifyOperatorText();
			} else if (osVersion.equalsIgnoreCase("android")) {
				new OperatorPage().verifyOperatorText();
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}
	
	@Then("I click on {string} operator")
	public void i_click_on_operator(String operator) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
			} else if (osVersion.equalsIgnoreCase("android")) {
				new OperatorPage().clickOnOperator(operator);
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}
	
	@Then("I click on {string} route")
	public void i_click_on_route(String route) {
		try {
			if (osVersion.equalsIgnoreCase("iOS")) {
			} else if (osVersion.equalsIgnoreCase("android")) {
				new RoutePageAndroid().clickOnRoute(route);
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}
	
	

}
