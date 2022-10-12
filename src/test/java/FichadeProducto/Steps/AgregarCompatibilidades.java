package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class AgregarCompatibilidades extends BaseTest {

    FichadeProducto.Page.AgregarCompatibilidades Addcompatibilities = new FichadeProducto.Page.AgregarCompatibilidades(getDriver());


    @And("Click en Boton Variantes")
    public void clickEnBotonVariantes() {
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }
        Addcompatibilities.clickBtnVariants();
    }

    @And("Click en Boton Compatibilidades")
    public void clickEnBotonCompatibilidades() throws InterruptedException {
        Addcompatibilities.scrollToElement(FichadeProducto.Elements.AgregarCompatibilidades.BtnCompatibility);
        Thread.sleep(1000);
        Addcompatibilities.clickBtnCompatibility();
        if (Addcompatibilities.classCompatibility().contains("false"));
            Addcompatibilities.clickBtnCompatibility();
    }

    @And("Click en Boton Acciones")
    public void clickEnBotonAcciones() throws InterruptedException {
        Addcompatibilities.clickBtnActions();
    }

    @And("Click en Boton Agregar")
    public void clickEnBotonAgregar() throws InterruptedException {
        Addcompatibilities.clickBtnAdd();
    }

    @When("Selecciono los productos deseados")
    public void seleccionoLosProductosDeseados() throws InterruptedException {
        Addcompatibilities.clickProducts();
        Thread.sleep(1000);
        Addcompatibilities.clickProducts2();
        Thread.sleep(1000);
        Addcompatibilities.clickProducts3();
    }

    @And("Click en Boton Agregar en Compatibilidades")
    public void clickEnBotonAgregarEnCompatibilidades() {
        Addcompatibilities.clickBtnAddCompatibilities();
    }

    @And("Click en Boton Aceptar")
    public void clickEnBotonAceptar() throws InterruptedException {
        Addcompatibilities.clickBtnAccept();
    }

    @Then("Valido que se agregaron compatibilidades seleciconada")
    public void validoQueSeAgregaronCompatibilidadesSeleciconada() throws InterruptedException {
        Assert.assertTrue(Addcompatibilities.getTextTitleAddCompatibilities().contains("La aplicacion se agrego correctamente"));
        Addcompatibilities.clickBtnOk();
        Addcompatibilities.clickExit();
    }

    @And("Selecciono los productos deseados para eliminar")
    public void seleccionoLosProductosDeseadosParaEliminar() throws InterruptedException {
        Thread.sleep(1000);
        Addcompatibilities.clickProductsDelete();
        Thread.sleep(1000);
        Addcompatibilities.clickProductsDelete2();
        Thread.sleep(1000);
        Addcompatibilities.clickProductsDelete3();
    }


    @And("Click en Boton Eliminar")
    public void clickEnBotonEliminar() {
        Addcompatibilities.clickBtnDelete();
    }

    @Then("Valido que se eliminen los productos seleccionados")
    public void validoQueSeEliminenLosProductosSeleccionado() {
        String textoValidar = Addcompatibilities.getTextYouWillRemoveCompatibilities();
        System.out.println(textoValidar);
        Assert.assertTrue(textoValidar.contains("Usted eliminará"));
        Addcompatibilities.clickBtnDeleteAccept();
    }

    @And("Click en Boton Traer nuevos")
    public void clickEnBotonTraerNuevos() {
        Addcompatibilities.clickBtnBringNew();
    }

    @Then("Valido que se agrearan los siguientes compatibilidades")
    public void validoQueSeAgrearanLosSiguientesCompatibilidades() {
        String compatibilities = Addcompatibilities.getTextTheFollowingCompatibilitiesWillBeAdded();
        System.out.println(compatibilities);
        Assert.assertTrue(compatibilities.contains("Se agregarán las siguientes compatibilidades:"));
        Addcompatibilities.clickBtnYes();
    }

    @And("Click en Boton Descartar Personalizaciones")
    public void clickEnBotonDescartarPersonalizaciones() {
        Addcompatibilities.clickBtnDiscardCustomizations();
    }

    @Then("Valido que desea descartar sus personalizaciones de aplicaciones")
    public void validoQueDeseaDescartarSusPersonalizacionesDeAplicaciones() throws InterruptedException {
        String descartar = Addcompatibilities.getTextDiscardYourApplicationCustomizations();
        System.out.println(descartar);
        Assert.assertTrue(descartar.contains("Está seguro que desea descartar sus personalizaciones de aplicaciones?"));
        Thread.sleep(2000);
        Addcompatibilities.clickBtnYesDiscard();
    }

    @When("Busco el producto Editor masivo nuevo {string}")
    public void buscoElProductoBEditorMasivoNuevo(String nombreProducto) {
        Addcompatibilities.writeProductSelect(nombreProducto);
    }

    @And("Click en el producto indicado Agregar compatibilidades")
    public void clickEnElProductoIndicadoAgregarCompatibilidades() {
        Addcompatibilities.clickProductSelect();
    }
}
