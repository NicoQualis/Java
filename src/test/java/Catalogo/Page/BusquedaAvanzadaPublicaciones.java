package Catalogo.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class BusquedaAvanzadaPublicaciones extends BasePage {
    public BusquedaAvanzadaPublicaciones(WebDriver driver) {super(driver);
    }
    protected Catalogo.Elements.BusquedaAvanzadaPublicaciones AdvancedSearchElements = new Catalogo.Elements.BusquedaAvanzadaPublicaciones();

    public void writePublicationTitle(String publicationTitle) throws InterruptedException {
        clickElement(AdvancedSearchElements.clickPublicationTitle);
        sendKeysToInput(publicationTitle);
        Thread.sleep(2000);
    }

    public void clickBtnPosts() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(AdvancedSearchElements.btnPosts);
    }

    public void writeIdPosts(String idPublicaciones) throws InterruptedException {
        clickElement(AdvancedSearchElements.clickIdPublication);
        sendKeysToInput(idPublicaciones);
        Thread.sleep(2000);
    }
}
