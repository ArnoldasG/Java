package main.java.Exercises.InnerAbstractInterface.InnerClass;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear (0, 0.0);
        this.gears.add(neutral);
    }

    // pasidarom metodą, kuris leis valdyti sankabą.
    public void operateClutch (boolean in) {
        this.clutchIsIn = in;
    }
    // susikursim metodą, kuris pridės pavarą
    public void addGear (int number, double ratio) {
        // jeigu skaičius > už 0 ir skaičius <= maksimalų pavarų skaičių.
        if (number > 0 && number <= maxGears) {
            // tuomet prie gears pridės naują pavarą.
            this.gears.add (new Gear(number, ratio));
        }
    }

    public void changeGear (int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed (int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    //Sukuriam inner class kurios mums reikia
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        // revs - apsukos
        public double driveSpeed (int revs) {
            return revs * (this.ratio);
        }
    }
 }
