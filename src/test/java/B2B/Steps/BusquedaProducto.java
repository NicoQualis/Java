package B2B.Steps;

import B2B.Page.BuscarProducto;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

import static com.aleph.core.BaseTest.getDriver;

public class BusquedaProducto {

    BuscarProducto buscarB2B = new BuscarProducto(getDriver());

    @Then("valido que se buscó correctamente el producto B2B")
    public void validar_Busqueda_ProductoB2B() throws InterruptedException {
        List listProducts = buscarB2B.FindElements(B2B.Elements.BusquedaProducto.cardElements);
        if (listProducts != null) {
            Assert.assertTrue(listProducts != null, "Se encontraron: " + listProducts.size() + " productos");
        } else {
            String message = buscarB2B.waitExitElement(B2B.Elements.BusquedaProducto.emptySerch).getText();
            Assert.assertEquals(message, "No hay resultados para esta búsqueda.");
        }
        Thread.sleep(2000);
    }

}


