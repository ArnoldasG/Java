package main.java.Lessons.InnerAbstractInterface.InterfacePhone;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on desk phone...");
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
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
