package Steps;

import org.openqa.selenium.JavascriptExecutor;

import Pages.LoginLogoutPageAndroid;
import Pages.LoginLogoutPageiOS;
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
				new LoginLogoutPageAndroid().verifyOperatorText();
			}
		} catch (Exception e) {
			closeApp(osVersion);
			e.printStackTrace();
		}
	}

}
