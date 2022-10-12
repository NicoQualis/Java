#PBI 20299

Feature: Modificar Stock de Productos

  #@FichadeProducto
  Scenario Outline: Mostrar Stock del product
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Click en el producto indicado Modificar Stock de Producto
    And   Click en Boton  Gestion de Stock
    And   Modificar "<Stock>" que deseas
    And   Click en boton guardar Stock
    Then  valido que se buscó se guardo el cambio del producto

    Examples:
      | user              | password   | account | Stock |
      |admin@alephcrm.com | ABC54321   | 15138   |  40   |
