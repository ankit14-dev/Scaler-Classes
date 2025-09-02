package ConsumerProducerProblem;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    public Queue<Shirt> store;
    public int maxSize;
    public String name;
    public Semaphore p;
    public Semaphore c;

    Consumer(Queue<Shirt> store, int maxSize, String name, Semaphore p, Semaphore c){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.p = p;
        this.c = c;
    }
    @Override
    public void run() {
        try {
            c.acquire();
            synchronized(store) {
                if (!store.isEmpty()) {
                    Shirt shirt = store.poll();
                    System.out.println(name + " consumed a shirt. Current store size: " + store.size());
                }
            }
            p.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
