package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ModificarCambiarTitulo extends BaseTest {

    FichadeProducto.Page.ModificarCambiarTitulo modifyTitle = new FichadeProducto.Page.ModificarCambiarTitulo(getDriver());


    @And("Modifico el titulo del precio {string}")
    public void modificoElTituloDelPrecio(String NewTitle) throws InterruptedException {
        modifyTitle.writeNewTitle(NewTitle);
        Thread.sleep(5000);
    }

    @And("Me dirigo al boton guardar")
    public void meDirigoAlBotonGuardar() throws InterruptedException {
        modifyTitle.clickBtnSave();
    }

    @And("Acepto el si en el cambio")
    public void aceptoElSiEnElCambio() throws InterruptedException {
        modifyTitle.clickYesModify();
    }

    @Then("Valido que se hizo el cambio")
    public void validoQueSeHizoElCambio() {
        Assert.assertTrue(modifyTitle.getTextSuccessfullyModifiedTitle().contains("Los Detalles del producto se guardaron con éxito"));
    }

    @And("Click en el producto Seleccionado ModifyTitle")
    public void clickEnElProductoSeleccionadoModifyTitle() throws InterruptedException {
        modifyTitle.clickProduct();
    }

    @And("Seleciono la subdivision nuevos")
    public void selecionoLaSubdivisionNuevos() throws InterruptedException {
        modifyTitle.clickSubNew();
    }
}