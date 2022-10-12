package com.aleph.elements;

import org.openqa.selenium.By;

import static com.aleph.elements.CrearProducto.variableNum;

public class CrearKit {

    //boton para crear un nuevo kit
    //click en boton "Acciones"
    public static By btnActionsCreateKit = By.xpath("//span[normalize-space()='Acciones']");
    //click en boton "Nuevos"
    public static By btnOpenCreateKit = By.xpath("//*[@id='divCrearProd']");
    //Selecciono crear "KIT"
    public static By btnkit = By.xpath("//div[@class='dx-item-content']//span[contains(text(), 'Kit')]");

    //titulo de producto
    public static By titleCreateProductsPopup = By.xpath("//div[@id='title_popup_creaprod']");
    public static String titleProduct = "Producto";

    //seleccionar campo para buscar la marca
    public static By selectBrandKit = By.id("Marcas-selectized");
    public static String imputBrand = "Test";

    // campo para escribir el codigo sku
    public static By imputSkuKit = By.xpath("//*[@id='CodigoSKUCPROD']/div/div[1]/input");
    public static String sku = "Am" + variableNum + "qa";

    // campo exclusivo para titulo
    public static By inputTitleKit = By.xpath("//*[@id='TituloCPROD']/div/div[1]/input");
    public static String titleNewKit = "Amortiguador";

    //nombre del campo titulo
    public static By snapTitleKit = By.xpath("//*[@id='divTitulo']/div[1]");

    // boton "crear kit"
    public static By btnCreateKit = By.xpath("//button[@id='btnCrearProducto']");

    // texto de que se guardo correcto el kit
    public static By textCreateKitSuccess= By.xpath("//div[@id='popUpId']");

    //valor que se utiliza para validar que se creo correctamente un producto
    public static String validationNewProduct = "Se creó con éxito el producto";;

    public static String imputCategory = "MLA86379";
    public static By selectCategoria = By.xpath("//*[@id='SelectorCrearProdCategoria-selectized']");
}



