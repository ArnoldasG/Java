package Lessons.OOP.Inheritence.Exercises;

public class Porsche extends Car {
    private int roadServiceMonths;

    public Porsche(int wheels, String type, int doors, boolean isManual,
                   int gears, String color, String lightsType, int roadServiceMonths) {
        super("Porsche", "4 WD", wheels, type, doors, isManual, gears, color, lightsType);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 25) {
            changeGear(1);
        } else if (newVelocity > 25 && newVelocity <= 50) {
            changeGear(2);
        } else if (newVelocity > 50 && newVelocity <= 70) {
            changeGear(3);
        } else if (newVelocity > 70 && newVelocity <= 90) {
            changeGear(4);
        } else if (newVelocity > 90 && newVelocity <= 110) {
            changeGear(5);
        } else if (newVelocity > 110 && newVelocity <= 130) {
            changeGear(6);
        } else if (newVelocity > 130 && newVelocity <= 150) {
            changeGear(7);
        } else {
            changeGear(8);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
