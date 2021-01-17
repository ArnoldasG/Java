package Lessons.OOP.Polymorphism.Lesson1;

class MainCar {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public MainCar(int cylinders, String name) {
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

class BMW extends MainCar {
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

