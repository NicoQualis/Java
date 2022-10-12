package FichadeProducto.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

public class PublicarProducto extends BasePage {

    public PublicarProducto(WebDriver driver) {super(driver);
    }

    public void writeProductSearch(String CodSKUMARCA) {
        write(FichadeProducto.Elements.PublicarProducto.imputProductSearch,CodSKUMARCA);
        clickElement(FichadeProducto.Elements.PublicarProducto.btnBuscar);
    }

    public String getTextReadyToPublish() {
        return textFromElement(FichadeProducto.Elements.PublicarProducto.textPublications);
    }

    public void checkProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.PublicarProducto.checkProduct);
    }

    public void clickMercadoLibre() {
        clickElement(FichadeProducto.Elements.PublicarProducto.btnMercadolibre);
    }

    public void clickPost() {
        clickElement(FichadeProducto.Elements.PublicarProducto.btnPost);
    }

    public void clickConfirm() {
        clickElement(FichadeProducto.Elements.PublicarProducto.btnConfirm);
    }

    public String getTextPosted() {
        return textFromElement(FichadeProducto.Elements.PublicarProducto.textPosted);
    }

    public String getTextToComplete() {
        return textFromElement(FichadeProducto.Elements.PublicarProducto.textToComplete);
    }

    public void clickToComplete() {
        clickElement(FichadeProducto.Elements.PublicarProducto.btnToComplete);
    }

    public void clickPause() {
        clickElement(FichadeProducto.Elements.PublicarProducto.btnPause);
    }

    public void clickProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.PublicarProducto.btnProduct);
    }
}