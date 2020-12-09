package main.java.Exercises.Methods;

public class TeenNumberChecker {

    public static boolean hasTeen (int teenOne, int teenTwo, int teenThree) {
        if ( (teenOne >= 13 && teenOne <= 19) || (teenTwo >= 13 && teenTwo <= 19)  ||
                teenThree >= 13 && teenThree <= 19) {
            return true;
        }
        return false;
    }
    public static boolean isTeen (int teenRange) {
        if (teenRange >= 13 && teenRange <= 19) {
            return true;
        }
        return false;
    }
}
