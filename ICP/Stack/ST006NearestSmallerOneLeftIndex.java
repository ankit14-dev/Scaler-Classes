import java.util.ArrayList;
import java.util.Stack;

public class ST006NearestSmallerOneLeftIndex {
    public void solve(){
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }
            st.push(i);
        }
        return ans;
    }
}
