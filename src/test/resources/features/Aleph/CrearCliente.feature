#PBI23829
  Feature: AdminCuentas - Crear Cliente
    Rule: Crear un cliente

  @Aleph
  Scenario Outline: Creo un cliente, desde el AdminCuenta. de una cuenta Distribuidor
    Given Me logueo utilizando "<user>" y "<password>"
    When  click en menu
    And   click en boton Cuenta
    And   presiono click en Nueva Cuenta
    And   Selecciono el Tipo De Cuenta Distribuidor
    And   Selecciono el Pais "<pais>"
    And   Selecciono la Razon Social "<Razon Social>"
    And   Ingreso datos validos "<Clave Unica>"
    And   Ingreso los datos de Nombre De Fantasia "<Nombre de Fantasia>"
    And   Ingreso los datos del email "<email>"
    And   Ingreso los datos de la Calle "<Calle>"
    And   Ingreso los datos del Nro "<Nro>"
    And   Ingreso los datos del Codigo Postal "<CodPostal>"
    And   Ingreso los datos de la Localidad "<Localidad>"
    And   Selecciono la provincia correspondiente "<Provincia>"
    And   Presiono click sobre el boton Crear Cuenta
    And   Presiono click sobre el boton Confirmar
    Then  Valido que se creo correctamente la cuenta


    Examples:
      | user              | password      | pais      | Razon Social | Clave Unica  |Nombre de Fantasia |email                 | Calle           | Nro | CodPostal | Localidad | Provincia    |
      |admin@alephcrm.com | ABC54321      | Argentina | Aleph        |  11234567891 | QA test           |nicolasr@alephcrm.com | Av. Santamarina | 319 | 7000      | Tandil    | Buenos Aires |


  @Aleph
  Scenario Outline: Creo un cliente, desde el AdminCuenta. de una cuenta seller
    Given Me logueo utilizando "<user>" y "<password>"
    When  click en menu
    And   click en boton Cuenta
    And   presiono click en Nueva Cuenta
    And   Selecciono el Tipo De Cuenta Seller
    And   Selecciono el Pais "<pais>"
    And   Selecciono la Razon Social "<Razon Social>"
    And   Ingreso datos validos "<Clave Unica>"
    And   Ingreso los datos de Nombre De Fantasia "<Nombre de Fantasia>"
    And   Ingreso los datos del email "<email>"
    And   Ingreso los datos de la Calle "<Calle>"
    And   Ingreso los datos del Nro "<Nro>"
    And   Ingreso los datos del Codigo Postal "<CodPostal>"
    And   Ingreso los datos de la Localidad "<Localidad>"
    And   Selecciono la provincia correspondiente "<Provincia>"
    And   Presiono click sobre el boton Crear Cuenta
    And   Presiono click sobre el boton Confirmar
    Then  Valido que se creo correctamente la cuenta

      Examples:
        | user              | password      | pais      | Razon Social | Clave Unica  |Nombre de Fantasia |email                 | Calle           | Nro | CodPostal | Localidad | Provincia    |
        |admin@alephcrm.com | ABC54321      | Argentina | Aleph        |  11234567891 | QA test           |nicolasr@alephcrm.com | Av. Santamarina | 319 | 7000      | Tandil    | Buenos Aires |

  @Aleph
   Scenario Outline: Creo un cliente, desde el AdminCuenta. de una cuenta Catalogador
     Given Me logueo utilizando "<user>" y "<password>"
     When  click en menu
     And   click en boton Cuenta
     And   presiono click en Nueva Cuenta
     And   Selecciono el Tipo De Cuenta Catalogador
     And   Selecciono el Pais "<pais>"
     And   Selecciono la Razon Social "<Razon Social>"
     And   Ingreso datos validos "<Clave Unica>"
     And   Ingreso los datos de Nombre De Fantasia "<Nombre de Fantasia>"
     And   Ingreso los datos del email "<email>"
     And   Ingreso los datos de la Calle "<Calle>"
     And   Ingreso los datos del Nro "<Nro>"
     And   Ingreso los datos del Codigo Postal "<CodPostal>"
     And   Ingreso los datos de la Localidad "<Localidad>"
     And   Selecciono la provincia correspondiente "<Provincia>"
     And   Presiono click sobre el boton Crear Cuenta
     And   Presiono click sobre el boton Confirmar
     Then  Valido que se creo correctamente la cuenta

      Examples:
        | user              | password      | pais      | Razon Social | Clave Unica  |Nombre de Fantasia |email                 | Calle           | Nro | CodPostal | Localidad | Provincia    |
        |admin@alephcrm.com | ABC54321      | Argentina | Aleph        |  11234567891 | QA test           |nicolasr@alephcrm.com | Av. Santamarina | 319 | 7000      | Tandil    | Buenos Aires |