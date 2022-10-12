#PBI 20842
Feature: CUIT/NIT Seleniunm
  Rule: Crear una nueva cta en selenium

  @Aleph
  Scenario Outline: Crear una nueva cta seller en selenium

    Given Me logueo utilizando "<user>" y "<password>"
    And   click en menu
    When  click en boton Cuenta
    And   presiono click en Nueva Cuenta
    And   Selecciono el Tipo De Cuenta Distribuidor
    And   Selecciono el Pais "<pais>"
    Then  Valido que el valor es invalido
    And   Ingreso datos validos "<Clave Unica>"

    Examples:
      | user              | password  | pais      | Clave Unica         |
      |admin@alephcrm.com | ABC54321  | Argentina |  11234567891        |
      |admin@alephcrm.com | ABC54321  | Colombia  |  1123456789         |
      |admin@alephcrm.com | ABC54321  | Brasil    |  12345678912345     |
      |admin@alephcrm.com | ABC54321  | Chile     |  112345678          |
      |admin@alephcrm.com | ABC54321  | Uruguay   |  112345678901       |
      |admin@alephcrm.com | ABC54321  | Peru      |  10123456789        |