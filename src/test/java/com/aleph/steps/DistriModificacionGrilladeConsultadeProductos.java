package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DistriModificacionGrilladeConsultadeProductos extends BaseTest {

    com.aleph.pages.DistriModificacionGrilladeConsultadeProductos ModifyProductGridsDistri = new com.aleph.pages.DistriModificacionGrilladeConsultadeProductos(getDriver());
    com.aleph.elements.DistriModificacionGrilladeConsultadeProductos ModifyProductGridsElements = new com.aleph.elements.DistriModificacionGrilladeConsultadeProductos();


    @And("Selecciono el producto {string}")
    public void seleccionoElProducto(String nombreProducto) throws InterruptedException {
        ModifyProductGridsDistri.writeProductSearch(nombreProducto);
    }

    @And("Presiono el boton para edicion del producto")
    public void presionoElBotonParaEdicionDelProducto() throws InterruptedException {
        ModifyProductGridsDistri.clickEdition();
    }

    @And("Edito la grilla Stock {string}")
    public void editoLaGrillaStock(String CantStock) throws InterruptedException {
        ModifyProductGridsDistri.writeCantStock(CantStock);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actualiza el stock con {string}")
    public void validoQueSeActualizaElStockCon(String CantStock) throws InterruptedException {
        Thread.sleep(2000);
        String valueCantStock = ModifyProductGridsDistri.getTextValueStock();
        System.out.println(CantStock);
        Assert.assertTrue(valueCantStock.contains(CantStock));
        ModifyProductGridsDistri.scroollBar();
    }
    
    @And("Edito la grilla PrecioSinImpuesto {string}")
    public void editoLaGrillaPrecioSinImpuesto(String PrecioSinImpuesto) throws InterruptedException {
        ModifyProductGridsDistri.writePriceWithoutTax(PrecioSinImpuesto);
        ModifyProductGridsDistri.clickYesconfirm();
    }
    
    @Then("Valido que se actualiza el precio sin impuestos {string}")
    public void validoQueSeActualizaElPrecioSinImpuestos(String PrecioSinImpuesto) throws InterruptedException {
        Thread.sleep(2000);
        String valuePriceWithoutTax = ModifyProductGridsDistri.getTextPriceWithoutTax();
        System.out.println(("Es el valor esperado: ") + (valuePriceWithoutTax.split("ARS")[1]).replace(".",""));
        valuePriceWithoutTax = (valuePriceWithoutTax.split("ARS")[1]).replace(".","");
        Assert.assertTrue(valuePriceWithoutTax.contains(PrecioSinImpuesto));
        Thread.sleep(500);
        String valueExpectedPriceWithTax = ModifyProductGridsDistri.getExpectedPriceWithTax();
        System.out.println(("El valor actualizado es: ")+ (valueExpectedPriceWithTax));
        ModifyProductGridsDistri.scroollBar();
    }


    @And("Edito la grilla PrecioConImpuesto {string}")
    public void editoLaGrillaPrecioConImpuesto(String PrecioConImpuesto) throws InterruptedException {
        ModifyProductGridsDistri.writePriceWithTax(PrecioConImpuesto);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actualiza el precio con impuestos {string}")
    public void validoQueSeActualizaElPrecioConImpuestos(String PrecioConImpuesto) throws InterruptedException {
        Thread.sleep(2000);
        String valuePriceWithTax = ModifyProductGridsDistri.getTextPriceWithTax();
        System.out.println(("Es el valor esperado: ") + (valuePriceWithTax.split("ARS")[1]).replace(".",""));
        valuePriceWithTax = (valuePriceWithTax.split("ARS")[1]).replace(".","");
        Assert.assertTrue(valuePriceWithTax.contains(PrecioConImpuesto));
        Thread.sleep(500);
        String valueExpectedriceWithoutTax = ModifyProductGridsDistri.getExpectedriceWithoutTax();
        System.out.println(("El valor actualizado es: ")+ (valueExpectedriceWithoutTax));
        ModifyProductGridsDistri.scroollBar();
    }

    @And("Edito la grilla PVsugerido {string}")
    public void editoLaGrillaPVsugerido(String PVsugerido) throws InterruptedException {
        ModifyProductGridsDistri.writePVsugerido(PVsugerido);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actualiza el PVsugerido {string}")
    public void validoQueSeActualizaElPVsugerido(String PVsugerido) throws InterruptedException {
        Thread.sleep(2000);
        String valuePVsugerido = ModifyProductGridsDistri.getTextwritePVsugerido();
        System.out.println(("Es el valor esperado: ") + (valuePVsugerido.split("ARS")[1]).replace(".",""));
        valuePVsugerido = (valuePVsugerido.split("ARS")[1]).replace(".","");
        Assert.assertTrue(valuePVsugerido.contains(PVsugerido));
        ModifyProductGridsDistri.scroollBar();
    }

    @And("Edito la grilla Visibilidad")
    public void editoLaGrillaVisibilidad() throws InterruptedException {
        ModifyProductGridsDistri.scroollsBar();
        ModifyProductGridsDistri.imputVisibilidad();
        Thread.sleep(500);
        ModifyProductGridsDistri.imputVisibility(ModifyProductGridsElements.imputVisibility);
        Thread.sleep(500);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido el estado de visibilidad del producto")
    public void validoElEstadoDeVisibilidadDelProducto() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(ModifyProductGridsDistri.getTextCorrectMessage().contains("Visible"));
        Thread.sleep(500);
        String  txtSelectVisibility = ModifyProductGridsDistri.getTextCorrectMessage();
        System.out.println(("Mensaje esparado:") + (txtSelectVisibility));
        Assert.assertTrue(txtSelectVisibility.contains("Visible"));
        ModifyProductGridsDistri.scroollBar();
    }

    @And("Edito la Grilla Stock Compra {string}")
    public void editoLaGrillaStockCompra(String StockCompra) throws InterruptedException {
        ModifyProductGridsDistri.writeStockBuy(StockCompra);
        ModifyProductGridsDistri.clickYesconfirm();
        System.out.println(("El valor esperado es: ") + (StockCompra));
    }

    @Then("Valido que se actualiza el StockCompra {string}")
    public void validoQueSeActualizaElStockCompra(String StockCompra) throws InterruptedException {
        Thread.sleep(2000);
        String valueCantStock = ModifyProductGridsDistri.getValueExpectedStockBuy();
        System.out.println(("El valor esperado es: ") + (StockCompra));
        Assert.assertTrue(valueCantStock.contains(StockCompra));
        ModifyProductGridsDistri.scroollBar();
    }

    @And("Edito la Grilla Stock Rojo {string}")
    public void editoLaGrillaStockRojo(String StockRojo) throws InterruptedException {
        ModifyProductGridsDistri.writeStockRojo(StockRojo);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actualiza el StockRojo {string}")
    public void validoQueSeActualizaElStockRojo(String StockRojo) throws InterruptedException {
        Thread.sleep(2000);
        String valueCantStockRed = ModifyProductGridsDistri.getValueExpectedStockRed();
        System.out.println(("El valor esperado es: ") + (StockRojo));
        Assert.assertTrue(valueCantStockRed.contains(StockRojo));
    }

    @And("Edito la Grilla Stock Amarillo {string}")
    public void editoLaGrillaStockAmarillo(String StockAmarillo) throws InterruptedException {
        ModifyProductGridsDistri.writeStockAmarillo(StockAmarillo);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actualiza el StockAmarillo {string}")
    public void validoQueSeActualizaElStockAmarillo(String StockAmarillo) throws InterruptedException {
        Thread.sleep(2000);
        String valueCantStockYellow = ModifyProductGridsDistri.getValueExpectedStockYellow();
        System.out.println(("El valor esperado es: ") + (StockAmarillo));
        Assert.assertTrue(valueCantStockYellow.contains(StockAmarillo));
    }

    @And("Edito la Grilla Cantidad min de Venta {string}")
    public void editoLaGrillaCantidadMinDeVenta(String CantMindeVenta) throws InterruptedException {
        ModifyProductGridsDistri.writeCantMindeVenta(CantMindeVenta);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actualiza Cantidad Min de Venta {string}")
    public void validoQueSeActualizaCantidadMinDeVenta(String CantMindeVenta) throws InterruptedException {
        Thread.sleep(2000);
        String valueCantMindeVenta = ModifyProductGridsDistri.getValueExpectedMinimumSalesQuantity();
        System.out.println(("El valor esperado es: ") + (CantMindeVenta));
        Assert.assertTrue(valueCantMindeVenta.contains(CantMindeVenta));
    }

    @And("Edito la Multiplicador de Venta {string}")
    public void editoLaMultiplicadorDeVenta(String MultipdeVenta) throws InterruptedException {
        ModifyProductGridsDistri.writeMultipdeVenta(MultipdeVenta);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se actaulice Multiplicador de Venta {string}")
    public void validoQueSeActauliceMultiplicadorDeVenta(String MultipdeVenta) throws InterruptedException {
        Thread.sleep(2000);
        String valueMultideVenta = ModifyProductGridsDistri.getValueExpectedSellMultiplier();
        System.out.println(("El valor esperado es: ") + (MultipdeVenta));
        Assert.assertTrue(valueMultideVenta.contains(MultipdeVenta));
    }

    @And("Edito el Porcentaje Descuento Adicional {string}")
    public void editoElPorcentajeDescuentoAdicional(String PorcentajeDescAdic) throws InterruptedException {
        ModifyProductGridsDistri.writePorcentajeDescAdic(PorcentajeDescAdic);
        ModifyProductGridsDistri.clickYesconfirm();
    }

    @Then("Valido que se el Porcentaje Descuento Adicional {string}")
    public void validoQueSeElPorcentajeDescuentoAdicional(String PorcentajeDescAdic) throws InterruptedException {
        Thread.sleep(2000);
        String valuePorcentajeDescAdic = ModifyProductGridsDistri.getValueExpectedPorcentajeDescAdic();
        System.out.println(("El valor esperado es: ") + (PorcentajeDescAdic));
        Assert.assertTrue(valuePorcentajeDescAdic.contains(PorcentajeDescAdic));
    }
}
