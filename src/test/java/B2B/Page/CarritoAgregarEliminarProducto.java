package B2B.Page;

import com.aleph.core.BasePage;
import B2B.Elements.CarritoAgergarEliminarProducto;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;


public class CarritoAgregarEliminarProducto extends BasePage {

    public CarritoAgregarEliminarProducto(WebDriver driver) {
        super(driver);
    }

    public void ValidoslosPrecios() throws InterruptedException {
        Map<String, String> map = new HashMap<String, String>();
        map.put("PrecioProducto1", textFromElement(CarritoAgergarEliminarProducto.txtProducto1));
        map.put("PrecioProducto2", textFromElement(CarritoAgergarEliminarProducto.txtProducto2));
        map.put("PrecioProducto3", textFromElement(CarritoAgergarEliminarProducto.txtProducto3));
        System.out.println("PrecioProducto1= " + map.get("PrecioProducto1"));
        System.out.println("PrecioProducto2= " + map.get("PrecioProducto2"));
        System.out.println("PrecioProducto3= " + map.get("PrecioProducto3"));
    }


    public void clickBtncarritoQA() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(CarritoAgergarEliminarProducto.BtnTomassiCarritoB2B);
    }

    public void clickBtnTiendaAleph() {
        clickElement(CarritoAgergarEliminarProducto.BtnTiendaAleph);
    }

    public void ClickBtnId25617() {
        clickElement(CarritoAgergarEliminarProducto.ClickBtnId25617);
    }

    public void writeProductAleph(String writeProduct) {
        write(CarritoAgergarEliminarProducto.inputProductAleph, writeProduct);
    }

    public void ClickBtnAgregar() {
        clickElement(CarritoAgergarEliminarProducto.BtnAgregar);
    }

    public void Validoquesecompraronminimoproducto(String valor) {
        String valorCantMin = attributeFromElement(CarritoAgergarEliminarProducto.numberdelproduct, "value");
        System.out.println("valor obtebido: " + valorCantMin);
        System.out.println("valor esperado: " + valor);
        Assert.assertEquals(valorCantMin, valor);
    }

    public void ClickBtnProduct() {
        clickElement(CarritoAgergarEliminarProducto.ClickBtnProduct);
    }

    public void ClickBtnBusqueda() {
        clickElement(CarritoAgergarEliminarProducto.BtnBusqueda);
    }

    public void ClickProductTest() {
        clickElement(CarritoAgergarEliminarProducto.BtnProductTEST);
    }

    public void clickBtnClasificacion() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(CarritoAgergarEliminarProducto.BtnClasificacion);
    }

    public void TxtCantidadMinimaVtaDeseas(String valor) throws InterruptedException {
        Thread.sleep(2000);
        writeInvisibleInput(CarritoAgergarEliminarProducto.btnDeleteCantMin, CarritoAgergarEliminarProducto.writecantidadminimavtadeseas, valor);
    }

    public void ClickBtnGuardar() {
        scrollToElement(CarritoAgergarEliminarProducto.lblVisibility2);
        clickElement(CarritoAgergarEliminarProducto.BtnGuardar);
    }

    public void textdatosseguardaronconexito() throws InterruptedException {
        String textDetailProduct = textFromElement(CarritoAgergarEliminarProducto.lblsavechange);
        String valueExpected = ("Los datos se guardaron con exito!");
        Assert.assertEquals(textDetailProduct, valueExpected, "Los datos se guardaron con exito!");
        Thread.sleep(5000);
    }

    public void ClickBtnCarritodeCompra() {
        clickElement(CarritoAgergarEliminarProducto.BtnCarritoCompra);
    }

    public void clickBtnsubirpedido() {
        clickElement(CarritoAgergarEliminarProducto.BtnSubirPedido);
    }

    public void writeCodProduct(String codigoProducto) throws InterruptedException {
        Thread.sleep(3000);
        write(CarritoAgergarEliminarProducto.lblCodigoProducto, codigoProducto);

    }

    public void ClickBtnAgregarCarrito() {
        clickElement(CarritoAgergarEliminarProducto.BtnAgregarCarrito);
    }

    public void ClickBtnBorrar() {
        clickElement(CarritoAgergarEliminarProducto.BtnBorrar);
    }

    public void lblNotenesproductosenelcarrito() throws InterruptedException {
        String textDetailProduct = textFromElement(CarritoAgergarEliminarProducto.TxtNoTenesProdcutoCarrito);
        String valueExpected = ("No tenés productos en el carrito.");
        Assert.assertEquals(textDetailProduct, valueExpected, "No tenés productos en el carrito.");
        Thread.sleep(5000);
        Map<String, String> map = new HashMap<String, String>();
        map.put("CarritoVacio", textFromElement(CarritoAgergarEliminarProducto.TxtNoTenesProdcutoCarrito));
        System.out.println("CarritoVacio" + map.get("CarritoVacio"));
    }

    public void ClickBtnVaciar() {
        clickElement(CarritoAgergarEliminarProducto.BtnVaciar);
    }

    public void lblDeseaBorrarelProducto() throws InterruptedException {
        String textDetailProduct = textFromElement(CarritoAgergarEliminarProducto.TxtBorrarTodoslosProductos);
        String valueExpected = ("Si confirma se borrarán todos los productos del carrito");
        Assert.assertEquals(textDetailProduct, valueExpected, "Si confirma se borrarán todos los productos del carrito");
        Thread.sleep(5000);
        ;

    }

    public void ClickBtnAceptar() {
        clickAceptarModal();
    }

    public void ClickCarritodeCompra() {
        clickElement(CarritoAgergarEliminarProducto.BtnCompraAleph);
    }

    public void ClickBtnDetalleProducto() {
        clickElement(CarritoAgergarEliminarProducto.BtnDetalleProducto);
    }

    public void clickBtnproducto1() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(CarritoAgergarEliminarProducto.PrimerProducto);
        Thread.sleep(5000);
    }

    public void clickBtnProducto2() throws InterruptedException {
        waitDontExitElement(CarritoAgergarEliminarProducto.txtConfirmAddProduct);
        Thread.sleep(1000);
        clickElement(CarritoAgergarEliminarProducto.SegundoProducto);
    }

    public void clickBtnProducto3() throws InterruptedException {
        waitDontExitElement(CarritoAgergarEliminarProducto.txtConfirmAddProduct);
        Thread.sleep(1000);
        clickElement(CarritoAgergarEliminarProducto.TercerProducto);
    }
}

