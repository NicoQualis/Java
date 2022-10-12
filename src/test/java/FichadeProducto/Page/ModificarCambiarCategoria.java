package FichadeProducto.Page;

import FichadeProducto.Elements.ModificarStockdeProducto;
import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class ModificarCambiarCategoria extends BasePage {

    public ModificarCambiarCategoria(WebDriver driver) {super(driver);}
    FichadeProducto.Elements.ModificarCambiarCategoria modifyCategory = new FichadeProducto.Elements.ModificarCambiarCategoria();

    public void clickOrigin() throws InterruptedException {
        scrollToElement(modifyCategory.btnOrigin);
        Thread.sleep(500);
        clickElement(modifyCategory.btnOrigin);
        Thread.sleep(2000);
    }

    public void clickOwn() {
        clickElement(modifyCategory.btnOwn);
    }

    public void clickPredictCategory() {
        clickElement(modifyCategory.btnPredictCategory);
    }

    public void imputSelect() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarCambiarCategoria.imputSelect);
        Thread.sleep(3000);
        clickElement(FichadeProducto.Elements.ModificarCambiarCategoria.btnModifyCategory);

    }

    public void clickCategoryPredictor() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(modifyCategory.btnYes);
    }

    public String getTextSuccessfullyModifiedCategory() {
        return textFromElement(modifyCategory.txtSuccessfullyModifiedCategory);
    }
    public void clickProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(modifyCategory.btnProduct);
    }

    public void clickDeployFilters() {
        clickElement(modifyCategory.btnDeployFilters);
    }

    public void writeNameProduct(String nombreProducto)  throws InterruptedException {
        Thread.sleep(3000);
        write(modifyCategory.inputProductSearch,nombreProducto);
        Thread.sleep(3000);
        clickElement(modifyCategory.btnSearch);
    }
}
