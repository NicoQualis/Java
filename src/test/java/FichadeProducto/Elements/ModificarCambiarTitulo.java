package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class ModificarCambiarTitulo {

    // Boton eliminar nombre
    public static By btnDeleteTitle = By.xpath("//*[@id='txtNombre']/div/div[2]/span/span");

    // Escribir el nuevo nombre
    public static By writeTitle = By.id("Titulo");

    // Referencia de Marca
    public static By lblBrand = By.xpath("//*[@id='frmDetalles']/div/div/div[4]/div[4]/div[1]");

    // Boton guardar
    public static By btnSave = By.xpath("//div[@id='accordion-DetalleProducto']//span[contains(text(),'Guardar')]");

    // Boton de si, aceptar
    public static By btnYes = By.xpath("//div[@class='dx-item-content dx-toolbar-item-content']//span[contains(text(),'Si')]");

    // Mensaje que modifico con exito
    public static By txtSuccessfullyModifiedTitle= By.xpath("//span[@data-notify= 'message'][contains(text(), 'Los Detalles del producto se guardaron con éxito')]");

    // click en el producto
    public static By btnProduct = By.xpath("//tr[@aria-rowindex='1']//span[contains(text(),'Edlp')]");

    // click en la subdivision "Nuevos"
    public static By btnNew = By.xpath("//a[contains(text(),'Nuevos')]");
}
