package main.java.Exercises.OOP.Inheritence.Explanation;

public class Main {

    public static void main(String[] args) {


    // 6. Pavyzdys. Kad galima susikurti ir Animal objektą tik su jo konstruktoriumi.
    Animal animal = new Animal("Cat", 1, 1, 35, 4);

    // 7. Pavyzdys. Kad galima susikurti ir Dog objektą, kuris turis ir paveldėtą konstruktorių ir dar pridetą.
    Dog dog = new Dog("Aidas", 1, 1, 14, 6, "blue", 4, 1, "Black,", 32);
    // 8.4. Panaudojam metodą iš animal klasės, kad šuo gali valgyt. Pasiekiamas nes yra public 'modifier'
    dog.eat();
    // 9.4. Padarius visą 9 punktą persirašė eat(); metodas ir išspausdina chew() metodą.

        // 10.3 Pakviečiame jau padaryti dog.walk() ir dog.run() metodus.
        // Gaunam atsakymus: Calling dog.walk() metodą:
        //Dog.walk() called
        //Animal is moving at:5
        //
        //Calling dog.run() metodą:
        //Dog.run() called
        //Animal is moving at:10
        System.out.println("\nCalling dog.walk() metodą:");
        dog.walk();
        System.out.println("\nCalling dog.run() metodą:");
        dog.run();

        // 11. Override metodus išspausinds tokį tekstą.
        // Dog.move() called (Animal method)
        //Dog.moveLegs() called (Dog class)
        //Animal is moving at:10
}
}
