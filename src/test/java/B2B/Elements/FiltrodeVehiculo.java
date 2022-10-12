package B2B.Elements;

import org.openqa.selenium.By;

public class FiltrodeVehiculo {

    //Presiono para seleccionar una Marca
    public static By ClickSellectMarca = By.xpath("//*[@id='slMarcas-Superior']/div/div/div[1]/input");

    // Escribo el MODELO deaseado
    public static By ClickSellectModelo = By.xpath("//*[@id='slModelo-Superior']/div[1]/div/div[2]");

    // Escribo la VERSION deseada
    public static By ClickSellectVersion = By.xpath("//*[@id='slVersion-Superior']/div[1]/div/div[2]/div[2]");

    // Presiono boton buscar
    public static By Btnbuscar = By.xpath("//*[@class='btn btn-buscar-vehiculo  ']");

    // Valido que no se encontraron proudcuto
    public static By txtNoDataSearch = By.id("off-container-cart");

    // Tarjetas de productos
    public static By cardProducts = By.className("off-link-item");
}

