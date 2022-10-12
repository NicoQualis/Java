package Catalogo.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class BusquedaAvanzadaVarios extends BaseTest {
    protected Catalogo.Page.BusquedaAvanzadaVarios AdvancedSearchesDescription = new Catalogo.Page.BusquedaAvanzadaVarios(getDriver());
    protected Catalogo.Elements.BusquedaAvanzadaVarios AdvancedSearchesDescriptionElements = new Catalogo.Elements.BusquedaAvanzadaVarios();


    @And("click en Busqueda Avanzadas")
    public void andClickEnBusquedaAvanzadas() throws InterruptedException {
        Thread.sleep(3000);
        AdvancedSearchesDescription.clickBtnAdvancedSearches();
    }

    @And("click en descripcion y escribo el producto {string}")
    public void clickEnDescripcionYEscriboElProducto(String Description) throws InterruptedException {
        Thread.sleep(1000);
        AdvancedSearchesDescription.writeDescription(Description);
    }

    @And("click en boton Buscar")
    public void clickEnBotonBuscar() {
        AdvancedSearchesDescription.clickBtnSearch();
    }

    @Then("valido que se busco correctamente el producto")
    public void validoQueSeBuscoCorrectamenteElProducto() throws InterruptedException {
        List listProducts = AdvancedSearchesDescription.FindElements(AdvancedSearchesDescriptionElements.ProductVisibility);
        if (listProducts != null){
            Assert.assertTrue(listProducts != null, "Se encontraron: " + listProducts.size() + " productos");
            System.out.println();
        } else {
            String message = AdvancedSearchesDescription.waitExitElement(AdvancedSearchesDescriptionElements.emptySerch).getText();
            Assert.assertEquals(message, "Sin datos");
        }
        Thread.sleep(2000);
    }

    @And("click en Titulo y escribo el producto {string}")
    public void clickEnTituloYEscriboElProducto(String Title) throws InterruptedException {
        Thread.sleep(1000);
        AdvancedSearchesDescription.writeTitle(Title);

    }
}
