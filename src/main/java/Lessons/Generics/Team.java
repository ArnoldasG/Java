package main.java.Lessons.Generics;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // metodas, kuris patikrins ar žaidėjas tokiu vardu yra ar ne, ir jei nėra pridės
    // pasirinktą žaidėją.
    public boolean addPlayer (T player) {
        if (members.contains(player)) {
            // kadangi naudojam GENERIC klasę <T> mums reikia castinti, kad suprastų iš kokios
            // klasės naudojam: (((Player)player).getName(). Bet mums šitas castas reikalingas
            // tik tokiu atveju, jeigu <> bracketuose naudojam tik <T> ir neextendinam kitos klasės.
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            // vėl castinam
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    // parodys kiek yra narių
    public int numPlayers() {
        return this.members.size();
    }

    // sukuriam matchResult metodą, kuris pridės taškus komandom kurios laimės, pralaimėjimus
    // kurios pralaimės. Pridės po vieną sužaistą rungtynę ir jeigu varžovų nebuvo - nepridės
    // nei vienai. Taip pat padarom klasę Generic <T> kad žaidimą žaistų tik tinkamos komandos.
    public void matchResult (Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
