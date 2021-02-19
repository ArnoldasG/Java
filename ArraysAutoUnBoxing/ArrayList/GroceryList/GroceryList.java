package Lessons.ArraysAutoUnBoxing.ArrayList.GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        // vietoj to, kad nurodytume konkretų masyvo dydį, mes sukuriame metodą
        // kuris yra dalis masyvo klasės.
        groceryList.add(item); // automatiškai įtrauks daiktą į masyvą.

    }
    public void printGroceryList() {
        // groceryList.size() ir loop'as - parodys kiek elementų yra arrayliste
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            // (i + 1) - reiškia, kad masyvas prasidės nuo skaičiaus 1.
            // groceryList.get(i)) - gaus visą sudaryta sąrašą į loop i.
            System.out.println((i +1) + "." + groceryList.get(i));
        }
    }
    // su šitu metodu pridėsim norimą daiktą į grocery list.
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    // su šitu metodu galėsim panaikinti daiktą iš grocery list.
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    // metodas, kuris leist mums surasti daiktą sąraše.
    public String findItem(String searchItem) {
      //  boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
