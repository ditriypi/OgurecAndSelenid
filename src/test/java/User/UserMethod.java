package User;
public class UserMethod {


    public static void setSurNameInField(String sname) {
        UserLocator.Surname.val(sname);

    }

    public static void setNameInField(String name) {
        UserLocator.Name.val(name);

    }

    public static void setPhoneInField(String phone){
        UserLocator.Phone.val(phone);

    }
}