#PBI23436
  Feature: Catalogo - Buscar - Búsquedas avanzadas - Publicaciones.
    Rule:  valido que los Buscadores obtengan los productos correcto

  @Catalogo
  Scenario Outline: Buscar un producto, por el busquedas avanzadas. Titulo Publicacion
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en boton Publicaciones
    And   click en Titulo Publicacion  y escribo el producto "<PublicationTitle>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto

    Examples:
      | user              | password      |account  | PublicationTitle |
      |admin@alephcrm.com | ABC54321      |13512    | Aleph            |
      |admin@alephcrm.com | ABC54321      |13512    | aaas             |


  @Catalogo
  Scenario Outline: Buscar un producto, por el busquedas avanzadas. Id publicaciones
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   click en Busqueda Avanzadas
    And   click en boton Publicaciones
    And   click en Id Publicacion  y escribo el producto "<IdPublicaciones>"
    And   click en boton Buscar
    Then  valido que se busco correctamente el producto

    Examples:
      | user              | password      |account  | IdPublicaciones |
      |admin@alephcrm.com | ABC54321      |13512    | MLA1150724737   |
      |admin@alephcrm.com | ABC54321      |13512    | aaas            |