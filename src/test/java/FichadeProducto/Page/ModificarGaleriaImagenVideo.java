package FichadeProducto.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

public class ModificarGaleriaImagenVideo extends BasePage {

    public ModificarGaleriaImagenVideo(WebDriver driver) {super(driver);}


    public void clickBtnGalery() {
        scrollToElement(FichadeProducto.Elements.ModificarGaleriaImagenVideo.lblGaleryImagenyVideo);
        clickElement(FichadeProducto.Elements.ModificarGaleriaImagenVideo.clickBtnGaleryImagenyVideo);
    }

    public void addImage() throws InterruptedException, IOException {
        //File a = new File("src/test/resources/img/galeria imagen y video.jpg");
       //File parentFolder = new File(a.getParent());
       //File b = new File(parentFolder, "../some/relative/path");
       //String absolute = b.getCanonicalPath();
        String absolutePath = FileSystems.getDefault().getPath("src/test/resources/img/galeria imagen y video.jpg").normalize().toAbsolutePath().toString();
        sendKeysElementVisible(FichadeProducto.Elements.ModificarGaleriaImagenVideo.clickaddimage, absolutePath);
        Thread.sleep(15000);
    }

    public void clickBtnDelete() throws InterruptedException {
        mouseOverElement(FichadeProducto.Elements.ModificarGaleriaImagenVideo.imgProduct);
        realClickElement(FichadeProducto.Elements.ModificarGaleriaImagenVideo.btnDeleteImg);
    }

    public void clickProductSelect() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(FichadeProducto.Elements.ModificarGaleriaImagenVideo.btnProduct);
    }
}
