package User;

import com.codeborne.selenide.SelenideElement;

public class User {
    private SelenideElement Name;

    public void setName(SelenideElement name) {
        Name = name;
    }

    public void setSurname(SelenideElement surname) {
        Surname = surname;
    }

    public void setPhone(SelenideElement phone) {
        Phone = phone;
    }

    private SelenideElement Surname;
    private SelenideElement Phone;



}
