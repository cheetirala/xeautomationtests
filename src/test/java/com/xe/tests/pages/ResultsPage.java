package com.xe.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// xe conversion results page

@Component
public class ResultsPage {

    @Autowired
    private WebDriver browser;

    @PostConstruct
    public void setup(){
        PageFactory.initElements(browser, this);
    }

    @FindBy(css=".uccResultAmount")
    private WebElement result;

    public String getResult(){
        return result.getText();
    }

}
