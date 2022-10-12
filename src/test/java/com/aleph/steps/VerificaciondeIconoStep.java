package com.aleph.steps;

import com.aleph.core.BaseTest;
import com.aleph.elements.VerificaciondeIconoElements;
import com.aleph.pages.VerificaciondeIconoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class VerificaciondeIconoStep extends BaseTest {
    protected VerificaciondeIconoPage verificationIconPage = new VerificaciondeIconoPage(getDriver());


    @Then("Validar que los iconos se muestran correctamente")
    public void validarQueLosIconosSeMuestranCorrectamente() throws InterruptedException {
       Thread.sleep(2000);
       Assert.assertFalse(verificationIconPage.getTextIconNotReported().contains("NoInformado"));
    }

    @And("Me dirijo a la pantalla de publicaciones")
    public void meDirijoALaPantallaDePublicaciones() throws InterruptedException {
        verificationIconPage.clickPublicationsMenu();
    }
}
