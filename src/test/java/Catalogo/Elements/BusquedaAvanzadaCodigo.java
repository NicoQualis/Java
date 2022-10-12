package Catalogo.Elements;

import org.openqa.selenium.By;

public class BusquedaAvanzadaCodigo {

    // click en sku marca
    public static By clickSkuBrand = By.xpath("//*[@id='txtSku']");

    // click en boton codigo
    public static By btnCode = By.xpath("//*[@id='popoverContent']//li[2]");

    // click en sku propio
    public static By clickSkuOwn = By.xpath("//*[@id='txtPropio']");

    // click en Variantes
    public static By clickVariant = By.xpath("//*[@id='txtVariante']");
}
