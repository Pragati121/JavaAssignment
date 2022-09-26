package Stepdefinition;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class StepDefinition1 extends BaseClass {

    @Given("User is on Home Page")
    public void user_is_on_home_page() throws IOException, InterruptedException {
        setUpDriver();
        pageFactory.getHome().HomeUser();
    }

    @When("Add Swagbag to cart and then checkout")
    public void add_swagbag_to_cart_and_then_checkout() {
     pageFactory.getCart().CartMethod();
    }

    @When("Enter billing information")
    public void enter_billing_information() {
        pageFactory.getBill().BillMethod();

    }

    @Then("Back to home page")
    public void back_to_home_page() {
    pageFactory.getBackh().BackMethod();
    close();
    }
}
