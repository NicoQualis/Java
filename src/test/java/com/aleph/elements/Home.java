package com.aleph.elements;

import org.openqa.selenium.By;

public class Home {

    public By txtMensajeVersion = By.xpath("//div[@class='navbar-menu']");
    public By getCuentasHeader = By.xpath("//a[@id='nombFantasia-user-navbar']//div[contains(@class,'menu-nomb-user')]");
    public By cuentasSearchHeader = By.xpath("//input[@id='cuentasSearch']");
    public By selectCuentaHeader = By.cssSelector("div[class='my-accounts'] div:nth-child(1)");
}
