package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class ModificarGaleriaImagenVideo {

    // Click en el boton de Galeria Imagen y Video
    public static By lblGaleryImagenyVideo = By.xpath("//*[@id='heading-Galeria']/h4/a");
    public static By clickBtnGaleryImagenyVideo = By.xpath("//*[@id='heading-Galeria']/h4/a");

    // Click en agregar imagen
    public static By clickaddimage = By.xpath("//*[@id='fileElement']");

    // Cantidad de imagen guardada
    public static By CantImagene = By.xpath("//*[@class='glImage']/ul/li");

   // Boton borrar imagen
    public static String imgProduct = "//*[@class='glImage']/ul/li[1]/div";

    public static String btnDeleteImg = "//span[contains(@id,'btnRemove')][@data-id='1']/i";

    // click en el producto deseado
    public static By btnProduct = By.xpath("//tr[@aria-rowindex='1']//span[contains(text(),'Amortiguador test Galery')]");
}
