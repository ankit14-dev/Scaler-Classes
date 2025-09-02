package MergeSortThreaded;
public class PrintingNumber implements Runnable{
    int x;
    public PrintingNumber(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println(x+" "+Thread.currentThread().getName());
    }
    
}