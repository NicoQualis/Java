#PBI 23910
  Feature: Compatibilidades - Verificación de icono - Este OK
    Rule: verificar que los iconos se muestren en OK

  @NewTest
  Scenario Outline: Validar que el icono este OK
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de publicaciones
    And   desplazo la barra horizontal para visualizar las grillas
    Then  Validar que los iconos se muestran correctamente

    Examples:
      | user              | password      |account  |
      |admin@alephcrm.com | ABC54321      |13512    |