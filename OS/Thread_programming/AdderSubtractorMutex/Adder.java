package AdderSubtractorMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    public Count count;
    public Lock lock;
    public Adder(Count count,Lock lock) {
        this.lock = lock;
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            lock.lock();
            count.value++;
            lock.unlock();
        }
    }

    
}
