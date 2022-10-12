package B2B.Page;

import com.aleph.core.BasePage;
import B2B.Elements.CarritoAgergarEliminarProducto;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class ConfirmarCompra<textFromElement> extends BasePage {

    public ConfirmarCompra(WebDriver driver) {
        super(driver);
    }

    protected B2B.Elements.ConfirmarCompra confirmarCompra18069Elements = new B2B.Elements.ConfirmarCompra();

    public void clickBtnMenu() {
        clickElement(B2B.Elements.ConfirmarCompra.btnMenu);}

    public void clickBtnShop() {
        scrollToElement(B2B.Elements.ConfirmarCompra.btnShop);
        clickElement(B2B.Elements.ConfirmarCompra.btnShop);
    }

    public void clickBtnQAutomation() {
        clickElement(B2B.Elements.ConfirmarCompra.btnQAutomation);
    }

    public void clickBtnProducto() throws InterruptedException {
        scrollToElement(B2B.Elements.ConfirmarCompra.scrollAllProducts);
        Thread.sleep(1000);
        clickElement(B2B.Elements.ConfirmarCompra.PrimerProducto);
        clickElement(B2B.Elements.ConfirmarCompra.PrimerProducto);
    }

    public void clickBtnProducto2() {
        clickElement(B2B.Elements.ConfirmarCompra.SegundoProducto);
    }

    public void ClickBtnCarro() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(B2B.Elements.ConfirmarCompra.ClickCarro);
    }

    public void clickFinalizarPedido() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(B2B.Elements.ConfirmarCompra.ClickFinalizar);
    }

    public void clickModoEnvio() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(B2B.Elements.ConfirmarCompra.ClickModoEnvio);
    }

    public void Validolosdatos() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Total", textFromElement(B2B.Elements.ConfirmarCompra.txtTotal));
        map.put("Parcial", textFromElement(B2B.Elements.ConfirmarCompra.txtParcial));
        map.put("Total Final", textFromElement(B2B.Elements.ConfirmarCompra.txtTotalFinal));
        System.out.println("Total= " + map.get("Total"));
        System.out.println("Parcial= " + map.get("Parcial"));
        System.out.println("Total Final=" + map.get("Total Final"));
    }

    public void clickConfirmarPedido() {
        scrollToElement(B2B.Elements.ConfirmarCompra.scrollTotal);
        clickElement(B2B.Elements.ConfirmarCompra.BtnConfirmarPedido);
    }

    public void Validoqueserealizolacompra() {
            String textDetailProduct = textFromElement(B2B.Elements.ConfirmarCompra.titleThankyouforyourpurchase);
            String valueExpected = ("¡Gracias por su compra!\nEl pedido ya está siendo procesado.");
            if (textDetailProduct.contentEquals(valueExpected)) {
                System.out.println("Valores del Resumen son Correctos");
            }
            Assert.assertEquals(textDetailProduct, valueExpected, "Se valida que se pudo ingresar al Detalle del producto");
    }

    public void ValoresdelResumensonCorrectos() throws InterruptedException {
        Thread.sleep(2000);
        scrollToElement(B2B.Elements.ConfirmarCompra.txtValidacionTotal);
        Map<String, String> map = new HashMap<String, String>();
        map.put("aTotal:", textFromElement(B2B.Elements.ConfirmarCompra.txtValidacionTotal));
        map.put("TotalFinal", textFromElement(B2B.Elements.ConfirmarCompra.txtValidacionTotalFinal));
        System.out.println("aTotal: " + map.get("aTotal:"));
        System.out.println("TotalFinal" + map.get("TotalFinal"));
    }
}
