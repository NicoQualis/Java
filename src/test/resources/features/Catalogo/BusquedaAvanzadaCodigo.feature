#PBI23433
  Feature: Catalogo - Buscar - Búsquedas avanzadas - Códigos.
    Rule:  valido que los Buscadores obtengan los productos correcto

  @Catalogo
  Scenario Outline: Buscar un producto, por el busquedas avanzadas. Sku marca
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en boton Codigos
    And   click en sku marca y escribo el producto "<skuMarca>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto

    Examples:
      | user              | password      |account  | skuMarca|
      |admin@alephcrm.com | ABC54321      |13512    | 1052    |
      |admin@alephcrm.com | ABC54321      |13512    | 0000    |


  @Catalogo
   Scenario Outline: Buscar un producto, por el busquedas avanzadas. Sku Propio
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en boton Codigos
    And   click en sku propio y escribo el producto "<skuPropio>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto

        Examples:
          | user              | password      |account  | skuPropio|
          |admin@alephcrm.com | ABC54321      |13512    | 1052     |
          |admin@alephcrm.com | ABC54321      |13512    | 0000     |


  @Catalogo
    Scenario Outline: Buscar un producto, por el busquedas avanzadas. Variable
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en boton Codigos
    And   click en variante y escribo el producto "<Variante>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto

     Examples:
       | user              | password      |account  | Variante|
       |admin@alephcrm.com | ABC54321      |13512    | A-RED   |
       |admin@alephcrm.com | ABC54321      |13512    | aaaa    |


