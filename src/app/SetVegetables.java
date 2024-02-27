package app;

import static app.Main.choice;

public class SetVegetables implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread started : " + thread.getName());
        try {
            if (choice == 1) {
                Thread.sleep(3000);
            } else if (choice == 2) {
                Thread.sleep(6000);
            }
        } catch (InterruptedException exception) {
            exception.getMessage();
        }
        System.out.println("""
                Some Vegetables :
                1) Potato
                2) Pepper
                3) Tomato
                Thread ended :\s""" + thread.getName());
    }
}
