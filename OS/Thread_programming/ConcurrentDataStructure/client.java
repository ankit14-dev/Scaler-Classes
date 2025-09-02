package ConcurrentDataStructure;

import java.util.ArrayList;

public class client {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2000);

        Addvalue addValue = new Addvalue(list, 0);
        Addvalue addValue2 = new Addvalue(list, 1000);
        Thread thread1 = new Thread(addValue);
        Thread thread2 = new Thread(addValue2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
