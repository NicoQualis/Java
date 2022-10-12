package FichadeProducto.Steps;

import FichadeProducto.Page.ModificarStockdeProductos;
import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ModificarStockdeProducto extends BaseTest {

    ModificarStockdeProductos ModifyProductStock = new ModificarStockdeProductos(getDriver());

    @And("Presiono sobre la lista {string}")
    public void presionoSobreLaLista(String arg0) throws InterruptedException {
        ModifyProductStock.clickBtnProducto();
    }

    @And("Busco el nombre producto {string}")
    public void buscoElNombreProducto(String nombreProducto) {
        ModifyProductStock.writeBombaNafta(nombreProducto);
    }

    @And("Click en Boton  Gestion de Stock")
    public void clickEnBotonGestionDeStock() throws InterruptedException {
        ModifyProductStock.scrollToElement(FichadeProducto.Elements.ModificarStockdeProducto.BtnGestiondeStock);
        Thread.sleep(1000);
        ModifyProductStock.clickGestiondeStock();
        if (ModifyProductStock.classGestiondeStock().contains("false")){
            ModifyProductStock.clickGestiondeStock();
        }
    }

    @And("Modificar {string} que deseas")
    public void modificarQueDeseas(String valor) throws InterruptedException {
        ModifyProductStock.TxtCantidadMinStock(valor);
        Thread.sleep(2000);
    }

    @And("Click en boton guardar Stock")
    public void clickEnBotonGuardarStock() {
        ModifyProductStock.BtnGuardar();
    }

    @When("Busco el producto BOMBA DE NAFTA {string}")
    public void buscoElProductoBOMBADENAFTA(String nombreProducto) {
        ModifyProductStock.writeProductSearch(nombreProducto);
    }

    @And("Click en el producto indicado Modificar Stock de Producto")
    public void clickEnElProductoIndicadoModificarStockDeProducto() throws InterruptedException {
        ModifyProductStock.clickProduct();
    }
}

