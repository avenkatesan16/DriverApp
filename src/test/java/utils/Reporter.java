package utils;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public abstract class Reporter{

	public ExtentHtmlReporter html;
	public ExtentReports extent;
	public static ExtentTest test, suiteTest;
	public String testCaseName, testNodes, testDescription, category, authors;
	public static String folderName = "";
//	public ExtentReports report;
//	public ExtentTest logger;
	// File Level - Before Suite
	
	public void startResult() throws IOException {
		
		try {
			File file = new File("./reports/result.html");
			file.delete();
			folderName = "reports/images";

			File folder = new File("./" + folderName);
			if (folder.exists()) {
				folder.delete();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		html = new ExtentHtmlReporter("./reports/result.html");
//		html.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
//		html.config().setChartVisibilityOnOpen(false);
//		html.config().setDocumentTitle("MobileFramework");
//		html.setAppendExisting(true);		
//		extent = new ExtentReports();	
//		extent.attachReporter(html);	
	}
	
	

	// testCase level - Before class
//	@BeforeClass
//	public void startTestModule(String testCaseName, String testDescription) {
//		suiteTest = extent.createTest(testCaseName, testDescription);
//
//	}

//	@Test
//	public ExtentTest startTestCase(String testNodes) {
//		test = 	suiteTest.createNode(testNodes);
//		test.assignAuthor(authors);
//		test.assignCategory(category);
//		return test;
//	}

	public abstract long takeScreenShot();

	// step level
	public void reportStep(String desc, String status, boolean bSnap)  {

		MediaEntityModelProvider img = null;
		if(bSnap && !status.equalsIgnoreCase("INFO")){

			long snapNumber = 100000L;
			snapNumber = takeScreenShot();
			try {
				img = MediaEntityBuilder.createScreenCaptureFromPath
						("./../reports/images/"+snapNumber+".png").build();
			} catch (IOException e) {
				
			}
		}
//		if(status.equalsIgnoreCase("PASS")) {
//			test.pass(desc);			
//		}else if (status.equalsIgnoreCase("FAIL")) {
//			test.fail(desc);
//			throw new RuntimeException();
//		}else if (status.equalsIgnoreCase("WARNING")) {
//			test.warning(desc);
//		}else if (status.equalsIgnoreCase("INFO")) {
//			test.info(desc);
//		}							
	}


	public void reportStep(String desc, String status) {
		reportStep(desc, status, true);
	}



	// execute code - After suite
//	public void endResult() {
//		extent.flush();
//		
//	}	

}