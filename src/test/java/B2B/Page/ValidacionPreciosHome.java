package B2B.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ValidacionPreciosHome extends BasePage {
    public ValidacionPreciosHome(WebDriver driver) {super(driver);}
    B2B.Elements.ValidacionPreciosHome homePriceElements = new B2B.Elements.ValidacionPreciosHome();

    public void lblProduct() throws InterruptedException {
        Thread.sleep(1000);
        scrollToElement(homePriceElements.scrollAllProduct);
        Thread.sleep(2000);
        String homePriceProduct = textFromElement(homePriceElements.clickProduct);
        String valueExpexted = "Aleph - sku288md8z";
        if(homePriceProduct.contentEquals(valueExpexted));{
            System.out.println(" Validacion los precios");
            System.out.println("Costo sin impuestos: " + textFromElement(homePriceElements.txtCostWithoutTax));
        }
    }

    public void lblProduct2() throws InterruptedException {
        scrollToElement(homePriceElements.clickProduct2);
        Thread.sleep(2000);
        String homePriceProduct2 = textFromElement(homePriceElements.clickProduct2);
        String valueExpexted2 = "Aleph - sku786gubz";
        if(homePriceProduct2.contentEquals(valueExpexted2));{
            System.out.println(" Validacion los precios");
            System.out.println("Costo sin impuestos: " + textFromElement(homePriceElements.txtCostWithoutTax2));
        }
    }

    public void lblProduct3() throws InterruptedException {
        scrollToElement(homePriceElements.clickProduct3);
        Thread.sleep(2000);
        String homePriceProduct3 = textFromElement(homePriceElements.clickProduct3);
        String valueExpexted3 = "Aleph - sku6059ka7";
        if(homePriceProduct3.contentEquals(valueExpexted3));{
            System.out.println(" Validacion los precios");
            System.out.println("Costo sin impuestos: " + textFromElement(homePriceElements.txtCostWithoutTax3));
        }
    }
}
