package ArrayListAdder;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class ArrayListAdder extends Thread {
    ArrayList<Integer> al;
    Lock lock;
    ArrayListAdder(ArrayList<Integer> al,Lock lock) {
        this.al = al;
        this.lock = lock;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            lock.lock();
            al.add(i);
            lock.unlock();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished adding elements.");
    }

}
