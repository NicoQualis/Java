#PBI21560
Feature: Validacion de precios en la Home

  @B2BQA
  Scenario Outline: Validacion de precios en la Home
    Given  Me logueo utilizando "<user>" y "<password>"
    When   cambio a la cuenta "<account>"
    And    click en menu
    And    Presiono sobre el nombre tienda
    And    click en  seleccione una tienda "QAutomation"
    Then   me dirijo al producto para validad los precios

    Examples:
      | user              | password | account  |
      |admin@alephcrm.com | ABC54321 |  123     |