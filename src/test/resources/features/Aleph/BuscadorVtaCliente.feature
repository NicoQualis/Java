#PBI23198
Feature:  Buscador en Ventas - Clientes
  Rule: validar que el buscador extraer valores correcto

    #@Aleph este test tiene  un BUG
    Scenario Outline: Buscar en el VtaCliente, que contenga valores validos
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   me dirijo a la pantalla de VtaCliente
      And   click en el buscador "<CUIT>"
      Then  valido que se busco correctamente el cliente

      Examples:
        | user              | password      |account  | CUIT      |
        |admin@alephcrm.com | ABC54321      |15138    |98765432109|