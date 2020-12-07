package Exercises;


/*
Creating cats
Create the Cat class with five constructors:
- Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (name, address, and age are unknown; the cat is homeless)
- Weight, color, address (someone else's pet)

The constructor's job is to make the object valid.
For example, if the weight is unknown, then you need to specify some average weight.
A cat can't weigh nothing.
The same applies to age and color. But there may or may not be a name (i.e. name might be null).
The same applies to the address (it might be null).


Requirements:
1. The Cat class must have a String variable name.
2. The Cat class must have an int variable age.
3. The Cat class must have an int variable weight.
4. The Cat class must have a String variable address.
5. The Cat class must have a String variable color.
6. The class must have a constructor that takes a name as an argument, but initializes all variables except the address.
7. The class must have a constructor that takes a name, weight, and age as arguments, and initializes all variables except the address.
8. The class must have a constructor that takes a name and age as arguments, and initializes all variables except the address.
9. The class must have a constructor that takes a weight and color as arguments, and initializes all variables except the name and address.
10. The class must have a constructor that takes a weight, color, and address as arguments, and initializes all variables except the name.
*/

public class CatInitializationWithConstructors {
    //write your code here
    private String name = null;
    private int age;
    private int weight;
    private String address = null;
    private String color;

    public CatInitializationWithConstructors(String name) {
        this.name = name;
        age = 2;
        weight = 4;
        color = "black";
    }

    public CatInitializationWithConstructors(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }

    public CatInitializationWithConstructors(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 5;
        color = "Purple";
    }

    public CatInitializationWithConstructors(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 4;
    }

    public CatInitializationWithConstructors(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;

    }

    public static void main(String[] args) {

    }
}
