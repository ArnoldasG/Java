package Lessons.OOP.Encapsulation;

public class Main {
    public static void main (String[] args) {

    /* JEIGU NAUDOJAMA SU PUBLIC KINTAMAISIAI BE GETTERIŲ

        // Jeigu nėra konstruktoriaus, o tik defaulitinis, informacija priskiriam taip:
        Player player = new Player();
        player.name = "Arnoldas";
        player.health = 20;
        player.weapon = "ShotGun";


        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());
        */

        EnhancedPlayer player = new EnhancedPlayer("Arnoldas", 80, "Sword");
        System.out.println(player.getHealth());
        // Dabar modifier yra nustatytas į private ir pasiekti kintamąjį galim tik su "get" metodu.

        System.out.println("\nEXERCISE WITH PRINTER\n");
        Printer printer = new Printer(50, true);
        System.out.println("Intial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print" +
                "count for printer: " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(1);
        System.out.println("Pages printed was " + pagesPrinted + " new total print" +
                "count for printer: " + printer.getPagesPrinted());

        System.out.println("\nCreating new printer without duplex mode");

        Printer printer1 = new Printer (30, false);
        int pagesPrint = printer1.printPages(4);
        System.out.println("Pages printed was " + pagesPrint + " new total print" +
                "count for printer: " + printer1.getPagesPrinted());
        pagesPrint = printer1.printPages(5);
        System.out.println("Pages printed was " + pagesPrint + " new total print" +
                "count for printer: " + printer1.getPagesPrinted());
    }
}

