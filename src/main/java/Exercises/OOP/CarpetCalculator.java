package main.java.Exercises.OOP;

class CarpetCalculator {
public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor, carpet);
    System.out.println("Total price of first carpet = " + calculator.getTotalCost());
       carpet = new Carpet(1.5);
       floor = new Floor(5.4,4.5);
       calculator = new Calculator(floor, carpet);
    System.out.println("Total price of second carpet = " + calculator.getTotalCost());
        }

public static class Floor {

    private double width;
    private double length;

    public Floor(double width, double length){
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public double getArea() {
        return this.width * this.length;

    }
}

    public static class Carpet {
        private double cost;

        public Carpet(double cost) {
            if(cost < 0) {
                this.cost = 0.0;
            } else {
                this.cost = cost;
            }
        }
        public double getCost() {
            return this.cost;
        }
    }

    public static class Calculator {
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }
        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }

}