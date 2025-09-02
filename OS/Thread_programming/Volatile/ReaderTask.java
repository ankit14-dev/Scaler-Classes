package Volatile;

public class ReaderTask extends Thread {
    SharedObject sharedObject;

    ReaderTask(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        sharedObject.printFlag();
    }
}
