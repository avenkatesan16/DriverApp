package Pages;

import mobileWrap.AppSpecificMethods;

public class DatePageAndroid extends AppSpecificMethods {

	String date = "(//android.widget.TextView[@content-desc=\"Text\"])[2]";
	String route="(//android.widget.TextView[@content-desc=\"Text\"])[6]";
	
	
	//Verify the Route Name
	public DatePageAndroid VerifyRouteName(String data) {
	
	verifyText(route,"xpath", route);
	
	return this;
}
	
	
	//Verify the Date Text
			public DatePageAndroid VerifyDateText() {
			
			verifyText("Date","xpath", date);
			
			return this;
		}
			
			
	
	

}
