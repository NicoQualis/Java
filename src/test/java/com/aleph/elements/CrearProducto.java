package com.aleph.elements;

import org.openqa.selenium.By;

import java.util.Random;

public class CrearProducto {

    //WebElements de la pagina de Productos

    //boton para desplegar el menu
    public By btnToggleMenu = By.xpath("//span[@id='toggle-menu']");

    //seleccion del punto de menu de Productos
    public By navigateToProductsMenu = By.xpath("//a[@href='/Productos/Get']");

    //boton para crear un nuevo producto
    public By btnActionsCreateProduct = By.xpath("//span[normalize-space()='Acciones']");

    // boton para ingresar a un nuevo producto
    public By btnOpenPopupCreateProduct = By.xpath("//*[@id='divCrearProd']");

    // seleccionar campo para buscar la marca
    public By selectBrandPopup = By.xpath("//*[@id='Marcas-selectized']");

    // campo para escribir el codigo
    public By inputSkuPopup = By.xpath("//div[@id='CodigoSKUCPROD']//input[@role='textbox']");

    // campo exclusivo para titulo
    public By inputTitlePopup = By.xpath("//div[@id='TituloCPROD']//input[@role='textbox']");

    // boton finalizacion de la creacion del producto
    public By btnCreateProductPopup = By.xpath("//button[@id='btnCrearProducto']");

    // titulo de producto
    public By titleCreateProductsPopup = By.xpath("//div[@id='title_popup_creaprod']");

    // campo de busqueda en el margen superior
    public By genericSearch = By.xpath("//input[@id='genericSearch']");

    // boton de busqueda margen superior
    public By btnGenericSearch = By.xpath("//*[@id='searchButton']");

    // txt de se creó con éxito el producto
    public By textCreateProductSuccess = By.xpath("//div[@id='popUpId']");

    // nombre del campo titulo
    public By spanTttleLabel = By.xpath("//*[@id=\"divTitulo\"]/div[1]/strong/label");


    //-------------------------------------------------------------------------------------------------//

    //Variables utilazadas para el alta de un producto

    //valor para el campo Marcas
    public static String brand = "Testing";

    //generamos un valor aleatorio para el campo Codigo sku Marca
    private static Random rand = new Random();
    static int variableNum = rand.nextInt(3000);
    public static String sku = "An" + variableNum + "qa";

    //valor para el campo Titulo
    public static String titleNewProduct = "Amortiguador selenium";

    //-------------------------------------------------------------------------------------------------//

    //Valores usados para los assertions

    //valor que se utiliza para validar que se ingresó a la sección de productos
    public static String titleProduct = "Producto";

    //valor que se utiliza para validar que se creo correctamente un producto
    public static String validationNewProduct = "Se creó con éxito el producto";
    public static By selectCategoria = By.xpath("//*[@id='SelectorCrearProdCategoria-selectized']");
}
