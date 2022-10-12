package B2B.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.aleph.core.BaseTest.getDriver;

public class DetalleProducto {

    protected B2B.Page.DetalleProducto testb2bPage = new B2B.Page.DetalleProducto(getDriver());

    @When("Busco el producto B2B {string}")
    public void buscoProductoB2B(String nombreProducto) throws InterruptedException {
        testb2bPage.writeProductSearch(nombreProducto);
    }


    @And("Presiono sobre el nombre del product B2B")
    public void presionoSobreElNombreDelProductB2B() throws InterruptedException {
        testb2bPage.clickProduct();
    }

    @Then("Accedo al detalle del producto BB")
    public void accedoAlDetalleDelProductoBB() throws InterruptedException {
        testb2bPage.viewProducto();
    }

}
