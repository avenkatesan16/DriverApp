package androidPages;

import org.testng.asserts.Assertion;
import org.testng.log4testng.Logger;

import Pages.DataRead;
import mobileWrap.MobileWrapper;


public class OperatorPage extends MobileWrapper {

	DataRead data = new DataRead();
	String sheetName = "LoginDetails";
	Assertion assertion = new Assertion();
	public static String platform;

	
	String operatorText = "//android.view.ViewGroup[@content-desc=\"Title, Operator, Title\"]/android.widget.TextView";
	

	/******* Test Data from Excel sheet ********/
	String usernameData = data.getCellData(sheetName, "Username", 2);
	String passwordData = data.getCellData(sheetName, "Password", 2);
	String operatorData = data.getCellData(sheetName, "Operator", 2);
	String warehouseData = data.getCellData(sheetName, "Warehouse", 2);
	String supplierData = data.getCellData(sheetName, "Supplier", 2);

	private static Logger LOGGER;

	public OperatorPage verifyOperatorText() {
		eleIsDisplayed("xpath", operatorText);
		return this;
	}
	
	public OperatorPage clickOnOperator(String operator) {
		clickAccessibilityID(operator);
		return this;
	}

}
