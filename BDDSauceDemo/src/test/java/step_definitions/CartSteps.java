package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private final WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);

    @And("User navigate to cart page")
    public void clickButtonCartPage(){
        cartPage.clickButtonCart();
    }

    @Then("User already on cart page")
    public void verifyCartPage() {
        Assert.assertTrue(cartPage.verifyCartPage());
    }

    @And("User remove item that last time was added to cart")
    public void clickButtonRemoveItemCart() {
        cartPage.clickButtonRemoveItem();
    }

    @And("User click checkout button")
    public void clickButtonCheckoutItem() {
        cartPage.clickButtonCheckout();
    }
}
