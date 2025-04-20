import java.util.ArrayList;
import java.util.Stack;

public class ST005NearestSmallerOnLeft {
    public static ArrayList<Integer> solve(int[] a) {
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }
            st.push(a[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 10, 8, 2, 6, 7 };
        ArrayList<Integer> arr = solve(a);
        System.out.println(arr.toString());
    }
}
