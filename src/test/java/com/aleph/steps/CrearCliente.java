package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CrearCliente extends BaseTest {
    protected com.aleph.pages.CrearCliente createClientPage = new com.aleph.pages.CrearCliente(getDriver());
    protected com.aleph.elements.CrearCliente createClientElements = new com.aleph.elements.CrearCliente();

    @And("Selecciono la Razon Social {string}")
    public void seleccionoLaRazonSocial(String RazonSocial) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeSocialReason(RazonSocial);

    }

    @And("Ingreso los datos de Nombre De Fantasia {string}")
    public void ingresoLosDatosDeNombreDeFantasia(String NombredeFantasia) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeFancyName(NombredeFantasia);
    }

    @And("Ingreso los datos del email {string}")
    public void ingresoLosDatosDelEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeEmail(email);
    }

    @And("Ingreso los datos de la Calle {string}")
    public void ingresoLosDatosDeLaCalle(String Calle) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeRoad(Calle);
    }

    @And("Ingreso los datos del Nro {string}")
    public void ingresoLosDatosDelNro(String Nro) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeNumber(Nro);
    }

    @And("Ingreso los datos del Codigo Postal {string}")
    public void ingresoLosDatosDelCodigoPostal(String CodPostal) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeZipCode(CodPostal);
    }

    @And("Ingreso los datos de la Localidad {string}")
    public void ingresoLosDatosDeLaLocalidad(String Localidad) throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.writeTown(Localidad);
    }

    @And("Selecciono la provincia correspondiente {string}")
    public void seleccionoLaProvinciaCorrespondiente(String Localidad) throws InterruptedException {
        createClientPage.clickSellectProvince(Localidad);
    }

    @And("Presiono click sobre el boton Crear Cuenta")
    public void presionoClickSobreElBotonCrearCuenta() throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.clickBtnCreateAccount();
    }

    @And("Presiono click sobre el boton Confirmar")
    public void presionoClickSobreElBotonConfirmar() throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.clickBtnConfirm();
    }

    @Then("Valido que se creo correctamente la cuenta")
    public void validoQueSeCreoCorrectamenteLaCuenta() throws InterruptedException {
        Thread.sleep(1000);
        createClientPage.ValidConfirmAccount();
        createClientPage.clickBtnReturn();
    }

    @And("Selecciono el Tipo De Cuenta Seller")
    public void seleccionoElTipoDeCuentaSeller() throws InterruptedException {
        createClientPage.SelectSeller();
    }

    @And("Selecciono el Tipo De Cuenta Catalogador")
    public void seleccionoElTipoDeCuentaCatalogador() throws InterruptedException {
        createClientPage.SelectCatalogador();
    }
}
