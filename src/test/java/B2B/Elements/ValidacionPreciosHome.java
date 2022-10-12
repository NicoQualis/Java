package B2B.Elements;

import org.openqa.selenium.By;

public class ValidacionPreciosHome {

    // Producto que deseo validar
    public By clickProduct = By.xpath("//*[@id='off-container-cart']/div[2]/div[1]");
    public By clickProduct2 = By.xpath("//*[@id='off-container-cart']/div[2]/div[2]");
    public By clickProduct3 = By.xpath("//*[@id='off-container-cart']/div[2]/div[3]");

    // validacion del "Costo sin impuesto"
    public By txtCostWithoutTax = By.xpath("//*[@id='off-card-1170070']//div[@class='w-100 costo-home']//span[2]");
    public By txtCostWithoutTax2 = By.xpath("//*[@id='off-card-1170069']//div[@class='w-100 costo-home']//span[2]");
    public By txtCostWithoutTax3 = By.xpath("//*[@id='off-card-1170061']//div[@class='w-100 costo-home']//span[2]");

    // scroll
    public By scrollAllProduct = By.xpath("//span[contains(text(),'Todos los productos')]");

    public By txtNameProduct1 = By.xpath("//*[@id='off-card-1170070']/a");
}
