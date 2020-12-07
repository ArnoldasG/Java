package Exercises;

/*
Implement the fight method

/*Implement the fight method
Implement the boolean fight(Cat anotherCat) method:
implement a mechanism for cats to fight based on their weight, age and strength.
You can decide for yourself how a cat's characteristics factor into combat.
The method should determine whether we (this) won the fight, i.e. return true if we won and false if not.

The following condition must be met:
if cat1.fight(cat2) returns true,
then cat2.fight(cat1) must return false


Requirements:
1. The Cat class must have a constructor with no parameters.
2. The Cat class must contain public fields age, weight, and strength.
3. The Cat class must have a fight method.
4. In the fight method, implement a mechanism for cats to fight based on their weight, age and strength.
5. The method should return the same value every time we fight the same cat.
6. If cat1 beats cat2, then cat2 must lose to cat1.*/

public class CatsComparision {
    // Sukuriama klasė - objektas "Cat"
    public int age;
    // Konstruktoriuje sukuriama, kad objektas turės - "age"
    public int weight;
    // Konstruktoriuje sukuriama, kad objektas turės - "weight"
    public int strength;
    // Konstruktoriuje sukuriama, kad objektas turės - "strength"

    public CatsComparision() {
        // Sukuriama nauja katė - objektas
    }

    public boolean fight(Cat anotherCat) {
        // Nurodome sąlygą, kad viena katė kovos su kita kate(anotherCat)
        int ageDifference = this.age > anotherCat.age ? 1 : 0;
        /* Nurodome, kad kova vyks tarp amžiaus skirtumo. (int ageDifference)
            Nurodome, kad būtent šios klasės katė ir jos paimtas amžius kovos bus lyginimas su kitos katės amžiumi
            kuris paimtas iš argumentų. (this.age > anotherCat.age).
            Ir nurodome amžių/sąlygą pagal kurią bus lyginima. (? 1 : 0) */
        int weightDifference = this.weight > anotherCat.age ? 1 : 0;
        int strengthDifference = this.strength > anotherCat.strength ? 1 : 0;

        int score = ageDifference + weightDifference + strengthDifference;
        return score > 2;

    }

    public static void main(String[] args) {

    }
}