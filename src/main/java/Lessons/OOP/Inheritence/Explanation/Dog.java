package Lessons.OOP.Inheritence.Explanation;

// 1. Norėdami paveldėti Animal klasę ir viską joje mums reikia prirašyti "extends"
public class Dog extends Animal {

    // 4. Jeigu reikia, pridedame naujų fieldų, kokie reikalingi šiai "Dog" klasei.
    private String eyes;
    private int legs;
    private int tail;
    private String color;
    private int teeth;


    // 2. Susikuriame konstruktorių: Code > Generate > Constructor. Ir konstruktorius bus paimtas iš "Animal" klasės.
    public Dog(String name, int brain, int body, int size, int weight, String eyes, int legs, int tail, String color, int teeth) {
        // 5. Jeigu pridėjome papildomų fieldų, reikia juos įtraukti į konstruktoriaus parametruos ir juos priskirti. Bet jau po "super"
        // 2.1. Žodis "super" reiškia, kad paimtas kontruktorius su tokiais parametrais iš paveldimos klasės. "Animal"
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.color = color;
        this.teeth = teeth;
    }
    // 9. Jeigu reikia, susikuriam metodą(dalyką), kurį būtent šį klasė daro. Tai šuo kramto.
    private void chew() {
        System.out.println("Dog.chew() called");
    }
    // 9.1. Sukuriam, @Override metodą, kuris perrašys eat() metodą iš Animal klasės į mūsų parašytą metodą Dog klasėje.
    @Override
    public void eat() {
        System.out.println("Dog.eat() Override called");
        // 9.3. Nurodome metodą su kuriuo mums reikia perrašyti.
        chew();
        // 9.2. super.eat() parodo, kurį metodą mes perrašinėjam. 'super' reiškia, kad yra pagrintinė "Animal" klasėje.
        super.eat();

    }
    // 10. Galime sukurti dar vieną metodą, konkrečiai  kaip juda šuo. Bus paimta iš paveldėtos klasė "Animal"
    // iš "move metodo.
    public void walk (){
        System.out.println("Dog.walk() called");
        // 10.1. Nurodome, kad Dog klasės metodas "walk" bus paimtas iš paveldėtos "Animal" klasės.
        move(5);
    }
    // 10.2 Padarome viską tą patį, ką 10 ir 10.1 punktas, tik nurodom didesnė move greitį, nes jis bėgs.
    public void run() {
        System.out.println("Dog.run() called");
        move(10);

    }

    // 11. Sukursime naujome metodą, kad šuo eis judindamas kojas.
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called (Dog class)");
    }
    // 11.1. Perrašys move metodą (iš Animal klasės) į moveLegs metodą (Dog klasės)
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called (Animal method)");
        moveLegs(speed);
        super.move(speed);
    }
}
