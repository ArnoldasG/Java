package main.java.Exercises.InnerAbstractInterface.InterfaceBankAcc;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    // Implementuojam metodą iš Interface klasės Saveable ir jį paredaguojam, kad viską rašytų
    // į ArrayList ir visą sąrašą grąžintų.
    @Override
    public List<String> write() {
        List <String> values = new ArrayList<>();
        values.add(0, this.name);
        //"" + this.hitPoints = perkonvertuos automatiškai į String
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add (3,  this.weapon);

        return values;
    }
    // Vėl implementuojam metodą iš ISaveable. Patikrinam ar išsaugotame masyve yra nors vienas
    // elementas (per if). Patikrinę gaunam norimą vertę į indeksą kurį pasirenkame.
    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Ak47";


    }
}
