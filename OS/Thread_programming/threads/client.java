package threads;
public class client {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start(); // Wait for the thread to finish before starting the next one
        }
    }
}