package FichaProductoKit.Page;

import FichaProductoKit.Elements.CambiaStockComponenteKIt;
import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CambiaStockComponenteKit extends BasePage {
    public CambiaStockComponenteKit(WebDriver driver) {super(driver);}


    public void StockManagement() throws InterruptedException {
        scrollToElement(CambiaStockComponenteKIt.lblKitComponent);
        clickElement(CambiaStockComponenteKIt.lblKitComponent);
        Thread.sleep(2000);
    }

    public void CantStock() {
        List<WebElement> cantStock = getElements(CambiaStockComponenteKIt.cantStock);
        int i = 0;
        int stockEsperado = Integer.parseInt(cantStock.get(i).getText());
        for (i = 0; i < cantStock.size(); i++) {
            int stock = Integer.parseInt(cantStock.get(i).getText());
            if (stock < stockEsperado) {
                stockEsperado = stock;
            }
        }
        scrollToElement(CambiaStockComponenteKIt.validarStock);
        int valorObtenido = Integer.parseInt(attributeFromElement(CambiaStockComponenteKIt.validarStock, "aria-valuenow"));
        System.out.println("El stock menor encontrado en la grilla es: " + stockEsperado);
        System.out.println("El valor del stock propio es: " + valorObtenido);
        Assert.assertEquals(stockEsperado, valorObtenido);
    }
}

