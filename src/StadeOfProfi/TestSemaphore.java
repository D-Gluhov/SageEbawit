package StadeOfProfi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TestSemaphore {
    public static void main(String[] args) {
        Connection connection = Connection.getConnection();
        ExecutorService executorService = Executors.newFixedThreadPool(5000);
        for (int i = 0; i < 5000; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }
}


class Connection {
    private static Connection connection = new Connection();
    private int countConnection;

    private final Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }

    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            countConnection++;
            System.out.println(countConnection);
        }

        Thread.sleep(5000);

        synchronized (this) {
            countConnection--;
        }
    }
}