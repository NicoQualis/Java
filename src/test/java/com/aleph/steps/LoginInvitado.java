package com.aleph.steps;

import com.aleph.core.BaseTest;
import com.aleph.pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginInvitado extends BaseTest {
    com.aleph.pages.LoginInvitado LoginPage;
    com.aleph.pages.Home Home;


    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        LoginPage = new com.aleph.pages.LoginInvitado(getDriver());
        LoginPage.navigateToLogin();
    }
    @When("^enters admin@alephcrm.com and ABC54321$")
    public void enters_admin_alephcrm_com_and_abc54321() {
        LoginPage.login("admin@alephcrm.com", "ABC54321");
    }

    @Then("^user is redirected to homepage$")
    public void user_is_redirected_to_homepage() {
        Home = new Home(getDriver());
        Assert.assertEquals("CATALOGADOR", Home.getMessageVersion());
    }

}
