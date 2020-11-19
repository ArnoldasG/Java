package Exercises;

/*
Create a Circle class
Create the Circle class with three initializers:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color


Requirements:
1. The program must not read data from the keyboard.
2. The Circle class must have int variables centerX, centerY, radius, width and color.
3. The class must have an initialize method that takes centerX, centerY, and radius as arguments, and initializes the corresponding instance variables.
4. The class must have an initialize method that takes centerX, centerY, radius, and width as arguments, and initializes the corresponding instance variables.
5. The class must have an initialize method that takes centerX, centerY, radius, width, and color as arguments, and initializes the corresponding instance variables.
*/

public class InitializationHarder {
    //write your code here
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}