package com.xe.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by kotche on 19/12/2016.
 */

@Component
public class HomePage {

    @Autowired
    private WebDriver browser;

    @FindBy(id = "amount")
    WebElement amount;

    @FindBy(id = "from")
    WebElement from;

    @FindBy(id = "to")
    WebElement to;

    @FindBy(id = "ucc_go_btn_svg")
    WebElement submit;

    @PostConstruct
    public void setup() {
        PageFactory.initElements(browser, this);
    }

    public void enter_amount_to_convert(String amt) {
        amount.sendKeys(amt);
        submit.click();
    }

    public void convert_from_euros_to_pounds() {
        from.sendKeys("EUR - Euro");
        from.sendKeys(Keys.TAB);
        to.sendKeys("GBP - British Pound");
        to.sendKeys(Keys.TAB);
    }

}
