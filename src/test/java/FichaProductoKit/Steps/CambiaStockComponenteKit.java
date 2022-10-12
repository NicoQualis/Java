package FichaProductoKit.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CambiaStockComponenteKit extends BaseTest {

    FichaProductoKit.Page.CambiaStockComponenteKit changeStockKit = new FichaProductoKit.Page.CambiaStockComponenteKit(getDriver());

    @And("me dirijo al sector de la ficha de producto Gestion de Stock")
    public void meDirijoAlSectorDeLaFichaDeProductoGestionDeStock() throws InterruptedException {
        changeStockKit.StockManagement();
    }

    @Then("valido el valor stock Kit")
    public void validoElValorStockKit() {
        changeStockKit.CantStock();

    }
}
