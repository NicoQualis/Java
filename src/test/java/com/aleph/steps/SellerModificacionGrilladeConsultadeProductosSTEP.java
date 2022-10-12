package com.aleph.steps;

import com.aleph.core.BaseTest;
import com.aleph.pages.SellerModificacionGrilladeConsultadeProductosPAGE;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SellerModificacionGrilladeConsultadeProductosSTEP extends BaseTest {
    SellerModificacionGrilladeConsultadeProductosPAGE ModifyProductGrindsSeller = new SellerModificacionGrilladeConsultadeProductosPAGE(getDriver());


    @And("Presiono el boton para edicion del producto cuenta Seller")
    public void presionoElBotonParaEdicionDelProductoCuentaSeller() throws InterruptedException {
        ModifyProductGrindsSeller.clickEdition();
    }

    @And("Edito la grilla Stock de la Cta Seller {string}")
    public void editoLaGrillaStockDeLaCtaSeller(String CantStock) throws InterruptedException {
        ModifyProductGrindsSeller.writeCantStock(CantStock);
        ModifyProductGrindsSeller.clickYesconfirm();
    }

    @Then("Valido que se actualiza el stock del producto de la Cta Seller {string}")
    public void validoQueSeActualizaElStockDelProductoDeLaCtaSeller(String CantStock) throws InterruptedException {
        Thread.sleep(2000);
        String valueCantStock = ModifyProductGrindsSeller.getTextValueStock();
        System.out.println(CantStock);
        Assert.assertTrue(valueCantStock.contains(CantStock));
        Thread.sleep(2000);
        ModifyProductGrindsSeller.ValidoModificacionStockTotal();
        ModifyProductGrindsSeller.scroollBar();
    }

    @And("Edito la grilla de M% del Producto {string}")
    public void editoLaGrillaDeMDelProducto(String Mporc) throws InterruptedException {
        Thread.sleep(1000);
        ModifyProductGrindsSeller.writeProductMporc(Mporc);
        ModifyProductGrindsSeller.clickYesconfirm();
    }

    @Then("Valido que se actualice la grilla de M% {string}")
    public void validoQueSeActualiceLaGrillaDeM(String Mporc) throws InterruptedException {
        Thread.sleep(2000);
        String valueExpectedMporc = ModifyProductGrindsSeller.getTextMporc();
        System.out.println(Mporc);
        Assert.assertTrue(valueExpectedMporc.contains(Mporc));
        Thread.sleep(2000);
        ModifyProductGrindsSeller.scroollBar();
    }

    @And("desplazo la barra horizontal para visualizar las grillas")
    public void desplazoLaBarraHorizontalParaVisualizarLasGrillas() {
        ModifyProductGrindsSeller.scroollsBar();
    }

    @And("Edito la grilla PVP Sinimpuesto {string}")
    public void editoLaGrillaPVPSImpuesto(String PVPsinImpuesto) throws InterruptedException {
        Thread.sleep(1000);
        ModifyProductGrindsSeller.wirteProductPvPSinImpuesto(PVPsinImpuesto);
        ModifyProductGrindsSeller.clickYesconfirm();
    }

    @Then("Valido que se actualice la grilla de PVP {string}")
    public void validoQueSeActualiceLaGrillaDePVP(String PVPsinImpuesto) throws InterruptedException {
        Thread.sleep(2000);
        String valueExpectedPVP = ModifyProductGrindsSeller.getTextPVP();
        System.out.println(("Es el valor esperado: ") + (valueExpectedPVP.split("ARS")[1]).replace(".",""));
        valueExpectedPVP = (valueExpectedPVP.split("ARS")[1].replace(".",""));
        Assert.assertTrue(valueExpectedPVP.contains(PVPsinImpuesto));
        Thread.sleep(2000);
        String valueExpectedPVPSinImpuesto = ModifyProductGrindsSeller.getExpectedPVP();
        System.out.println(("El valor actualizo es: ") + (valueExpectedPVPSinImpuesto));
        ModifyProductGrindsSeller.scroollBar();
    }

    @And("Edito la grilla PVP {string}")
    public void editoLaGrillaPVP(String PVP) throws InterruptedException {
        Thread.sleep(1000);
        ModifyProductGrindsSeller.writePVP(PVP);
        ModifyProductGrindsSeller.clickYesconfirm();
    }

    @Then("Valido que se actualice la grilla PVP {string}")
    public void validoQueSeActualiceLaGrillaPVP(String PVP) throws InterruptedException {
        Thread.sleep(2000);
        String valueExpectedPVP2 = ModifyProductGrindsSeller.getTextPVP2();
        System.out.println(("ES el valor esperadp: ") + (valueExpectedPVP2.split("ARS")[1]).replace(".",""));
        valueExpectedPVP2 = (valueExpectedPVP2.split("ARS")[1].replace(".",""));
        Assert.assertTrue(valueExpectedPVP2.contains(PVP));
        Thread.sleep(2000);
        String valueExpectedPVP = ModifyProductGrindsSeller.getExpectedPVP2();
        System.out.println(("El valor actualizo es: ") + (valueExpectedPVP));
    }
}
