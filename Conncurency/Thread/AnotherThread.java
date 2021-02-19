// Importuojame spalvų klasę ir konkrečią spalvą kurią naudosime.

public class AnotherThread extends Thread {
    @Override
    public void run() {
        // ANSI_BLUE nustatom, kad spalva bus mėlyna.
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from another thread.");
        // L.2. Parodom, kad atspausdinsim nurodytą "Thread" vardą.
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            // Sukuriam bloką, kuris užmigdys šitą thread į sekundėm
            Thread.sleep(5000);
            // Šita komanda reiškia, kad nutrauks išimtį Thread.Sleep ir
            // išspasudins sekančią žinutę.
        } catch(InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE + " Another thread woke me up");
        }
        System.out.println(ThreadColor.ANSI_BLUE + " Five seconds have passed and I'm awake");
        }
    }

