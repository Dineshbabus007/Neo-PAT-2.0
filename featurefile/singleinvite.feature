Feature: Student single invite

  Scenario: Student single invited successful
    Given user login to the portal
    And User enter the email id and User enter the password
    When User clicks the submit button
    
    Given The user should go to the manage students page
    When The user should click the single invite button
    And User should select campus
    And User should select Admission year
    And User should select Pass out year
    And User should select Department
    And User should select Degree & Spec
    #And User should enter email ids
    #When Invite button is clicked
    #Then Single invite is successful
