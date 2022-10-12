package FichaProductoKit.Elements;

import org.openqa.selenium.By;

public class CambiarPreciodeComponente {

    // click en el producto seleccionado
    public static By btnProduct = By.xpath("//tbody[@role='presentation']//span[contains(text(),'QA test amortiguador de auto KIT')]");

    // scrolll hasta componente Kit
    public static By lblKitcomponent = By.xpath("//*[@id='heading-DetalleKit']/h4");

    public static By priceCell = By.xpath("//div[@id='grdComponentesKit']//div[@class='dx-scrollable-wrapper']//tr[@role='row']//td[7]");

    public static By validarPrice = By.xpath("//*[@id='prPrecioComponentesCImp']/div/div[1]/input");

    public static By btnComponentKit = By.xpath("//*[@id='heading-DetalleKit']/h4/a");

    public static By btnStockManagement = By.xpath("//*[@id='heading-GestionPreciosSeller']/h4/a");
}
