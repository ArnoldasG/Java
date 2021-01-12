package main.java.Lessons.Generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        // items.add("String"); || negali pridėt String į Integer ArrayList
        items.add(4);
        items.add(5);

        printDoubled(items);

    }
    // Sukuriam metodą, kuris padaugins skaičių ArrayListe iš dviejų.
    private static void printDoubled(ArrayList<Integer> list) {
        //for (int i = 0; i < list.size(); i++) same:
        for (int i : list) {
            System.out.println(i * 2);
        }
    }
}

