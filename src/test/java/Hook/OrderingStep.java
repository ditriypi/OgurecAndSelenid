package Hook;

import MethodForStep.OrderingMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static BaseLocator.BaseLocator.ButtonField;

public class OrderingStep {
OrderingMethod method = new OrderingMethod();


    @Given("I open the main page")
    public void iOpenTheMainPage() {
        method.openMainPage();
    }



    @And("I  choose  {string} model")
    public void iChooseMacBookAirModel( String productName) {

       method.selectProductFromCatalog(productName);

    }




    @Then("I going in basket and see chosen  product")
    public void iGoingInBasketAndSeeChosenProduct() {
        method.goingInBasketAndSeeChosenProduct();
        System.out.println("End");

    }


    @And("I  click button Buy")
    public void iClickButtonBuy() {
        method.clickOnBuyButton();
    }

    @And("I Click on find button")
    public void iClickOnFindButton() {
        ButtonField.click();

    }


    @When("I send {string} in search field")
    public void iSendНоутбукInSearchField(String item) {
        method.sendTextInSearchField(item);
    }

    @And("I choose {string}")
    public void iChooseDualshock(String productName) {
        method.selectProductFromCatalog(productName);
    }

    @And("I   click  checkout")
    public void iClickCheckout() {
        method.checkoutProduct();

    }



    @Then("I see that order button is available")
    public void iSeeThatOrderButtonIsAvailable() {

    }


    @And("I   click  credit")
    public void iClickCredit() {
        method.buyInCredit();

    }
}
