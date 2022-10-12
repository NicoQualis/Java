package Catalogo.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class BusquedaAvanzadaCodigo extends BasePage {
    public BusquedaAvanzadaCodigo(WebDriver driver){super(driver);}
    protected Catalogo.Elements.BusquedaAvanzadaCodigo skuCodeElements = new Catalogo.Elements.BusquedaAvanzadaCodigo();


    public void writeSkuBrand(String skuMarca) throws InterruptedException {
        clickElement(skuCodeElements.clickSkuBrand);
        sendKeysToInput(skuMarca);
        Thread.sleep(2000);
    }

    public void clickBtnCode() {
        clickElement(skuCodeElements.btnCode);
    }

    public void writeSkuOwn(String skuPropio) throws InterruptedException {
        clickElement(skuCodeElements.clickSkuOwn);
        sendKeysToInput(skuPropio);
        Thread.sleep(2000);
    }

    public void writeVariant(String variante) throws InterruptedException {
        clickElement(skuCodeElements.clickVariant);
        sendKeysToInput(variante);
        Thread.sleep(2000);
    }
}
