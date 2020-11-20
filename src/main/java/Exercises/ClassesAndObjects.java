package Exercises;


/*
Create Dog, Cat, and Mouse classes.
Add three fields of your choice to each class.
Create objects for the characters in the cartoon "Tom and Jerry".
You'll recall there are quite a few.

For example:
Mouse jerryMouse = new Mouse("Jerry", 5, 2),
where 5 is the height in inches,
and 2 is the length of his tail in inches.

Requirements:
•	Create a Dog class.
•	Create a Cat class.
•	The Dog class must have three variables.
•	The Cat class must have three variables.
•	You must create at least one Mouse object.
•	You must create at least one Dog object.
•	You must create at least one Cat object.
*/

public class ClassesAndObjects {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog = new Dog("Sidas", 7, "Orange");
        Cat cat = new Cat("Ryžikas", 2, "Black");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        private String name;
        private int age;
        private String color;

        public Dog(String name,int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
    public static class Cat{
        private String name;
        private int age;
        private String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
}
