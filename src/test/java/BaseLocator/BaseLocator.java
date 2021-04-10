package BaseLocator;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BaseLocator {

        public  static SelenideElement SearchField = $(By.xpath("// input[@placeholder ='Я шукаю...']"));
        public static SelenideElement ButtonField = $(By.xpath("//form/button"));
        public static SelenideElement ButtonBuy = $(By.xpath("//span[contains(@class,'buy-button__label')]"));
        public static SelenideElement ContinueShopping = $(By.xpath("//rz-shopping-cart/div/div[1]/a"));




    }


