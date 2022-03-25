@driverAppLoginLogout
Feature: Login Logout functionality of DriverApp
      
  @loginLogoutFunctionality
  Scenario Outline: Validate login and logout functionality
    Given I log into the application in "<OSVersion>" for "<Functionality>"
    And I validate login page objects
    Then I enter "<username>" and "<password>"
    And I click login button
    And I verify operator text in "<OSVersion>"
    Then I click logout
    And validate if logout is done successfully
    And Update execution status for "<Functionality>" functionality

    Examples: 
      | OSVersion | username | password | Functionality            |
      #| iOS       | skaushik@cantaloupe.com      | Saurabh@123   | LoginLogoutFunctionality |
      | android   | skaushik@cantaloupe.com      | Saurabh@123  | LoginLogoutFunctionality |
      
  @endToEndloginLogoutFunctionality
  Scenario Outline: Validate End to End login and logout functionality
    Given I log into the application in "<OSVersion>" for "<Functionality>"
    And validate if splash screen is displayed
		When I click login button
    And validate if hide or show is displayed
    And validate if skip username or password error msg is displayed
    And validate if blank username and valid pwd "<password>" error msg is dispalyed
    And validate if valid username "<username>" and blank pwd error msg is dispalyed
    And validate if copyright text and version is displayed
    And validate if user gets error msg when logged in with blank spaces in values with "<BlankspacesUsername>" and "<BlankspacesPassword>"
    Then I enter "<username>" and "<password>"
    And I click login button
    And I verify operator text in "<OSVersion>"
    Then I click logout alone
    And validate logout yes or no is displayed
    And validate logout popup "No" functionality
    Then I click logout alone
    And validate logout popup "Yes" functionality
    And validate if logout is done successfully
    And Update execution status for "<Functionality>" functionality

    Examples: 
      | OSVersion | username | password | BlankspacesUsername | BlankspacesPassword | Functionality |
      #| iOS       | skaushik@cantaloupe.com | Saurabh@123 | skaus hik@cantaloupe.com | Saur abh@123 | EndtoEndLoginLogoutFunctionality |
      | android   | skaushik@cantaloupe.com | Saurabh@123 | skaus hik@cantaloupe.com | Saur abh@123 | EndtoEndLoginLogoutFunctionality |
    