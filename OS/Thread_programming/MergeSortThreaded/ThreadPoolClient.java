package MergeSortThreaded;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolClient {

public static void main(String[] args) {
    // ExecutorService es=Executors.newFixedThreadPool(10);
    ExecutorService es=Executors.newCachedThreadPool();
    for (int i = 0; i < 100; i++) {
        es.execute(new PrintingNumber(i));
    }
    es.shutdown();
}
}