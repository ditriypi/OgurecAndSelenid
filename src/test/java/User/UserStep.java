package User;

import io.cucumber.java.en.And;


public class UserStep {
   // UserMethod user = new UserMethod();



    @And("I  send {string} in field name")
    public void iSendNameInFieldName(String name) {
        UserMethod.setNameInField(name);
    }


    @And("I send {string} in field surname")
    public void iSendSurnameInFieldSurname(String surname) {
        UserMethod.setSurNameInField(surname);
    }

    @And("I send {string} in field phone")
    public void iSendPhoneNumberInFieldPhone(String phone) {
        UserMethod.setPhoneInField(phone);
    }
}
