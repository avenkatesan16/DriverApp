$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Operator.feature");
formatter.feature({
  "name": "Opertor flow of DriverApp",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@driverAppOperatorFlow"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Operator flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@operatorFlow"
    }
  ]
});
formatter.step({
  "name": "I log into the application in \"\u003cOSVersion\u003e\" for \"\u003cFunctionality\u003e\"",
  "keyword": "Given "
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
  "name": "I click on \"\u003cOperator\u003e\" operator",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on \"\u003cRoute\u003e\" route",
  "keyword": "And "
});
formatter.step({
  "name": "I click logout",
  "keyword": "Then "
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
        "Operator",
        "Route",
        "Functionality"
      ]
    },
    {
      "cells": [
        "android",
        "skaushik@cantaloupe.com",
        "Saurabh@123",
        "List items, All Star Services, List items",
        "List items, QuickPick, List items",
        "OperatorFlowFunctionality"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Operator flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@driverAppOperatorFlow"
    },
    {
      "name": "@operatorFlow"
    }
  ]
});
formatter.step({
  "name": "I log into the application in \"android\" for \"OperatorFlowFunctionality\"",
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
  "name": "I click on \"List items, All Star Services, List items\" operator",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.OperatorStepDef.i_click_on_operator(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"List items, QuickPick, List items\" route",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.OperatorStepDef.i_click_on_route(java.lang.String)"
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
  "name": "Update execution status for \"OperatorFlowFunctionality\" functionality",
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