package com.aleph.pages;

import com.aleph.core.BasePage;
import org.openqa.selenium.WebDriver;

public class VisualizacionesGrillasVarias extends BasePage {
    public VisualizacionesGrillasVarias(WebDriver driver) {super(driver);}
    com.aleph.elements.VisualizacionesGrillasVarias gridVisualizationElements = new com.aleph.elements.VisualizacionesGrillasVarias();

    public void navigateToPosts() {
        clickElement(gridVisualizationElements.btnToggleMenu);
        clickElement(gridVisualizationElements.nagivateToPostsMenu);
    }

    public void navigateToObservations() {
        clickElement(gridVisualizationElements.btnToggleMenu);
        clickElement(gridVisualizationElements.nagivateToObservationsMenu);
    }

    public void navigateToAccount() {
        clickElement(gridVisualizationElements.btnToggleMenu);
        scrollToElement(gridVisualizationElements.scrollAdministrator);
        clickElement(gridVisualizationElements.nagivateToAccountMenu);
    }
}
