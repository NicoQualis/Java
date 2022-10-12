package FichaProductoKit.Elements;

import org.openqa.selenium.By;

public class CambiaStockComponenteKIt {


    // click para que ser visible "Componente kit"
    public static By lblKitComponent = By.xpath("//span[contains(text(),'Componentes de Kit')]");

    // scroll hasta gestion de stock
    public static By lblStockMAnagement = By.xpath("//span[contains(text(),'Gestión de Stock')]");

    public static By cantStock = By.xpath("//div[@id='grdComponentesKit']//div[@class='dx-scrollable-wrapper']//tr[@role='row']//td[4]");

    public static By validarStock = By.id("Stock");
}
