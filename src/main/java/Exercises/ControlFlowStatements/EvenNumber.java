package main.java.Exercises.ControlFlowStatements;

public class EvenNumber {
    public static void main(String[] args) {

    int number = 4;
    int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            System.out.println("Even number " +  number);
        }
    }
    public static boolean isEvenNumber (int number) {
        while ((number % 2) == 0) {
            return true;
        } return false;
    }
}
