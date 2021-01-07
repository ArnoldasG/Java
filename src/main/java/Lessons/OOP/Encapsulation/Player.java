package main.java.Lessons.OOP.Encapsulation;

public class Player {
    // 1. Sukuriam keleta kintamųjų (variables)
    public String name;
    public int health;
    public String weapon;

    // 2. Sukuriam metodą, kur žaidėjas praras gyvybes.
    public void loseHealth(int damage) {
        // 2.1. Nustatom, kad šitas metodas atims gyvybių, jei žaidėjas jų praras.
        this.health = this.health - damage;
        // 2.2. Nustatom, kad jei žaidėjui 0 gyvybių arba mažiau. Jis atsijungia.
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }
    // 3. Sukuriam dar vieną metodą - kiek gyvybių liko.

    public int healthRemaining() {
        return this.health;

    }
}
