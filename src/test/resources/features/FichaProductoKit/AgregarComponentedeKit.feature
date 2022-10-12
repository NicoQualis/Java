#PBI22313
Feature: Agregar componente de Kit

  #@FichaProductoKit Corre bien, pero cuando corre el test la siguiente vez rompe, porque el componente ya esta agregado
  Scenario Outline: Add Component Kit
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   click en boton Kits
    And   click en el producto indicado para Agregar componente de Kits
    And   me dirijo al sector de la ficha de producto Componente kit
    And   selecciono productos para agregar a los Componente kit "<nombreProducto>"
    And   click en boton Agregar
    Then  valido que se agrego el producto al kit

    Examples:
      | user              | password   | account| nombreProducto               |
      |admin@alephcrm.com | ABC54321   | 13512  | 0000888 - Alephasda - bobina |
