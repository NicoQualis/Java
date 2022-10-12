package com.aleph.elements;

import org.openqa.selenium.By;

public class VisualizacionesGrillasVarias {

    //Grilla de Mensaje de Error
    public static  By messageError = By.xpath("//div[@class='dx-error-message']");

    //Columnas de grillas
    public static By lblColumnaGrilla = By.xpath("//div[@class='dx-datagrid-headers dx-datagrid-nowrap']//td");

    //Boton para desplegar el menu
    public By btnToggleMenu = By.xpath("//span[@id='toggle-menu']");

    //Boton de publicaciones en el menu
    public By nagivateToPostsMenu = By.xpath("//a[@href='/Productos/Publicaciones']");

    //Boton de ver publicaciones en el menu
    public By nagivateToObservationsMenu = By.xpath("//a[@href='/Productos/Observaciones']");

    //Boton de Cuenta
    public By nagivateToAccountMenu = By.xpath("//a[@href='/Admin/AdminCuentas']");

    //Scroll hasta Administrador
    public By scrollAdministrator = By.xpath("//a[@href='/Admin/AdminCuentas']");
}
