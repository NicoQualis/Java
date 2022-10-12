#PBI19887
Feature:B2B Carrito agregar/eliminar productos

  @B2BQA
  Scenario Outline: Valido los precios de los productos
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre el nombre tienda
    And   click en  seleccione una tienda "QAutomation"
    And   Selecciono los productos del carrito B2B "QAutomation"
    And   Click en el boton carrito "QAutomation"
    Then  Verificar que los precios sean los indicados


    Examples:
      | user              | password | account |
      |admin@alephcrm.com | ABC54321 | 15174   |

  @B2BQA
    #Recordar tener el carro vacío para el usuario utilizado
  Scenario Outline: Verificar la cantidad minima de compra completo
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Click en catalogo producto
    When  Busco el producto"<nombreProducto>"
    And   Click en boton busqueda
    And   Click en el producto
    And   Click en boton detalle
    And   Click en boton clasificacion
    When  Escribir "<cantidadMinima>" como valor de la cantidad minima de venta
    And   Click en boton guardar
    When  cambio a la cuenta "<account2>"
    And   click en menu
    And   Presiono sobre el nombre tienda
    And   click en  seleccione una tienda "QAutomation"
    And   Reviso que el carro esta vacio
    When  Busco el producto"<nombreProducto>"
    And   click en el producto
    Then  Valido que se compraron "<cantidadMinima>" minimo producto
    And   click en agregar
    And   Presiono sobre el boton del carro
    And   Presiono sobre Finalizar Pedido

    Examples:
      | user              | password | account | cantidadMinima | account2 |nombreProducto       |
      |admin@alephcrm.com | ABC54321 |  15138  | 6              | 123      |Amortiguador B2B12   |


  @B2BQA
  Scenario Outline: Agregar productos al carrito masivo
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre el nombre tienda
    And   click en  seleccione una tienda "QAutomation"
    And   click en Carrito de Compra
    And   click en Boton subir pedido
    When  busco el producto "<CodigoProducto>"
    And   click en el Boton Agregar


    Examples:
      | user              | password | account | CodigoProducto |
      |admin@alephcrm.com | ABC54321 | 123     |  sku320z5uc    |


  @B2BQA
  Scenario Outline: Boton Vaciar Carro
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   click en menu
    And   Presiono sobre el nombre tienda
    And   click en  seleccione una tienda "QAutomation"
    And   click en Carrito de Compra
    And   click en Boton subir pedido
    When  busco el producto "<CodigoProducto>"
    And   click en el Boton Agregar
    And   click en Boton Vaciar
    And   click en Boton Aceptar

    Examples:
      | user              | password | account | CodigoProducto |
      |admin@alephcrm.com | ABC54321 |  123    |  sku320z5uc    |
