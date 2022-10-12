package B2B.Elements;

import org.openqa.selenium.By;

public class DetalleProducto {

    // Webelements detalle de producto de B2B

    // Click en boton busqueda
    public static By inputProductSearch = By.xpath("//*[@id='genericSearch']");

    // Click en boton busqueda
    public static By btnbusqueda = By.xpath("//*[@id='menu']/div[2]/form/div/span/button");

    // Click en el producto seleccionado
    public static  By btnproductsellectbb = By.xpath("//span[@id='Prod-1170058']");

    //Valido los datos sean correcto
    public static By txtNombre = By.xpath("//span[contains(text(),'Amortiguador B2B5')]");
    public static By txtSKUMarca = By.xpath("//div[@class='label-aleph'][1]//span[contains(text(),'Aleph')]");
    public static By txtmarca = By.xpath("//div[@class='label-aleph'][2]//span[contains(text(),'Aleph')]");
    public static By txtCostosinimpuesto = By.xpath("//*[@id='spanPrecioDeVenta']");
    public static By btndetailproduct = By.xpath("//span[@id='prod-1170058']");
    public static By txtCostoconimpuesto = By.xpath("//*[@id='spanPrecioDeVentaConImpuesto']");
}
