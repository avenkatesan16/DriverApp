package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", 
	glue = { "Steps","Hooks" }, 
	tags = "@loginLogoutFunctionality",
	plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 	
	dryRun = false, 
	monochrome = true
	)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
