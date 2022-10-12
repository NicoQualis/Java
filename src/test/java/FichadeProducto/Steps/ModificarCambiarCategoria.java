package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ModificarCambiarCategoria extends BaseTest {

    FichadeProducto.Page.ModificarCambiarCategoria changCategory = new FichadeProducto.Page.ModificarCambiarCategoria(driver);

    @And("Me dirigo sub division ORIGEN")
    public void meDirijoSubDivisionORIGEN() throws InterruptedException {
        changCategory.clickOrigin();
    }

    @And("Seleciono el titulo Propio")
    public void selecionoElTituloPropio() throws InterruptedException {
        changCategory.clickOwn();
        Thread.sleep(2000);
    }

    @And("Click en el producto en seleccionar y modificar categoria")
    public void clickEnElProductoEnSeleccionarYModificarCategoria() throws InterruptedException {
        changCategory.imputSelect();
    }

    @And("Click en Predictor de categorias")
    public void clickEnPredictorDeCategorias() throws InterruptedException {
        changCategory.clickCategoryPredictor();
    }

    @Then("Valido que la categoria se modifico con exito")
    public void validoQueLaCategoriaSeModificoConExito() {
        Assert.assertTrue(changCategory.getTextSuccessfullyModifiedCategory().contains("Categoría modificada con éxito"));
    }

    @And("Me dirigo a Predecir Categoria")
    public void meDirigoAPredecirCategoria() {
        changCategory.clickPredictCategory();
    }

    @And("Click en el producto Seleccionado Cambiar Categoria")
    public void clickEnElProductoSeleccionadoCambiarCategoria() throws InterruptedException {
        changCategory.clickProduct();
    }

    @And("click en el icono de Desplegar Filtros")
    public void clickEnElIconoDeDesplegarFiltros() {
        changCategory.clickDeployFilters();
    }

    @And("Buscar el producto {string}")
    public void buscarElProducto(String nombreProducto) throws InterruptedException {
        changCategory.writeNameProduct(nombreProducto);
    }
}
