package threads;
public class NumberPrinter implements Runnable {

    int noToPrint;

    NumberPrinter(int x){
        noToPrint=x;
    }

    public void run() {
        System.out.println("Number :"+noToPrint + " Thread :"+
        Thread.currentThread().getName());
    }
}
