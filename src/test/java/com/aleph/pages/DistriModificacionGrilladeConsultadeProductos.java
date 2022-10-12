package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DistriModificacionGrilladeConsultadeProductos extends BasePage {

    public DistriModificacionGrilladeConsultadeProductos(WebDriver driver) {super(driver);}
    com.aleph.elements.DistriModificacionGrilladeConsultadeProductos ModifyProductGridsElements = new com.aleph.elements.DistriModificacionGrilladeConsultadeProductos();

    public void writeProductSearch(String nombreProducto) throws InterruptedException {
        Thread.sleep(2000);
        write(ModifyProductGridsElements.inputProductSearch,nombreProducto);
        Thread.sleep(2000);
        clickElement(ModifyProductGridsElements.btnBuscar);
        Thread.sleep(2000);
    }

    public void clickEdition() throws InterruptedException {
        clickElement(ModifyProductGridsElements.btnEdition);
        Thread.sleep(3000);
        String textEnablingGridEditing = textFromElement(ModifyProductGridsElements.txtEnablingGridEditing);
        String valueExpected = ("Habilitando edición de la grilla");
        Assert.assertEquals(textEnablingGridEditing, valueExpected,"Habilitando edición de la grilla");
    }

    public void writeCantStock(String cantStock) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputWriteCantStock);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputWriteCantStock,cantStock);
        pressEnter(ModifyProductGridsElements.imputWriteCantStock);
    }

    public void clickYesconfirm() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(ModifyProductGridsElements.btnYes);
    }

    public String getTextValueStock() {
        return textFromElement(ModifyProductGridsElements.lblStock);
    }

    public void writePriceWithoutTax(String precioSinImpuesto) throws InterruptedException{
        clickElement(ModifyProductGridsElements.imputWritePriceWithoutTax);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputWritePriceWithoutTax,precioSinImpuesto);
        pressEnter(ModifyProductGridsElements.imputWritePriceWithoutTax);
    }

    public String getTextPriceWithoutTax() {
        return textFromElement(ModifyProductGridsElements.lblPriceWithoutTax);
    }

    public String getExpectedPriceWithTax() {
        return textFromElement(ModifyProductGridsElements.lblExpectedPriceWithTax);
    }

    public void writePriceWithTax(String precioConImpuesto) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputWritePriceWithTax);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputWritePriceWithTax,precioConImpuesto);
        pressEnter(ModifyProductGridsElements.imputWritePriceWithTax);
    }

    public String getTextPriceWithTax() {
        return textFromElement(ModifyProductGridsElements.lblExpectedPriceWithTax);
    }

    public String getExpectedriceWithoutTax() {
        return textFromElement(ModifyProductGridsElements.lblPriceWithoutTax);
    }

    public void writePVsugerido(String PVsugerido) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputWritePVSuggested);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputWritePVSuggested,PVsugerido);
        pressEnter(ModifyProductGridsElements.imputWritePVSuggested);
    }

    public String getTextwritePVsugerido() {
        return textFromElement(ModifyProductGridsElements.lblPVSuggested);
    }

    public void imputVisibility(String imputVisibility) throws InterruptedException {
        Thread.sleep(500);
        clickElement(ModifyProductGridsElements.selectVisibility);
        sendKeysToInput(imputVisibility);
        pressEnter(ModifyProductGridsElements.imputSelectVisibility);
        Thread.sleep(1000);
    }

    public void scroollsBar() {
        Actions action = new Actions(driver);
        int width = FindElement(ModifyProductGridsElements.btnScrollBar).getSize().getWidth();
        action.moveToElement(FindElement(ModifyProductGridsElements.btnScrollBar), width, 0).click().build().perform();
    }


    public void scroollBar() throws InterruptedException {
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
    }

    public void imputVisibilidad() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(ModifyProductGridsElements.imputSelectVisibility);
        clickElement(ModifyProductGridsElements.btnflecha);
    }

    public String getTextCorrectMessage() {
        return textFromElement(ModifyProductGridsElements.imputSelectVisibility);
    }

    public void writeStockBuy(String stockCompra) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputWriteStockBuy);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputWriteStockBuy,stockCompra);
        pressEnter(ModifyProductGridsElements.imputWriteStockBuy);
    }

    public String getValueExpectedStockBuy() {
        return  textFromElement(ModifyProductGridsElements.imputWriteStockBuy);
    }

    public void writeStockRojo(String stockRojo) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputWriteStockRed);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputWriteStockRed,stockRojo);
        pressEnter(ModifyProductGridsElements.imputWriteStockRed);
    }

    public String getValueExpectedStockRed() {
        return textFromElement(ModifyProductGridsElements.imputWriteStockRed);
    }

    public void writeStockAmarillo(String stockAmarillo) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputwriteYellow);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputwriteYellow,stockAmarillo);
        pressEnter(ModifyProductGridsElements.imputwriteYellow);
    }

    public String getValueExpectedStockYellow() {
        return textFromElement(ModifyProductGridsElements.imputWriteStockYellow);
    }

    public void writeCantMindeVenta(String cantMindeVenta) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputwritecantMindeVenta);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputwritecantMindeVenta,cantMindeVenta);
        pressEnter(ModifyProductGridsElements.imputwritecantMindeVenta);
    }

    public String getValueExpectedMinimumSalesQuantity() {
        return textFromElement(ModifyProductGridsElements.imputwritecantMindeVenta);
    }

    public void writeMultipdeVenta(String multipdeVenta) throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputwritemultipdeVenta);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputwritemultipdeVenta,multipdeVenta);
        pressEnter(ModifyProductGridsElements.imputwritemultipdeVenta);
    }

    public String getValueExpectedSellMultiplier() {
        return textFromElement(ModifyProductGridsElements.imputwritemultipdeVenta);
    }

    public void writePorcentajeDescAdic(String porcentajeDescAdic)  throws InterruptedException {
        clickElement(ModifyProductGridsElements.imputwriteAdditionalDiscountPercentage);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElements.imputwriteAdditionalDiscountPercentage,porcentajeDescAdic);
        pressEnter(ModifyProductGridsElements.imputwriteAdditionalDiscountPercentage);
    }

    public String getValueExpectedPorcentajeDescAdic() {
        return textFromElement(ModifyProductGridsElements.imputwriteAdditionalDiscountPercentage);
    }
}
