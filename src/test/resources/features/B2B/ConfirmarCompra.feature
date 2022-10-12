#PBI18069
Feature: B2B Confirmar Compare

  @B2BQA
  Scenario Outline:: Confirmar compra
    Given Me logueo utilizando "<user>" y "<password>"
    When cambio a la cuenta "<account>"
    And click en menu
    And Presiono sobre el nombre tienda
    And click en  seleccione una tienda "QAutomation"
    And Presiono sobre el producto seleccionado
    And Presiono sobre el boton del carro
    And Presiono sobre Finalizar Pedido
    And Selecciono "Entrega en mi domicilio" como modo de envio
    And Reviso los datos del carro
    And Presiono sobre el boton Confirmar Pedido
    Then Valido que se realizo la compra
    And Valido que los valores del Resumen son correctos

    Examples:
      |  user             | password | account |
      |admin@alephcrm.com | ABC54321 | 15174   |