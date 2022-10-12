package FichadeProducto.Page;

import com.aleph.core.BasePage;

import org.openqa.selenium.WebDriver;

import java.util.Collection;


public class AgregarCompatibilidades extends BasePage {

    public AgregarCompatibilidades(WebDriver driver) {super(driver);}


    public void clickBtnVariants() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.BtnVariants);
    }

    public void clickBtnCompatibility() {
        realClickElement(FichadeProducto.Elements.AgregarCompatibilidades.StringBtnCompatibility);
    }

    public void clickBtnActions() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.BtnActions);
    }

    public void clickBtnAdd() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.BtnAdd);
    }

    public void clickProducts() throws InterruptedException {
        Thread.sleep(5000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.primerSelectedProduct);
    }

    public void clickProducts2() throws InterruptedException {
        Thread.sleep(500);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.segundoSelectedProduct);
    }

    public void clickProducts3() throws InterruptedException {
        Thread.sleep(500);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.tercerSelectedProduct);
    }

    public void clickBtnAddCompatibilities() {
        scrollToElement(FichadeProducto.Elements.AgregarCompatibilidades.lblLastProductSealed);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnAdd);
    }

    public void clickBtnAccept() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnAccert);
    }

    public String getTextTitleAddCompatibilities() {
        return  textFromElement(FichadeProducto.Elements.AgregarCompatibilidades.txtTheApplicationWasAddedCorrectly);
    }

    public void clickBtnOk() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnOk);
    }

    public void clickProductsDelete() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickProductsDelete1);
    }

    public void clickProductsDelete2() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickProductsDelete2);
    }

    public void clickProductsDelete3() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickProductsDelete3);
    }

    public void clickBtnDelete() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnDelete);
    }

    public String getTextYouWillRemoveCompatibilities() {
        return  textFromElement(FichadeProducto.Elements.AgregarCompatibilidades.txtYouWillRemoveCompatibilities);
    }

    public void clickBtnDeleteAccept() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnAccept);
    }

    public void clickBtnBringNew() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnBringNew);
    }

    public String getTextTheFollowingCompatibilitiesWillBeAdded() {
        return textFromElement(FichadeProducto.Elements.AgregarCompatibilidades.txtTheFollowingCompatibilitiesWillBeAddead);
    }

    public void clickBtnYes() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnYes);
    }

    public void clickBtnDiscardCustomizations() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnDiscardCustomizations);
    }

    public String getTextDiscardYourApplicationCustomizations() {
        return textFromElement(FichadeProducto.Elements.AgregarCompatibilidades.txtDiscardYourApplicationCustomizations);
    }

    public void clickBtnYesDiscard() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickBtnYesDiscard);
    }

    public void writeProductSelect(String nombreProducto) {
        write(FichadeProducto.Elements.AgregarCompatibilidades.imputProductSearch,nombreProducto);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.btnBuscar);
    }

    public void clickProductSelect() {
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.clickProduct);
    }

    public void clickExit() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarCompatibilidades.btnExit);
    }

    public String classCompatibility() {
        return attributeFromElement(FichadeProducto.Elements.AgregarCompatibilidades.BtnCompatibility,"aria-expanded");
    }
}
