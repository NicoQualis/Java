package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CrearCliente extends BasePage {

    public CrearCliente(WebDriver driver) {
        super(driver);
    }

    protected com.aleph.elements.CrearCliente createClientElements = new com.aleph.elements.CrearCliente();

    public void writeSocialReason(String razonSocial) throws InterruptedException {
        clickElement(createClientElements.imputSocialReason);
        sendKeysToInput(razonSocial);
        Thread.sleep(2000);
        System.out.println("Razon Social: " + attributeValueFromInvisibilityElement(createClientElements.imputSocialReason));
    }

    public void writeFancyName(String nombredeFantasia) throws InterruptedException {
        clickElement(createClientElements.imputFancyName);
        sendKeysToInput(nombredeFantasia);
        Thread.sleep(2000);
        System.out.println("Nombre De Fantasia: " + attributeValueFromInvisibilityElement(createClientElements.imputFancyName));
    }

    public void writeEmail(String email) throws InterruptedException {
        clickElement(createClientElements.imputEmail);
        sendKeysToInput(email);
        Thread.sleep(2000);
        System.out.println("Email: " + attributeValueFromInvisibilityElement(createClientElements.imputEmail));
    }

    public void writeRoad(String calle) throws InterruptedException {
        clickElement(createClientElements.imputRoad);
        sendKeysToInput(calle);
        Thread.sleep(2000);
        System.out.println("Calle: " + attributeValueFromInvisibilityElement(createClientElements.imputRoad));
    }

    public void writeNumber(String nro) throws InterruptedException {
        clickElement(createClientElements.imputNumber);
        sendKeysToInput(nro);
        Thread.sleep(2000);
        System.out.println("Nro: " + attributeValueFromInvisibilityElement(createClientElements.imputNumber));
    }

    public void writeZipCode(String codPostal) throws InterruptedException {
        clickElement(createClientElements.imputZipCode);
        sendKeysToInput(codPostal);
        Thread.sleep(2000);
        System.out.println("Codigo Postal: " + attributeValueFromInvisibilityElement(createClientElements.imputZipCode));
    }

    public void writeTown(String localidad) throws InterruptedException {
        clickElement(createClientElements.imputTown);
        sendKeysToInput(localidad);
        Thread.sleep(2000);
        System.out.println("Localidad: " + attributeValueFromInvisibilityElement(createClientElements.imputTown));
    }

    public void clickSellectProvince(String localidad) throws InterruptedException {
        clickElement(createClientElements.imputProvince);
        Thread.sleep(2000);
        clickElement(createClientElements.imputBsAs(localidad));
    }

    public void clickBtnCreateAccount() {
        clickElement(createClientElements.btnCreateAccount);
    }

    public void clickBtnConfirm() {
        clickElement(createClientElements.btnConfirm);
    }

    public void ValidConfirmAccount() {
        String textValidConfirmAccount = textFromElement(createClientElements.textTheAccountWasSavedWithSuccess);
        String valueExpected = ("Se guardo la cuenta con Exito!");
        if (textValidConfirmAccount.contentEquals(valueExpected)) ;{
        }
        Assert.assertEquals(textValidConfirmAccount, valueExpected, "Se valida que se pudo ingresar al Detalle del producto");
    }

    public void clickBtnReturn() {
        clickElement(createClientElements.btnReturn);
    }

    public void SelectSeller() throws InterruptedException {
        clickElement(createClientElements.imputaccounytype);
        Thread.sleep(1000);
        clickElement(createClientElements.imputSeller);
    }

    public void SelectCatalogador() throws InterruptedException {
        clickElement(createClientElements.imputaccounytype);
        Thread.sleep(1000);
        clickElement(createClientElements.imputCatalogador);
    }
}