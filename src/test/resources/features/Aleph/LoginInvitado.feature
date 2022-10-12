Feature: Login

  @Aleph
  Scenario Outline:  Login with valid credentials

    Given user is on login page
    When enters <email> and <password>
    Then user is redirected to homepage

    Examples:
    |email             | password|
    |admin@alephcrm.com| ABC54321|

