#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: User Login
  User should be able to login into the application to access details
Background:
	Given User navigates to Login Page
  
	@login @valid @smoke
  Scenario Outline: Login with Valid Credentials
    When User enters valid username <username>
    And User enters valid password <password>
    And User Clicks on Login button
    Then User should login successfully
	  Examples:
		|username					|password				 |
		|standard_user1234|secret_sauce1234|
 
	@login @invalid @regression
  Scenario: Login with Invalid Credentials
    When User enters invalid username "standard_user1234"
    And User enters invalid password "secret_sauce1234"
    And User Clicks on Login button
    Then User should get propert error message

	@login @invalid @regression
  Scenario: Login with valid username and invalid password
    When User enters valid username "standard_user"
    And User enters invalid password "secret_sauce1234"
    And User Clicks on Login button
    Then User should get propert error message

  
  Scenario: Login with invalid username and valid password
    When User enters valid username "standard_user1234"
    And User enters invalid password "secret_sauce"
    And User Clicks on Login button
    Then User should get propert error message

  Scenario: Login without any credentials
    When User dont enter any credentials
    And User Clicks on Login button
    Then User should get propert error message


  