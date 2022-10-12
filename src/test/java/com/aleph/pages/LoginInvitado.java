package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;


public class LoginInvitado extends BasePage {

    public LoginInvitado(WebDriver driver) {
        super(driver);
    }

    protected com.aleph.elements.LoginInvitado LoginElements = new com.aleph.elements.LoginInvitado();

    public void navigateToLogin(){
        navigateTo("https://app-test.alephcrm.com/Login/");
    }

    public void login(String email, String password) {
        write(LoginElements.txtUser, email);
        write(LoginElements.txtPassword, password);
        clickElement(LoginElements.btnLogin);
    }
}
