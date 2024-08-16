@tag
Feature: Enter and exit application
  User wants to login & logout of application

  Background: 
    Given User is in login page
  

  @smoke @login
  Scenario Outline: Login to application
    Then user is on login screen
    Given enter <username>
    And enter <password>
    And click login
    Then user is navigated to dasboard screen

    Examples: 
      | username | password |
      | Admin    | admin123 |

  @smoke @After(" @login")
  Scenario: Title of your scenario outline
    Given click my profile
    And click logout
    Then user is naviagated to login screen
