package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginLogoutPageAndroid;
import Pages.LoginLogoutPageiOS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import mobileWrap.AppSpecificMethods;

public class OperatorStepDef extends AppSpecificMethods{
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
	
	

	@Then("I verify operator text in {string}")
	public void i_verify_operator_text_in(String OSVersion) {
		osVersion=OSVersion;
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
