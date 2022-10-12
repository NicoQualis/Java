package com.aleph.steps;

import com.aleph.core.BaseTest;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks extends BaseTest {
    @After
    public static void afterClass(Scenario scenario){
        if(scenario.isFailed()){
            scenario.log("El escenario fallo, revisar imagen");
            final  byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName() );
        }
    }
}
