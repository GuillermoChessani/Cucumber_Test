Feature: feature to test invalid login scenario

@smoke
  Scenario Outline: Check login is unsuccessful with invalid credentials:
    Given user is on login page
    When user enter <username> and <password>
    And user clicks on login button
    Then an invalid credentials message is displayed
    Examples: 
      | username | password |
      | Memo     | memo123  |
			| Admin     | admin132  |

