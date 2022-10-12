#PBI21338
Feature: Cambiar precio de componente de kit

  @FichaProductoKit
  Scenario Outline: Change price Component Kit
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   click en boton Kits
    And   click en el producto de Cambiar precio de componenete de kit
    And   click en abrir los encabezados Componente de Kit
    And   me dirijo al sector de la ficha de producto Gestion de Precio
    Then  Valido que los numeros de precios sean correctos


    Examples:
      | user              | password   | account |
      |admin@alephcrm.com | ABC54321   | 13512   |