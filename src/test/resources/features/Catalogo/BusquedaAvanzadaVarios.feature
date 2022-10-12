#PBI23432
Feature: Catalogo - Buscar - Búsquedas avanzadas - Varios.
  Rule: valido que los Buscadores obtengan los productos correcto


  @Catalogo
  Scenario Outline: Buscar un producto, por el busquedas avanzadas. Descripcion
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en descripcion y escribo el producto "<Description>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto

    Examples:
      | user              | password      |account  | Description  |
      |admin@alephcrm.com | ABC54321      |13512    | QA test      |
      |admin@alephcrm.com | ABC54321      |13512    | 511151       |


  @Catalogo
  Scenario Outline: Buscar un producto, por el busquedas avanzadas. Descripcion
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en Titulo y escribo el producto "<Title>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto


    Examples:
      | user              | password      |account  | Title  |
      |admin@alephcrm.com | ABC54321      |13512    | Aleph  |
      |admin@alephcrm.com | ABC54321      |13512    | 511151 |

