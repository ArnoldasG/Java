package main.java.Lessons.Methods;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && hourOfDay < 8 || hourOfDay < 22) {
            return true;
        } else if (barking == true && hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking == false) {
            return false;
        } else {
            return false;
        }
    }
}
