package B2B.Page;

import com.aleph.core.BasePage;
import B2B.Elements.LoginInvitadoElements;
import org.openqa.selenium.WebDriver;


public class LoginInvitado extends BasePage {

    public LoginInvitado(WebDriver driver) {
        super(driver);
    }

    protected com.aleph.elements.LoginInvitado LoginElements = new com.aleph.elements.LoginInvitado();


    public void navigateToLoginB2B() {
        navigateTo("https://b2b-test-staging2.alephcrm.com/Login");
    }

    public void login(String email, String password) {
        write(LoginInvitadoElements.B2BtxtUser, email);
        write(LoginInvitadoElements.B2BtxtPassword, password);
        clickElement(LoginInvitadoElements.B2BbtnLogin);
    }

    public boolean viewIconHome() throws InterruptedException {
        Thread.sleep(3000);
        return elementIsDisplayed(LoginInvitadoElements.iconHome);
    }
}

