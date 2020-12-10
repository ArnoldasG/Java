package main.java.Exercises.Random;

public class Casting {

    public static void main(String[] args) {

        byte small = 125;
        short medium = 320;
        int big = 999;
        long biggest =  50000 + (small * 10) + (medium + big);
        System.out.println(biggest);
    }
}
