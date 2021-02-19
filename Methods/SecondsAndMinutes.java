package main.java.Lessons.Methods;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(145, 32));
        System.out.println(getDurationString(3600));
    }

/*  1. You should validate that the first parameter minutes is >= 0.
    2. You should validate that the 2nd parameter seconds is >= 0 and <= 59.
    3. The method should return ÅgInvalid valueÅh in the method if either of the above are not true. */
    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0 ) || (seconds < 0) || (seconds > 59))   {
            return "Invalid Value";
        }
        // hours - apskaičiuos kiek valandų sudaro paduotas minučių skaičius.
        long hours = minutes / 60;
        // remainingMinutes - apskaičiuos, kiek iš paduotų minučių liks iš
        // jau konvertuotų į valandas.
        long remainingMinutes = minutes % 60;
        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }
    /* Create a 2nd method of the same name but with only one parameter seconds. */
    private static String getDurationString(long seconds) {
        // Validate that it is >= 0, and return "Invalid value" if it is not true.
        if (seconds < 0) {
            return "Invalid Value";
        }
        // If it is valid, then calculate how many minutes are in the seconds value
        long secondsInMinutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        /* Call the other overloaded method passing the correct minutes
         and seconds calculated so that it can calculate correctly. */
        return getDurationString(secondsInMinutes, remainingSeconds);
    }

}
