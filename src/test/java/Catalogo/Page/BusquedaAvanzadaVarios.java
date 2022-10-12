package Catalogo.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class BusquedaAvanzadaVarios extends BasePage {
    public BusquedaAvanzadaVarios(WebDriver driver) {super(driver);}
    protected Catalogo.Elements.BusquedaAvanzadaVarios AdvancedSearchesDescriptionElements = new Catalogo.Elements.BusquedaAvanzadaVarios();

    public void clickBtnAdvancedSearches() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(AdvancedSearchesDescriptionElements.btnAdvancedSearches);
    }

    public void writeDescription(String description) throws InterruptedException {
        clickElement(AdvancedSearchesDescriptionElements.clickDescription);
        sendKeysToInput(description);
        Thread.sleep(2000);
    }

    public void clickBtnSearch() {
        clickElement(AdvancedSearchesDescriptionElements.btnSearch);
    }

    public void writeTitle(String title) throws InterruptedException {
        clickElement(AdvancedSearchesDescriptionElements.clickTitle);
        sendKeysToInput(title);
        Thread.sleep(2000);
    }
}
