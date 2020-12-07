package Exercises;


/*
The whole duck isn't enough

*/

public class toStringMethod {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //write your code here

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        System.out.println(cat);
        System.out.println(cat1);

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        System.out.println(dog);
        System.out.println(dog1);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}
