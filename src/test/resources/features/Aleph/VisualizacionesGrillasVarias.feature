Feature: Visualizacion de las grillas

  Rule: Verificar que las grillas se visualice, en caso que no la espera de un mensaje

    @Aleph
    Scenario Outline: Verificar que las grillas se visualice, en caso que no la espera de un mensaje
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    Then  valido que se carguen correctamente las columnas de las grillas

    Examples:
      | user              | password      |account      |
      |admin@alephcrm.com | ABC54321      | 13512       |
      |admin@alephcrm.com | ABC54321      | 15174       |
      |admin@alephcrm.com | ABC54321      | 15138       |
      |admin@alephcrm.com | ABC54321      | 15176       |
      |admin@alephcrm.com | ABC54321      | 15175       |
      |admin@alephcrm.com | ABC54321      |   123       |


    @Aleph
    Scenario Outline: Verificar que las grillas se visualice, en caso que no la espera de un mensaje
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   me dirijo a la pantalla de Publicaciones
      Then  valido que se carguen correctamente las columnas de las grillas

      Examples:
        | user              | password      |account      |
        |admin@alephcrm.com | ABC54321      | 13512       |
        |admin@alephcrm.com | ABC54321      | 15174       |
        |admin@alephcrm.com | ABC54321      | 15176       |
        |admin@alephcrm.com | ABC54321      |   123       |


    @Aleph
    Scenario Outline: Verificar que las grillas se visualice, en caso que no la espera de un mensaje
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   me dirijo a la pantalla de ver Observaciones
      Then  valido que se carguen correctamente las columnas de las grillas

      Examples:
        | user              | password      |account      |
        |admin@alephcrm.com | ABC54321      | 13512       |
        #|admin@alephcrm.com | ABC54321      | 9007        | Hay un BUG
        |admin@alephcrm.com | ABC54321      | 15174       |
        |admin@alephcrm.com | ABC54321      | 15138       |
        |admin@alephcrm.com | ABC54321      | 15176       |
        |admin@alephcrm.com | ABC54321      | 15175       |
        |admin@alephcrm.com | ABC54321      |   123       |

    @Aleph
    Scenario Outline: Verificar que las grillas se visualice, en caso que no la espera de un mensaje
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   me dirijo a la pantalla de Cuenta
      Then  valido que se carguen correctamente las columnas de las grillas

      Examples:
        | user              | password      |account      |
        |admin@alephcrm.com | ABC54321      | 13512       |
        |admin@alephcrm.com | ABC54321      | 15174       |
        |admin@alephcrm.com | ABC54321      | 15138       |
        |admin@alephcrm.com | ABC54321      | 15176       |
        |admin@alephcrm.com | ABC54321      | 15175       |
        |admin@alephcrm.com | ABC54321      |   123       |


    @Aleph
    Scenario Outline: Verificar que las grillas del Kits se visualice, en caso que no la espera de un mensaje
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   Me dirijo a la pantalla de productos
      And   click en boton Kits
      Then  valido que se carguen correctamente las columnas de las grillas

      Examples:
        | user              | password      |account      |
        |admin@alephcrm.com | ABC54321      | 13512       |
        |admin@alephcrm.com | ABC54321      | 9007        |
        |admin@alephcrm.com | ABC54321      | 15174       |
        |admin@alephcrm.com | ABC54321      | 15138       |
        |admin@alephcrm.com | ABC54321      | 15176       |
        |admin@alephcrm.com | ABC54321      | 15175       |
        |admin@alephcrm.com | ABC54321      |   123       |
