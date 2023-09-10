package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);
//    CartPage cartPage= new CartPage(driver);

    @When("User sort filter list product by {string}")
    public void selectFilterProduct(String filterProduct) {
        homePage.selectFilterProduct(filterProduct);
    }

    @When("User click item {string} into cart")
    public void clickButtonAddToCartItem(String item) {
        homePage.clickButtonAddToCart(item);
    }

}
