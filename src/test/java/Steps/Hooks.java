package Steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.EmailSend;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import mobileWrap.MobileWrapper;

public class Hooks extends MobileWrapper {

	public static WebDriver driver;
//	public static AndroidDriver<WebElement> Androiddriver;
//	public static IOSDriver<WebElement> iOSDriver;
	JavascriptExecutor jse;
//	EmailSend email=new EmailSend();

//	TestContext testContext;
//
//	public Hooks(TestContext context) {
//		testContext = context;
//	}

//	@Before
//	public void setUp() {
//		try {
//			DesiredCapabilities caps = new DesiredCapabilities();
//			// Set your access credentials
//			caps.setCapability("browserstack.user", "cgurusamy_yEfsYh");
//			caps.setCapability("browserstack.key", "ksqvd8D79PaqQrxpXasL");
//
//			// Set URL of the application under test
//			caps.setCapability("app", "bs://d55cde6bac44cf50e86c6752170af74c8b520261");
//
//			// Specify device and os_version for testing
//			caps.setCapability("device", "Samsung Galaxy S21 Ultra");
//			caps.setCapability("os_version", "11.0");
//
//			// Set other BrowserStack capabilities
//			caps.setCapability("project", "Cantaloupe");
//			caps.setCapability("build", "Android Reports Demo Run");
//
//			// Initialise the remote Webdriver using BrowserStack remote URL
//			// and desired capabilities defined above
//			Androiddriver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
//
//			Androiddriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			jse = (JavascriptExecutor) Androiddriver;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
//	}

	@AfterStep
	public void as(Scenario scenario) throws IOException {
		if(iOSdriver!=null) {
		scenario.attach(getByteScreenshot("iOS"), "img/png", "test execution");
		}
		else if(Androiddriver!=null) {
			scenario.attach(getByteScreenshot("android"), "img/png", scenario.getName());
			
//			TakesScreenshot ts = (TakesScreenshot) Androiddriver;
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(src, "img/png", scenario.getName());
		}
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
//		String screenshotName = scenario.getName().replaceAll(" ", "_");
//		try {
//			// This takes a screenshot from the driver at save it to the specified location
//			File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
//					.getScreenshotAs(OutputType.FILE);
//
//			// Building up the destination path for the screenshot to save
//			// Also make sure to create a folder 'screenshots' with in the cucumber-report
//			// folder
//			File destinationPath = new File(
//					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
//
//			// Copy taken screenshot from source location to destination location
//			Files.copy(sourcePath, destinationPath);
//
//			// This attach the specified screenshot to the test
//			Reporter.addScreenCaptureFromPath(destinationPath.toString());
//		} catch (IOException e) {
//		}
		
	
	}

	@After(order = 0)
	public void quitDriver() {
		if (iOSdriver != null) {
			try {
				iOSdriver.closeApp();
				iOSdriver.quit();

			} catch (Exception e) {
			}
		}
		if (Androiddriver != null) {
			try {
				Androiddriver.closeApp();
				Androiddriver.quit();
//				EmailSend.emailSend();

			} catch (Exception e) {
			}
		}
	}

	public static byte[] getByteScreenshot(String osVersion) throws IOException {
		byte[] FileContent = null;
		if (platform.equalsIgnoreCase("iOS")) {
			File src = ((TakesScreenshot) iOSdriver).getScreenshotAs(OutputType.FILE);
			FileContent = FileUtils.readFileToByteArray(src);

		} else if (platform.equalsIgnoreCase("android")) {
			File src = ((TakesScreenshot) Androiddriver).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir")+"/test-output/ScreenshotScenarios/" + src.getName();
            org.apache.commons.io.FileUtils.copyFile(src, new File(path));
			FileContent = FileUtils.readFileToByteArray(new File(path));
		}

		return FileContent;
	}
	
//	@Attachment
//	public byte[] saveScreenshot(byte[] screenshot) {
//		return screenshot;
//	}

	
//	@After
//	public void tearDown(Scenario scenario) {
//
//		try {
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			if (scenario.isFailed()) {
//				scenario.log("this is my failure message");
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "image/png", screenshotName);
//			}
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
////		driver.close();
//	}

}
