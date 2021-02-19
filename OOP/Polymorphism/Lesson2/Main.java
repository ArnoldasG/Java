package main.java.Lessons.OOP.Polymorphism.Lesson2;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " engine --> Starts.";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " --> Accelerates";
    }

    public String brake() {
        return getClass().getSimpleName() + " --> Brakes.";
    }
}

class BMW extends Car {
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "  engine --> Starts.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "  --> Accelerates.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "  --> Brakes.";
    }
}

public class Main {
    public static void main (String[] args) {

        System.out.println("RANDOM CAR CREATION");
        Car car = new Car(3, "Random car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("\nBMW CREATION\n");
        BMW bmwx3 = new BMW(6, "BMW X3");
        System.out.println(bmwx3.accelerate());
        System.out.println(bmwx3.startEngine());
        System.out.println(bmwx3.brake());

        System.out.println("\nAUDI CREATION\n");

        Car audi = new Car(6, "Audi Q8") {
            @Override
            public String startEngine() {
                return getClass().getSimpleName() + "  engine --> Starts.";
            }

            @Override
            public String accelerate() {
                return getClass().getSimpleName() + " --> Accelerates.";
            }

            @Override
            public String brake() {
                return getClass().getSimpleName() + " --> Brakes.";
            }
        };
        System.out.println(audi.accelerate());
        System.out.println(audi.startEngine());
        System.out.println(audi.brake());
    }
}
