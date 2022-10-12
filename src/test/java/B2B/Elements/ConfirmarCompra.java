package B2B.Elements;

import org.openqa.selenium.By;

public class ConfirmarCompra {

    //Click boton menu
    public static By btnMenu = By.id("toggle-menu");

    // Click en Tienda
    public static By btnShop = By.xpath("//*[@id='menuitem4']/li[3]");

    //Click en Tomassi
    public static By btnQAutomation = By.xpath("//div[@class='container-fluid']//li[6]");

    //Click en producto 1
    public static By PrimerProducto = By.xpath("//div[@class='off-card-box  '][1]//span[contains(text(),'Agregar')]");

    //Click en producto 2
    public static By SegundoProducto = By.xpath("//div[@class='off-card-box  '][2]//span[contains(text(),'Agregar')]");

    // Boton en carro
    public static By ClickCarro = By.xpath("//*[@id='carritoCompras']");

    // Boton Finalizar
    public static By ClickFinalizar = By.xpath("//*[@id='confirmarCarrito']");

    // Seleccionar Modo Envio
    public static By ClickModoEnvio = By.xpath("//*[@id='rdbModoEnvio']/div/div[1]/div[1]");

    // Sub titulo Total
    public static By txtTotal = By.xpath("//*[@id='cart-subtotal-checkout']");

    // Sub titulo parcial
    public static By txtParcial = By.xpath("//div[@class='impuestos-section'][2]/span[contains(text(),'$')]");

    // Sub titulo Monto Final
    public static By txtTotalFinal = By.xpath("//span[@id='cart-total-checkout']");

    // Confirmo Pedido
    public static By BtnConfirmarPedido = By.xpath("//*[@id='off-confirmar-btn']");

    // Validacion del total
    public static By txtValidacionTotal = By.xpath("//div[@class='campo-precios-impuestos']/label[2]");

    // Validacion del Precio Final
    public static By txtValidacionTotalFinal = By.xpath("//span[@class='animated fadeInDown']");

    // Texto de Gracias por su compra
    public static By titleThankyouforyourpurchase = By.xpath("//div[@class='cont-msj-compra-finalizada']");

    //scroll para que se visualicen todos los productos
    public static By scrollAllProducts = By.xpath("//*[@id='tituloOff']");

    //scroll hasta el total del monto
    public static By scrollTotal = By.xpath("//*[@id='section-distri-15138']/div[2]");
}
