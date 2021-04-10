package User;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserLocator {

public static SelenideElement Surname = $(By.xpath("//*[@formcontrolname='surname']"));

public static SelenideElement Name = $(By.xpath("//*[@formcontrolname='name']"));

public static SelenideElement Phone = $(By.xpath("//*[@formcontrolname='phone']"));

}
