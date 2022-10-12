package FichadeProducto.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class ModificarCambiarTitulo extends BasePage {

    public ModificarCambiarTitulo(WebDriver driver) {super(driver);}

    public void writeNewTitle(String NewTitle) throws InterruptedException {
        writeInvisibleInput(FichadeProducto.Elements.ModificarCambiarTitulo.btnDeleteTitle, FichadeProducto.Elements.ModificarCambiarTitulo.writeTitle,NewTitle);
        Thread.sleep(3000);
        scrollToElement(FichadeProducto.Elements.ModificarCambiarTitulo.lblBrand);
        Thread.sleep(3000);
    }

    public void clickBtnSave() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarCambiarTitulo.btnSave);
    }

    public void clickYesModify() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarCambiarTitulo.btnYes);
    }

    public String getTextSuccessfullyModifiedTitle() {
        return textFromElement(FichadeProducto.Elements.ModificarCambiarTitulo.txtSuccessfullyModifiedTitle);
    }

    public void clickProduct() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarCambiarTitulo.btnProduct);
    }

    public void clickSubNew() throws InterruptedException {
        scrollToElement(FichadeProducto.Elements.ModificarCambiarTitulo.btnNew);
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarCambiarTitulo.btnNew);
    }
}
