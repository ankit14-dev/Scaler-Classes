package ArrayListAdder;

import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class client {
    public static void main(String[] args) {
        Lock lc=new ReentrantLock();
        ArrayList<Integer> al = new ArrayList<>();
        Thread t1 = new Thread(new ArrayListAdder(al, lc));
        Thread t2 = new Thread(new ArrayListAdder(al, lc));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(al.size());
    }
}
