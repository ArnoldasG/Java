package main.java.Lessons.Homework;

public class Multiplication implements  CalculationOperation {

    @Override
    public double evaluate(int a, int b) {
        return a * b;
    }

    @Override
    public char getSymbol() {
        return 'x';
    }
}
