package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class BuscadorAdminCuentas extends BaseTest {
    protected com.aleph.pages.BuscadorAdminCuentas AdminAccountsPage = new com.aleph.pages.BuscadorAdminCuentas(getDriver());
    protected com.aleph.elements.BuscadorAdminCuentas AdminAccountsElements = new com.aleph.elements.BuscadorAdminCuentas();

    @And("Me dirijo a la pantalla de AdminCuentas")
    public void meDirijoALaPantallaDeAdminCuenta() throws InterruptedException {
        AdminAccountsPage.navigateTOAccount();
    }

    @And("click en buscar Id {string}")
    public void clickEnBuscarId(String NumID) throws InterruptedException {
        AdminAccountsPage.writeNumID(NumID);
    }

    @Then("valido que se busco correctamente la cuenta")
    public void validoQueSeBuscoCorrectamenteLaCuenta() throws InterruptedException {
        List listProducts = AdminAccountsPage.FindElements(AdminAccountsElements.FoundID);
        if (listProducts != null) {
            Assert.assertTrue(listProducts != null, "Se encontraron: " + listProducts.size() + " productos");
            System.out.println("Se encontraron: " + listProducts.size() + " productos");
        }
        else {
            String message = AdminAccountsPage.waitExitElement(AdminAccountsElements.emptySearch).getText();
            Assert.assertEquals(message,"Sin datos");
        }
        Thread.sleep(5000);
    }
}
