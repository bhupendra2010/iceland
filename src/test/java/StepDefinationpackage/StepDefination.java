package StepDefinationpackage;

import PageObjectpackage.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
    Homepage page=new Homepage();
    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    page.baseurl();
    }

    @Given("^User click on Registar$")
    public void user_click_on_Registar() throws Throwable {
    page.Register();
    }

    @When("^User fill up all the details$")
    public void user_fill_up_all_the_details() throws Throwable {
    page.Detail();
    }

    @Then("^User should create account$")
    public void user_should_create_account() throws Throwable {

    }

}
