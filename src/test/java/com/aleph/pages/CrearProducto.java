package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CrearProducto extends BasePage {

    public CrearProducto(WebDriver driver) {
        super(driver);
    }

    protected com.aleph.elements.CrearProducto ProductElements = new com.aleph.elements.CrearProducto();

    public void navigateToProductsPage(){
        clickElement(ProductElements.btnToggleMenu);
        clickElement(ProductElements.navigateToProductsMenu);
    }

    public void genericSearch(String search){
        write(ProductElements.genericSearch,search);
        clickElement(ProductElements.btnGenericSearch);
    }
    public void brandSelectPopup(String brand) throws InterruptedException {
        clickElement(ProductElements.selectBrandPopup);
        sendKeysToInput(brand);
        actionEnter();
    }

    public void writeSkuPopup(String sku){
        write(ProductElements.inputSkuPopup, sku);
    }

    public void writeTitlePopup(String title){
        write(ProductElements.inputTitlePopup,title);
        clickElement(ProductElements.spanTttleLabel);
    }

    public void openPopupCreateProduct() throws InterruptedException {
        clickElement(ProductElements.btnActionsCreateProduct);
        Thread.sleep(2000);
        clickElement(ProductElements.btnOpenPopupCreateProduct);
    }

    public String getTextCreateProductSuccess(){
        return textFromElement(ProductElements.textCreateProductSuccess);
    }

    public String textPopupTitlePopup(){
        return textFromElement(ProductElements.titleCreateProductsPopup);
    }


    public void createProduct(){
        clickElement(ProductElements.btnCreateProductPopup);}

    public void scroollBar() throws InterruptedException {
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
    }

    public void selectCategory(String imputCategory) {
        clickElement(ProductElements.selectCategoria);
        sendKeysToInput(imputCategory);
    }
}
