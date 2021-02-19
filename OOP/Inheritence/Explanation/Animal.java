package Lessons.OOP.Inheritence.Explanation;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // 8. Pridedame ką visi "Animal" gali daryti. Tarkim "eat"
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    // 8.1. Ir gali judėti "move".
    // 8.3. Papildome metodą, kad jis turi ir greitį. Įtraukiame parametrą int speed
    public void move(int speed) {
        System.out.println("Animal is moving at:" + speed);

    }


    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
