package B2B.Page;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class DetalleProducto extends BasePage {

    public DetalleProducto(WebDriver driver) {
        super(driver);
    }

    public void writeProductSearch(String nombreproducto) throws InterruptedException {
        write(B2B.Elements.DetalleProducto.inputProductSearch, nombreproducto);
        clickElement(B2B.Elements.DetalleProducto.btnbusqueda);
    }

    public void clickProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(B2B.Elements.DetalleProducto.btnproductsellectbb);
    }

    public void viewProducto() throws InterruptedException {
        Thread.sleep(2000);
        String textDetailProduct = textFromElement(B2B.Elements.DetalleProducto.btndetailproduct);
        String valueExpected = "Amortiguador B2B5";
        if(textDetailProduct.contentEquals(valueExpected)) {
            System.out.println("aca irian los valores de cada campo del detalle del producto");
            System.out.println("Nombre: " + attributeValueFromInvisibilityElement(B2B.Elements.DetalleProducto.txtNombre));
            System.out.println("Codigo SKU Marca: " + attributeValueFromElement(B2B.Elements.DetalleProducto.txtSKUMarca));
            System.out.println("Marca: " + textFromElement(B2B.Elements.DetalleProducto.txtmarca));
            System.out.println("Costo sin impuesto " + textFromElement(B2B.Elements.DetalleProducto.txtCostosinimpuesto));
            System.out.println("Costo con impuesto " + textFromElement(B2B.Elements.DetalleProducto.txtCostoconimpuesto));

        }

        Assert.assertEquals(textDetailProduct,valueExpected, "Se valida que se pudo ingresar al Detalle del producto");
    }
}