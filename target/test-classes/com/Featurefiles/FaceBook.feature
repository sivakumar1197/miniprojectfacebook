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
Feature: FaceBook  Test

  @Smoketest
  Scenario: Login FaceBook
    Given User need to open the application
    When user enter the username(or)mailid in username(or)mailid field
    And user enter the password in password field
    #Then user click the login button

  @Sanitytest
  Scenario: Create new account
    When user click the create new  account button
    And user enter the firstname in firstname field
    And user enter the surname in surname field
    And user enter the username(or)mailid in username(or)mailid field
    And user enter the Newpassword in Newpassword field
    And user enter the DateOfBirth in DateOfBirth fields
    And user select the gender in gender field
    #Then user click the sign up button