#PBI21972
Feature: Modificacion de campos en grilla de consulta de productos, cuenta Seller

  Rule: Desde una cuenta Seller, modificar los campos de grillas de productos y validar el cambio

  #@Aleph
  Scenario Outline: Modificar grilla de Stock del productos de una Cuenta Seller
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Selecciono el producto "<nombreProducto>"
    And   Presiono el boton para edicion del producto cuenta Seller
    And   Edito la grilla Stock de la Cta Seller "<CantStock>"
    Then  Valido que se actualiza el stock del producto de la Cta Seller "<CantStock>"
    And   Edito la grilla de M% del Producto "<Mporc>"
    Then  Valido que se actualice la grilla de M% "<Mporc>"
    And   desplazo la barra horizontal para visualizar las grillas
    And   Edito la grilla PVP Sinimpuesto "<PVPsinImpuesto>"
    Then  Valido que se actualice la grilla de PVP "<PVPsinImpuesto>"
    And   Edito la grilla PVP "<PVP>"
    Then  Valido que se actualice la grilla PVP "<PVP>"

    Examples:
      | user              | password      |  account    | nombreProducto        | CantStock | Mporc |PVPsinImpuesto | PVP   |
      |admin@alephcrm.com | ABC54321      |  123        | Amortiguadores Test   | 2000      | 250   |  10000        | 15000 |





