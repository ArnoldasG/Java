package main.java.Lessons.Homework;

import javax.xml.stream.StreamFilter;
import java.util.List;

public class Calculator {

    private List <CalculationOperation> calculationOperation;

    public Calculator(List<CalculationOperation> calculationOperation) {
        this.calculationOperation = calculationOperation;
    }

    public double evaluate (int a, int b, char operation) {
        for (int i = 0; i < calculationOperation.size(); i++) {
            if (calculationOperation.get(i).getSymbol() == operation) {
                return calculationOperation.get(i).evaluate(a, b);
            }
        }
        throw new RuntimeException("Operation not found." + calculationOperation);
     }
}
