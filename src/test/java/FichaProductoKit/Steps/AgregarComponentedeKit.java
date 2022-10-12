package FichaProductoKit.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static FichaProductoKit.Elements.AgregarComponentedeKit.CantProductKit;

public class AgregarComponentedeKit extends BaseTest {

    FichaProductoKit.Page.AgregarComponentedeKit AddComponentKit = new FichaProductoKit.Page.AgregarComponentedeKit(getDriver());
    int cantProduct;


    @And("click en boton Kits")
    public void clickEnBotonKits() {
        AddComponentKit.clickBtnKits();
    }

    @And("click en el producto indicado para Agregar componente de Kits")
    public void clickEnElProductoIndicadoParaAgregarComponenteDeKits() throws InterruptedException {
        AddComponentKit.clickBtnProduct();
    }

    @And("me dirijo al sector de la ficha de producto Componente kit")
    public void meDirijoAlSectorDeLaFichaDeProductoComponenteKit() throws InterruptedException {
        AddComponentKit.clickComponenteKit();
    }

    @And("selecciono productos para agregar a los Componente kit {string}")
    public void seleccionoProductosParaAgregarALosComponenteKit(String nombreProducto) throws InterruptedException {
        AddComponentKit.writeProducto(nombreProducto);
    }

    @And("click en boton Agregar")
    public void clickEnBotonAgregar() {
        AddComponentKit.clickBtnAdd();
    }

    @Then("valido que se agrego el producto al kit")
    public void validoQueSeAgregoElProductoAlKit() {
        int newCantProduct = AddComponentKit.FindElements(CantProductKit).size();
        cantProduct++;
        System.out.println("Se encontraron: " + newCantProduct + " producto");
        Assert.assertTrue((cantProduct) == newCantProduct);
    }
}
