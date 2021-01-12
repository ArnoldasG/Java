package main.java.Lessons.Homework;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<CalculationOperation> operations = new ArrayList<>();
        operations.add(new Multiplication());
        operations.add(new Division());

        Calculator calculator = new Calculator(operations);
        System.out.println(calculator.evaluate(2,5,'x'));
    }
}
