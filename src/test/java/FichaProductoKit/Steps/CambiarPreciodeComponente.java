package FichaProductoKit.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CambiarPreciodeComponente extends BaseTest {

    FichaProductoKit.Page.CambiarPreciodeComponente changeComponentPrice = new FichaProductoKit.Page.CambiarPreciodeComponente(getDriver());

    @And("click en el producto de Cambiar precio de componenete de kit")
    public void clickEnElProductoDeCambiarPrecioDeComponeneteDeKit() throws InterruptedException {
        changeComponentPrice.clickProduct();
    }

    @Then("Valido que los numeros de precios sean correctos")
    public void validoQueLosNumerosDePreciosSeanCorrectos() throws InterruptedException {
        changeComponentPrice.validatePrice();
    }

    @And("click en abrir los encabezados Componente de Kit")
    public void clickEnAbrirLosEncabezadosComponenteDeKit() throws InterruptedException {
        Thread.sleep(3000);
        changeComponentPrice.scrollToElement(FichaProductoKit.Elements.CambiarPreciodeComponente.lblKitcomponent);
        Thread.sleep(5000);
        changeComponentPrice.clickComponentKit();
        if (changeComponentPrice.classComponentKit().contains("false"));

    }

    @And("me dirijo al sector de la ficha de producto Gestion de Precio")
    public void meDirijoAlSectorDeLaFichaDeProductoGestionDePrecio() throws InterruptedException {
        Thread.sleep(3000);
        if(changeComponentPrice.classPriceManagement().contains("false"));
        changeComponentPrice.clickStockManagement();
    }
}
