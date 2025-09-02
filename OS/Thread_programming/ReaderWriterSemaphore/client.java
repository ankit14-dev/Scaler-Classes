package ReaderWriterSemaphore;

import java.util.concurrent.Semaphore;

public class client {
    public static void main(String[] args) {
        Semaphore readSemaphore = new Semaphore(1);
        Semaphore writeSemaphore = new Semaphore(1);
        Counter readersCount = new Counter();

        Reader reader0 = new Reader(0,readSemaphore, writeSemaphore, readersCount);
        Reader reader1 = new Reader(1,readSemaphore, writeSemaphore, readersCount);
        Reader reader2 = new Reader(2,readSemaphore, writeSemaphore, readersCount);
        Reader reader3 = new Reader(3,readSemaphore, writeSemaphore, readersCount);
        Reader reader4 = new Reader(4,readSemaphore, writeSemaphore, readersCount);

        Writer writer0 = new Writer(0,writeSemaphore, readSemaphore);
        Writer writer1 = new Writer(1,writeSemaphore, readSemaphore);
        Writer writer2 = new Writer(2,writeSemaphore, readSemaphore);
        Writer writer3 = new Writer(3,writeSemaphore, readSemaphore);
        Writer writer4 = new Writer(4,writeSemaphore, readSemaphore);

        Thread readerThread0= new Thread(reader0);
        Thread readerThread1 = new Thread(reader1);
        Thread readerThread2 = new Thread(reader2);
        Thread readerThread3 = new Thread(reader3);
        Thread readerThread4 = new Thread(reader4);

        Thread writerThread0 = new Thread(writer0);
        Thread writerThread1 = new Thread(writer1);
        Thread writerThread2 = new Thread(writer2);
        Thread writerThread3 = new Thread(writer3);
        Thread writerThread4 = new Thread(writer4);

        readerThread0.start();
        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
        readerThread4.start();

        writerThread0.start();
        writerThread1.start();
        writerThread2.start();
        writerThread3.start();
        writerThread4.start();
    }
}
