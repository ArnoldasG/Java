package main.java.Lessons.OOP.Polymorphism.Lesson3;

        // Visos klasės bus sukurtos Main.java tai apsimoka daryti tuomet, kai jos yra
        // mažos bei kompaktiškos ir nebus naudojamos niekur kitur.

// Pagrindinė klasė.
class Movie {
    // Fieldas
    private String name;

    // Konstruktorius
    public Movie(String name) {
        this.name = name;
    }
    // Metodas
    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
    // Sukuriam norimą filmą ir paveldim "Movie" klasę.
class Godfather extends Movie {
    // Sukuriam kontruktorių ir su Super nurodom pavadinimą.
    public Godfather() {
        super("The Godfather");
    }
    // Vėl sukuriam metodą, kuris gražins filmo siužetą.
    public String plot() {
        return "Corleone family shows how to deal with Mafia ant business";
    }
}

class Scarface extends Movie {
    public Scarface() {
        super("The Scarface");
    }

    @Override
    public String plot() {
        return "The Coco man runs the world with guns, sluts and narcos";
    }
}

class Sopranos extends Movie {
    public Sopranos() {
        super("The Sopranos");
    }

    @Override
    public String plot() {
        return "New Jersey mafia runs a business around Jersey and fights with New York gang members.";
    }
}

class PearlHarbor extends Movie {
    public PearlHarbor(){
        super("Pearl Harbor");
    }

    @Override
    public String plot() {
        return "Second world war where Japan bombards USA Pearl Harbor";
    }
}

class BeautifulMind extends Movie {
    public BeautifulMind() {
        super("A Beautiful Mind");
    }

    @Override
    public String plot() {
        return "Schizophrenic man wins an oscar in math with his sickness";
    }
}

class UnknownMovie extends Movie {
    public UnknownMovie() {
        super("Unknown movie");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " " + movie.getName() + "\n"
            + "Plot: " + movie.plot() + "\n");
        }
    }
    // Sukuriamas metodas, tam, kad išrandomintų betkokį filmą. Static, nes nebus
    // naudojamos klasės iš kitur.
    public static Movie randomMovie() {
        // 1. Sukuriam int'1 su pavadinimu randomNumber.
        // 1.2. Nurodom (int), nes Math.random automatiškai konvertuoja į double, bet mum reikia grąžint į int'ą
        // 1.3. Automatiškai Math.random generuoja nuo 0 iki 1. Todėl, mes padauginam iš 6.
        // Dabar gaunasi, kad randomins nuo 0 iki 5. Ir prirašom +1. Tai reikš, kad randomins nuo 1 iki 6.
    int randomNumber = (int) (Math.random() * 6) +1;

        System.out.println("Random number generated was: " + randomNumber);

        // Naudojamas switch teiginys, kad būtų sukurtos viena iš movie klasių.
        switch (randomNumber) {
            case 1:
            return new Godfather();

            case 2:
                return new Scarface();

            case 3:
                return new Sopranos();

            case 4:
                return new PearlHarbor();

            case 5:
                return new BeautifulMind();

            case 6:
                return new UnknownMovie();
        }
        // Taip darom todėl, kad gali būti ir kita vertė, kurią gražins, todėl by default
        // jei bus, ją grąžins default.
        return null;
    }

}
