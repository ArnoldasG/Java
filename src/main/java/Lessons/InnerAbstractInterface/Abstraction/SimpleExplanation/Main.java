package main.java.Lessons.InnerAbstractInterface.Abstraction.SimpleExplanation;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Tabasco");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Čiurka");
        parrot.breathe();
        parrot.eat();

        Penguin penguin = new Penguin ("Tropical");
        penguin.fly();
    }

}
