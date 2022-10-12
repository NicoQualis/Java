package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class AgregarCompatibilidades {

    // Click en titulo variantes
    public static By BtnVariants = By.id("heading-DetalleVariacion");

    // Click en el titulo Compatibilidades
    public static By BtnCompatibility = By.xpath("//*[@id='heading-Aplicaciones']/h4/a");

    // Click en el titulo Compatibilidades
    public static String StringBtnCompatibility = "//*[@id='heading-Aplicaciones']";

    // Scroll en Atributo para visualizar el elemento id de compatibility
    public static By BtnAtributo = By.id("box-atributos");

    // click en acciones
    public static By BtnActions = By.xpath("//div[@id='accordion-Aplicaciones']//span[contains(text(), 'Acciones')]");

    // click en agregar
    public static By BtnAdd = By.xpath("//*[@id='products-menu-actions']/div/div/ul/li[1]/button[1]");

    // Click en el elemento seleccionado 215499
    public static By primerSelectedProduct = By.xpath("//div[@id='tblVehiculos']//div[6]//tbody/tr[1]/td[1]");

    // Click en el elemento seleccionado 215501
    public static By segundoSelectedProduct = By.xpath("//div[@id='tblVehiculos']//div[6]//tbody/tr[3]/td[1]");

    // Click en el elemento seleccionado 215510
    public static By tercerSelectedProduct = By.xpath("//div[@id='tblVehiculos']//div[6]//tbody/tr[5]/td[1]");

    // Click en el boton agregar los productos seleccionados
    public static By clickBtnAdd = By.xpath("//div[@class='cont-btn-aplic']//span[contains(text(), 'Agregar')]");

    //scroll hasta el ultimo producto que seleccione
    public static By lblLastProductSealed = By.xpath("//div[@id='tblVehiculos']//div[@aria-label='Tabla de datos']/div[6]//tbody/tr[5]");

    // Click en boton aceptar
    public static By clickBtnAccert = By.xpath("//div[@role='toolbar']//span[contains(text(), 'Aceptar')]");

    // txt validacion "La aplicacion se agrego correctamente"
    public static By txtTheApplicationWasAddedCorrectly = By.xpath("//div[@class='dx-dialog-message']//div[@id='popUpId']");

    // Click en Boton OK
    public static By clickBtnOk = By.xpath("//div[@class='dx-button-content']//span[contains(text(), 'OK')]");

    // Click en producto eliminar
    public static By clickProductsDelete1 = By.xpath("//div[@id='accordion-Aplicaciones']//div[@aria-label='Tabla de datos']/div[6]//tbody/tr[1]/td[1]");

    // Click en producto eliminar
    public static By clickProductsDelete2 = By.xpath("//div[@id='accordion-Aplicaciones']//div[@aria-label='Tabla de datos']/div[6]//tbody/tr[3]/td[1]");

    // Click en producto eliminar
    public static By clickProductsDelete3 = By.xpath("//div[@id='accordion-Aplicaciones']//div[@aria-label='Tabla de datos']/div[6]//tbody/tr[4]/td[1]");

    // Click en boton Eliminar
    public static By clickBtnDelete = By.xpath("//*[@id='products-menu-actions']/div/div/ul/li[1]/button[2]");

    // valido el mensaje "Usted eliminará 3 compatibilidades. . ¿Desea continuar?"
    public static By txtYouWillRemoveCompatibilities = By.xpath("//*[@id='popUpConfirmId']");

    // Click en boton aceptar
    public static By clickBtnAccept = By.xpath("//div[@role='toolbar']//div[@class='dx-button-content']//span[contains(text(), 'Aceptar')]");

    // Validad cuantos productos se encuentran
    public static By CantProduct = By.xpath("//*[@id='grdAplicaciones']/div/div[6]/div");

    // Click en traer nuevos
    public static By clickBtnBringNew = By.xpath("//*[@id='traerNovedades']");

    // valido Se agregarán las siguientes compatibilidades
    public static By txtTheFollowingCompatibilitiesWillBeAddead = By.xpath("//div[@class='dx-dialog-message']");

    // Click en boton SI
    public static By clickBtnYes = By.xpath("//div[@class='dx-button-content']//span[contains(text(), 'Sí')]");

    // Click en Descartar personalizaciones
    public static By clickBtnDiscardCustomizations = By.xpath("//*[@id='descartarAttrPropios']");

    // valido stá seguro que desea descartar sus personalizaciones de aplicaciones?
    public static By txtDiscardYourApplicationCustomizations = By.xpath("//div[@class='dx-dialog-message']");

    // Click en boton si de descartar personalizaciones
    public static By clickBtnYesDiscard = By.xpath("//div[@class='dx-button-content']//span[contains(text(), 'Sí')]");

    //
    public static By imputProductSearch = By.xpath("//*[@id='genericSearch']");
    public static By btnBuscar = By.xpath("//*[@id='searchButton']");

    // click en el producto
    public static By clickProduct = By.xpath("//span[contains(text(),'qa aceite premium vip')]");

    //Boton de la cruz
    public static By btnExit = By.xpath("//div[@aria-label='close']");
}
