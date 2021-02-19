package main.java.Lessons.JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // pirmas String - key, antras String value
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-orientied, platform independent language");
        languages.put("Python", "an interpreted, object-orientied, high-level programing language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");


        // pridėjus dark kartą ant to pačio key jis ne overwritins seną bet pridės dar vieną į tą patį key.
        // jeigu mes norim, kad daugiau tas keyword nebūtų naudojamas reikia įsistatyt į if/else
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.get("Java"));

        System.out.println("=======================================");

        // padarysim remove metodą, bet pirmiausia mum reikia prasukt per loopą, kad ž
        // žinotume kiek keys ir verčių yra.

        // šitas Lisp ištrins, nes yra nurodytas tik key ir pagal jį searchins.
        languages.remove("Lisp");
        // o šitas neištrins, nes key atitinka, bet pats value neatitinka.
        if (languages.remove("Algol", "Any not correct message")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value not found. It will throw null;");
        }

        // galima ir replacinti
        System.out.println(languages.replace("BASIC", "This will be replaced"));
        System.out.println(languages.replace("C++", "This will not be replaced because not found."));

        //keySet() metodas gražina visus keys vertes.
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
