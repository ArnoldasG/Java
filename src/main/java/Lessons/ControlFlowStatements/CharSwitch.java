package main.java.Lessons.ControlFlowStatements;
// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

public class CharSwitch {
    public static void main(String[] args) {

        char rightChar = 'C';

        switch (rightChar) {
            case 'A':
                System.out.println("The answer is: A");
                break;
            case 'B':
                System.out.println("The answer is: B");
                break;
            case 'C':
                System.out.println("The answer is: C");
                break;
            case 'D':
                System.out.println("The answer is: D");
                break;
            case 'E':
                System.out.println("The answer is: E");
                break;
            default:
                System.out.println("The letter  was not found.");
                break;
        }
    }

}
