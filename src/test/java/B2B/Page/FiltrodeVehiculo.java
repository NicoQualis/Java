package B2B.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FiltrodeVehiculo extends BasePage {


    public FiltrodeVehiculo(WebDriver driver) {super(driver);}

    public void writeMarcaAUDI(String writeMarca) throws InterruptedException {
        clickElement(B2B.Elements.FiltrodeVehiculo.ClickSellectMarca);
        sendKeysToInput(writeMarca);
        Thread.sleep(5000);
    }

    public void writeMODELO(String writeModelo) throws InterruptedException {
        clickElement(B2B.Elements.FiltrodeVehiculo.ClickSellectModelo);
        sendKeysToInput(writeModelo);
        Thread.sleep(5000);

    }

    public void writeVESION(String writeVersion) throws InterruptedException {
        clickElement(B2B.Elements.FiltrodeVehiculo.ClickSellectVersion);
        sendKeysToInput(writeVersion);
        Thread.sleep(5000);

    }

    public void clickBtnBuscar() {
        clickElement(B2B.Elements.FiltrodeVehiculo.Btnbuscar);
    }


    public int  resultsElements() {
        List<WebElement> products = FindElements(B2B.Elements.FiltrodeVehiculo.cardProducts);
        return products.size();
    }

}



