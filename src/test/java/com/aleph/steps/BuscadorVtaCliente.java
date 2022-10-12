package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class BuscadorVtaCliente extends BaseTest {
    protected com.aleph.pages.BuscadorVtaCliente VtaClientPage = new com.aleph.pages.BuscadorVtaCliente(getDriver());
    protected com.aleph.elements.BuscadorVtaCliente VtaClientElements = new com.aleph.elements.BuscadorVtaCliente();

    @And("me dirijo a la pantalla de VtaCliente")
    public void meDirijoALaPantallaDeVtaCliente() throws InterruptedException {
        VtaClientPage.navigateToClient();
    }

    @And("click en el buscador {string}")
    public void clickEnElBuscador(String CUIT) throws InterruptedException {
        VtaClientPage.writeNumCUIT(CUIT);
    }

    @Then("valido que se busco correctamente el cliente")
    public void validoQueSeBuscoCorrectamenteElCliente() throws InterruptedException {
        List listProducts = VtaClientPage.FindElements(VtaClientElements.FoundCUIT);
        if (listProducts != null){
            Assert.assertTrue(listProducts != null, "Se encontraron: " + listProducts.size() + " productos");
            System.out.println("Se encontraron: " + listProducts.size() + " productos");
        }
        else {
            String message = VtaClientPage.waitExitElement(VtaClientElements.emptySearch).getText();
            Assert.assertEquals(message,"Error");
        }
        Thread.sleep(3000);
    }
}
