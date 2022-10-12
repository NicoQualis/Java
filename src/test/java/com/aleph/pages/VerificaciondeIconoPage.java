package com.aleph.pages;

import com.aleph.core.BasePage;
import com.aleph.elements.VerificaciondeIconoElements;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

public class VerificaciondeIconoPage extends BasePage {
    public VerificaciondeIconoPage(WebDriver driver) {super(driver);
    }
    protected VerificaciondeIconoElements verificationIconElements = new VerificaciondeIconoElements();

    public String getTextIconNotReported() {
        return textFromElement(verificationIconElements.iconNotReported);
    }

    public void clickPublicationsMenu() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(verificationIconElements.btnMenu);
        Thread.sleep(1000);
        clickElement(verificationIconElements.btnPublicationsMenu);
    }
}
