package MergeSortThreaded;
import java.util.ArrayList;

public class CalculatingArray implements Runnable {
    private int x;
    private ArrayList<Long> factorials;
    public CalculatingArray(int x, ArrayList<Long> factorials) {
        this.x = x;
        this.factorials = factorials;
    }

    @Override
    public void run() {
        long ans=calculateFactorial(x);
        factorials.add(ans);
    }
    long calculateFactorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
}
