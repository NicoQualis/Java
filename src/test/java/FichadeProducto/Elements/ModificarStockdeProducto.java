package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class ModificarStockdeProducto {

    // El cliclk de "Producto" en el menu
    public static By BtnProduct = By.xpath("//*[@id='menuitem1']/li[1]");

    // Click en boton busqueda
    public static By inputProductSearch = By.xpath("//*[@id='genericSearch']");

    // Click en el producto que deseo
    public static By btnbusqueda = By.id("searchButton");

    // Click en Gestion de Stock
    public static By BtnGestiondeStock = By.xpath("//*[@id='heading-GestionStock']/h4/a");

    // Click en Gestion de Stock
    public static String StringBtnGestiondeStock = "//*[@id='heading-GestionStock']";

    // Click en la CRUZ
    public static By BtnDeleteCantStock = By.xpath("//*[@id='StockPropio']/div/div[2]/span/span") ;

    // Escribir el stock
    public static Object writeCantMinStock = By.xpath("//*[@id='Stock']");

    // Boton de guardar Stock
    public static By BtnGuardarStock = By.xpath("//div[@class='col-md-12']//input[@value='Guardar']");

    // titulo MODO STOCK PUB (para que se vea el BTN GUARDAR)
    public static By lblModoStock = By.xpath("//*[@id='form-stock']/section/div[1]/div/div[6]/div[1]");

    public static By BtnBuscar = By.id("genericSearch");

    // click en el nombre del producto
    public static By clickNameProduct = By.xpath("//span[contains(text(),'qa aceite premium vip')]");
}


