package B2B.Elements;

import org.openqa.selenium.By;

public class CarritoAgergarEliminarProducto {


    public static By btnBuscar = By.xpath("//button[@class='btn search-button']");

    public static By txtProducto1 = By.xpath("//li[1]//ancestor::div[@class='off-cart-description']//b");

    public static By txtProducto2 = By.xpath("//li[2]//ancestor::div[@class='off-cart-description']//b");

    public static By txtProducto3 = By.xpath("//li[3]//ancestor::div[@class='off-cart-description']//b");


    public static By txtConfirmAddProduct = By.xpath("//span[contains(text(),'El producto se agregó correctamente')]");

    public static By BtnTomassiCarritoB2B = By.xpath("//*[@id='carritoCompras']");

    public static By BtnTiendaAleph = By.xpath("/html/body/main/div[1]/div[2]/ul/li[2]/a");

    public static By ClickBtnId25617 = By.xpath("//*[@id='menu']/div[2]/form/div/span/button");

    public static By inputProductAleph = By.xpath("//*[@id='genericSearch']");

    public static By BtnAgregar = By.xpath("//button[contains(@onclick, 'agregarItem')]");

    public static By numberdelproduct = By.xpath("//div[@class='container-buttons-quantity  ']//input[@id='quantity-1170063']");

    public static By ClickBtnProduct = By.xpath("//*[@id='menuitem1']/li[1]");

    public static By BtnBusqueda = By.id("searchButton");

    public static By BtnProductTEST = By.xpath("//div[@id='tit-1170063']");

    public static By BtnClasificacion = By.xpath("//*[@id='heading-Clasificacion']");

    public static By writecantidadminimavtadeseas = By.id("nroCantidadMinimaDeVentaOff");

    public static By btnDeleteCantMin = By.xpath("//*[@id='nroCantidadMinimaDeVentaOff']/div/div[2]/span/span");

    public static By BtnGuardar = By.xpath("//*[@id='btnSaveClasificacion']");

    public static By lblsavechange = By.xpath("//span[contains(text(), 'Los datos se guardaron con exito!')]");

    public static By BtnCarritoCompra = By.xpath("//*[@id='carritoCompras']");

    public static By BtnSubirPedido = By.xpath("//*[@id='btn-SubirPedido-Carrito']");

    public static By lblCodigoProducto = By.xpath("//*[@id='txtCopyCarrito']");

    public static By BtnAgregarCarrito = By.xpath("//*[@id='btnGuardarCarrito']");

    public static By BtnBorrar = By.xpath("//*[@class='btn-trash-cart]");

    public static By TxtNoTenesProdcutoCarrito = By.xpath("//*[@id='off-message-carrito']");

    public static By BtnVaciar = By.xpath("//*[@id='vaciarCarrito']");

    public static By TxtBorrarTodoslosProductos = By.xpath("//*[@id='popUpConfirmId']");

    public static By BtnCompraAleph = By.xpath("//*[@class='link-item-acciones']");

    public static By BtnDetalleProducto = By.xpath("//*[@id='heading-DetalleProducto']");

    public static By cardValidoCarroVacio = By.xpath("//*[@id='off-message-carrito']");

    public static By lblVisibility2 = By.xpath("//*[@id='form-clasificacion']/div[1]/div/div[1]/div[9]/div[4]/div[1]/label");

    public static By PrimerProducto = By.xpath("//div[@class='off-card-box  '][1]//span[contains(text(),'Agregar')]");

    public static By SegundoProducto = By.xpath("//div[@class='off-card-box  '][2]//span[contains(text(),'Agregar')]");

    public static By TercerProducto = By.xpath("//div[@class='off-card-box  '][3]//span[contains(text(),'Agregar')]");

    public static By scrolltodoslosproductos = By.xpath("//span[contains(text(),'Todos los productos')]");
}