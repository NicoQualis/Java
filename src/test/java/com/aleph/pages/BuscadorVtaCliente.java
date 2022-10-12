package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class BuscadorVtaCliente extends BasePage {
    public BuscadorVtaCliente(WebDriver driver) {super(driver);}
    protected com.aleph.elements.BuscadorVtaCliente VtaClientElements = new com.aleph.elements.BuscadorVtaCliente();

    public void navigateToClient() throws InterruptedException {
        clickElement(VtaClientElements.btnToggleMenu);
        Thread.sleep(1000);
        scrollToElement(VtaClientElements.scroollSale);
        Thread.sleep(1000);
        clickElement(VtaClientElements.btnClient);
    }

    public void writeNumCUIT(String cuit) throws InterruptedException {
        Thread.sleep(1000);
        write(VtaClientElements.imputBuscar, cuit);
        Thread.sleep(1000);
        pressEnter(VtaClientElements.imputBuscar);
    }
}
