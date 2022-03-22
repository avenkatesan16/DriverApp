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
  "name": "Validate End to End login and logout functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@endToEndloginLogoutFunctionality"
    }
  ]
});
formatter.step({
  "name": "I log into the application in \"\u003cOSVersion\u003e\" for \"\u003cFunctionality\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "validate if splash screen is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I click login button",
  "keyword": "When "
});
formatter.step({
  "name": "validate if hide or show is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "validate if skip username or password error msg is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "validate if blank username and valid pwd \"\u003cpassword\u003e\" error msg is dispalyed",
  "keyword": "And "
});
formatter.step({
  "name": "validate if valid username \"\u003cusername\u003e\" and blank pwd error msg is dispalyed",
  "keyword": "And "
});
formatter.step({
  "name": "validate if copyright text and version is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "validate if user gets error msg when logged in with blank spaces in values with \"\u003cBlankspacesUsername\u003e\" and \"\u003cBlankspacesPassword\u003e\"",
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
  "name": "I click logout alone",
  "keyword": "Then "
});
formatter.step({
  "name": "validate logout yes or no is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "validate logout popup \"No\" functionality",
  "keyword": "And "
});
formatter.step({
  "name": "I click logout alone",
  "keyword": "Then "
});
formatter.step({
  "name": "validate logout popup \"Yes\" functionality",
  "keyword": "And "
});
formatter.step({
  "name": "validate if logout is done successfully",
  "keyword": "And "
});
formatter.step({
  "name": "Update execution status for \"\u003cFunctionality\u003e\" functionality",
  "keyword": "And "
});
formatter.step({
  "name": "I email the report",
  "keyword": "Then "
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
        "BlankspacesUsername",
        "BlankspacesPassword",
        "Functionality"
      ]
    },
    {
      "cells": [
        "android",
        "avenkatesan@cantaloupe.com",
        "abc",
        "a venkatesan@cantaloupe.com",
        "ab cde",
        "EndtoEndLoginLogoutFunctionality"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate End to End login and logout functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@driverAppLoginLogout"
    },
    {
      "name": "@endToEndloginLogoutFunctionality"
    }
  ]
});
formatter.step({
  "name": "I log into the application in \"android\" for \"EndtoEndLoginLogoutFunctionality\"",
  "keyword": "Given "
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
  "name": "validate if splash screen is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_splash_screen_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "When "
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
  "name": "validate if hide or show is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_hide_show_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate if skip username or password error msg is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_skip_username_pwd_error_msg_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate if blank username and valid pwd \"abc\" error msg is dispalyed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_blank_username_valid_pwd_error_msg_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate if valid username \"avenkatesan@cantaloupe.com\" and blank pwd error msg is dispalyed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_valid_username_blank_pwd_error_msg_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate if copyright text and version is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_copyright_text_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate if user gets error msg when logged in with blank spaces in values with \"a venkatesan@cantaloupe.com\" and \"ab cde\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_error_msg_logged_blank_Spaces_values_displayed(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"avenkatesan@cantaloupe.com\" and \"abc\"",
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
  "name": "I click logout alone",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_click_logout_alone()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate logout yes or no is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_logout_yes_no_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate logout popup \"No\" functionality",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_logout_pop_functionality(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click logout alone",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_click_logout_alone()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate logout popup \"Yes\" functionality",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.validate_logout_pop_functionality(java.lang.String)"
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
  "name": "Update execution status for \"EndtoEndLoginLogoutFunctionality\" functionality",
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
formatter.step({
  "name": "I email the report",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginLogoutStepDef.i_email_the_report()"
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