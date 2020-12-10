package main.java.Exercises.ControlFlowStatements;

/*Write a method with the name printDayOfTheWeek that has one parameter of
type int and name it day. The method should not return any value (hint: void)
Using a switch statement print ÅgSundayÅh, ÅgMondayÅh, Åc ,ÅgSaturdayÅh if
the int parameter "day" is 0, 1, Åc , 6 respectively, otherwise it should
print ÅgInvalid dayÅh.
Bonus:
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh*/

import org.omg.PortableServer.LifespanPolicy;

public class DayOfWeekSwitch {

    public static void main(String[] args) {
        printDayOfTheWeek(8);

    }

    public static void printDayOfTheWeek(int day) {


        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid day.");
        }
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2){
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid date.");
        }
    }
}
