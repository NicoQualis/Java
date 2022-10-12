package FichadeProducto.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class AgregarAtributos extends BasePage {

    public AgregarAtributos(WebDriver driver) {super(driver);}
    FichadeProducto.Elements.AgregarAtributos attributesAdd = new FichadeProducto.Elements.AgregarAtributos();

    public void clickBtnAttributes() throws InterruptedException {
        Thread.sleep(1000);
        scrollToElement(attributesAdd.lblScollAttributes);
        Thread.sleep(1000);
        clickElement(attributesAdd.clickBtnAttributes);
        String textAttributesFaltants = textFromElement(FichadeProducto.Elements.AgregarAtributos.lblAttributesFaltans);
        String valueExpected = "Tiene  atributo(s) obligatorios incompletos:";
        if (textAttributesFaltants.contentEquals(valueExpected)) ;
        System.out.println("Tiene  atributo(s) obligatorios incompletos");
        Thread.sleep(1000);
        System.out.println("" + textFromElement(FichadeProducto.Elements.AgregarAtributos.txtMaterial));
        Thread.sleep(1000);
        System.out.println("" + textFromElement(FichadeProducto.Elements.AgregarAtributos.txtDiamentroFiltrodeAceite));
        Thread.sleep(1000);
        System.out.println("" + textFromElement(FichadeProducto.Elements.AgregarAtributos.txtDiametroRoscadelFiltrodeAceite));
        Thread.sleep(1000);
        System.out.println("" + textFromElement(FichadeProducto.Elements.AgregarAtributos.txtIncluyeJunta));
        Thread.sleep(1000);
        System.out.println("" + textFromElement(FichadeProducto.Elements.AgregarAtributos.txtOrigen));
    }



    public void clickBtnActions() throws InterruptedException {
        scrollToElement(attributesAdd.lblAttributes);
        Thread.sleep(2000);
        clickElement(attributesAdd.clickBtnActions);
    }

    public void clickBtnAddAtrributes() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(attributesAdd.clickBtnAddAttribute);
        Thread.sleep(1000);
    }

    public void lblBrand() {
            scrollToElement(attributesAdd.lblBrand);
    }

    public String textEditAttributes () {
        return textFromElement(attributesAdd.titleEditAttributes);
    }

    public void imputMaterial(String imputFuelType) throws InterruptedException {
        clickElement(attributesAdd.selectMaterial);
        sendKeysToInput(imputFuelType);
        Thread.sleep(1000);
    }

    public void imputOilFilterDiameter(String imputEnergy) throws InterruptedException {
        clickElement(attributesAdd.selectOilFilterDiameter);
        sendKeysToInput(imputEnergy);
        Thread.sleep(1000);
    }

    public void imputOilFilterThreadDiameter(String imputFilter) throws InterruptedException {
        clickElement(attributesAdd.selectOilFilterThreadDiameter);
        sendKeysToInput(imputFilter);
        Thread.sleep(1000);
    }

    public void imputIncludesGasket(String imputMountingKit)throws  InterruptedException{
       clickElement(attributesAdd.selectIncludesGasket);
       sendKeysToInput(imputMountingKit);
       Thread.sleep(1000);
    }

    public void imputOrigin(String imputGasketsorSeal) throws InterruptedException {
        scrollToElement(attributesAdd.selectOrigen);
        clickElement(attributesAdd.selectOrigen);
        sendKeysToInput(imputGasketsorSeal);
        Thread.sleep(1000);
    }

    public void clickBtnSaveChange() throws InterruptedException {
        clickElement(attributesAdd.clickBtnSaveChange);
        Thread.sleep(1000);
    }

    public String getTextSaveAttributes() {
        return textFromElement(FichadeProducto.Elements.AgregarAtributos.txtSaveAttributes);
    }

    public void clickBtnSaveAttributesAccept() {
        clickElement(FichadeProducto.Elements.AgregarAtributos.clickBtnAccept);
    }

    public String getTextDataWasSavedSuccessfully() {
        return textFromElement(FichadeProducto.Elements.AgregarAtributos.txtDataWasSavedSuccessFully);
    }

    public String getTextYourAttributesAreComplete() {
        return textFromElement(FichadeProducto.Elements.AgregarAtributos.txtYourAttributesAreComplete);
    }

    public void clickBtnDiscardCustomizations() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarAtributos.clickBtnActions);
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarAtributos.clickBtnDiscardCustomizations);
    }

    public void clickBtnDiscardCustomizationsYes() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.AgregarAtributos.clickBtnYes);
    }

    public String getTextDiscardCustomizations() throws InterruptedException {
        Thread.sleep(2000);
        return textFromElement(FichadeProducto.Elements.AgregarAtributos.textDiscardCustomizations);
    }

    public void clickProduct() {
        clickElement(FichadeProducto.Elements.AgregarAtributos.btnProduct);
    }

    public void clickBtnOK() throws InterruptedException {
        Thread.sleep(4000);
        clickElement(FichadeProducto.Elements.AgregarAtributos.btnOK);
    }

    public void wirteProductSearch(String nombreProducto) {
        write(FichadeProducto.Elements.AgregarAtributos.imputProductSearch,nombreProducto);
        clickElement(FichadeProducto.Elements.AgregarAtributos.btnBuscar);
    }
}
