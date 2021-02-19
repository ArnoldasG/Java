package main.java.Lessons.InputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

//        int x = 98;
//        int y = 0;
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divide(x, y));

        int x = getIntEAFP();
        System.out.println("Entered number x is: " + x);
    }
    // Metodas, kuris mes errorą, jeigu mes įvesime vietoj Integer Stringą.
    private static int getInt() {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter your number (integer): ");
        //
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
    // pasirašom metodą, kuris padalins du skaičius. Kadangi dalybą iš nulio yra negalima, nes
    // atsakymas visada bus nulis - tai mes ir pasakom, kad jei y nebus 0 mes dalinsime. Tai ir
    // reiškia look before you leap.
    private static int divideLBYL (int y, int x) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }
        // o čia metodas Easy to Ask for Forgiveness than Permission.
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
        // o dabar metodas, nuo kurio JAVA mes errorą, nes iš dviejų nesidalina.
    private static int divide (int x, int y) {
        return x / y;
    }
}
