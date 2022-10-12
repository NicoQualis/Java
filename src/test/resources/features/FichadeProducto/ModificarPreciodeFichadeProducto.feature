#PBI20352

Feature: Modificar Precio de ficha de producto

  @FichadeProducto
  Scenario Outline:Modificar Precio de ficha de producto
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Busco el nombre producto "<nombreProducto>"
    And   Click en el nombre del producto BOMBA DE NAFTA abc
    And   Me dirijo a la ficha de Gestion de Precio
    When  Edito el "<Precio sin impuestos>"
    And   Click en Boton guardar GESTION de PRECIO
    Then  valido que se buscó se guardo el cambio del producto

    Examples:
      | user              | password   | account | nombreProducto     | Precio sin impuestos  |
      |admin@alephcrm.com | ABC54321   | 13512   | BOMBA DE NAFTA abc | 15000                 |
