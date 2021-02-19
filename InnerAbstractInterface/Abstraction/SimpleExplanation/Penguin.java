package main.java.Lessons.InnerAbstractInterface.Abstraction.SimpleExplanation;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + ": I'm not so good at this.. Maybe I can swim?");
    }
}
