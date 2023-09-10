package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement buttonContinue;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyTitleCoutOverview;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement totalItemsPrice;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxPrice;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalPrice;
    @FindBy(id = "finish")
    private WebElement buttonFinish;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyTitleCoutComplete;
    @FindBy(id = "back-to-products")
    private WebElement buttonBackHome;


    public void setFirstName(String frstName){
        firstName.sendKeys(frstName);
    }

    public void setLastName(String lstName){
        lastName.sendKeys(lstName);
    }

    public void setPostalCode(String pstlCode) {
        postalCode.sendKeys(pstlCode);
    }

    public void setButtonContinue(){
        buttonContinue.click();
    }

    public boolean coutOverviewDisplayed(){
        return verifyTitleCoutOverview.isDisplayed();
    }

    public String getItemPrice(){
        return totalItemsPrice.getText();
    }

    public String getTaxPrice(){
        return taxPrice.getText();
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public void setButtonFinish(){
        buttonFinish.click();
    }

    public boolean coutCompleteDisplayed(){
        return verifyTitleCoutComplete.isDisplayed();
    }

    public void setButtonBackHome(){
        buttonBackHome.click();
    }

}
