#PBI 20465
Feature: Agregar compatibilidades

  #@FichadeProducto este test tiene un BUG
  Scenario Outline: Add compatibilities
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   Click en el producto indicado Agregar compatibilidades
    And   Click en Boton Compatibilidades
    And   Click en Boton Acciones
    And   Click en Boton Agregar
    When  Selecciono los productos deseados
    And   Click en Boton Agregar en Compatibilidades
    And   Click en Boton Aceptar
    Then  Valido que se agregaron compatibilidades seleciconada

    Examples:
      | user              | password   | account |
      |admin@alephcrm.com | ABC54321   | 15138   |

  #@FichadeProducto
  Scenario Outline: Delete Compatibilities
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   Click en el producto indicado Agregar compatibilidades
    And   Click en Boton Compatibilidades
    And   Selecciono los productos deseados para eliminar
    When  Click en Boton Acciones
    And   Click en Boton Eliminar
    Then  Valido que se eliminen los productos seleccionados

    Examples:
      | user              | password   | account |
      |admin@alephcrm.com | ABC54321   | 15138   |

  #@FichadeProducto
  Scenario Outline: Discard Customizations
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre la lista "Producto"
    And   Click en el producto indicado Agregar compatibilidades
    And   Click en Boton Compatibilidades
    When  Click en Boton Acciones
    And   Click en Boton Descartar Personalizaciones
    Then  Valido que desea descartar sus personalizaciones de aplicaciones

    Examples:
      | user              | password   | account |
      |admin@alephcrm.com | ABC54321   | 15138   |