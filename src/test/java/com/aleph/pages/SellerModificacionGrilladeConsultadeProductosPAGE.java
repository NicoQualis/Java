package com.aleph.pages;

import com.aleph.core.BasePage;
import com.aleph.elements.SellerModificacionGrilladeConsultadeProductosELEMENTS;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class SellerModificacionGrilladeConsultadeProductosPAGE extends BasePage {


    public SellerModificacionGrilladeConsultadeProductosPAGE(WebDriver driver) {super(driver);}
    SellerModificacionGrilladeConsultadeProductosELEMENTS ModifyProductGridsElementsSeller = new SellerModificacionGrilladeConsultadeProductosELEMENTS();

    public void clickEdition() throws InterruptedException {
        clickElement(ModifyProductGridsElementsSeller.btnEdition);
        Thread.sleep(3000);
        String textEnablingGridEditing = textFromElement(ModifyProductGridsElementsSeller.txtEnablingGridEditing);
        String valueExpected = ("Habilitando edición de la grilla");
        Assert.assertEquals(textEnablingGridEditing, valueExpected,"Habilitando edición de la grilla");
    }

    public void writeCantStock(String cantStock) throws InterruptedException {
        clickElement(ModifyProductGridsElementsSeller.imputWriteCantStock);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElementsSeller.imputWriteCantStock,cantStock);
        pressEnter(ModifyProductGridsElementsSeller.imputWriteCantStock);
    }

    public void clickYesconfirm() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(ModifyProductGridsElementsSeller.btnYes);
    }

    public String getTextValueStock() {
        return textFromElement(ModifyProductGridsElementsSeller.lblStock);
    }

    public void ValidoModificacionStockTotal() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Stock Total: ",textFromElement(ModifyProductGridsElementsSeller.lblStockTotal));
    }

    public void writeProductMporc(String mporc) throws InterruptedException {
        clickElement(ModifyProductGridsElementsSeller.imputWriteMporc);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElementsSeller.imputWriteMporc,mporc);
        pressEnter(ModifyProductGridsElementsSeller.imputWriteMporc);
    }

    public String getTextMporc() {
        return textFromElement(ModifyProductGridsElementsSeller.imputWriteMporc);
    }

    public void scroollsBar() {
        Actions action = new Actions(driver);
        int width = FindElement(ModifyProductGridsElementsSeller.btnScrollBar).getSize().getWidth();
        action.moveToElement(FindElement(ModifyProductGridsElementsSeller.btnScrollBar), width, 0).click().build().perform();
    }

    public void scroollBar() throws InterruptedException {
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
    }

    public void wirteProductPvPSinImpuesto(String pvPsinImpuesto) throws InterruptedException {
        clickElement(ModifyProductGridsElementsSeller.imputWritePVPSinImpuesto);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElementsSeller.imputWritePVPSinImpuesto,pvPsinImpuesto);
        pressEnter(ModifyProductGridsElementsSeller.imputWritePVPSinImpuesto);
    }

    public String getTextPVP() {
        return textFromElement(ModifyProductGridsElementsSeller.imputWritePVPSinImpuesto);
    }

    public String getExpectedPVP() {
        return textFromElement(ModifyProductGridsElementsSeller.imputWritePVPSinImpuesto);
    }

    public void writePVP(String pvp) throws  InterruptedException {
        clickElement(ModifyProductGridsElementsSeller.imputWritePVP);
        Thread.sleep(1000);
        setPrice(ModifyProductGridsElementsSeller.imputWritePVP,pvp);
        pressEnter(ModifyProductGridsElementsSeller.imputWritePVP);
    }

    public String getTextPVP2() {
        return textFromElement(ModifyProductGridsElementsSeller.imputWritePVP);
    }

    public String getExpectedPVP2() {
        return textFromElement(ModifyProductGridsElementsSeller.imputWritePVP);
    }
}
