# dinesh bro
@bulk
Feature: Student bulk invite

  Scenario: Student bulk invite successful
    Given Admin login to the site
    Given User should go to the manage students page
    When User click the dropdown icon
    When User should click the Bulk invite button
    When Click the Upload icon
    Then Save the uploaded file
    Then Click the bulk invite button.
