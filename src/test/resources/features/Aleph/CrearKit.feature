#PBI 20461

Feature: Crear Kit

  #@Aleph
  Scenario Outline: Crear Kit
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Abro el popup de creacion de producto y creo el kit
    Then  El kit se crea con exito

    Examples:
      | user              | password  | account |
      |admin@alephcrm.com | ABC54321  | 13512   |