package main.java.Exercises.InnerAbstractInterface.InterfacePhone;

public class Main {
    public static void main(String[] args) {
        ITelephone arnisPhone;
        arnisPhone = new DeskPhone(37061444);
        arnisPhone.powerOn();
        arnisPhone.callPhone(37061444);
        arnisPhone.answer();
        System.out.println();
        arnisPhone = new MobilePhone(24689);
        arnisPhone.powerOn();
        arnisPhone.callPhone(24689);
        arnisPhone.answer();
    }
}
