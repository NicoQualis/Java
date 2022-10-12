package B2B.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;


public class ConfirmarCompra extends BaseTest {

    B2B.Page.ConfirmarCompra confirmarCompra18069Page = new B2B.Page.ConfirmarCompra(getDriver()) ;


    @And("click en menu")
    public void click_en_menu () {
        confirmarCompra18069Page.clickBtnMenu();
    }

    @And("Presiono sobre el nombre tienda")
    public void presiono_Sobre_El_Nombre_Tienda() {
        confirmarCompra18069Page.clickBtnShop();
    }


    @And("click en  seleccione una tienda {string}")
    public void click_En_Seleccione_Una_Tienda(String arg0) {
        confirmarCompra18069Page.clickBtnQAutomation();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }


    @And("Presiono sobre el producto seleccionado")
    public void presiono_Sobre_El_Producto_Seleccionado() throws InterruptedException {
        Thread.sleep(2000);
        confirmarCompra18069Page.clickBtnProducto();
        Thread.sleep(2000);
        confirmarCompra18069Page.clickBtnProducto2();
    }

    @And("Presiono sobre el boton del carro")
    public void presiono_Sobre_El_Boton_Del_Carro() throws InterruptedException {
        confirmarCompra18069Page.ClickBtnCarro();

    }

    @And("Presiono sobre Finalizar Pedido")
    public void presiono_Sobre_Finalizar_Pedido() throws InterruptedException {
        confirmarCompra18069Page.clickFinalizarPedido();
    }

    @And("Selecciono {string} como modo de envio")
    public void selecciono_Como_Modo_De_Envio(String arg0) throws InterruptedException {
        confirmarCompra18069Page.clickModoEnvio();
    }

    @And("Reviso los datos del carro")
    public void reviso_Los_Datos_Del_Carro() throws InterruptedException {
        Thread.sleep(1000);
        confirmarCompra18069Page.Validolosdatos();
    }

    @And("Presiono sobre el boton Confirmar Pedido")
    public void presiono_Sobre_El_Boton_Confirmar_Pedido() throws InterruptedException {
        Thread.sleep(3000);
        confirmarCompra18069Page.clickConfirmarPedido();
    }

    @Then("Valido que se realizo la compra")
    public void valido_Que_Se_Realizo_La_Compra() throws InterruptedException {
        Thread.sleep(3000);
        confirmarCompra18069Page.Validoqueserealizolacompra();
    }

    @And("Valido que los valores del Resumen son correctos")
    public void valido_Que_Los_Valores_Del_Resumen_Son_Correctos() throws InterruptedException {
        Thread.sleep(3000);
        confirmarCompra18069Page.ValoresdelResumensonCorrectos();
    }
}


