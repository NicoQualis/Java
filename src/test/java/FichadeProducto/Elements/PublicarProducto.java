package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class PublicarProducto {


    //scroll en ficha producto relacionados, hasta la visibilidad de publicaciones
    public static By lblScrollPublications = By.xpath("//*[@id='heading-ProductosRelacionados']//span[contains(text(),'Productos Relacionados')]");

    // click en boton ML
    public static By btnMercadolibre = By.xpath("//div[@id='botPublicacion']//button[@type='button']");

    // click en boton publicar
    public static By btnPost = By.xpath("//*[@id='divPublicar']/button");


    public static By txtTheNumberOfPostsToBeProcessedAre = By.xpath("//*[@id='divPopPublicar']//span[contains(text(),'La cantidad de publicaciones que se procesarán son: ')]");

    // click en boton confirmar
    public static By btnConfirm = By.xpath("//*[@id='divPopPublicar']/form/div[2]/div/button");

    // Elemento usado en el Assertions, valido que el producto dice:
    public static String validationTextPosted = "Publicado";;
    public static By textPosted = By.xpath("//div[@title=' - Ok - Publicada - ']");

    // click en el producto utilizado
    public static By btnPause = By.xpath("//*[@id='divPausar']");

    // click en boton confirmar de la parte de pausar
    public static By btnConfirmPause = By.xpath("//*[@id='divPopPublicar']/form/div[2]/div/button");

    // imput para escribir el producto
    public static By imputProductSearch  = By.xpath("//*[@id='genericSearch']");

    // click en el boton buscar
    public static By btnBuscar  = By.xpath("//button[@id='searchButton']") ;

    // Elemento usado en el Assertions, valido que el producto dice:
    public static String validationTextManualPaused = "Pausada Manual";
    public static By txtManuelaPaused = By.xpath("//td[@aria-describedby='dx-col-41']");

    // boton finalizar
    public static By btnToComplete = By.id("divFinalizar");

    // click en el encabezado "Publicaciones"
    public static By btnPublicion = By.xpath("//*[@id='heading-DetallePublicacion']");
    public static String StringBtnPublicion = "//div[@id='heading-DetallePublicacion']";

    // Elemento usado en el Assertions, valido que el producto dice:
    public static By textPublications = By.xpath("//text[contains(text(),'Listo para publicar')]");
    public static String validationReadyToPublish = "Listo para publicar";

    // check en el producto, para publicar
    public static By checkProduct = By.xpath("//div[@class='dx-scrollable-container']//tr[1]//td[1]/div");

    // valido el mensaje "La cantidad de publicaciones que se procesarán son"
    public static By textTheNumberOfPostsToBeProcessedAre = By.xpath("//*[@id='divPopPublicar']//span[contains(text(),'La cantidad de publicaciones que se procesarán son: ')]");
    public static String validitionTheNumberOfPosts = "La cantidad de publicaciones que se procesarán son:";

    public static By textToComplete = By.xpath("//td[@aria-describedby='dx-col-42']");
    public static String validationToComplete = "Pausada Manual";

    public static By btnProduct = By.xpath("//tr[@aria-rowindex='1']//span[contains(text(),'Cafetera Test')]");
}