package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class ModificarPrecioFichadeProducto {

    // CLick en Boton Gestion de Precio
    public static By clickBtnGestiondePrecio = By.xpath("//*[@id='heading-GestionPreciosSeller']/h4/a");

    // titulo para que sea posible y que se desplace hasta editar precio sin impuesto
    public static By lblvisilityPrecioVtaSugerido = By.xpath("//*[@id='frmSeller']/div[5]/label");

    // xpath para cambiar el precio
    public static By inputPreciosinImpuesto = By.xpath("//*[@id='txtPrecioSinImp']/div/div[1]/input");

    // Click en el boton guardar para cambiar el cambio del precio
    public static By clickBtnGuardar = By.xpath("//*[@id='frmSeller']/div[17]/input");

    // Click en producto Bomba de Narta abc
    public static By btnProduct = By.xpath("//td[contains(text(),'')]//span[contains(text(),'BOMBA DE NAFTA abc')]");

    // scroll hasta el titulo de Gestion de Precio
    public static By lblTitleGestionPrecio = By.xpath("//span[contains(text(),'Gestión de Precios')]");
}
