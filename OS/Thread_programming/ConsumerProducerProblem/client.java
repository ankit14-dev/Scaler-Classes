package ConsumerProducerProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class client{
    public static void main(String[] args){
        Queue<Shirt> store=new ConcurrentLinkedQueue<>();
        int maxSize=5;

        Producer p1=new Producer(store, maxSize,"P1");
        Producer p2=new Producer(store, maxSize,"P2");
        Producer p3=new Producer(store, maxSize,"P3");
        Producer p4=new Producer(store, maxSize,"P4");
        Producer p5=new Producer(store, maxSize,"P5");
        Producer p6=new Producer(store, maxSize,"P6");

        Consumer c1=new Consumer(store, maxSize,"C1");
        Consumer c2=new Consumer(store, maxSize,"C2");
        Consumer c3=new Consumer(store, maxSize,"C3");
        Consumer c4=new Consumer(store, maxSize,"C4");
        Consumer c5=new Consumer(store, maxSize,"C5");
        Consumer c6=new Consumer(store, maxSize,"C6");

        Thread producerThread=new Thread(p1);
        Thread producerThread2=new Thread(p2);
        Thread producerThread3=new Thread(p3);
        Thread producerThread4=new Thread(p4);
        Thread producerThread5=new Thread(p5);
        Thread producerThread6=new Thread(p6);

        Thread consumerThread=new Thread(c1);
        Thread consumerThread2=new Thread(c2);
        Thread consumerThread3=new Thread(c3);
        Thread consumerThread4=new Thread(c4);
        Thread consumerThread5=new Thread(c5);
        Thread consumerThread6=new Thread(c6);
    }
}