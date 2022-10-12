#PBI 20462

Feature: Cambiar titulo

  #@FichadeProducto Corre bien, pero rompe porque hay que acomodar nuevamente el name
  Scenario Outline: modify Title
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Buscar el producto "<nombreProducto>"
    And   Click en el producto Seleccionado ModifyTitle
    And   Modifico el titulo del precio "<New Title>"
    And   Me dirigo al boton guardar
    And   Acepto el si en el cambio
    Then  Valido que se hizo el cambio


    Examples:
      | user              | password   | account   |nombreProducto |New Title           |
      |admin@alephcrm.com | ABC54321   |  13512    | Edlp          |Amortiguadores Test |