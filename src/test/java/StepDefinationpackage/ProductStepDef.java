package StepDefinationpackage;

import PageObjectpackage.Homepage;
import PageObjectpackage.Productpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductStepDef {
    Homepage homepage=new Homepage();
    Productpage productpage=new Productpage();
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        homepage.baseurl();
    }

    @When("^User search for the product$")
    public void user_search_for_the_product() throws Throwable {
    productpage.selectproduct();
    }

    @When("^select the required product$")
    public void select_the_required_product() throws Throwable {
    productpage.productlist();
    }

    @Then("^User should put selected products in basket$")
    public void user_should_put_selected_products_in_basket() throws Throwable {
    productpage.selectitem();
    }
}
