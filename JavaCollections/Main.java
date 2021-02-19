package main.java.Lessons.JavaCollections;

public class Main {
    public static void main(String[] args) {
        Theater theatre = new Theater("Olympic", 4, 5);
        // theatre.getSeats();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for your seat");
        } else {
            System.out.println("Sorry, seat is taken.");
        }
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for your seat");
        } else {
            System.out.println("Sorry, seat is taken.");
        }
    }
}
