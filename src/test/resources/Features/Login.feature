Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username and password
    And user clicks the login button
    Then user should see the homepage

    