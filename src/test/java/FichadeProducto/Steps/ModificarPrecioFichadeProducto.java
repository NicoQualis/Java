package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ModificarPrecioFichadeProducto extends BaseTest {

    FichadeProducto.Page.ModificarPrecioFichadeProducto PrecioProdcut = new FichadeProducto.Page.ModificarPrecioFichadeProducto(getDriver());


    @And("Me dirijo a la ficha de Gestion de Precio")
    public void meDirijoALaFichaDeGestionDePrecio() throws InterruptedException {
        PrecioProdcut.clickProductManagement();
        Thread.sleep(2000);
        PrecioProdcut.clickBtnGestiondePrecio();
        if (PrecioProdcut.classGestiondePrecio().contains("false"));

    }

    @When("Edito el {string}")
    public void editoEl(String Preciosinimpuestos) throws InterruptedException {
        PrecioProdcut.clickPreciosinImpuesto(Preciosinimpuestos);
    }

    @And("Click en Boton guardar GESTION de PRECIO")
    public void clickEnBotonGuardarGESTIONDePRECIO() throws InterruptedException {
        PrecioProdcut.clickbtnguardar();
    }

    @And("Click en el nombre del producto BOMBA DE NAFTA abc")
    public void clickEnElNombreDelProductoBOMBADENAFTAAbc() throws InterruptedException {
        PrecioProdcut.clickBtnProduct();
    }
}

