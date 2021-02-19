import static ThreadColor.ANSI_PURPLE;
import static ThreadColor.ANSI_RED;
// Importuojame spalvų klasę ir konkrečią spalvą kurią naudosime.

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");
        // Sukuriam "instance" iš AnotherThread klasės.
        Thread anotherThread = new AnotherThread();
        // L.2 Galime nustatyti Thread vardą/pavadinimą.
        anotherThread.setName("== Another Thread ");
        // Kad kompiliuotų, mums reikia panaudoti start() metodą. Jis įjungia, kad JVM paleistų metodą.
        anotherThread.start();

        // Taip sukursim naują nežinomą klasę ir ji bus public.
        new Thread() {
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous classroom.");
                // ANSI_RED nustatom, kad spalva bus mėlyna.

            }
        }.start();
        // Sukūrėmė ir paleidome dar vieną thread anonymous klasėje, bet jis negegarantavo
        // kad jis bus pirmiau paleistas už antrą sout funkciją iš main metodo. Taip
        // veikia thread. Kuris pirmas atliekamas - tas išspausdinamas.

        // L.2. Sukuriam naują thread ir į parametrus nurodom mūsų runnable klasę kurią sukūrėm.
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");

        // Vieną kartą panaudojus "thread" metodą klasei, antrą kartą jos naudoti nebelig
        // Vietoj to mes gausime klaidą konsolėje.
        // anotherThread.start();
    }
}
