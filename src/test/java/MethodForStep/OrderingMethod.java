package MethodForStep;

import BasketLocator.BasketLocator;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static BaseLocator.BaseLocator.*;
import static BasketLocator.BasketLocator.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderingMethod {
    public  SelenideElement productName;
    public  SelenideElement ItemInBasket;
    public String productNameText;

    public void openMainPage(){
        open("https://rozetka.com.ua/ua/");
    }

    public void sendTextInSearchField(String text){
        SearchField.val(text);
    }
    public void selectProductFromCatalog(String name){
          productNameText = name;
          productName = $(By.xpath("//span[contains(text(),'"+productNameText+"')]"));
          productName.click();
    }

   public  void  clickOnBuyButton(){
       ButtonBuy.click();
   }

   public void  clickOnContinueShopping(){
       ContinueShopping.click();}


    public void  goingInBasketAndSeeChosenProduct(){
        findAddedItem();
    }

    public void findAddedItem(){
        ItemInBasket  = $(By.xpath("//a[contains(text(),'"+productNameText+"')]"));
        assert (ItemInBasket.text().equals(productName.text()));

    }
    public void checkoutProduct(){Checkout.click();}

    public void buyInCredit(){Credit.click();}

}

