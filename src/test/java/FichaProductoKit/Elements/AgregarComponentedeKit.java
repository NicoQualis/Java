package FichaProductoKit.Elements;

import org.openqa.selenium.By;

public class AgregarComponentedeKit {

    // selecciono el boton kits
    public static By btnKits = By.xpath("//div[@class='btnTabConsult '][2]");

    // click en boton producto "QA test amortiguador de auto KIT"
    public static By btnProduct = By.xpath("//span[contains(text(),'QA test amortiguador de auto KIT')]");

    // me dirijo a subdivision componente kit
    public static By lblComponenteKit = By.xpath("//span[contains(text(),'Componentes de Kit')]");

    // imput en buscar
    public static By imputBtnbuscar = By.xpath("//*[@id='wrapper_SelectorTodosProductosDetalle']/div/div/div[1]");

    // click en btn Agregar
    public static By btnAdd = By.xpath("//div[@id='collapseCompKit']//span[contains(text(),'Agregar')]");

    // cuanto productos se encuentran en el kit
    public static By CantProductKit = By.xpath("//div[@id='grdComponentesKit']//div[@class='dx-scrollable-wrapper']//tr[@role='row']");
}
