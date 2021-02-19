package main.java.Lessons.Methods;

public class MethodsScoreCalculation {

    public static void main(String[] args){

        // Dabar surišam abudu metodus, kuriame pirmą metodą surišim su antru.
        // Ir pagal paduotus taškus jis nustatys jo pozicija.
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Arnoldas", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Evita", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Linas", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Aidas", position);



    }
    // Sukuriu metodą su parametrais kurių man reikės, tai name ir pozicijos
    public static void displayHighScorePosition(String name, int position) {
        // Liaužtiniuose skliaustuose apibūdinam ką metodas turės daryti
        System.out.println(name + " managed to get into positions " +
                position + " on the highscore table.");
    }

    // Sukuriam naują metodą int, nes reikės gražinti skaičiu, ir nurodom
    // parametrą ko mums reikės
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
