package ConsumerProducerProblem;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Shirt> store;
    int maxSize;
    Semaphore p;
    Semaphore c;
    String name;

    Producer (Queue<Shirt> store, int maxSize, String name, Semaphore p,Semaphore c){
        this.c = c;
        this.p = p;
        this.name = name;
        this.store = store;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        // synchronized(store){
        //     if(store.size()<maxSize){
        //         store.add(new Shirt(1, "T-Shirt", "Red"));
        //     }
        // }
        try {
            p.acquire();
            synchronized(store) {
                if (store.size() < maxSize) {
                    store.add(new Shirt(1, "T-Shirt", "Red"));
                    System.out.println(name + " produced a shirt. Current store size: " + store.size());
                }
            }
            c.release();
            
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
