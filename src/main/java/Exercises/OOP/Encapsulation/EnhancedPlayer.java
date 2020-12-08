package main.java.Exercises.OOP.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health = 100; // Apibūdinam, kad mūsų default gyvybės yra 100.
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // Šitas if reiškia, kad nuo 1 iki 100 yra galimos gyvybės. Reiškia neleis pvz 200, ar -15.
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }


    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }


    }
}
