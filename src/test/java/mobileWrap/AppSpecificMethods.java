package mobileWrap;

public class AppSpecificMethods extends MobileWrapper {
	
	public String dataSheetName;
//
//	@BeforeSuite
//	public void bs() throws IOException {
//		startResult();
//	}
//
//	@BeforeClass
//	public void bc() {
//		startTestModule(testCaseName, testDescription);
//	}
//	
//	@BeforeMethod
//	public void bm() {
//		startTestCase(testNodes);
////		initiateDriver("android");
//		//launchAppBrowserStack(deviceName);
////		switchNativeview();
//		
////		launchAppBrowserStack();
////		switchNativeview();
//	}
	
	
	public void closeDriver(String OSVersion) {
		closeApp(OSVersion);
	}

	
	
	public void launchDriver(String OSVersion) {
		initiateDriver(OSVersion);
		//launchAppBrowserStack(deviceName);
		switchNativeview();
		
	}
	
	public void reLaunchDriver(String OSVersion) {
		reinitiateDriver(OSVersion);
		//launchAppBrowserStack(deviceName);
		switchNativeview();
		
	}
	
	
	public void launchDriverRealDevice(String OSVersion) {
		if(OSVersion.equalsIgnoreCase("iOS")) {
		launchAppInRealDevice("com.driver_app", "com.driver_app_MaiActivity", "Aishwarya", "D:\\Downloads\\driver_app.ipa",OSVersion);
		switchNativeview();
		}
		else if(OSVersion.equalsIgnoreCase("android")) {
			launchAppInRealDevice("com.driver_app", "com.driver_app_MaiActivity", "Aishwarya", "D:\\Downloads\\app-armeabi-v7a-release.apk",OSVersion);
			switchNativeview();
		}
		
	}
	
	

//	//@org.testng.annotations.Parameters(value={"deviceName"})
//	@BeforeMethod
//	public void bm() {
//		startTestCase(testNodes);
//		launchAppBrowserStackIOS();
//		//launchAppBrowserStack(deviceName);
//		switchNativeview();
//	}
	
	
	/*public void bm() {
		startTestCase(testNodes);
		launchApp("com.seedwarehouse", "com.seedwarehouse.MainActivity", "Saurabh", "63cfec52");
		switchNativeview();
	}*/
//	@AfterMethod
//	public void am() {
//		closeApp();
//		iOSdriver.quit();
//	}

//	@AfterSuite
//	public void as() {
//		endResult();
//		
//		
//	}


}
