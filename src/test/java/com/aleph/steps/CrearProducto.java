package com.aleph.steps;

import com.aleph.pages.LoginInvitado;
import com.aleph.pages.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.aleph.core.BaseTest.getDriver;

public class CrearProducto {

    protected LoginInvitado LoginPage = new LoginInvitado(getDriver());
    protected com.aleph.pages.CrearProducto ProductsPage = new com.aleph.pages.CrearProducto(getDriver());
    protected Home HomePage = new Home(getDriver());

    @Given("Me logueo utilizando {string} y {string}")
    public void meLogueoUtilizandoY(String username, String password){
        LoginPage.navigateToLogin();
        LoginPage. login(username,password);
    }

    @And("Me dirijo a la pantalla de productos")
    public void meDirijoALaPantallaDeProductos() {
        ProductsPage.navigateToProductsPage();
    }

    @When("cambio a la cuenta {string}")
    public void cambioALaCuenta(String arg0) {
        HomePage.changeAccount(arg0);
    }

    @And("Abro el popup de creacion de producto y creo el producto")
    public void abroElPopupDeCreacionDeProductoYCreoElProducto() throws InterruptedException {
        Thread.sleep(500);
        ProductsPage.openPopupCreateProduct();
        Thread.sleep(500);
        Assert.assertEquals(com.aleph.elements.CrearProducto.titleProduct,ProductsPage.textPopupTitlePopup());
        Thread.sleep(1000);
        ProductsPage.brandSelectPopup(com.aleph.elements.CrearProducto.brand);
        Thread.sleep(500);
        ProductsPage.scroollBar();
        ProductsPage.writeSkuPopup(com.aleph.elements.CrearProducto.sku);
        Thread.sleep(500);
        ProductsPage.writeTitlePopup(com.aleph.elements.CrearProducto.titleNewProduct);
        Thread.sleep(2000);
        ProductsPage.createProduct();
        Thread.sleep(500);
    }

    @Then("El producto se crea con exito")
    public void elProductoSeCreaConExito() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(ProductsPage.getTextCreateProductSuccess(), com.aleph.elements.CrearProducto.validationNewProduct);
    }
}
