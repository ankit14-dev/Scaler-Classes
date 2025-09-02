package AdderSubtractor;

public class Adder implements Runnable{
    public Count count;
    public Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=0;i<100000000;i++){
            count.value++;
        }
    }

    
}
