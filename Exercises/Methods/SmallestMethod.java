package main.java.Lessons.Exercises.Methods;

public class SmallestMethod {
    public static void main(String[] args) {

        System.out.println(SmallestMethod.smallestOne(25,37,29));

    }

    public static double smallestOne (double a, double b, double c) {
        double smallest;
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c){
            smallest = b;
        } else {
            smallest = c;
        }
        return smallest;
    }
}
