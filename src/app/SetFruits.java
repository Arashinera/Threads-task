package app;

import static app.Main.choice;

public class SetFruits implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread started : " + thread.getName());
        try {
            if (choice == 1) {
                Thread.sleep(6000);
            } else if (choice == 2) {
                Thread.sleep(3000);
            }
        } catch (InterruptedException exception) {
            exception.getMessage();
        }
        System.out.println("""
                Some Fruits :
                1) Banana
                2) Apple
                3) Orange
                Thread ended:\s""" + thread.getName());
    }
}
