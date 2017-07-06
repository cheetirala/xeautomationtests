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
    
    @Given("^I navigate to xe money transfer$")
    public void i_navigate_to_XE_money_transfer() throws Throwable {
        browser.get("http://www.xe.com/xemoneytransfer/uk");
    }
    
    @When("^I would like to convert from euros to pounds$")
    public void i_would_like_to_convert_from_euros_to_pounds() throws Throwable {
            homePage.convert_from_euros_to_pounds();
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

    @When("^I would click on transfer money with XE$")
    public void i_would_click_on_transfer_money_with_xe( ) throws Throwable {
            homePage.transfer_money_with_xe();
    
    }
    
    @When("^I Click on Get Started$")
    public void i_click_on_get_started( ) throws Throwable {
            homePage.i_click_on_get_started();
    }        
    
    @When("^Transfer signup page should appear$")
    public void transfer_sign_up_page_should_appear( ) throws Throwable {
            homePage.transfer_sign_up_page_should_appear();
    }        
}
