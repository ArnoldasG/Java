package main.java.Exercises.InnerAbstractInterface;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Your iPhone turned on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + "on iPhone..");
        } else {
            System.out.println("iPhone is turned off.");
        }
    }

    @Override
    public void answer() {
        // patikrinam pirmą ar telefonas skamba.
        if(isRinging) {
            System.out.println("Answering the phone");
            // nustatom skambėjimą į false, nes mes jau pakėlėmė ragelį.
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // nurodom, kad jeigu įvestas mano numeris skamba mano telefonas
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("iPhone is turned off or different number..");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
