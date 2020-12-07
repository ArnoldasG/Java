package Exercises;


/*
Calling a constructor from a constructor
Figure out what the program does.
Correct the constructor with two parameters so that it calls another constructor with a radius of 10.
Think about which constructor you need to call.

Hint:
carefully study the implementation of the default constructor.


Requirements:
1. The class must have 3 constructors.
2. The constructor with two parameters must initialize the variables x and y to the passed values.
3. The constructor with two parameters must initialize the variable radius to a value of 10.
4. The constructor with two parameters must call another constructor, passing the correct arguments.
5. Don't change the main method.
6. Don't change the default constructor.
*/

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //write your code here
        this(x, y, 10.0); // Calling a constructor from a constructor
        this.x = x;
        this.y = y;
        radius = 10;
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
