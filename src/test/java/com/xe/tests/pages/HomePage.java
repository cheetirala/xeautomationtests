package com.xe.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
    
    @FindBy(id = "c")
    private WebElement addCurrency;
    
    @FindBy(id = "xRatesBxTable")
    private WebElement ratesTable;

    @FindBy(css = ".button.green.white-text")
    private WebElement transfermoneywithxe;
    
    @FindBy(linkText = "Get Started")
    private WebElement getstarted;
    
    @FindBy(id ="ff-country")
    private WebElement country;
    
    @FindBy(xpath = "//*[@id='ff-email']")
    private WebElement email;
    
    @FindBy(xpath = "//*[@id='ff-confirm-email']")
    private WebElement Confirmemail;
    
    @FindBy(id = "ff-step1")
    private WebElement Continue;
    
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

	public void add_currency(String currency) throws InterruptedException {		
	
		addCurrency.sendKeys(currency);
		addCurrency.sendKeys(Keys.ARROW_DOWN);
		addCurrency.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}

	public String getRatesTable() {
		
		return ratesTable.getText();
	}

	
	public void transfer_money_with_xe() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println(transfermoneywithxe.getText());
		transfermoneywithxe.click();
		
	}

	public void i_click_on_get_started() {
		getstarted.click();
		
	}
	
    public void transfer_sign_up_page_should_appear()  {
    	Select select =new Select(country);
    	select.selectByVisibleText("canada");
        email.sendKeys("lalasa.srinivas@gmail.com");
        Confirmemail.sendKeys("lalasa.srinivas@gmail.com");
        Continue.click();
    }
    
    
}
