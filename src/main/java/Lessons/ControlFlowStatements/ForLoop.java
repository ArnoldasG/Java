package main.java.Lessons.ControlFlowStatements;

public class ForLoop {

    public static void main(String[] args) {

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        System.out.println("EXERCISE 1 \n");
        for (int i = 2; i < 9; i++) {

            // Įdėsim metodą į String jį formatuodami. %.2f reiškia, kad konvertuos ir išspausdins skaičų su dviem skaičiais
            // po kablelio. Į amount vietą įdedam sumą, kurią norime sukti per loopą, o interestRate įdedam loop value;
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        //How would you modify the for loop above to do the same thing as
        //shown but to start from 8% and work back to 2%

        System.out.println("\nSecond part of this exercise\n");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }


        System.out.println("\nThird part of this exercise\n");
        // Reikalingas skaičiavimas, kad jeigu sąlygoje pasieks norima skaičių - loopas sustos.
        int count = 0;
        // Loop'as, kuris panaudos isPrime metodą, kad apskaičiuot Pirminius skaičius.
        for (int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 7) {
                    System.out.println("\nExiting for loop");
                    break;
                }

            }

        }
    }
    // Sukuriamas metodas, kuris leis mums apskaičiuoti pirminius skaičius.
    public static boolean isPrime(int n){

    if (n == 1) {
        return false;
    }
    for(int i = 2; i <= (long) Math.sqrt(n); i++) {
    // arba for (int i = 2; i <= n/2; i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;

    }



    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    /*  // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit*/



}


