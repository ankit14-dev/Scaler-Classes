import java.util.ArrayList;
import java.util.Stack;

public class ST017 {
    public static int[] solveLeft(int[] a) {
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
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static int[] solveRight(int []a){}
    public static void main(String[] args) {
        int[] a = { 4, 3, 4, 6, 2 };
        int n=a.length;
        int[] arrLeft = solveLeft(a);
        int[] arrRight = solveRight(a);
        int ans=0;

        for (int i = 0; i < a.length; i++) {
            int areaL= (arrLeft[i]==-1)?a[i]*i:(i-arrLeft[i])*a[i];
            int areaR= (arrRight[i]==-1)?a[i]*(n-i+1):(arrRight[i]-i)*a[i];
            ans=Math.max(ans,areaL+areaR);
        }
    }
}
