// L.2. Sukuriam klasę kuri implementuos "Runnable" metodą.
public class MyRunnable implements Runnable {
    // L.2. Mums brauks raudonai nes reikia implementuoti RUN metodą.

        @Override
        public void run() {
            System.out.println(ThreadColor.ANSI_GREEN + "Hello from MyRunnable's implementations of run()");
        }
    }
