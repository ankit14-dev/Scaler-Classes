package Volatile;

public class client {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        
        // Create and start writer threads
        WriterTask writer1 = new WriterTask(sharedObject);
        writer1.start();
        
        // Create and start reader threads
        ReaderTask reader1 = new ReaderTask(sharedObject);
        reader1.start();
        
        // Wait for all threads to finish
        try {
            writer1.join();
            reader1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
