package main.java.Exercises.Methods;

// Method overloading - opcija, kur naudoji tą patį metodo vardą,
// bet su skirtingais parametrais.

public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0 );

        }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ( (feet < 0) && (inches < 0) || (inches > 12) ) {
            System.out.println("Invalid parameter added.");
        return -1;
        }
    double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet" + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
}


