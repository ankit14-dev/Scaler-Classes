package Volatile;

class WriterTask extends Thread {

    SharedObject sharedObject;
    WriterTask(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(1000); // Simulate some work before setting the flag
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sharedObject.setFlagTrue();
        System.out.println("Writer set Flag to true");
    }
}