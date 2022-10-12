#PBI21337
Feature: Cambiar Stock Componente Kit

  @FichaProductoKit
  Scenario Outline: Change Stock Component Kit
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   click en boton Kits
    And   click en el producto indicado para Agregar componente de Kits
    And   me dirijo al sector de la ficha de producto Gestion de Stock
    Then  valido el valor stock Kit

    Examples:
      | user              | password   | account |
      |admin@alephcrm.com | ABC54321   | 13512   |