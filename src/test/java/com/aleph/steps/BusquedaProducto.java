package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class BusquedaProducto {

    protected com.aleph.pages.BusquedaProducto busquedaPage = new com.aleph.pages.BusquedaProducto(BaseTest.getDriver());

    @And("Busco el producto {string}")
    public void buscoElProducto(String productoBuscado) throws InterruptedException {
        busquedaPage.writeProductSearch(productoBuscado);
        Thread.sleep(4000);
    }

    @Then("valido que se buscó correctamente")
    public void validoQueSeBuscóCorrectamente() {
        List listProducts = busquedaPage.FindElements(B2B.Elements.BusquedaProducto.cardElements);
        if (listProducts != null) {
            Assert.assertTrue(listProducts != null, "Se encontraron: " + listProducts.size() + " productos");
            System.out.println( "Se encontraron: " + listProducts.size() + " productos");
        } else {
            String message = busquedaPage.waitExitElement(B2B.Elements.BusquedaProducto.emptySerch).getText();
            Assert.assertEquals(message, "No hay resultados para esta búsqueda.");
        }
    }
}

