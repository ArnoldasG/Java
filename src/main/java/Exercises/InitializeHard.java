package Exercises;

/*
Initializing cats
Create a Cat class with five initializers:
- Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (unknown name, address and age, i.e. a homeless cat)
- Weight, color, address (someone else's pet)

The initializer's job is to make the object valid.
For example, if the weight is unknown, then you need to specify some average weight.
A cat can't weigh nothing.
The same applies to age and color.
But there may or may not be a name (i.e. name might be null).
The same applies to the address (it might be null).


Requirements:
1. The program must not read data from the keyboard.
2. The Cat class must have a String variable name.
3. The Cat class must have an int variable age.
4. The Cat class must have an int variable weight.
5. The Cat class must have a String variable address.
6. The Cat class must have a String variable color.
7. The class must have an initialize method that takes a name as an argument, but initializes all variables except the address.
8. The class must have an initialize method that takes a name, weight, and age as arguments, but initializes all variables except the address.
9. The class must have an initialize method that takes a name and age as arguments, and initializes all variables except the address.
10. The class must have an initialize method that takes a weight and color as arguments, and initializes all variables except the name and address.
11. The class must have an initialize method that takes a weight, color, and address as arguments, but initializes all variables except the name.
*/

public class InitializeHard {
    //write your code here
    private String name = null;
    private int weight;
    private int age;
    private String color;
    private String address = null;

    // Initialize metodas su String name parametru
    public void initialize(String name) {
        this.name = name;
        weight = 6;
        age = 10;
        color = "Black";
    }
    // Initalize metodas su String name, int weight, int age parametrais
    public void initialize (String name, int weight, int age) {

        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Brown";
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 5;
        color = "Yellow";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 6;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;

    }



    public static void main(String[] args) {

    }
}

