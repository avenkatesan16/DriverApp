@driverAppOperatorFlow
Feature: Opertor flow of DriverApp
      
  @operatorFlow
  Scenario Outline: Operator flow
    Given I log into the application in "<OSVersion>" for "<Functionality>"
    Then I enter "<username>" and "<password>"
    And I click login button
    And I verify operator text in "<OSVersion>"
    Then I click on "<Operator>" operator
    And I click on "<Route>" route
    Then I click logout
    And Update execution status for "<Functionality>" functionality

    Examples: 
      | OSVersion | username | password | Operator |  Route | Functionality            |
      #| iOS       | skaushik@cantaloupe.com      | Saurabh@123   | OperatorFlowFunctionality |
      | android   | skaushik@cantaloupe.com      | Saurabh@123  | List items, All Star Services, List items | List items, QuickPick, List items | OperatorFlowFunctionality |
