package AdderSubtractor;

public class client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        
        // Wait for both threads to finish
        // This ensures that the main thread waits for the completion of both adder and subtractor threads
        t1.join();
        t2.join();

        System.out.println("Final count value: " + count.value);


    }
}
