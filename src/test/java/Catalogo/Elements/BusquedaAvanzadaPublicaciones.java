package Catalogo.Elements;

import org.openqa.selenium.By;

public class BusquedaAvanzadaPublicaciones {

    // click en titulo publicacion
    public static By clickPublicationTitle = By.xpath("//*[@id='txtTituloPub']");

    // click en el sub titulo "Publicaciones"
    public static By btnPosts = By.xpath("//*[@id='popoverContent']//li[3]");

    // click en el encabezado "Id publicaciones"
    public By clickIdPublication = By.xpath("//*[@id='txtIdsPub']");
}
