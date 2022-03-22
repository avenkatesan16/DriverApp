package Runners;

import java.io.UnsupportedEncodingException;

import Pages.EmailSend;
import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue = { "Steps",
		"Hooks" }, tags = "@endToEndloginLogoutFunctionality", plugin = { "pretty", "html:test-output",
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, dryRun = false, monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests {

	@After
	public void sendEmail() throws UnsupportedEncodingException, InterruptedException {
		EmailSend.emailSend();
	}

}
