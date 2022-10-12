package FichaProductoKit.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Collection;
import java.util.List;

public class CambiarPreciodeComponente extends BasePage {

    public CambiarPreciodeComponente(WebDriver driver) {super(driver);}


    public void clickProduct() throws InterruptedException {
        Thread.sleep(3000);
        scrollToElement(FichaProductoKit.Elements.CambiarPreciodeComponente.btnProduct);
        Thread.sleep(1000);
        clickElement(FichaProductoKit.Elements.CambiarPreciodeComponente.btnProduct);
    }

    public void validatePrice() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> listPriceProduct = getElements(FichaProductoKit.Elements.CambiarPreciodeComponente.priceCell);
        int i = 0;
        double priceEsperado = 0.00;
        System.out.println("Valor obtenido: "+ attributeFromElement(FichaProductoKit.Elements.CambiarPreciodeComponente.validarPrice, "aria-valuenow"));
        Thread.sleep(2000);
        for (i = 0; i < listPriceProduct.size(); i++) {
            String textPrecio = listPriceProduct.get(i).getText().replace("$ ","");
            double priceProduct = Double.parseDouble(textPrecio.replace(".","").replace(",","."));
            double roundDbl = Math.round(priceProduct*100.0)/100.0;
            System.out.println("precio del producto " + i + " es " + roundDbl);
            priceEsperado = priceEsperado + roundDbl;
        }
        scrollToElement(FichaProductoKit.Elements.CambiarPreciodeComponente.validarPrice);
        double valorObtenido = Double.parseDouble(attributeFromElement(FichaProductoKit.Elements.CambiarPreciodeComponente.validarPrice, "aria-valuenow"));
        double roundDbl2 = Math.round(valorObtenido*100.0)/100.0;
        System.out.println("El valor obtneido es: " + roundDbl2);
        Assert.assertEquals(priceEsperado,roundDbl2);
    }

    public void clickComponentKit () throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichaProductoKit.Elements.CambiarPreciodeComponente.lblKitcomponent);
    }

    public String classComponentKit() {
        return attributeFromElement(FichaProductoKit.Elements.CambiarPreciodeComponente.btnComponentKit,"aria-expanded");
    }

    public void clickStockManagement() throws InterruptedException {
        clickElement(FichaProductoKit.Elements.CambiarPreciodeComponente.btnStockManagement);
    }

    public String classPriceManagement() {
        return attributeFromElement(FichaProductoKit.Elements.CambiarPreciodeComponente.btnStockManagement,"aria-expanded");
    }
}

