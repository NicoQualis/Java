package B2B.Steps;

import com.aleph.core.BaseTest;
import B2B.Elements.LoginInvitadoElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import org.testng.Assert;

public class LoginInvitado extends BaseTest {

    B2B.Page.LoginInvitado B2BLoginPage = new B2B.Page.LoginInvitado(getDriver());


    @Given("user is on login page B2B")
    public void user_is_on_login_page() {
        B2BLoginPage.navigateToLoginB2B();
    }

    @When("enters {string} and {string}")
    public void enters_and(String email, String password) {
        B2BLoginPage.login(email, password);
    }

    @SneakyThrows
    @When("click en  seleccione una tienda")
    public void clickEnSeleccioneUnaTienda() {
        B2BLoginPage.clickElement(LoginInvitadoElements.btngetinto);
    }

    @Then("valido que se ingreso correctamente")
    public void validoQueSeIngresoCorrectamente() throws InterruptedException {
        Assert.assertTrue(B2BLoginPage.viewIconHome());
    }



}

