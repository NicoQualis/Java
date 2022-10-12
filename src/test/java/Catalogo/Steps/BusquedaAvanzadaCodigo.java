package Catalogo.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BusquedaAvanzadaCodigo extends BaseTest {
    protected Catalogo.Page.BusquedaAvanzadaCodigo skuCodePage = new Catalogo.Page.BusquedaAvanzadaCodigo(getDriver());

    @And("click en sku marca y escribo el producto {string}")
    public void clickEnSkuMarcaYEscriboElProducto(String skuMarca) throws InterruptedException {
        Thread.sleep(1000);
        skuCodePage.writeSkuBrand(skuMarca);
    }

    @And("click en boton Codigos")
    public void clickEnBotonCodigos() throws InterruptedException {
        Thread.sleep(1000);
        skuCodePage.clickBtnCode();
    }

    @And("click en sku propio y escribo el producto {string}")
    public void clickEnSkuPropioYEscriboElProducto(String skuPropio) throws InterruptedException {
        Thread.sleep(1000);
        skuCodePage.writeSkuOwn(skuPropio);
    }

    @And("click en variante y escribo el producto {string}")
    public void clickEnVarianteYEscriboElProducto(String Variante) throws InterruptedException {
        Thread.sleep(1000);
        skuCodePage.writeVariant(Variante);
    }
}
