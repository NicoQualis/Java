package com.aleph.elements;

import org.openqa.selenium.By;

public class LoginInvitado {

   public By txtUser = By.xpath("//input[@id='email']");
   public By txtPassword = By.xpath("//input[@id='password']");
   public By btnLogin = By.cssSelector("#devextreme2 .dx-button-text");
}
