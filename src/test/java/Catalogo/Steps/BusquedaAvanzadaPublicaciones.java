package Catalogo.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;

public class BusquedaAvanzadaPublicaciones extends BaseTest {
    protected Catalogo.Page.BusquedaAvanzadaPublicaciones AdvancedSearchPage = new Catalogo.Page.BusquedaAvanzadaPublicaciones(getDriver());

    @And("click en Titulo Publicacion  y escribo el producto {string}")
    public void clickEnTituloPublicacionYEscriboElProducto(String PublicationTitle) throws InterruptedException {
        Thread.sleep(1000);
        AdvancedSearchPage.writePublicationTitle(PublicationTitle);
    }

    @And("click en boton Publicaciones")
    public void clickEnBotonPublicaciones() throws InterruptedException {
        AdvancedSearchPage.clickBtnPosts();
    }

    @And("click en Id Publicacion  y escribo el producto {string}")
    public void clickEnIdPublicacionYEscriboElProducto(String IdPublicaciones) throws InterruptedException {
        Thread.sleep(1000);
        AdvancedSearchPage.writeIdPosts(IdPublicaciones);
    }
}
