package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }


    //inisiasi locator
    @FindBy(xpath = "//a[.='2']")
    private WebElement buttonCart;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement cartPage;
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonRemoveItem;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckout;

    public void clickButtonCart(){
        buttonCart.click();
    }

    public boolean verifyCartPage(){
        return cartPage.isDisplayed();
    }

    public void clickButtonRemoveItem(){
        buttonRemoveItem.click();
    }

    public void clickButtonCheckout(){
        buttonCheckout.click();
    }

}
