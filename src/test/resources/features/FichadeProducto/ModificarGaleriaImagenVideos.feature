#PBI 20353

Feature: Modificar Galeria Imagen y Videos

  @FichadeProducto
  Scenario Outline:Modificar galeria de imagen y videos
    Given Me logueo utilizando "<user>" y "<password>"
    When  cambio a la cuenta "<account>"
    And   Me dirijo a la pantalla de productos
    And   Buscar el producto "<nombreProducto>"
    And   Click en el producto indicado Modificar Galeria Imagen y Videos
    And   Click en Boton Galeria de Imagen y Video
    And   Click en Agregar una imagen
    Then  Validar que se subio la imagen
    And   Click en Boton Borrar

    Examples:
      | user              | password   | account |   nombreProducto       |
      |admin@alephcrm.com | ABC54321   | 13512   |Amortiguador test Galery|