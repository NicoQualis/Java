package FichadeProducto.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

public class ModificarPrecioFichadeProducto extends BasePage {

    public ModificarPrecioFichadeProducto(WebDriver driver) {super(driver);}

    public void clickBtnGestiondePrecio() throws InterruptedException {
        clickElement(FichadeProducto.Elements.ModificarPrecioFichadeProducto.clickBtnGestiondePrecio);
        Thread.sleep(2000);
    }


    public void clickPreciosinImpuesto(String Preciosinimpuestos) throws InterruptedException {
        scrollToElement(FichadeProducto.Elements.ModificarPrecioFichadeProducto.lblvisilityPrecioVtaSugerido);
        Thread.sleep(5000);
        setPrice(FichadeProducto.Elements.ModificarPrecioFichadeProducto.inputPreciosinImpuesto,Preciosinimpuestos);
        Thread.sleep(2000);
    }

    public void clickbtnguardar() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarPrecioFichadeProducto.clickBtnGuardar);
    }

    public void clickBtnProduct() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarPrecioFichadeProducto.btnProduct);
    }

    public void clickProductManagement() throws InterruptedException {
        Thread.sleep(3000);
        scrollToElement(FichadeProducto.Elements.ModificarPrecioFichadeProducto.lblTitleGestionPrecio);
    }

    public String classGestiondePrecio() {
        return attributeFromElement(FichadeProducto.Elements.ModificarPrecioFichadeProducto.clickBtnGestiondePrecio,"aria-expanded");
    }
}
