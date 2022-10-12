package FichadeProducto.Page;

import com.aleph.core.BasePage;

import FichadeProducto.Elements.ModificarStockdeProducto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModificarStockdeProductos extends BasePage {

    public ModificarStockdeProductos(WebDriver driver) {super(driver);}

    public void clickBtnProducto() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(ModificarStockdeProducto.BtnProduct);
    }

    public void clickGestiondeStock() {
        realClickElement(ModificarStockdeProducto.StringBtnGestiondeStock);
    }

    public String classGestiondeStock() {
        return attributeFromElement(ModificarStockdeProducto.BtnGestiondeStock,"aria-expanded");
    }

    public void clickProduct() throws InterruptedException {
        clickElement(ModificarStockdeProducto.clickNameProduct);
    }

    public void TxtCantidadMinStock(String valor) {
        writeInvisibleInput(ModificarStockdeProducto.BtnDeleteCantStock, (By) ModificarStockdeProducto.writeCantMinStock,valor);
    }

    public void BtnGuardar() {
        scrollToElement(ModificarStockdeProducto.lblModoStock);
        clickElement(ModificarStockdeProducto.BtnGuardarStock);
    }

    public void writeProductSearch(String nombreProducto) {
        write(ModificarStockdeProducto.inputProductSearch,nombreProducto);
        clickElement(ModificarStockdeProducto.BtnBuscar);
    }

    public void writeBombaNafta(String nombreProducto) {
        write(ModificarStockdeProducto.inputProductSearch, nombreProducto);
        clickElement(ModificarStockdeProducto.btnbusqueda);
    }
}

