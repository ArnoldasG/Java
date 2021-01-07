package Exercises;

public class CatClass {
    public static void main(String[] args) {
        // Sukuriamas naujas objektas ir įrašomi dalykai, kurie jam priskirti.
        Cat cat = new Cat("Arnoldas", 27,87,100);
        Cat cat1 = new Cat("Aidas", 22, 120, 88);
        Cat cat3 = new Cat("Ryža", 6, 4, 15);

    }

    public static class Cat {
        // Sukuriama nauja klasė-objektas - katė "cat"
        private String name; // Priskiriama, kad objektas turės vardą.
        private int age; // Priskiriama, kad objektas turės amžių.
        private int weight; // Priskiriame, kad objektas turės svorį.
        private int strength; // Priskirama, kad objektas turės stiprumą.

        public Cat(String name, int age, int weight, int strength) {
            // Sukuriama konkreti klasė "Cat" ir priskiriami jau sukurti argumentai konstruktoriuje: "name, age, weight, strenght"
            this.name = name; // "this" priskiria konkretų objektų, šiuo atveju "cat" ir nurodo, kad bus priskirtas vardas.
            this.age = age; // Nurodo, kad reikės paskirti objektui amžių.
            this.weight = weight; // Nurodo, kad reikės paskirti objektui svorį.
            this.strength = strength; // Nurodo, kad reikės paskirti objektui stiprumą.
        }
    }
}
