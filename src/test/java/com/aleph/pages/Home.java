package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class Home extends BasePage {

    public Home(WebDriver driver)
    {
        super(driver);
    }

    protected com.aleph.elements.Home HomeElements = new com.aleph.elements.Home();

    public String getMessageVersion()
    {
        return textFromElement(HomeElements.txtMensajeVersion);
    }

    public void changeAccount(String account){
        clickElement(HomeElements.getCuentasHeader);
        write(HomeElements.cuentasSearchHeader, account);
        clickElement(HomeElements.selectCuentaHeader);
    }
}
