package main.java.Lessons.JavaCollections.Sets;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        // konstruktoriuj priskyrėm, kad sukurs naują HashSetą.
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        // pridėsim mėnulį
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        // sukuriam naują hash setą mūsų turimam satelitų sturinu.
        // kodas kviečiant šį objektą neturi priėjimo prie mūsų orginalaus has seto

        return new HashSet<>(this.satellites);
    }
}
