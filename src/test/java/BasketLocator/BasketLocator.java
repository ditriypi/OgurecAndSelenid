package BasketLocator;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketLocator {
    public static SelenideElement Basket = $(By.xpath("//rz-cart/button"));

    public static SelenideElement Checkout = $(By.xpath("//rz-shopping-cart/div/div[1]/div/a"));

    public static SelenideElement Credit  = $(By.xpath("//app-product-credit"));

    public static SelenideElement ConfirmOrder = $(By.xpath("//input[contains(@class,'button')]"));
}
