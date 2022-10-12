package com.aleph.elements;

import org.openqa.selenium.By;

public class CUITNIT {

    // click en cuenta (dentro del menu, en el sector de ADMINISTRADOR)
    public static By btnCta = By.xpath("//*[@id='menuitem3']/li[3]");

    // click en Nueva Cuenta
    public static By btnNewAccount = By.xpath("//*[@id='btnNuevaCuenta']//span[contains(text(),'Nueva cuenta')]");

    // scroll hasta administrador para que muestre Cuenta
    public static By btnAdm = By.xpath("//li[@class='menu-items']//span[contains(text(),'Administrador')]");

    // id de Distribuidor
    public static By imputDistribuidor = By.xpath("//div[contains(text(),'Distribuidor')]");

    // Imput para seleccionar los paises
    public static By imputCountry = By.xpath("//*[@id='cboPais']");

    // Imput para seleccionar el tipo de Cuenta:
    public By imputaccounytype = By.xpath("//*[@id='cboTipoCuenta']/div[1]/div/div[2]");

    //variable para ir cambiando los paises
    public static By imputArg(String pais){
        By inputPais = By.xpath("//div[contains(text(),'" + pais + "')]");
        return inputPais;
    }

    // Mensaje de valor invalidos
    public static By lblInvalidValue = By.xpath("//div[contains(text(),'Valor inválido')]");

    public static By imputCUIT = By.xpath("//*[@id='CIF']");

    public static By clickClaveUnica = By.xpath("//*[@id='CIF']");

    public static Object writeClaveUnica = By.xpath("//*[@id='CIF']");
}

