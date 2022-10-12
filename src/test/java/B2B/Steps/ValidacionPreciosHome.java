package B2B.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.Then;

public class ValidacionPreciosHome extends BaseTest {
    B2B.Page.ValidacionPreciosHome homePrice = new B2B.Page.ValidacionPreciosHome(getDriver());


    @Then("me dirijo al producto para validad los precios")
    public void meDirijoAlProductoParaValidadLosPrecios() throws InterruptedException {
        homePrice.lblProduct();
        homePrice.lblProduct2();
        homePrice.lblProduct3();
    }
}
