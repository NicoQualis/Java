package com.aleph.elements;

import org.openqa.selenium.By;

public class BuscadorAdminCuentas {

    //boton para desplegar el menu
    public static By btnToggleMenu = By.xpath("//span[@id='toggle-menu']");

    //scrooll para que se visualice el titulo "Cuenta"
    public static By scroollAdministrator = By.xpath("//span[contains(text(),'Administrador')]");

    //click en boton "Cuenta"
    public static By btnAccount = By.xpath("//a[@href='/Admin/AdminCuentas']");

    //click en imput Id / Razón Social / Tipo Cuenta / Nombre Fantasía / País
    public static By imputBuscar = By.xpath("//*[@id='txtGenericSearch']//input");

    public static By FoundID = By.xpath("//*[@id='grdAdminCuentas']//tbody//tr[@aria-rowindex='1']");

    public static By emptySearch = By.xpath("//span[contains(text(),'Sin datos')]");
}
