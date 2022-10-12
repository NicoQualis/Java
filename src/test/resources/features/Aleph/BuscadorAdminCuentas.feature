#PBI23417
Feature: Buscador en AdminCuentas, cuenta Distri 15138
  Rule: Validar que el buscador extraer valores correcto

 @Aleph
 Scenario Outline: Buscar en el AdminCuentas, que contenga valores validos
   Given Me logueo utilizando "<user>" y "<password>"
   When  cambio a la cuenta "<account>"
   And   Me dirijo a la pantalla de AdminCuentas
   And   click en buscar Id "<NumID>"
   Then  valido que se busco correctamente la cuenta

   Examples:
     | user              | password      |account  | NumID |
     |admin@alephcrm.com | ABC54321      |15138    | 15138 |
     |admin@alephcrm.com | ABC54321      |15138    | 88888 |