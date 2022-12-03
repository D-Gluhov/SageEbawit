package Tregulov;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestThreadSync {
    public static void main(String[] args) {
        new Worker().main();
        System.out.println("YA ZDAL");
    }
}

class Worker {
    final Object lock1 = new Object();
    final Object lock2 = new Object();
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(50));
        }
    }

    public void addList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(50));
        }
    }

    public void addAllList() {
        for (int i = 0; i < 1000; i++) {
            addList1();
            addList2();
        }
    }


    public void main() {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(this::addAllList);
        Thread thread2 = new Thread(this::addAllList);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long after = System.currentTimeMillis();
        System.out.println("Vremya vipolnennia " + (after - before));
        System.out.println("List1: " + list1.size() + " List2: " + list2.size());
    }
}