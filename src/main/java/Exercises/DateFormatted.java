package Exercises;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatted {
    public static void main(String[] args) {

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(dateFormat.format(date));

    }
}