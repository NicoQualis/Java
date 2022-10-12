package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class CrearKit extends BasePage {

    public CrearKit(WebDriver driver) {super(driver);}

    protected com.aleph.elements.CrearKit crearnewKitElements = new com.aleph.elements.CrearKit();

    public void openCreateProduct() throws InterruptedException {
        clickElement(crearnewKitElements.btnActionsCreateKit);
        Thread.sleep(2000);
        clickElement(crearnewKitElements.btnOpenCreateKit);
    }

    public void clickKit() {
        clickElement(crearnewKitElements.btnkit);
    }

    public void brandSelectKit(String brand) {
        clickElement(crearnewKitElements.selectBrandKit);
        sendKeysToInput(brand);
    }

    public String textPopupTitlePopup () {
        return textFromElement(crearnewKitElements.titleCreateProductsPopup);
    }

    public void writeSkuKit(String sku) {
        write(crearnewKitElements.imputSkuKit, sku);
    }

    public void writeTitleKit(String title){
        write(crearnewKitElements.inputTitleKit,title);
        clickElement(crearnewKitElements.snapTitleKit);
    }

    public String getTextCreateKitSuccess() throws InterruptedException {
        Thread.sleep(3000);
        return textFromElement(crearnewKitElements.textCreateKitSuccess);
    }

    public void checkCreateKit() throws InterruptedException {
        clickElement(crearnewKitElements.btnCreateKit);
    }

    public void selectCategory(String imputCategory){
        clickElement(crearnewKitElements.selectCategoria);
        sendKeysToInput(imputCategory);
    }
}