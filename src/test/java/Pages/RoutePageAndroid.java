package Pages;

import mobileWrap.MobileWrapper;

public class RoutePageAndroid extends MobileWrapper {

	String route = "(//android.widget.TextView[@content-desc=\"Text\"])[2]";
	String operator = "(//android.widget.TextView[@content-desc=\"Text\"])[1]";
	String routesearch = "//android.widget.EditText[@content-desc=\"Item Search\"]";
	String routefilter = "(//android.widget.TextView[@content-desc=\"Text\"])[5]";
	String inactiveRouteErrorMsg = "";

	public RoutePageAndroid clickOperator() {
		click("xpath", operator);

		return this;
	}

	public RoutePageAndroid clickRoutefilter() {
		click("xpath", routefilter);

		return this;
	}

	public RoutePageAndroid VerifyInactiveRoutefilterDrpDwnPresent() {

		verifyText("JP nagar", "xpath", routefilter);

		return this;
	}

	public RoutePageAndroid VerifyActiveRoutefilterPresent(String route) {

		verifyText(route, "xpath", routefilter);

		return this;
	}

	public RoutePageAndroid enterSearchItem(String data) {
		enterValue(data, "xpath", routesearch);

		return this;
	}

	public RoutePageAndroid verifyRouteSearch() {
		eleIsDisplayed("xpath", routesearch);

		return this;
	}

	public RoutePageAndroid VerifyOperatorBackButton() {

		verifyText("Operator", "xpath", operator);

		return this;
	}

	public RoutePageAndroid VerifyRouteText() {

		verifyText("Route", "xpath", route);

		return this;
	}

}
