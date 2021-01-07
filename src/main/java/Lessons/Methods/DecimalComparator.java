package main.java.Lessons.Methods;

public class DecimalComparator {

    public static boolean areEqualThreeDecimalPlaces(double one, double two) {

        if ((int) (one * 1000) == (int) (two * 1000)) {
            return true;
        }
        return false;
    }
}