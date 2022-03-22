$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/LoginLogout.feature");
formatter.feature({
  "name": "Login Logout functionality of DriverApp",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@driverAppLoginLogout"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate login and logout functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginLogoutFunctionality"
    }
  ]
});
formatter.step({
  "name": "I log into the application in \"\u003cOSVersion\u003e\" for \"\u003cFunctionality\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I validate login page objects",
  "keyword": "And "
});
formatter.step({
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify operator text in \"\u003cOSVersion\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click logout",
  "keyword": "Then "
});
formatter.step({
  "name": "validate if logout is done successfully",
  "keyword": "And "
});
formatter.step({
  "name": "Update execution status for \"\u003cFunctionality\u003e\" functionality",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "OSVersion",
        "username",
        "password",
        "Functionality"
      ]
    },
    {
      "cells": [
        "android",
        "skaushik@cantaloupe.com",
        "Saurabh@123",
        "LoginLogoutFunctionality"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate login and logout functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@driverAppLoginLogout"
    },
    {
      "name": "@loginLogoutFunctionality"
    }
  ]
});
formatter.step({
  "name": "I log into the application in \"android\" for \"LoginLogoutFunctionality\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_log_into_the_application_in_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I validate login page objects",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_validate_login_page_objects()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"skaushik@cantaloupe.com\" and \"Saurabh@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I verify operator text in \"android\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.OperatorStepDef.i_verify_operator_text_in(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_click_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate if logout is done successfully",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_if_logout_is_done_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Update execution status for \"LoginLogoutFunctionality\" functionality",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.update_execution_status_for_functionality(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});