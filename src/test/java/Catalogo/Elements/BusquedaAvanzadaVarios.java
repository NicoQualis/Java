package Catalogo.Elements;

import org.openqa.selenium.By;

public class BusquedaAvanzadaVarios {

   // click en la flechita de busqueda avanzadas
    public static By btnAdvancedSearches = By.xpath("//*[@id='popoverbutton']");

    // click en descripcion
    public static By clickDescription = By.xpath("//*[@id='txtDescripcion']");

    // click en boton Buscar
    public static By btnSearch = By.xpath("//div[@class='popover-content']//span[contains(text(),'Buscar')]");

    // visibilidad de cuantos productos obtengo
    public static By ProductVisibility = By.xpath("//*[@id='grillaProductos']//tbody//tr[@aria-rowindex]");

    // mostrar el mensaje "Sin datos"
    public static By emptySerch = By.xpath("//span[contains(text(),'Sin datos')]");

    // click en titulo
     public By clickTitle = By.xpath("//*[@id='txtTitulo']");
}
