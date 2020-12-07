package main.java.Exercises.Methods;

public class SpeedConverter {

    public static void main(String[] args) {
       double miles = SpeedConverter.toMilesPerHour(100);
        System.out.println("Miles: " + miles);

        SpeedConverter.printConversion(100);
    }

    public static long  toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid VALUE");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            // Čia išsaugom, kad milesPerHour bus lygus, kad gautai vertei iš toMilesPerHour
            {
                System.out.println(kilometersPerHour + "km/h = " +
                        milesPerHour + "mi/h");
            }
        }
    }
}
