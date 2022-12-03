package StadeOfProfi;

import java.util.Random;

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("Potok preostanovlen");
                    }
//                    if (Thread.currentThread().isInterrupted()) {
//                        break;
//                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Thread is started");
        thread1.start();
        Thread.sleep(5000);
        thread1.interrupt();
        thread1.join();

        System.out.println("Thread is finishded");
    }
}
