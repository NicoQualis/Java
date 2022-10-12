package com.aleph.elements;

import org.openqa.selenium.By;

public class SellerModificacionGrilladeConsultadeProductosELEMENTS {

    //Click en Edicion
    public static By btnEdition = By.xpath("//*[@id='chkHabilitarEdicion']");

    //Mensaje que "Habilitando edición de la grilla"
    public static By txtEnablingGridEditing = By.xpath("//div[@data-notify='container']//span[contains(text(),'Habilitando edición de la grilla')]");

    //Click en imput stock del producto
    public static By imputWriteCantStock = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='10']");

    //Click en boton Si, de confirmar cambio
    public static By btnYes = By.xpath("//div[@aria-label='Sí']");

    //Validar modificacion de stock
    public static By lblStock = By.xpath("//*[@id='stk-1172597']");

    //Validar el Stock Total
    public static By lblStockTotal = By.xpath("//div[@title='Stock Total ']");

    //Click en Grilla M%
    public static By imputWriteMporc = By.xpath("//div[@class='dx-scrollable-content']//td[@aria-colindex='17']");

    public static By btnScrollBar = By.xpath("//div[@class='dx-scrollable-scrollbar dx-widget dx-scrollbar-horizontal dx-scrollbar-hoverable']//div[@class='dx-scrollable-scroll-content']");

    public static By imputWritePVPSinImpuesto = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='20']");

    // grilla de PVP
    public static By imputWritePVP = By.xpath("//div[@class='dx-datagrid-content']//tr[1]//td[@aria-colindex='22']");
}
