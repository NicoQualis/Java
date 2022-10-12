Feature: Buscar producto

  Rule: El usuario debe poder buscar productos normales y kits

   @Aleph
    Scenario Outline: Como usuario seller quiero buscar un producto normal

      Given Me logueo utilizando "<user>" y "<password>"
      When  Me dirijo a la pantalla de productos
      And Busco el producto "<nombreProducto>"
      Then valido que se buscó correctamente

      Examples:
      | user              | password      | nombreProducto |
      |admin@alephcrm.com | ABC54321      | bobina         |
      |admin@alephcrm.com | ABC54321      | xyrns          |






