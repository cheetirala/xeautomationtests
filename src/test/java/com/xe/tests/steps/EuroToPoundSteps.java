package com.xe.tests.steps;

import com.xe.tests.pages.HomePage;
import com.xe.tests.pages.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

// euro to pounds conversion step definition file

public class EuroToPoundSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private ResultsPage resultsPage;

    @Autowired
    private WebDriver browser;

    @Given("^I navigate to XE website$")
    public void i_navigate_to_XE_website() throws Throwable {
        browser.get("http://www.xe.com/");
    }
    
    @Given("^I navigate to XE Money Transfer website$")
    public void i_navigate_to_XE_money_transfer_website() throws Throwable {
        browser.get("http://www.xe.com/xemoneytransfer/uk/");
    }

    @When("^I would like to convert from euros to pounds$")
    public void i_would_like_to_convert_from_euros_to_pounds() throws Throwable {
            homePage.convert_from_euros_to_pounds();
    }
    
    @When("^I would like to transfer money$")
    public void i_would_like_to_transfer_money() throws Throwable {
            homePage.transfer_money();
    }

    @When("^I enter the amount (.*) in euros$")
    public void i_enter_the_amount_in_euros(String amount) throws Throwable {
           homePage.enter_amount_to_convert(amount);
    }

    @Then("^the amount in pounds (.*) should be displayed$")
    public void the_amount_in_pounds_should_be_displayed(String result) throws Throwable {
        Assert.assertEquals(result, resultsPage.getResult());
    }
    
    @When("^I would like to add currency (.*)$")
    public void i_would_like_to_add_currency(String currency) throws Throwable {
            homePage.add_currency(currency);
    }
    
    @When("^(.*) should appear in the live rates$")
    public void should_appear_in_the_live_rates(String expected) throws Throwable {
         Assert.assertTrue(homePage.getRatesTable().contains(expected));
    }
    
    
}
