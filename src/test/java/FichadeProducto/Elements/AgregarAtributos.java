package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class AgregarAtributos {

    // Click en boton Atributos
    public static By clickBtnAttributes = By.id("box-atributos");

    // Cantidad de Atributos
    public static By CantAttribute = By.xpath("//div[@class='items-AtribFaltantes']");
    public static By txtMaterial = By.xpath("//*[@id='atributos']//div[@class='txt-QualityAtr']//span[contains(text(),'Material')]");
    public static By txtDiamentroFiltrodeAceite = By.xpath("//*[@id='atributos']//div[@class='txt-QualityAtr']//span[contains(text(),'Diámetro del filtro de aceite')]");
    public static By txtDiametroRoscadelFiltrodeAceite = By.xpath("//*[@id='atributos']//div[@class='txt-QualityAtr']//span[contains(text(),'Diámetro de la rosca del filtro de aceite')]");
    public static By txtIncluyeJunta = By.xpath("//*[@id='atributos']//div[@class='txt-QualityAtr']//span[contains(text(),'Incluye junta')]");
    public static By txtOrigen = By.xpath("//*[@id='atributos']//div[@class='txt-QualityAtr']//span[contains(text(),'Origen')]");
    public static By lblAttributesFaltans  = By.xpath("//*[@id='atributos']//div[@class='txt-QualityAtr']//span[@class='txt-calidad']");


    // Boton de acciones en la parte de atributo
    public static By clickBtnActions = By.xpath("//*[@id='form-atributos']/section/div[2]//span[contains(text(),'Acciones')]");

    // click en el producto indicado
    public static By btnProduct = By.xpath("//span[contains(text(),'qa aceite premium vip')]");

    // escribo el nombre del producto
    public static By imputProductSearch = By.xpath("//*[@id='genericSearch']");
    public static By btnBuscar = By.xpath("//*[@id='searchButton']");

    // scroll hasta atributos
    public By lblAttributes = By.xpath("//*[@id='form-atributos']//div[@class='txt-QualityAtr']");

    // click en boton agregar atributos faltantes
    public By clickBtnAddAttribute = By.xpath("//div[@class='cont-botonera-base']//span[contains(text(), 'Agregar atributos faltantes')]");

    // click en boton Descartar personalizaciones
    public static By clickBtnDiscardCustomizations = By.xpath("//div[@class='cont-botonera-base']//input[@value='Descartar personalizaciones']");

    // scrool hasta Marca
    public By lblBrand = By.xpath("//*[@id='tblAttrs']/tbody/tr[7]");

    // Valido que el titulo es "Editar Atributos"
    public static By titleEditAttributes = By.xpath("//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title']");
    public static String titleAttribute = "Editar atributos";

    // campo "Material"
    public By selectMaterial = By.xpath("//*[@id='tblAttrs']//*[@id='attrValue1726']");
    public static String imputMaterial = "Aluminio";

    // campo "Diametro del filtro del aceite"
    public By selectOilFilterDiameter  = By.xpath("//*[@id='attrValue4515']");
    public static String imputDiametrodelFiltrodeAceite = "10";

    // campo "Diámetro de la rosca del filtro de aceite"
    public By selectOilFilterThreadDiameter = By.xpath("//*[@id='attrValue4516']");
    public static String imputDiametrodelaRoscadelFiltrodeAceite = "15";

    // campo "incluye junta"
    public By selectIncludesGasket = By.xpath("//*[@id='attrValue4517']");
    public static String imputMountingKit = "Sí";

    // campo "Origen"
    public By selectOrigen = By.xpath("//*[@id='attrValueVisible1741']");
    public static String imputOrigen = "Test";

    // click en boton Guardar cambio
    public By clickBtnSaveChange = By.xpath("//*[@id='btnGuardar']");

    // valido el menseja
    public static By txtSaveAttributes = By.xpath("//*[@id='popUpConfirmId']");

    // click en Boton Aceptar
    public static By clickBtnAccept = By.xpath("//div[@class='dx-toolbar-center']//span[contains(text(), 'Aceptar')]");

    // valido el mensaje "Los datos se guardaron con Exítos"
    public static By txtDataWasSavedSuccessFully = By.xpath("//span[@data-notify= 'message'][contains(text(), 'Los datos se guardaron con exito!')]");

    // valido que se muestra en la ficha de producto los atributos completos
    public static By txtYourAttributesAreComplete = By.xpath("//*[@id='form-atributos']//div[@class='cont-data-QualityAtr']//span");

    // click en boton si, de descartar personalizaciones
    public static By clickBtnYes = By.xpath("//div[@aria-label='Sí']//span[contains(text(), 'Sí')]");

    // valido el mensaje "Está seguro que desea descartar sus personalizaciones de atributos? De esta manera, volverá a tener los atributos del padre."
    public static By textDiscardCustomizations = By.xpath("//div[@class='dx-dialog-message']");

    public static By lblScollAttributes = By.xpath("//a[@id='box-atributos']");

    public static By btnOK = By.xpath("//div[@aria-label='OK']");

}
