@seed
Feature: Login Logout functionality
      
  @loginLogoutFunctionality
  Scenario Outline: Validate login and logout functionality
    When I log into the application in "<OSVersion>" for "<Functionality>"
    And I validate login page objects
    Then I enter "<username>" and "<password>"
    And I click login button
    And I verify operator text in "<OSVersion>"
    Then I click logout
    And validate if logout is done successfully
    And Update execution status for "<Functionality>" functionality
    #And Close the application
    #closing handled in Hooks

    Examples: 
      | OSVersion | username | password | Functionality            |
      #| iOS       | abc@abc.com      | abc   | LoginLogoutFunctionality |
      | android   | abc@abc.com      | abc  | LoginLogoutFunctionality |
      
  @endToEndloginLogoutFunctionality
  Scenario Outline: Validate End to End login and logout functionality
    Given I log into the application in "<OSVersion>" for "<Functionality>"
    #TC01
    And validate if splash screen is displayed
		When I click login button
		#TC02
    And validate if hide or show is displayed
    #TC03
    And validate if skip username or password error msg is displayed
    #TC04
    #And validate if valid username "<username>" and incorrect pwd "<password>" error msg is dispalyed
    #TC05
    And validate if blank username and valid pwd "<password>" error msg is dispalyed
    #TC06
    And validate if valid username "<username>" and blank pwd error msg is dispalyed
    #TC09
    And validate if copyright text and version is displayed
    #TC10
    And validate if user gets error msg when logged in with blank spaces in values with "<BlankspacesUsername>" and "<BlankspacesPassword>"
    #TC11
    Then I enter "<username>" and "<password>"
    And I click login button
    #TC13
    #And validate "<username>" is displayed in home screen
    #And Close the application alone
    #When I reopen the application in "<OSVersion>" for "<Functionality>"
    #And validate if username "<username>" is saved and pwd is empty
    #TC12
    #And I enter password "<password>" alone for auto filled in username
    #When I do swipe down to "Login" element
    #And I click login button
    And I verify operator text in "<OSVersion>"
    Then I click logout alone
    #TC14
    And validate logout yes or no is displayed
    #TC15
    #And validate if user not logged out when clicked outside pop up
    #TC16
    And validate logout popup "No" functionality
    #TC17
    Then I click logout alone
    And validate logout popup "Yes" functionality
    #TC18
    And validate if logout is done successfully
    And Update execution status for "<Functionality>" functionality
    #And Close the application

    Examples: 
      | OSVersion | username | password | BlankspacesUsername | BlankspacesPassword | Functionality |
      #| iOS       | avenkatesan@cantaloupe.com | abc | a venkatesan@cantaloupe.com | ab cde | EndtoEndLoginLogoutFunctionality |
      | android   | avenkatesan@cantaloupe.com | abc | a venkatesan@cantaloupe.com | ab cde | EndtoEndLoginLogoutFunctionality |
    