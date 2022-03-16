package Pages;

import mobileWrap.AppSpecificMethods;

public class LoginLogoutPageiOS extends AppSpecificMethods {
	
	DataRead data=new DataRead();
	String sheetName="LoginDetails";

	String username = "(//XCUIElementTypeOther[@name=\"Username\"])[3]/XCUIElementTypeTextField";
	String usernameclear = "(//XCUIElementTypeOther[@name=\"Password Show\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";
	String password = "//XCUIElementTypeOther[@name=\"Password\"]/XCUIElementTypeSecureTextField";
	String login = "(//XCUIElementTypeOther[@name=\"LOG IN\"])[2]";
	String show = "//XCUIElementTypeOther[@name=\"Show\"]";
	//String seedmobile = "(//XCUIElementTypeOther[@name=\"Username Password Show LOG IN\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage";
	String usernameorpassword = "//XCUIElementTypeStaticText[@name=\"Username and Password cannot be empty\"]";
	String validpassword = "//XCUIElementTypeStaticText[@name=\" Please enter a valid Password\"]";
	String validUsername = "//XCUIElementTypeStaticText[@name=\"Please enter a valid Username\"]";
	String Operator="//XCUIElementTypeStaticText[@name=\"Operator\"]";
	String logout="//XCUIElementTypeOther[@name=\"Logout\"]";
	String yes="(//XCUIElementTypeOther[@name=\"Yes\"])[2]";
	String itemSearch="(//XCUIElementTypeOther[@name=\"123 Munch 1234 Dairy milk 1234 Milkybar 45 Cookies American Express Caffe coffee Chips Coco cola Coffe Machine Donuts Goodday Kitkat Lays Merinda Milk Pepsi Treat America Trident Vertical scroll bar, 2 pages Horizontal scroll bar, 1 page\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";
	String item="(//XCUIElementTypeOther[@name=\"Chips\"])[3]";
	
	String UserName= data.getCellData(sheetName, "Username", 2);
	String operatorData= data.getCellData(sheetName, "Operator", 2);
	
	
	//Click Operator Search Item
			public LoginLogoutPageiOS clickOperator() {
				click("xpath", item);

				return this;
			}
	
	
	//Verify the Item Search Filter Successfully
	
	
		public LoginLogoutPageiOS VerifyItemSearchFilterSuccessfully() {
			
			verifyText(operatorData,"xpath", item);
			
			return this;
		}
		
		
		// Enter Search Item
				public LoginLogoutPageiOS enterSearchItem() {
					enterValue(operatorData, "xpath", itemSearch);

					return this;
				}
		
		
		// Verify Item Search Validation

				public LoginLogoutPageiOS verifyItemSearch() {
					eleIsDisplayed("xpath", itemSearch);

					return this;
				}
		
	
	
	
	
	//Click Logout Yes Button
		public LoginLogoutPageiOS clickLogoutYes() {
			click("xpath", yes);

			return this;
		}
	
	
	
	
	//Click Logout Button
	public LoginLogoutPageiOS clickLogout() {
		click("xpath", logout);

		return this;
	}
	
	
	
	// Verify Operator Text Validation

	public LoginLogoutPageiOS verifyOperatorText() {
		eleIsDisplayed("xpath", Operator);

		return this;
	}
	
	
	
	
	//Verify Valid UsernameError Message
	public LoginLogoutPageiOS verifyValidUsernameError() {
		eleIsDisplayed("xpath", validUsername);

		return this;
	}

	// Enter Password
		public LoginLogoutPageiOS enterValidPassword(String pwd) {
			enterValue(pwd, "xpath", password);

			return this;
		}
	
	// Enter Password alone
	public LoginLogoutPageiOS enterPasswordAlone(String pwd) {
		clear("xpath", usernameclear);
		enterValue(pwd, "xpath", password);

		return this;
	}

	// Valid Password Error Message Verification

	public LoginLogoutPageiOS verifyValidPasswordError() {
		eleIsDisplayed("xpath", validpassword);

		return this;
	}

	// Enter Username
	public LoginLogoutPageiOS enterEmailAddress(String emailAddress) {
		String user=UserName;
		enterValue(emailAddress, "xpath", username);

		return this;
	}

	// Username or Password Error Message Verification
	public LoginLogoutPageiOS verifyUsernamePasswordError() {
		eleIsDisplayed("xpath", usernameorpassword);
		return this;
	}

	// Click Login Button
	public LoginLogoutPageiOS clickLogin() {
		click("xpath", login);

		return this;
	}

	// Username Verification
	public LoginLogoutPageiOS verifyUsername() {
		eleIsDisplayed("xpath", username);
		return this;
	}

	// Password Verification
	public LoginLogoutPageiOS verifyPassword() {
		eleIsDisplayed("xpath", password);

		return this;
	}

	// Show link Verification
	public LoginLogoutPageiOS verifyShowlink() {
		eleIsDisplayed("xpath", show);

		return this;
	}

	// Login Button Verification
	public LoginLogoutPageiOS  verifyLogin() {
		eleIsDisplayed("xpath", login);

		return this;
	}
	/*
	// Seed Mobile Logo Verification
	public LoginPage verifySeedMobileLogo() {
		if (!eleIsDisplayed("xpath", seedmobile) == false) {
			reportStep("SeedMobile Logo  Verified  successfully", "PASS");

		} else {

			reportStep("SeedMobile Logo  Verified not  successfully", "FAIL");

		}

		return this;
	}*/

}
