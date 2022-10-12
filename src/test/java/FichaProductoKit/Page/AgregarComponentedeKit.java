package FichaProductoKit.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class AgregarComponentedeKit extends BasePage {
    public AgregarComponentedeKit(WebDriver driver){super(driver);}

    public void clickBtnKits() {
        clickElement(FichaProductoKit.Elements.AgregarComponentedeKit.btnKits);
    }

    public void clickBtnProduct() throws InterruptedException {
        Thread.sleep(2000);
        scrollToElement(FichaProductoKit.Elements.AgregarComponentedeKit.btnProduct);
        Thread.sleep(2000);
        clickElement(FichaProductoKit.Elements.AgregarComponentedeKit.btnProduct);
    }

    public void clickComponenteKit() throws InterruptedException {
        Thread.sleep(2000);
        scrollToElement(FichaProductoKit.Elements.AgregarComponentedeKit.lblComponenteKit);
        clickElement(FichaProductoKit.Elements.AgregarComponentedeKit.lblComponenteKit);
    }

    public void writeProducto(String nombreProducto) throws InterruptedException {
        clickElement(FichaProductoKit.Elements.AgregarComponentedeKit.imputBtnbuscar);
        sendKeysToInput(nombreProducto);
        Thread.sleep(3000);
    }

    public void clickBtnAdd() {
        clickElement(FichaProductoKit.Elements.AgregarComponentedeKit.btnAdd);
    }
}
