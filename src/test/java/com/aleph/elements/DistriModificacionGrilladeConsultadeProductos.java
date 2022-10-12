package com.aleph.elements;

import org.openqa.selenium.By;

public class DistriModificacionGrilladeConsultadeProductos {

    //Click para escribir el producto
    public By inputProductSearch = By.xpath("//*[@id='genericSearch']");

    //Click en busqueda
    public By btnBuscar = By.xpath("//*[@id='searchButton']");

    //Click en Edicion
    public By btnEdition = By.xpath("//*[@id='chkHabilitarEdicion']");

    // mensaje que "Habilitando edición de la grilla"
    public By txtEnablingGridEditing = By.xpath("//div[@data-notify='container']//span[contains(text(),'Habilitando edición de la grilla')]");

    // click en imput stock del producto
    public By imputWriteCantStock = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='9']");

    // click en boton si
    public By btnYes = By.xpath("//div[@aria-label='Sí']");

    // validar modificacion de stock
    public By lblStock = By.xpath("//*[@id='stk-3876']");

    // click en Grilla Precio sin Impuesto
    public By imputWritePriceWithoutTax = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='10']");

    // validar modificacion de Precio sin Impuesto
    public By lblPriceWithoutTax = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='10']");

    // Valido que tambien actualice el precio con impuestos
    public By lblExpectedPriceWithTax = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='12']");

    // click en grilla Precio con Impuesto
    public By imputWritePriceWithTax = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='12']");

    // click en la grilla de PVsugerido del producto
    public By imputWritePVSuggested = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='13']");

    // click en la grilla de PVsugerido del producto
    public By lblPVSuggested = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='13']");

    public By selectVisibility = By.xpath("//div[@class='dx-item dx-list-item']//div[normalize-space()='Visible']");
    public static String imputVisibility = "Visible";

    // grilla de modificar la visibilidad
    public By imputSelectVisibility = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='15']");

    // click en la barra para desplazar
    public By btnScrollBar = By.xpath("//*[@id='grillaProductos']/div/div[6]/div/div/div[2]/div");

    // flecha para seleccionar una de las 3
    public By btnflecha = By.xpath("//*[@id='grillaProductos']//td[15]/div/div/div/div/div[2]/div[2]");

    // grilla del producto de Stock Compra B2B
    public By imputWriteStockBuy = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='16']");

    // grilla del producto de Stock Rojo B2B
    public By imputWriteStockRed = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='17']");

    // grilla del producto de Stock Amarillo B2B
    public By imputwriteYellow = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='18']");
    public By imputWriteStockYellow = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='18']");

    // grilla de Cant min de Venta B2B
    public By imputwritecantMindeVenta = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='19']");

    // grilla de multiplicador de Venta
    public By imputwritemultipdeVenta = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='20']");

    // grilla de Porcentaje Descuento Adiconal B2B
    public By imputwriteAdditionalDiscountPercentage = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='21']");
}
