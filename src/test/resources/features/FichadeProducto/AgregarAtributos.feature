#PBI 20464
Feature: Agregar Atributos

  @FichadeProducto
  Scenario Outline: Add Attributes
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   Click en el producto indicado de agregar Atributos
    And   Click en Boton Atributos
    Then  Valido que los atributos faltantes
    And   Click en Boton Acciones de Atributos
    And   Click en Boton Agregar Atributos Faltantes
    And   Agregar atributos a un producto
    And   Click Guardar Cambio
    And   Acepto a Guardar Atributos
    And   click en boton OK
    Then  Valido que guardaron con exito
    And   Descartar Personalizaciones de atributos

    Examples:
      | user              | password   | account  |
      |admin@alephcrm.com | ABC54321   | 15138    |