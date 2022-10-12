package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class VisualizacionesGrillasVarias extends BaseTest {

    com.aleph.pages.VisualizacionesGrillasVarias gridVisualization = new com.aleph.pages.VisualizacionesGrillasVarias(getDriver());
    com.aleph.elements.VisualizacionesGrillasVarias gridVisualizationElements = new com.aleph.elements.VisualizacionesGrillasVarias();

    @Then("valido que se carguen correctamente las columnas de las grillas")
    public void validoQueSeCarguenCorrectamenteLasColumnasDeLasGrillas() {
        Assert.assertTrue(!gridVisualization.elementExist(gridVisualizationElements.messageError), "Error al mostrar las columnas de la grilla");
         int cantColumna = gridVisualization.FindElements(gridVisualizationElements.lblColumnaGrilla).size();
        System.out.println("Se encontraron: " + (cantColumna-2) + " Columnas de grillas");

    }

    @And("me dirijo a la pantalla de Publicaciones")
    public void meDirijoALaPantallaDePublicaciones() {
        gridVisualization.navigateToPosts();
    }

    @And("me dirijo a la pantalla de ver Observaciones")
    public void meDirijoALaPantallaDeVerObservaciones() {
        gridVisualization.navigateToObservations();

    }

    @And("me dirijo a la pantalla de Cuenta")
    public void meDirijoALaPantallaDeCuenta() {
        gridVisualization.navigateToAccount();
    }
}
