package com.aleph.steps;

import com.aleph.core.BasePage;
import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CUITNIT extends BaseTest {

    com.aleph.pages.CUITNIT codCUIT = new com.aleph.pages.CUITNIT(getDriver());

    @When("click en boton Cuenta")
    public void clickEnBotonCuenta() {
        codCUIT.clickBtnCta();
    }

    @And("presiono click en Nueva Cuenta")
    public void presionoClickEnNuevaCuenta() {
        codCUIT.clickBtnNewAccount();
    }

    @And("Selecciono el Tipo De Cuenta Distribuidor")
    public void seleccionoElTipoDeCuentaDistribuidor() throws InterruptedException {
        codCUIT.clickSellect();
    }

    @And("Selecciono el Pais {string}")
    public void seleccionoElPais(String pais) throws InterruptedException {
        codCUIT.clickSellectCountry(pais);
    }

    @Then("Valido que el valor es invalido")
    public void validoQueElValorEsInvalido() {
        codCUIT.clickImputCUIT();
        codCUIT.textInvalidValue();
        String message = codCUIT.waitExitElement(com.aleph.elements.CUITNIT.lblInvalidValue).getText();
        Assert.assertEquals(message, "Valor inválido");
    }

    @And("Ingreso datos validos {string}")
    public void ingresoDatosValidos(String ClaveUnica) throws InterruptedException {
        Thread.sleep(2000);
        codCUIT.clickImputClaveUnica(ClaveUnica);
        Assert.assertFalse(BasePage.elementExist(com.aleph.elements.CUITNIT.lblInvalidValue));
    }
}
