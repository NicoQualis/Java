#PBI17948
Feature: B2B Detalle del producto

  @B2BQA
  Scenario Outline:: Mostrar los detalles del product
    Given Me logueo utilizando "<user>" y "<password>"
    When   cambio a la cuenta "<account>"
    And  click en menu
    And  Presiono sobre el nombre tienda
    And click en  seleccione una tienda "QAutomation"
    When Busco el producto B2B "<nombreProducto>"
    And Presiono sobre el nombre del product B2B
    Then Accedo al detalle del producto BB

    Examples:
      | user              | password | account  |nombreProducto  |
      |admin@alephcrm.com | ABC54321 | 15174    | Amortiguador   |

