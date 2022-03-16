package Pages;

import mobileWrap.AppSpecificMethods;

public class RoutePageAndroid extends AppSpecificMethods {

	String route = "(//android.widget.TextView[@content-desc=\"Text\"])[2]";
	String operator = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String routesearch = "//android.widget.EditText[@content-desc=\"Item Search\"]";
	String routefilter="(//android.widget.TextView[@content-desc=\"Text\"])[5]";
	String inactiveRouteErrorMsg="";
	
	
	//Click route filter text
			public RoutePageAndroid clickOperator() {
				click("xpath", operator);

				return this;
			}
	
	
	
	//Click route filter text
		public RoutePageAndroid clickRoutefilter() {
			click("xpath", routefilter);

			return this;
		}
	
	
	//Verify the Route Filter Successfully
		public RoutePageAndroid VerifyInactiveRoutefilterDrpDwnPresent() {
		
			verifyText("JP nagar","xpath", routefilter);
		
		return this;
	}
		
		//Verify the Route Filter Successfully
				public RoutePageAndroid VerifyActiveRoutefilterPresent(String route) {
				
					verifyText(route,"xpath", routefilter);
				
				return this;
			}
	
	
	// Enter Search Item
				public RoutePageAndroid enterSearchItem(String data) {
					enterValue(data, "xpath", routesearch);

					return this;
				}
	
	
	
	// Verify routesearch

	public RoutePageAndroid verifyRouteSearch() {
		eleIsDisplayed("xpath", routesearch);

		return this;
	}

	// Verify Operator Back Text

	public RoutePageAndroid VerifyOperatorBackButton() {

		verifyText("Operator", "xpath", operator);

		return this;
	}

	// Verify Route Text

	public RoutePageAndroid VerifyRouteText() {

		verifyText("Route", "xpath", route);

		return this;
	}

}
