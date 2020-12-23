package main.java.Exercises.OOP.Composition.Explanation;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "MSI", "240", dimensions);


        Monitor theMonitor = new Monitor("27cm", "AOC", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("3080", "RTX", 16, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
       thePC.powerUp();
    }
}
