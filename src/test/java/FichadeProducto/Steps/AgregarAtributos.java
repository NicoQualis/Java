package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static FichadeProducto.Elements.AgregarAtributos.CantAttribute;


public class AgregarAtributos extends BaseTest {
int cantAttribute;
    FichadeProducto.Page.AgregarAtributos addAttributes = new FichadeProducto.Page.AgregarAtributos(getDriver());

    @And("Click en Boton Atributos")
    public void clickEnBotonAtributos() throws InterruptedException {
        addAttributes.clickBtnAttributes();
    }

    @Then("Valido que los atributos faltantes")
    public void validoQueLosAtributosFaltantes() {
        cantAttribute = addAttributes.FindElements(CantAttribute).size();
        System.out.println("Se encontraron: " + cantAttribute + " Atributos");
    }

    @And("Click en Boton Acciones de Atributos")
    public void clickEnBotonAccionesDeAtributos() throws InterruptedException {
        addAttributes.clickBtnActions();
    }

    @And("Click en Boton Agregar Atributos Faltantes")
    public void clickEnBotonAgregarAtributosFaltantes() throws InterruptedException {
        addAttributes.clickBtnAddAtrributes();
    }

    @And("Agregar atributos a un producto")
    public void agregarAtributosAUnProducto() throws InterruptedException {
        addAttributes.lblBrand();
        Assert.assertEquals(FichadeProducto.Elements.AgregarAtributos.titleAttribute,addAttributes.textEditAttributes());
        addAttributes.imputMaterial(FichadeProducto.Elements.AgregarAtributos.imputMaterial);
        addAttributes.imputOilFilterDiameter(FichadeProducto.Elements.AgregarAtributos.imputDiametrodelFiltrodeAceite);
        addAttributes.imputOilFilterThreadDiameter(FichadeProducto.Elements.AgregarAtributos.imputDiametrodelaRoscadelFiltrodeAceite);
        addAttributes.imputIncludesGasket(FichadeProducto.Elements.AgregarAtributos.imputMountingKit);
        addAttributes.imputOrigin(FichadeProducto.Elements.AgregarAtributos.imputOrigen);
    }

    @And("Click Guardar Cambio")
    public void clickGuardarCambio() throws InterruptedException {
        addAttributes.clickBtnSaveChange();
    }

    @And("Acepto a Guardar Atributos")
    public void aceptoAGuardarAtributos() throws InterruptedException {
        Thread.sleep(2000);
        String txtSaveAttributes = addAttributes.getTextSaveAttributes();
        System.out.println(txtSaveAttributes);
        Assert.assertTrue(txtSaveAttributes.contains("¿Desea continuar?"));
        addAttributes.clickBtnSaveAttributesAccept();
    }

    @Then("Valido que guardaron con exito")
    public void validoQueGuardaronConExito() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(addAttributes.getTextDataWasSavedSuccessfully().contains("Los datos se guardaron con exito!"));
        Thread.sleep(2000);
        String txtYourAttributesAreComplete = addAttributes.getTextYourAttributesAreComplete();
        System.out.println(txtYourAttributesAreComplete);
        Assert.assertTrue(txtYourAttributesAreComplete.contains("Excelente! Tus atributos están completos."));
    }

    @And("Descartar Personalizaciones de atributos")
    public void descartarPersonalizacionesDeAtributos() throws InterruptedException {
        Thread.sleep(2000);
        addAttributes.clickBtnDiscardCustomizations();
        String txtDiscardCustomizations = addAttributes.getTextDiscardCustomizations();
        System.out.println(txtDiscardCustomizations);
        Assert.assertTrue(txtDiscardCustomizations.contains("Está seguro que desea descartar sus personalizaciones de atributos?"));
        addAttributes.clickBtnDiscardCustomizationsYes();
        String txtDataWasSavedSuccessfully = addAttributes.getTextDataWasSavedSuccessfully();
        System.out.println(txtDataWasSavedSuccessfully);
        Assert.assertTrue(txtDataWasSavedSuccessfully.contains("Los datos se guardaron con exito!"));
    }

    @And("Click en el producto indicado de agregar Atributos")
    public void clickEnElProductoIndicadoDeAgregarAtributos() {
        addAttributes.clickProduct();
    }

    @And("click en boton OK")
    public void clickEnBotonOK() throws InterruptedException {
        addAttributes.clickBtnOK();
    }

    @When("Busco el producto que necesito para Agregar Atributos {string}")
    public void buscoElProductoQueNecesitoParaAgregarAtributos(String nombreProducto) {
        addAttributes.wirteProductSearch(nombreProducto);
    }
}

