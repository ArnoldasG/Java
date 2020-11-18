package Exercises;

/*
Create a Dog class
Create a Dog class with three initializers:
- Name
- Name, height
- Name, height, color


Requirements:
1. The program must not read data from the keyboard.
2. The Dog class must have a String variable name.
3. The Dog class must have an int variable height.
4. The Dog class must have a String variable color.
5. The class must have an initialize method that takes a name as an argument and initializes the corresponding instance variable.
6. The class must have an initialize method that takes a name and height as arguments, and initializes the corresponding instance variables.
7. The class must have an initialize method that takes a name, height, and color as arguments, and initializes the corresponding instance variables.
*/

public class InitializeDog {
    String name;
    public int height;
    public String color;


    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
