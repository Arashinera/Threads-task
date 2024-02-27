package app;

import static app.Main.choice;

public class ThreadRun {

    public static void ThreadSolution() {
        Thread firstThread = new Thread(new SetFruits(), "Fruits Thread");
        Thread secondThread = new Thread(new SetVegetables(), "Vegetable Thread");

        if (choice == 1) {
            firstThread.start();

            if (firstThread.isAlive()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                secondThread.start();
            }
        } else if (choice == 2) {
            secondThread.start();

            if (secondThread.isAlive()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                firstThread.start();
            }
        }
    }
}
