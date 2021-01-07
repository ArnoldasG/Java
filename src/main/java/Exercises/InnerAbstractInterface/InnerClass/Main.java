package main.java.Exercises.InnerAbstractInterface.InnerClass;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_REDPeer;

import java.util.Scanner;
    // Kur neužkomentuota - local class pavyzdys.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
        // kaip visada susikuriam objektą
    /*    Gearbox ferrariEnzo = new Gearbox(6);
        ferrariEnzo.addGear(1, 5.3);
        ferrariEnzo.addGear(2,10.6);
        ferrariEnzo.addGear(3, 15.6);
        ferrariEnzo.operateClutch(true);
        ferrariEnzo.changeGear(1);
        ferrariEnzo.operateClutch(false);
        System.out.println(ferrariEnzo.wheelSpeed(1000));
        ferrariEnzo.changeGear(2);
        System.out.println(ferrariEnzo.wheelSpeed(3000));
        ferrariEnzo.operateClutch(true);
        ferrariEnzo.changeGear(3);
        ferrariEnzo.operateClutch(false);
        System.out.println(ferrariEnzo.wheelSpeed(6000));
*/

    }
    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
                switch(choice){
                    case 0:
                        quit = true;
                    case 1:
                        btnPrint.onClick();
                }
             }
        }
    }

