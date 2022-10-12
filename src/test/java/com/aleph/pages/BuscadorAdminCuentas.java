package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class BuscadorAdminCuentas extends BasePage {
    public BuscadorAdminCuentas(WebDriver driver){
        super(driver);
    }
    protected com.aleph.elements.BuscadorAdminCuentas AdminAccountsElements = new com.aleph.elements.BuscadorAdminCuentas();

    public void navigateTOAccount() throws InterruptedException {
        clickElement(AdminAccountsElements.btnToggleMenu);
        Thread.sleep(1000);
        scrollToElement(AdminAccountsElements.scroollAdministrator);
        Thread.sleep(500);
        clickElement(AdminAccountsElements.btnAccount);
    }

    public void writeNumID(String numID) throws InterruptedException {
        Thread.sleep(1000);
        write(AdminAccountsElements.imputBuscar, numID);
        Thread.sleep(1000);
        pressEnter(AdminAccountsElements.imputBuscar);
    }
}
