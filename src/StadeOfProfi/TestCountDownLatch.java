package StadeOfProfi;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            executorService.submit(new Processor(i, countDownLatch));
        }
        executorService.shutdown();

        for (int i = 0; i < 4; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }
        System.out.println("Main has been proceed");
    }
}

class Processor implements Runnable {
    CountDownLatch countDownLatch;
    int id;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread id " + id + " is copleed");
    }
}