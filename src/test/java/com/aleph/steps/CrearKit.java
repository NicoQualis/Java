package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CrearKit extends BaseTest {

    com.aleph.pages.CrearKit CrearNewKit = new com.aleph.pages.CrearKit(getDriver());

    @And("Abro el popup de creacion de producto y creo el kit")
    public void abroElPopupDeCreacionDeProductoYCreoElKit() throws InterruptedException {
        Thread.sleep(500);
        CrearNewKit.openCreateProduct();
        Thread.sleep(500);
        CrearNewKit.clickKit();
        Thread.sleep(3000);
        Assert.assertEquals(com.aleph.elements.CrearKit.titleProduct,CrearNewKit.textPopupTitlePopup());
        Thread.sleep(500);
        CrearNewKit.brandSelectKit(com.aleph.elements.CrearKit.imputBrand);
        Thread.sleep(500);
        CrearNewKit.writeSkuKit(com.aleph.elements.CrearKit.sku);
        Thread.sleep(500);
        CrearNewKit.writeTitleKit(com.aleph.elements.CrearKit.titleNewKit);
        Thread.sleep(2000);
        CrearNewKit.checkCreateKit();
    }

    @Then("El kit se crea con exito")
    public void elKitSeCreaConExito() throws InterruptedException {
        Assert.assertEquals(CrearNewKit.getTextCreateKitSuccess(), com.aleph.elements.CrearKit.validationNewProduct);
    }
}