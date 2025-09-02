package AtomicInteger;

public class client {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);
        adderThread.start();
        subtractorThread.start();

        try {
            // Wait for both threads to finish
            adderThread.join();
            subtractorThread.join();
            System.out.println("Final count value: " + counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
