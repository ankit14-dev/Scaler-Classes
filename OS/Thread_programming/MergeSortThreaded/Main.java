package MergeSortThreaded;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // for (int i = 0; i < 100; i++) {
        //     Thread t = new Thread(new PrintingNumber(i));
        //     t.start();
        // }

        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Long> factorials = new ArrayList<>();
        for (int number : numbers) {
            Thread t = new Thread(new CalculatingArray(number, factorials));
            t.start();
        }
    }
}
