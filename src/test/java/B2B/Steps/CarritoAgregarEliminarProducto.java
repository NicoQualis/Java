package B2B.Steps;

import com.aleph.core.BaseTest;
import B2B.Elements.CarritoAgergarEliminarProducto;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class CarritoAgregarEliminarProducto extends BaseTest {

    B2B.Page.CarritoAgregarEliminarProducto carritoPage19887 = new B2B.Page.CarritoAgregarEliminarProducto(getDriver());

    @Then("Verificar que los precios sean los indicados")
    public void verificar_Que_Los_Precios_Sean_Los_Indicados() throws InterruptedException {
        carritoPage19887.ValidoslosPrecios();
        Thread.sleep(5000);

    }

    @And("Click en el boton carrito {string}")
    public void clickEnElBotonCarrito(String arg0) throws InterruptedException {
        carritoPage19887.clickBtncarritoQA();
    }

    @And("click seleciono la tienda {string}")
    public void clickSelecionoLaTienda(String arg0) {
        carritoPage19887.clickBtnTiendaAleph();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    @And("click en el producto")
    public void clickEnElProducto() throws InterruptedException {
        carritoPage19887.ClickBtnId25617();
        Thread.sleep(5000);
    }

    @When("Busco el producto{string}")
    public void buscoElProducto(String nombreProducto) throws InterruptedException {
        carritoPage19887.writeProductAleph(nombreProducto);
        Thread.sleep(5000);
    }

    @And("click en agregar")
    public void clickEnAgregar() throws InterruptedException {
        carritoPage19887.ClickBtnAgregar();
        Thread.sleep(5000);
    }

    @Then("Valido que se compraron {string} minimo producto")
    public void validoQueSeCompraronMinimoProducto(String value) throws InterruptedException {
        carritoPage19887.Validoquesecompraronminimoproducto(value);
        Thread.sleep(5000);

    }

    @And("Click en catalogo producto")
    public void clickEnCatalogoProducto() throws InterruptedException {
        carritoPage19887.ClickBtnProduct();
        Thread.sleep(5000);
    }

    @And("Click en boton busqueda")
    public void clickEnBotonBusqueda() {
        carritoPage19887.ClickBtnBusqueda();
    }

    @And("Click en el producto")
    public void clickEnElProductoTEST() throws InterruptedException {
        carritoPage19887.ClickProductTest();
    }

    @And("Click en boton clasificacion")
    public void clickEnBotonClasificacion() throws InterruptedException {
        Thread.sleep(2000);
        carritoPage19887.clickBtnClasificacion();
    }

    @When("Escribir {string} como valor de la cantidad minima de venta")
    public void escribirLaCantidadMinimaDeVentaQueSeDeseas(String valor) throws InterruptedException {
        carritoPage19887.TxtCantidadMinimaVtaDeseas(valor);
        Thread.sleep(5000);
    }

    @Then("Click en boton guardar")
    public void clickEnBotonGuardar() {
        carritoPage19887.ClickBtnGuardar();
    }


    @Then("valido que se buscó se guardo el cambio del producto")
    public void validoQueSeBuscóSeGuardoElCambioDelProducto() throws InterruptedException {
        carritoPage19887.textdatosseguardaronconexito();
        String message = carritoPage19887.waitExitElement(CarritoAgergarEliminarProducto.lblsavechange).getText();
        Assert.assertEquals(message, "Los datos se guardaron con exito!");
    }

    @And("click en Carrito de Compra")
    public void clickEnCarritoDeCompra() throws InterruptedException {
        carritoPage19887.ClickBtnCarritodeCompra();
        Thread.sleep(3000);
    }

    @And("click en Boton subir pedido")
    public void clickEnBotonSubirPedido() {
        carritoPage19887.clickBtnsubirpedido();
    }

    @When("busco el producto {string}")
    public void buscoElProductoAleph(String CodigoProducto) throws InterruptedException {
        carritoPage19887.writeCodProduct(CodigoProducto);

    }

    @And("click en el Boton Agregar")
    public void clickEnElBotonAgregar() {
        carritoPage19887.ClickBtnAgregarCarrito();
    }

    @When("click en boton Borrar")
    public void clickEnBotonBorrar() {
        carritoPage19887.ClickBtnBorrar();
    }

    @Then("Valido que se borro el producto")
    public void validoQueSeBorroElProducto() throws InterruptedException {
        carritoPage19887.lblNotenesproductosenelcarrito();
        String message = carritoPage19887.waitExitElement(CarritoAgergarEliminarProducto.TxtNoTenesProdcutoCarrito).getText();
        Assert.assertEquals(message, "No tenés productos en el carrito.");
        Thread.sleep(5000);
    }

    @When("click en Boton Vaciar")
    public void clickEnBotonVaciar() {
        carritoPage19887.ClickBtnVaciar();
    }

    @Then("Valido que se desea borrar el producto")
    public void validoQueSeDeseaBorrarElProducto() throws InterruptedException {
        carritoPage19887.lblDeseaBorrarelProducto();
        String message = carritoPage19887.waitExitElement(CarritoAgergarEliminarProducto.TxtBorrarTodoslosProductos).getText();
        Assert.assertEquals(message, "Si confirma se borrarán todos los productos del carrito");
        Thread.sleep(3000);

    }

    @And("click en Boton Aceptar")
    public void clickEnBotonAceptar() {
        carritoPage19887.ClickBtnAceptar();
    }

    @And("click en Carrito de Compra Aleph")
    public void clickEnCarritoDeCompraAleph() {
        carritoPage19887.ClickCarritodeCompra();
    }

    @And("Click en boton detalle")
    public void clickEnBotonDetalle() {
        carritoPage19887.ClickBtnDetalleProducto();
    }

    @And("Reviso que el carro esta vacio")
    public void revisoQueElCarroEstaVacio() throws InterruptedException {
        carritoPage19887.ClickBtnCarritodeCompra();
        List<WebElement> ValidoCarroVacio = carritoPage19887.FindElements(CarritoAgergarEliminarProducto.cardValidoCarroVacio);
        if (ValidoCarroVacio == null) {
            carritoPage19887.ClickBtnVaciar();
            carritoPage19887.ClickBtnAceptar();
        } else {
            System.out.println("No tenés productos en el carrito.");
        }
    }

    @And("Selecciono los productos del carrito B{int}B {string}")
    public void seleccionoLosProductosDelCarritoBB(int arg0, String arg1) throws InterruptedException {
        carritoPage19887.scrollToElement(CarritoAgergarEliminarProducto.scrolltodoslosproductos);
        carritoPage19887.clickBtnproducto1();
        carritoPage19887.clickBtnProducto2();
        carritoPage19887.clickBtnProducto3();
    }
}

