package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BusquedaProducto extends BasePage {

    public BusquedaProducto(WebDriver driver) {
        super(driver);
    }

    public void writeProductSearch(String productoBuscado){
        write(com.aleph.elements.BusquedaProducto.inputProductSearch,productoBuscado);
        clickElement(com.aleph.elements.BusquedaProducto.btnSearch);
    }

}


