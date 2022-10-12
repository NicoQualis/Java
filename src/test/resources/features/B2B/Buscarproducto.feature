#PBI19689
Feature: B2B Buscar producto

  Rule: El usuario debe poder buscar productos normales y kits

  @B2BQA
    Scenario Outline: Como usuario seller quiero buscar un producto normal B2B

      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   click en menu
      And   Presiono sobre el nombre tienda
      And   click en  seleccione una tienda "QAutomation"
      When  Busco el producto B2B "<nombreProducto>"
      Then  valido que se buscó correctamente el producto B2B

      Examples:
        | user              | account | password    |  nombreProducto |
        |admin@alephcrm.com | 15174   |ABC54321     |  Amortiguador   |
        |admin@alephcrm.com | 15174   |ABC54321     |  asd            |
