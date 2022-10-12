package com.aleph.elements;

import org.openqa.selenium.By;

public class CrearCliente {

    //click en el imput "Razon Social"
    public static By imputSocialReason = By.xpath("//*[@id='RazonSocial']");

    // click en el imput "Nombre de Fantasia"
    public static By imputFancyName = By.xpath("//*[@id='txtFantasia']");

    // click en el imput "email"
    public static By imputEmail = By.xpath("//*[@id='EmailCuenta']");

    // click en el imput "calle"
    public static By imputRoad = By.xpath("//*[@id='Direccion_Calle']");

    // click en el imput "Nro"
    public static By imputNumber = By.xpath("//*[@id='Direccion_Nro']");

    // click en el imput "Codigo Postal"
    public static By imputZipCode = By.xpath("//*[@id='Direccion_CP']");

    // click en el imput "Localidad"
    public static By imputTown = By.xpath("//*[@id='Direccion_Localidad']");

    // imput para seleccionar las provincias
    public static By imputProvince = By.xpath("//*[@id='cboProvincias']");

    // variable para ir cambiando las localidades
    public static By imputBsAs(String localidad) {
        By imputProvince = By.xpath("//div[contains(text(),'" + localidad + "')]");
        return imputProvince;
    }

    // click en boton "Crear Cuenta"
    public static By btnCreateAccount = By.xpath("//*[@id='btnCrearCuenta']");

    // click en boton "Confirmar" del cartel: Confirmar Alta de Cuenta
    public static By btnConfirm = By.xpath("//*[@id='btnConfirmarCambio']//span[contains(text(),'Confirmar')]");

    // texto para validar
    public static By textTheAccountWasSavedWithSuccess = By.xpath("//span[contains(text(),' Se guardo la cuenta con Exito! ')]");

    // click en boton volver
    public static By btnReturn = By.xpath("//*[@aria-label='Volver']");

    // Imput para seleccionar el tipo de Cuenta:
    public static By imputaccounytype = By.xpath("//*[@id='cboTipoCuenta']/div[1]/div/div[2]");

    // id de Seller
    public static By imputSeller = By.xpath("//div[contains(text(),'Seller')]");

    // id de Catalogador
    public static By imputCatalogador = By.xpath("//div[contains(text(),'Catalogador')]");

}
