package AdderSubtractor;

public class Subtractor implements Runnable {
    public Count count;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count.value--;
        }
    }

    public Subtractor(Count count) {
        this.count = count;
    }
}
