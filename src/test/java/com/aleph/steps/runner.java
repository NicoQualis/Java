package com.aleph.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.aleph.core.BaseTest.*;


@CucumberOptions(
        plugin = {  "pretty", "html:target/cucumber-html-report.html" , "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features= {"src/test/resources/features/"},
        glue= {"B2B","com.aleph.steps","FichadeProducto","FichaProductoKit","Catalogo"},
        tags= "@Aleph or @Catalogo"
)

public class runner extends AbstractTestNGCucumberTests {


    @Before
    public static void setUp() {

        initializeChrome();
        //initializeFirefox();
        //initializeEdge();
        //initializeOpera();
    }

    @After
    public static void tearDown() {

        afterClass();
    }
}
