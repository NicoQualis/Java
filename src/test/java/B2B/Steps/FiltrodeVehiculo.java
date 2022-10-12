package B2B.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class FiltrodeVehiculo extends BaseTest {

    B2B.Page.FiltrodeVehiculo TestFiltroVehiculo = new B2B.Page.FiltrodeVehiculo(getDriver());

    @And("selecciono la {string}")
    public void seleccionoMarca(String Marca) throws InterruptedException {
        Thread.sleep(5000);
        TestFiltroVehiculo.writeMarcaAUDI(Marca);
    }

    @And("selecciono el {string}")
    public void seleccionoEl(String Modelo) throws InterruptedException {
        TestFiltroVehiculo.writeMODELO(Modelo);
    }

    @And("Selecciono la {string}")
    public void seleccionoVersion(String Version) throws InterruptedException {
        TestFiltroVehiculo.writeVESION(Version);
    }

    @When("Presiono Boton Buscar")
    public void presionoBotonBuscar() {
        TestFiltroVehiculo.clickBtnBuscar();
    }

    @Then("Que no exista el mensaje {string}")
    public void queNoExistaElMensaje(String arg0) throws InterruptedException {
        List messageWithoutResults = TestFiltroVehiculo.FindElements(B2B.Elements.FiltrodeVehiculo.txtNoDataSearch);
        if (messageWithoutResults != null) {
            Assert.assertTrue(messageWithoutResults != null, "Se encontraron: " + TestFiltroVehiculo.resultsElements() + " productos");
            System.out.println("Se encontraron: " + TestFiltroVehiculo.resultsElements() + " productos");
            Thread.sleep(5000);
        } else {
            String message = TestFiltroVehiculo.waitExitElement(B2B.Elements.FiltrodeVehiculo.txtNoDataSearch).getText();
            Assert.assertFalse(messageWithoutResults != null, message);
        }

    }
}


