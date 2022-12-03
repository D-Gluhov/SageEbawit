package MultiThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableEx {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> listFuture = new ArrayList<>();
        long temp = value / 10;

        for (int i = 0; i < 10; i++) {
            long from = temp * i + 1;
            long to = temp * (i + 1);
            TestCol testCol = new TestCol(from, to);
            listFuture.add(executorService.submit(testCol));
        }
        for (Future<Long> f1 : listFuture) {
            sum += f1.get();
        }
        executorService.shutdown();
        System.out.println(sum);
    }


}


class TestCol implements Callable<Long> {
    long from;
    long to;
    long sum;

    public TestCol(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            sum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + sum);
        return sum;
    }
}
