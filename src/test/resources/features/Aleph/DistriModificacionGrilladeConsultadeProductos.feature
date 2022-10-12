#PBI21971
Feature: Modificacion de campos en grilla de consulta de productos, cuenta Distribuidor

  Rule: Desde una cuenta Distri, modificar los campos de grillas de productos y validar el cambio

      #@Aleph
      Scenario Outline: Modificar grilla de Stock del productos de una Cuenta Distri
        Given Me logueo utilizando "<user>" y "<password>"
        When  cambio a la cuenta "<account>"
        And   Me dirijo a la pantalla de productos
        And   Selecciono el producto "<nombreProducto>"
        And   Presiono el boton para edicion del producto
        And   Edito la grilla Stock "<CantStock>"
        Then  Valido que se actualiza el stock con "<CantStock>"
        And   Edito la grilla PrecioSinImpuesto "<PrecioSinImpuesto>"
        Then  Valido que se actualiza el precio sin impuestos "<PrecioSinImpuesto>"
        And   Edito la grilla PrecioConImpuesto "<PrecioConImpuesto>"
        Then  Valido que se actualiza el precio con impuestos "<PrecioConImpuesto>"
        And   Edito la grilla PVsugerido "<PVsugerido>"
        Then  Valido que se actualiza el PVsugerido "<PVsugerido>"
        And   Edito la grilla Visibilidad
        Then  Valido el estado de visibilidad del producto
        And   Edito la Grilla Stock Compra "<StockCompra>"
        Then  Valido que se actualiza el StockCompra "<StockCompra>"

        Examples:
          | user              | password |account| nombreProducto       | CantStock|PrecioSinImpuesto | PrecioConImpuesto | PVsugerido |StockCompra |
          |admin@alephcrm.com | ABC54321 | 15138 |qa aceite premium vip |  600     |  11000,00        |   12000,00        |  11000,00  | 10         |

    #@Aleph1
    Scenario Outline:  Modificar grilla de Stock Rojo B2B de un producto, de una cuenta Distri
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   Me dirijo a la pantalla de productos
      And   Selecciono el producto "<nombreProducto>"
      And   Presiono el boton para edicion del producto

      And   Edito la Grilla Stock Rojo "<StockRojo>"
      Then  Valido que se actualiza el StockRojo "<StockRojo>"

      Examples:
        | user              | password      |account      | nombreProducto     | StockRojo  |
        |admin@alephcrm.com | ABC54321      | 9007        |   Am019QA          |  11        |


    #@Aleph1
    Scenario Outline: Modificar grilla de Stock Amarillo B2B de un producto, de una cuenta Distri
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   Me dirijo a la pantalla de productos
      And   Selecciono el producto "<nombreProducto>"
      And   Presiono el boton para edicion del producto
      And   desplazo la barra horizontal para visualizar las grillas
      And   Edito la Grilla Stock Amarillo "<StockAmarillo>"
      Then  Valido que se actualiza el StockAmarillo "<StockAmarillo>"

      Examples:
        | user              | password      |account      | nombreProducto     | StockAmarillo  |
        |admin@alephcrm.com | ABC54321      | 9007        |   Am019QA          |  40            |

    #@Aleph1
    Scenario Outline: Modificar grilla de Cantidad min de Venta B2B de un producto, de una cuenta Distri
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   Me dirijo a la pantalla de productos
      And   Selecciono el producto "<nombreProducto>"
      And   Presiono el boton para edicion del producto
      And   desplazo la barra horizontal para visualizar las grillas
      And   Edito la Grilla Cantidad min de Venta "<CantMindeVenta>"
      Then  Valido que se actualiza Cantidad Min de Venta "<CantMindeVenta>"

      Examples:
        | user              | password      |account      | nombreProducto     |CantMindeVenta  |
        |admin@alephcrm.com | ABC54321      | 9007        |   Am019QA          |  2             |

    #@Aleph1
    Scenario Outline: Modificar grilla de Multiplicador de Venta B2B, de una cuenta Distri
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   Me dirijo a la pantalla de productos
      And   Selecciono el producto "<nombreProducto>"
      And   Presiono el boton para edicion del producto
      And   desplazo la barra horizontal para visualizar las grillas
      And   Edito la Multiplicador de Venta "<MultipdeVenta>"
      Then  Valido que se actaulice Multiplicador de Venta "<MultipdeVenta>"

      Examples:
        | user              | password      |account      | nombreProducto     |MultipdeVenta   |
        |admin@alephcrm.com | ABC54321      | 9007        |   Am019QA          | 1              |

    #@Aleph1
    Scenario Outline: Modificar grilla de Porcentaje Descuento Adicional B2B, de una cuenta Distri
      Given Me logueo utilizando "<user>" y "<password>"
      When  cambio a la cuenta "<account>"
      And   Me dirijo a la pantalla de productos
      And   Selecciono el producto "<nombreProducto>"
      And   Presiono el boton para edicion del producto
      And   desplazo la barra horizontal para visualizar las grillas
      And   Edito el Porcentaje Descuento Adicional "<PorcentajeDescAdic>"
      Then  Valido que se el Porcentaje Descuento Adicional "<PorcentajeDescAdic>"

      Examples:
        | user              | password      |account      | nombreProducto     |PorcentajeDescAdic   |
        |admin@alephcrm.com | ABC54321      | 9007        |   Am019QA          | 15                  |

