#PBI17949
Feature: B2B Login/Invitado

  @B2BQA
  Scenario Outline:  Login with valid credentials

    Given user is on login page B2B
    When enters "<email>" and "<password>"
    Then valido que se ingreso correctamente


    Examples:
      |email              | password|
      |admin@alephcrm.com | ABC54321|