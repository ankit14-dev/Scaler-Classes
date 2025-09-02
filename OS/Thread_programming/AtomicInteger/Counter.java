package AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    //volatile int count=0;
    private AtomicInteger count = new AtomicInteger(0);
    public void increment() {
        // count++;
        count.incrementAndGet();
    }
    public void decrement() {
        // count--;
        count.decrementAndGet();
    }
    public int getCount() {
        return count.get();
    }
    

}
