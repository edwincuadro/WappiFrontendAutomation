Feature: Update profile
  As QAA
  I want to update the profile
  To validate its correct execution


  Scenario: Update profile with correct data
    Given user open the site
    When user input correct credentials
      | username | password |
      | edwin02  | 85697412 |
    And user input the information to update
      | name | lastName | birth      |
      | Jank | Sourth   | 24/05/1995 |
    Then user can see the confirmation message Tu información se guardó correctamente