package FichadeProducto.Steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.IOException;

import static FichadeProducto.Elements.ModificarGaleriaImagenVideo.CantImagene;


public class ModificarGaleriaImagenVideo extends BaseTest {

    FichadeProducto.Page.ModificarGaleriaImagenVideo imageGallery = new FichadeProducto.Page.ModificarGaleriaImagenVideo(driver);
    int cantImage;

    @And("Click en Boton Galeria de Imagen y Video")
    public void clickEnBotonGaleriaDeImagenYVideo() throws InterruptedException {
        Thread.sleep(2000);
        imageGallery.clickBtnGalery();
    }

    @And("Click en Agregar una imagen")
    public void clickEnAgregarUnaImagen() throws InterruptedException, IOException {
        cantImage = imageGallery.FindElements(CantImagene).size();
        System.out.println("Se encontraron: " + cantImage + " imágenes del producto");
        imageGallery.addImage();
    }

    @Then("Validar que se subio la imagen")
    public void validarQueSeSubioLaImagen() throws InterruptedException {
        int newCantImage = imageGallery.FindElements(CantImagene).size();
        cantImage++;
        System.out.println("Se encontraron: " + newCantImage + " imágenes del producto");
        Assert.assertTrue((cantImage) == newCantImage);
    }

    @And("Click en Boton Borrar")
    public void clickEnBotonBorrar() throws InterruptedException {
        imageGallery.clickBtnDelete();
        Thread.sleep(3000);
        int newCantImage = imageGallery.FindElements(CantImagene).size();
        cantImage--;
        System.out.println("Se encontraron: " + cantImage + " imágenes del producto");
        Assert.assertTrue(cantImage == newCantImage);
    }

    @And("Click en el producto indicado Modificar Galeria Imagen y Videos")
    public void clickEnElProductoIndicadoModificarGaleriaImagenYVideos() throws InterruptedException {
        imageGallery.clickProductSelect();
    }
}