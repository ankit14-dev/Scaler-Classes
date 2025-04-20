import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Test {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();

        if (n <= 1) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        long count = 0;

        for (int i = 0; i < n; i++) {
            int currentHeight = A.get(i);

            while (!stack.isEmpty() && A.get(stack.peek()) < currentHeight) {
                int idx = stack.pop();
                count++;
            }

            if (!stack.isEmpty()) 
                count++;
                
            stack.push(i);
        }

        return (int) count;
    }
}