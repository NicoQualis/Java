package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CUITNIT extends BasePage {
    public CUITNIT(WebDriver driver) {super(driver);}

    protected com.aleph.elements.CUITNIT codCUITNIT = new com.aleph.elements.CUITNIT();

    public void clickBtnCta() {
        clickElement(codCUITNIT.btnCta);
    }

    public void clickBtnNewAccount() {
        scrollToElement(codCUITNIT.btnAdm);
        clickElement(codCUITNIT.btnNewAccount);
    }

    public void clickSellect() throws InterruptedException {
        clickElement(codCUITNIT.imputaccounytype);
        Thread.sleep(2000);
        clickElement(codCUITNIT.imputDistribuidor);
    }

    public void clickSellectCountry(String pais) throws InterruptedException {
        clickElement(codCUITNIT.imputCountry);
        Thread.sleep(2000);
        scrollToElement(codCUITNIT.imputArg(pais));
        clickElement(codCUITNIT.imputArg(pais));
    }

    public void textInvalidValue()  {
        String textInvalidValue = textFromElement(com.aleph.elements.CUITNIT.lblInvalidValue);
        String valueExpected = ("Valor inválido");
        Assert.assertEquals(textInvalidValue, valueExpected, "Valor inválido");
    }

    public void clickImputCUIT() {
        clickElement(codCUITNIT.imputCUIT);
    }

    public void clickImputClaveUnica(String ClaveUnica) throws InterruptedException {
        writeSlow(codCUITNIT.clickClaveUnica,ClaveUnica);
        System.out.println("ClaveUnica: " + attributeValueFromInvisibilityElement(codCUITNIT.clickClaveUnica));
    }

}
