package com.aleph.elements;

import org.openqa.selenium.By;

public class BuscadorVtaCliente {

    //boton para desplegar el menu
    public static By btnToggleMenu = By.xpath("//span[@id='toggle-menu']");

    //scrool para que se visualice el titulo "Venta"
    public static By scroollSale = By.xpath("//span[contains(text(),'Ventas')]");

    // click en boton "cliente"
    public static By btnClient = By.xpath("//a[@href='/Cuentas/CuentasAsociadas']");

    //click en imput Id / Razón Social / Tipo Cuenta / Nombre Fantasía / País
    public static By imputBuscar = By.xpath("//*[@id='txtFiltroTextos']//input");;

    public static By FoundCUIT =  By.xpath("//*[@id='grdCuentasAsociadas']//tbody//tr[@aria-rowindex]");

    public static By emptySearch = By.xpath("//*[@id='grdCuentasAsociadas']//tbody//div[2]");
}
