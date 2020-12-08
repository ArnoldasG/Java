package main.java.Exercises.Operators;

public class OperatorChallenge {

    public static void main(String[] args) {

        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double result = (firstVariable + secondVariable) * 100.00;
        result = result % 40.00;

        boolean check = true;
        if (result == 0) {
            check = true;
        } else {
            check = false;
        }
        System.out.println(check);
        if (!check) {
            System.out.println("Got some remainder.");
        }
    }
}
