#PBI 20463

Feature: Cambiar Categoria

  @FichadeProducto
  Scenario Outline:Modificar el cambio de categoria
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Buscar el producto "<nombreProducto>"
    And   Click en el producto Seleccionado Cambiar Categoria
    And   Me dirigo a Predecir Categoria
    And   Click en el producto en seleccionar y modificar categoria
    And   Click en Predictor de categorias
    Then  Valido que la categoria se modifico con exito

    Examples:
      | user              | password   | account  | nombreProducto          |
      |admin@alephcrm.com | ABC54321   | 13512    | Amortiguador test prueba|