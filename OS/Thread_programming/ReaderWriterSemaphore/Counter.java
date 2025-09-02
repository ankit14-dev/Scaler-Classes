package ReaderWriterSemaphore;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
    public synchronized void decrement() {
        if (count > 0) {
            count--;
        }
    }

    public synchronized void reset() {
        count = 0;
    }
}
