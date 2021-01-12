package main.java.Lessons.Errors;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            /*Multiple Catch Exceptions*/
        } catch (ArithmeticException | /*or*/ NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform a division, autopilot shutting down");
        }
    }

    private static int divide(){
        int x, y;
        // This is a multiple exceptions;
       // try {
            x = getInt();
            y = getInt();
            System.out.println("First Integer: " + x + "\nSecond Integer " + y );
            return x / y;
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("no suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    public static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        while(true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // iš naujo apsisukam. Reiškia pagavus exception iš naujo prašys įvesti
                s.nextLine();
                System.out.println("Please enter the digits from 0 to 9");
            }
        }

    }
}
