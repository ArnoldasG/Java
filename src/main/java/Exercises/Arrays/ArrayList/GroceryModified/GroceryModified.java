package main.java.Exercises.Arrays.ArrayList.GroceryModified;

import java.util.ArrayList;

public class GroceryModified {
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
    // UPDATE 2 - surasime numerį ir paduosime skaičių ir Stringą, kad modifyintu
    // grocery daiktų metodą.
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
            if (position >= 0) {
                modifyGroceryItem(position, newItem);
        }
    }
    // su šitu metodu pridėsim norimą daiktą į grocery list.
    // UPDATE - pakeičiam modifier į private, tam, kad priverstume žmones, kurie naudojasi ta klase
    // kad naudotūsi tik tai metodais, kuriais mes norime, kad jie naudotūsi.
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    // UPDATE - padarom remove tokiu pačiu principu kaip modify.
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    // su šitu metodu galėsim panaikinti daiktą iš grocery list.
    // UPDATE - pakeičiam modifier į private, tam, kad priverstume žmones, kurie naudojasi ta klase
    // kad naudotūsi tik tai metodais, kuriais mes norime, kad jie naudotūsi.
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    // metodas, kuris leist mums surasti daiktą sąraše.
    // UPDATE - pakeisime, kad gražintų int ir pakeisime modifier
    private int findItem(String searchItem) {
            return groceryList.indexOf(searchItem);
        }
        public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
        }
    }

