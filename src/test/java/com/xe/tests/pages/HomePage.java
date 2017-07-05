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
    
    @FindBy(id = "c")
    private WebElement addCurrency;
    
    @FindBy(id = "xRatesBxTable")
    private WebElement ratesTable;

    @FindBy(linkText = "Get Started")
    private WebElement getStarted;
    
    @FindBy(id ="select2-chosen-1")
    private WebElement selectACountry;
    
    @FindBy(id ="s2id_autogen1_search")
    private WebElement countryDropDown;
    
    @FindBy(id ="ff-email")
    private WebElement email;
   
    @FindBy(id ="ff-confirm-email")
    private WebElement confirmEmail;    
    
    @FindBy(id ="ff-step1")
    private WebElement continueButton1; 
     
    @FindBy(id ="select2-chosen-2")
    private WebElement selectTitle;
     
    @FindBy(xpath ="//*[@id='select2-results-2']/li[1]")
    private WebElement title;
    
    @FindBy(id ="ff-first-name")
    private WebElement firstName;
    
    @FindBy(id ="ff-middle-name")
    private WebElement middleName;
    
    @FindBy(id ="ff-last-name")
    private WebElement lastName;    
    
    @FindBy(id ="ff-step2")
    private WebElement continueButton2;
        
    @FindBy(id ="ff-password")
    private WebElement password;    
    
   @FindBy(id ="ff-confirm-password")
   private WebElement confirmPassword;
   
   @FindBy(id ="select2-chosen-3")
   private WebElement memorableQuestionSelection;
   
   @FindBy(xpath ="//*[@id='select2-results-3']/li[1]")
   private WebElement memorableQuestion;
    
   @FindBy(id ="ff-security-answer")
   private WebElement memorableQuestionAnswer;  
   
   @FindBy(id ="ff-submit")
   private WebElement yourDetailsButton;
        
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
		Thread.sleep(2000);
		addCurrency.sendKeys(Keys.ENTER);
	}

	public String getRatesTable() {
		
		return ratesTable.getText();
	}

	public void transfer_money() throws InterruptedException {
		getStarted.click();
		selectACountry.click();
		countryDropDown.sendKeys("United Kingdom");
		countryDropDown.sendKeys(Keys.ENTER);
		
		email.sendKeys("test1@gmail.com");
		confirmEmail.sendKeys("test1@gmail.com");
		continueButton1.click();
		
		selectTitle.click();
		Thread.sleep(5000);
		title.click();
		
		firstName.sendKeys("test");
		middleName.sendKeys("test");
		lastName.sendKeys("test");
		
		continueButton2.click();
		
		password.sendKeys("test@Password");
		confirmPassword.sendKeys("test@Password");
		
		memorableQuestionSelection.click();
		Thread.sleep(5000);
		memorableQuestion.click();
		
		memorableQuestionAnswer.sendKeys("test");
		
		yourDetailsButton.click();
		
	}

}
