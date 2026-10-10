Feature: Login functionality with DataTables

  Scenario: Login with multiple users
    Given User is on the login page
    When User enters username and password
      | username          | password |
      | user1@example.com | pass123  |
      | user2@example.com | pass456  |
    Then User should be redirected to the homepage