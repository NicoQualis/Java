package FichadeProducto.Elements;

import org.openqa.selenium.By;

public class ModificarCambiarCategoria {


    //Click para que se agrupe la subdivision Origen
    public static By btnOrigin = By.xpath("//*[@id='products-filters']/div/div[18]/h2/a");

    //Click en el Propios, de la subdivision de origen
    public static By btnOwn = By.xpath("//*[@id='filter-productos']/ul/li[1]/a");

    //Imput para buscar producto
    public static By inputProductSearch = By.xpath("//*[@id='genericSearch']");

    //Boton click de busqueda
    public static By btnSearch = By.id("searchButton");

    //Boton Predecir Categoria
    public static By btnPredictCategory = By.id("btnPredictorCategorias");

    //imput de seleccionar
    public static By imputSelect = By.xpath("//input[@name='rd-predecir-categorias']");

    //Boton Modificar
    public static By btnModifyCategory = By.id("btn-modificar-categorias");

    //Boton "SI" de modificacion de categoria
    public static By btnYes = By.xpath("//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//span[contains(text(), 'Si')]");

    // Mensaje que modifico con exito
    public static By txtSuccessfullyModifiedCategory = By.xpath("//span[@data-notify= 'message'][contains(text(), 'Categoría modificada con éxito')]");

    //click en el producto "Amortiguador test"
    public By btnProduct = By.xpath("//tr[@aria-rowindex='1']//span[contains(text(),'Amortiguador test prueba')]");

    // click en icono desplegar filtros
    public By btnDeployFilters = By.xpath("//*[@id='btn-filtros']");
}
