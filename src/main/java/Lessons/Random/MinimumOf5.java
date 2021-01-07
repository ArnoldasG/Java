package Exercises;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Improving functionality
Current implementation: The program reads two numbers from the keyboard and displays the minimum.
New task: The program reads five numbers from the keyboard and displays the minimum.


Requirements:
1. The program should read the numbers from the keyboard.
2. The class must have a public static void main method.
3. The class must have a public static min method that takes 5 int arguments.
4. The min method must return the minimum of the 5 passed numbers. If there are several minimum numbers, return any of them.
5. The program should display a string that starts with "Minimum = ".
6. The program should display a string that ends with the minimum of the 5 entered numbers.
*/

public class MinimumOf5 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);


        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {

        int lowest = 0;
        if (a <= b && a <= c && a <= d && a <= e) {
            lowest = a;
        } else if (b <= a && b <= c && b <= d && b <= e) {
            lowest = b;
        } else if (c <= a && c <= b && c <= d && c <= e) {
            lowest = c;
        } else if (d <= a && d <= b && d <= c && d <= e) {
            lowest = d;
        } else if (e <= a && e <= b && e <= c && e <= d) {
            lowest = e;
        }
        return lowest;
    }
}
