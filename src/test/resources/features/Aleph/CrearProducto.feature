Feature: Crear producto

  Rule: El usuario debe poder crear productos normales y kits

    #@Aleph
  Scenario Outline: Como usuario seller quiero crear un producto normal
    Given Me logueo utilizando "<user>" y "<password>"
    When cambio a la cuenta "<account>"
    And  Me dirijo a la pantalla de productos
    And Abro el popup de creacion de producto y creo el producto
    Then El producto se crea con exito

    Examples:
      | user              | password  | account |
      |admin@alephcrm.com | ABC54321  | 13512   |
