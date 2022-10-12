package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PublicarProducto extends BaseTest {
    FichadeProducto.Page.PublicarProducto postProduct = new FichadeProducto.Page.PublicarProducto(driver);

    @And("Busco el nombre product Post {string}")
    public void buscoElNombreProductPost(String CodSKUMARCA) {
        postProduct.writeProductSearch(CodSKUMARCA);
    }
    

    @Then("Valido que el producto se puede publicar")
    public void validoQueElProductoSePuedePublicarYLoPublico() throws InterruptedException {
        Assert.assertEquals(postProduct.getTextReadyToPublish(), FichadeProducto.Elements.PublicarProducto.validationReadyToPublish);
        postProduct.checkProduct();
    }

    @And("Click en boton Mercado libre y publicar")
    public void clickEnBotonMercadoLibre() throws InterruptedException {
        postProduct.clickMercadoLibre();
        Thread.sleep(5000);
        postProduct.clickPost();
    }

    @And("Confirmo la publicacion del producto")
    public void confirmoLaPublicacionDelProducto() {
        System.out.println(FichadeProducto.Elements.PublicarProducto.validitionTheNumberOfPosts);
        postProduct.clickConfirm();
    }

    @Then("Valido que el producto se puede pausar")
    public void validoQueElProductoSePuedePausar() throws InterruptedException {
        Assert.assertEquals(postProduct.getTextPosted(), FichadeProducto.Elements.PublicarProducto.validationTextPosted);
        postProduct.checkProduct();
    }

    @And("Click en boton Mercado libre y Pausar")
    public void clickEnBotonMercadoLibreYPausar() {
        postProduct.clickMercadoLibre();
        postProduct.clickPause();
    }

    @And("Click en boton Mercado libre y Finalizar")
    public void clickEnBotonMercadoLibreYFinalizar() {
        postProduct.clickMercadoLibre();
        postProduct.clickToComplete();
    }

    @Then("Valido que el producto se en Pausado Manual")
    public void validoQueElProductoSeEnPausadoManual() throws InterruptedException {
        Assert.assertEquals(postProduct.getTextToComplete(), FichadeProducto.Elements.PublicarProducto.validationToComplete);
        postProduct.checkProduct();
    }

    @And("Click en el encabezado Publicaciones")
    public void clickEnElEncabezadoPublicaciones() throws InterruptedException {
        Thread.sleep(1000);
        postProduct.scrollToElement(FichadeProducto.Elements.PublicarProducto.btnPublicion);
    }

    @And("click en el producto Publicar Producto")
    public void clickEnElProductoPublicarProducto() throws InterruptedException {
        postProduct.clickProduct();
    }
}
