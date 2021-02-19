package Lessons.Operators;

// Operators - (+),(-),(*),(/)
// Operands - (15) + (12) arba (hoursWorked) - (hourlyRate)
// Expression - susidaro kombinuojant vertes: (15 + 12) arba (one - two)
public class Operators {

    public static void main (String[] args) {

    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
    int previousPlus = result;
        System.out.println("Previous Result = " + previousPlus);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        // Multiplier
        result = result * 10; // 2 * 10 = 20
        System.out.println("Multiplier \n2 * 10 = " + result);

        // Division
        result = result / 5; // 20 / 5 = 4;
        System.out.println("Division \n20 / 5 = " + result);

        // Modulus or remainder
        // Išlaiko liekaną dviejų operandų.
        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // Abbreviating (sutrumpintas) Operators
        System.out.println("\nABBREVIATING OPERATORS");

        // result = result + 1;
        result ++; // 1 + 1 = 2;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " +  result);

        //result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 =" + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 12 - 2 = 8
        System.out.println("10 - 2 = " + result);

        System.out.println("\nCONDITIONAL LOGIC (IF)");
        // Conditional logic - naudoja konkrečius teiginius, kurie leidžia patikrinti ar salyga "true ar "false"
    boolean isAlien = false;
    if (isAlien == false) {
        System.out.println("It is not an alien!");
    }
        System.out.println("\nLOGICAL OPERATOR");
    // Logical operators are: (<) (>) (!=) (<=) (>=) (&&) (||)
    int topScore = 100;
    if (topScore == 100) {
        System.out.println("You reached the high score!");
    }
    int secondTopScore = 60;
    if (topScore > secondTopScore && topScore < 100) {
        System.out.println("Greater that second top score and less than 100");
    }
    if ((topScore > 90) || (secondTopScore <=90)) {
        System.out.println("Either or both of the conditions are true.");
    }
    boolean isCar = false;
    if(!isCar) {
        System.out.println("The isCar is false");
    }
        // Ternary Oparators
       System.out.println("\nTERNARY OPERATORS");
    // Turime tris operandus
        // (isCar) - sąlyga, kurią mes tikrinam, kuri turėtų įvertinti visas sąlygtas.
        // (true) - yra vertės paskyrimas (true) (wasCar) jeigu pirma sąlyga true.
        // (false) - vertės paskyrimas (false) jeigu pirma sąlygą yra false.
        isCar = true;
    boolean wasCar = isCar ? true : false;
    if(wasCar) {
        System.out.println("wasCar is true");
    }
    }
}
