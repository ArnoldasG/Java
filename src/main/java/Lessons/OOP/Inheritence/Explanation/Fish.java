package main.java.Lessons.OOP.Inheritence.Explanation;

// 12. Sukuriam dar vieną papildomą klasę "Fish"
public class Fish extends Animal{

    // 12.1. Sukuriam papildomus fieldus, kuriuos turi žuvis.
    private int gills; // žiaunos
    private String eyes;
    private int fins; // pelekai

    // 12.2. Sugeneruojam konstruktorių. Jis automatiškai įtrauks konstruktorių iš animal klasės ir pridės
    // tuos fieldus, kuriuos mes sukūrėme papildomai, šioje "Fish" klasėje.
    public Fish(String name, int brain, int body, int size, int weight, int gills, String eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // 13. Sukuriam metodus, kurių mums reikės: rest, moveMuscels, moveBackFin ir swim.
    private void rest() {

    }

    private void moveMuscles() {

}
    private void moveBackFin() {

    }
    // 13.1. Tam, kad žuvis plauktų jai reikia moveMuscles() ir moveBackFin() metodtų.
    // Priskiriam juos ir dar įtraukiam metodą iš Animal klasės move() su nurodytų greičiu.
    private void swim(int speed ) {
    moveMuscles();
    moveBackFin();
    super.move(15);
    }
}
