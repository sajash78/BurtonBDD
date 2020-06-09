package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.HomePage;

public class HomePageSteps {
    HomePage homepage = new HomePage();

    @Given("^user is on the home page of the website$")
    public void user_is_on_the_home_page_of_the_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user selects on shoes and selects chelsea shoes$")
    public void user_selects_on_shoes_and_selects_chelsea_shoes() throws Throwable {
        Thread.sleep(4000);
        homepage.shoe();
        homepage.select();
        homepage.mensBoots();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user is able to see all relevant red shoes$")
    public void user_is_able_to_see_all_relevant_red_shoes() throws Throwable {
        Thread.sleep(3000);
        homepage.reultpageAssertion();
        // Write code here that turns the phrase above into concrete actions
    }


}