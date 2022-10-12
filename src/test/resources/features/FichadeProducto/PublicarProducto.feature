#PBI20466
Feature: Publicar Producto

  #@FichadeProducto
  Scenario Outline: Post Product
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Buscar el producto "<nombreProducto>"
    And   click en el producto Publicar Producto
    And   Click en el encabezado Publicaciones
    Then  Valido que el producto se puede publicar
    And   Click en boton Mercado libre y publicar
    And   Confirmo la publicacion del producto

    Examples:
      | user              | password   | account  | nombreProducto |
      |admin@alephcrm.com | ABC54321   | 13512    |  Cafetera Test |

  #@FichadeProducto
  Scenario Outline:  Post Pause
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Buscar el producto "<nombreProducto>"
    And   click en el producto Publicar Producto
    And   Click en el encabezado Publicaciones
    Then  Valido que el producto se puede pausar
    And   Click en boton Mercado libre y Pausar
    And   Confirmo la publicacion del producto

    Examples:
      | user              | password   | account | nombreProducto |
      |admin@alephcrm.com | ABC54321   |  13512  |  Cafetera Test |

  #@FichadeProducto
  Scenario Outline:  Post Terminate
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Buscar el producto "<nombreProducto>"
    And   click en el producto Publicar Producto
    And   Click en el encabezado Publicaciones
    Then  Valido que el producto se en Pausado Manual
    And   Click en boton Mercado libre y Finalizar
    And   Confirmo la publicacion del producto

    Examples:
      | user              | password   | account  | nombreProducto |
      |admin@alephcrm.com | ABC54321   | 13512    |  Cafetera Test |