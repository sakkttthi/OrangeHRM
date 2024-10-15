@tag
Feature: Enter and exit application
  User wants to login & logout of application

  Background: 
    Given User is in login page

  @login
  Scenario: Login to application
    Then user is on login screen
    Given enter username as "<username>"
    And enter password as "<password>"
    And click login
    Then user is navigated to dashboard screen
    Given click my profile
    And click logout
    Then user is navigated to login screen