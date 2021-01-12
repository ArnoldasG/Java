package main.java.Lessons.Generics;

import com.sun.xml.internal.rngom.parse.host.Base;

public class Main {
    public static void main(String[] args) {
        FootballPlayer Arnoldas = new FootballPlayer("Arnoldas");
        BaseballPlayer Aidas = new BaseballPlayer("Aidas");
        SoccerPlayer Augis = new SoccerPlayer("Augis");

        Team<FootballPlayer> ichiban = new Team<>("Kyokushin 'IchiBan'");
        ichiban.addPlayer(Arnoldas);
       // ichiban.addPlayer(Aidas);
       // ichiban.addPlayer(Augis);

        Team<BaseballPlayer> baseballTeam = new Team<>("LKKF");
        baseballTeam.addPlayer(Aidas);

        Team<SoccerPlayer> soccerTeam = new Team<>("Žalgiris");
        soccerTeam.addPlayer(Augis);

        System.out.println("Players total in team " + ichiban.getName() + " is: " + ichiban.numPlayers());

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(ichiban, 3, 8);

        ichiban.matchResult(fremantle, 2, 1);
        ichiban.matchResult(ichiban, 1, 1);
    }

}
