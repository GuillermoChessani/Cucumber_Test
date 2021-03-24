Feature: feature to test valid login scenario

@smoke
  Scenario Outline: Check login is successful with valid credentials:
    Given user is on login page
    When user enter <username> and <password>
    And user clicks on login button
    Then user is navigated to the home page
    Examples: 
      | username | password |
      | Admin     | admin123  |

