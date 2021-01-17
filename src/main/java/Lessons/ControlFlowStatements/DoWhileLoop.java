package main.java.Lessons.ControlFlowStatements;

public class DoWhileLoop {

    public static void main(String[] args) {
        int count = 1;

        // užduotis su while loop. While loopas gali nepasileisti nei karto.
        System.out.println("\n");
        while (count != 6) {
            System.out.println("While loop count value is " + count);
            count++;
        }
        // ta pati užduotis atlikta su for loop.
        System.out.println("\n");
        for (count = 1; count != 6; count++) {
            System.out.println("For loop count value " + count);
        }

        // Tas pats su do loop. Do loopas visada leisis bent vieną kartą.
        count = 1;
        System.out.println("\n");
        do {
            System.out.println("Do loop count value was " + count);
            count++;
        } while (count !=6);
    }
}
