package Phone;

import java.util.ArrayList;

public class PhoneMain {
    public static void main(String[] args) {
    Phone phone = new Phone();
    Phone phone1 = new Phone("+375296548798", "Sumsung Galaxy A32", 184);
    Phone phone2 = new Phone("+375447586225", "Nokia 3310", 133);
    Phone phone3 = new Phone("+375336582545", "Realmi C25s", 209);
    ArrayList<Phone> listPhone = new ArrayList();
    listPhone.add(phone1);
    listPhone.add(phone2);
    listPhone.add(phone3);

    System.out.println(listPhone.toString());
    phone1.receiveCall("Don't answer ");
    phone2.receiveCall("Matty ");
    phone3.receiveCall("Kate ");
    phone.receiveCall("Fredy", "+375291475225");

    phone.sendMessage("+375294558564","+375291475454", "+375445414541");


}
}
