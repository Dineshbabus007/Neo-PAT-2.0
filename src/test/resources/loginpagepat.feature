@regression
Feature: Login page feature to the pat application
Scenario: Login page scenario should be successful

    Given the user should login into to the application
    When User clicks on the login link
    And User enter the email id
    And User enter the password 
    When User clicks the Login button
    Then Login should happen successfully