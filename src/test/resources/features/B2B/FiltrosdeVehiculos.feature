#PBI19933
Feature: B2B Filtro de Vehiculo

  @B2BQA
 Scenario Outline: Busco el productos por los filtros
    Given Me logueo utilizando "<user>" y "<password>"
    When cambio a la cuenta "<account>"
    And  click en menu
    And  Presiono sobre el nombre tienda
    And click en  seleccione una tienda "QAutomation"
    And  selecciono la "<Marca>"
    And  selecciono el "<Modelo>"
    And  Selecciono la "<Version>"
    When Presiono Boton Buscar
    Then Que no exista el mensaje "No hay resultados para esta búsqueda."




   Examples:
     | user              | password | account  | Marca | Modelo   | Version                     |
     |admin@alephcrm.com | ABC54321 |  123     | FIAT  | CRONOS   | CRONOS DRIVE 1.3 GSE Bz 5P  |
