package main.java.Lessons.OOP.Inheritence.Exercises;

public class Car extends Vehicle {

    private boolean isManual;
    private int gears;
    private String color;
    private String lightsType;
    private int currentGear;

    public Car(String name, String size, int wheels, String type, int doors,
               boolean isManual, int gears, String color, String lightsType) {
        super(name, size, wheels, type, doors);
        this.isManual = isManual;
        this.gears = gears;
        this.color = color;
        this.lightsType = lightsType;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);

        move(speed, direction);
    }
}
