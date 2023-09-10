package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class CheckoutSteps {

    private final WebDriver driver = Hooks.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @When("User input {string} as a firstname, {string} as a lastName, and {string} as a postalCode")
    public void inputCredentialCheckout(String frstName, String lstName, String pstlCode) {
        checkoutPage.setFirstName(frstName);
        checkoutPage.setLastName(lstName);
        checkoutPage.setPostalCode(pstlCode);
    }

    @And("User click continue button")
    public void clickButtonContinue() {
        checkoutPage.setButtonContinue();
    }

    @Then("User already on checkout overview page")
    public void verifyCoutOverviewPage(){
        Assert.assertTrue(checkoutPage.coutOverviewDisplayed());
    }

//    @And("User verify item total, tax price and total price")
//    public void verifyPrice(String verifyItemPrc, String verifyTaxPrc, String verifyTotalPrc){
//        Assert.assertEquals(checkoutPage.getItemPrice(), verifyItemPrc);
//        Assert.assertEquals(checkoutPage.getTaxPrice(), verifyTaxPrc);
//        Assert.assertEquals(checkoutPage.getTotalPrice(), verifyTotalPrc);
//    }

    @And("User verify item total, tax price and total price")
    public void verifyPrice(){
        Float totalItemPrc = (Float.parseFloat(checkoutPage.getItemPrice().substring(13)) + Float.parseFloat(checkoutPage.getTaxPrice().substring(6)));
        Float totalPrc = Float.parseFloat(checkoutPage.getTotalPrice().substring(8));
        Assert.assertEquals(totalItemPrc, totalPrc);
    }


    @And("User click finish button")
    public void clickButtonFinish() {
        checkoutPage.setButtonFinish();
    }

    @And("User directly go to checkout complete page")
    public void verifyCoutCompletePage(){
        Assert.assertTrue(checkoutPage.coutCompleteDisplayed());
    }

    @And("User back to home page")
    public void clickButtonComplete() {
        checkoutPage.setButtonBackHome();
    }

}
