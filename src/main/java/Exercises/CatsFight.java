package Exercises;

public class CatsFight {
        public static void main(String[] args) {
            //write your code here
            Cat cat = new Cat("Arnoldas", 6, 12, 100);
            Cat cat1 = new Cat("Ryžikas", 12, 9, 90);
            Cat cat2 = new Cat("Alzhaimeris", 3, 5, 80);

            System.out.println(cat.fight(cat1));
            System.out.println(cat.fight(cat2));
            System.out.println(cat1.fight(cat2));



        }

        public static class Cat {
            protected String name;
            protected int age;
            protected int weight;
            protected int strength;

            public Cat(String name, int age, int weight, int strength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }

            public boolean fight(Cat anotherCat) {
                int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
                int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
                int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

                int score = ageAdvantage + weightAdvantage + strengthAdvantage;
                return score > 2; // return score > 2 ? true : false;
            }
        }
    }


