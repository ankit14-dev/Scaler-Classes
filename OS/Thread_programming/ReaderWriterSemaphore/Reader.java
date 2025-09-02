package ReaderWriterSemaphore;

import java.util.concurrent.Semaphore;

public class Reader implements Runnable {
    private final int id;
    private final Semaphore readersemaphore;
    private final Semaphore writersemaphore;
    Counter readersCount;

    public Reader(int id,Semaphore readersemaphore,Semaphore writersemaphore, Counter readersCount) {
        this.id = id;
        this.readersemaphore = readersemaphore;
        this.writersemaphore = writersemaphore;
        this.readersCount = readersCount;
    }
    @Override
    public void run() {
        try {
            readersemaphore.acquire();
            readersCount.increment();
            if (readersCount.getCount() == 1) {
                writersemaphore.acquire();
            }
            readersemaphore.release();
            System.out.println("Reader "+id+" is reading"+
                    " (Current readers: "+readersCount.getCount()+")");
            Thread.sleep(1000); 

            readersemaphore.acquire();
            readersCount.decrement();
            
        } catch (InterruptedException e) {
            
        } finally {
            if (readersCount.getCount() == 0) {
                writersemaphore.release();
            }
            System.out.println("Reader "+id+" has finished reading");
            readersemaphore.release();
        }
    }
    
}
