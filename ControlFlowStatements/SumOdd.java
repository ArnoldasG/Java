package main.java.Lessons.ControlFlowStatements;

public class SumOdd {

    public static void main(String[] args) {

    }
    public static boolean isOdd (int odd) {
        if (odd < 0){
            return false;
        }
        if (odd % 2 != 0 ) {
            return true;
        }
        return false;
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (isOdd(i)) {
               return sum += i;
            }
        }
        return -1;
    }
}
