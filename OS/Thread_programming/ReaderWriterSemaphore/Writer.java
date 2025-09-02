package ReaderWriterSemaphore;

import java.util.concurrent.Semaphore;

public class Writer implements Runnable {
    private final int id;
    private final Semaphore writerSemaphore;
    private final Semaphore readerSemaphore;

    Writer(int id,Semaphore writerSemaphore, Semaphore readerSemaphore) {
        this.id = id;
        this.writerSemaphore = writerSemaphore;
        this.readerSemaphore = readerSemaphore;
    }

    @Override
    public void run() {
        try {
            writerSemaphore.acquire();
            readerSemaphore.acquire();
            System.out.println("Writer "+id+" is writing");
            Thread.sleep(1000); // Simulate writing time
        } catch (InterruptedException e) {
            
        } finally {
            System.out.println("Writer"+id+" has finished writing");
            readerSemaphore.release();
            writerSemaphore.release();
        }
    }
}
