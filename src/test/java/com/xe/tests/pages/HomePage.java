package com.xe.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// xe home page

@Component
public class HomePage {

    @Autowired
    private WebDriver browser;

    @FindBy(id = "amount")
    private WebElement amount;

    @FindBy(id = "from")
    private WebElement from;

    @FindBy(id = "to")
    private WebElement to;

    @FindBy(id = "ucc_go_btn_svg")
    private WebElement submit;

    @PostConstruct
    public void setup() {
        PageFactory.initElements(browser, this);
    }

    public void enter_amount_to_convert(String amt) {
        amount.sendKeys(amt);
        submit.click();
    }

    public void convert_from_euros_to_pounds() {
        from.sendKeys("EUR");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        to.sendKeys("GBP");
        to.sendKeys(Keys.ARROW_DOWN);
        to.sendKeys(Keys.ENTER);
    }

}
