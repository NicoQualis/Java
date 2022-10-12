package com.aleph.elements;

import com.aleph.core.BasePage;
import org.openqa.selenium.By;

public class VerificaciondeIconoElements {

    // icono "Naranja" de que NoInformada
    public static By iconNotReported = By.xpath("//a[contains(text(),'Delphi BCD00101 BOMBA DE NAFTA abc')]//ancestor::tr//img[contains(@src,'NoInformada')]");

    //click en menu>>Publicaciones
    public By btnPublicationsMenu = By.xpath("//*[@id='menuitem1']/li[2]/a");

    //click en menu
    public By btnMenu = By.xpath("//*[@id='btnRightMenu']");
}
